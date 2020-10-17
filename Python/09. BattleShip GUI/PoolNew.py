

import pygame
import math
from math import sqrt, pi, asin
import time
import numpy as np
from numpy import shape, zeros
import random


#colori predefiniti

black = (0, 0, 0)
white = (255, 255, 255)
green = (0, 200, 0)
darkgreen = (0, 100, 0)
red = (200, 0, 0)

#inizializzazione parametri pygame

pygame.init()

myfont = pygame.font.SysFont("monospace", 25)

wscreen = 1280                      #schermo
hscreen = 720+50
wfieldext = 1280
hfieldext = 720
wfieldint = wfieldext-25
hfieldint = hfieldext-25
screen = pygame.display.set_mode((wscreen, hscreen))
screen.fill(black)
pygame.display.set_caption('Biliardo')

#indici e valori iniziali

count = 0               #numero urti
fatt = 4                #fattore velocizzamento movimenti
rad = 21                #dimensioni delle palle
dim = 0.0008

#matrici delle posizioni e velocità

line1xPos = 3*wfieldext/4
line2xPos = 3*wfieldext/4 + sqrt(3)*rad + 1
line3xPos = 3*wfieldext/4 + 2*sqrt(3)*rad + 2
line4xPos = 3*wfieldext/4 + 3*sqrt(3)*rad + 3
line5xPos = 3*wfieldext/4 + 4*sqrt(3)*rad + 4
yTrasl1 = rad + 1
yTrasl2 = 2*rad + 1

# initPos = [[wfieldext/4, hfieldext/2],  [line1xPos, hfieldext/2],  [line2xPos, hfieldext/2 + yTrasl1],  [line2xPos, hfieldext/2 - yTrasl1],           #bianca e prime tre palle
#        [line3xPos, hfieldext/2],  [line3xPos, hfieldext/2 + yTrasl2],  [line3xPos, hfieldext/2 - yTrasl2],                #fila di tre palle
#        [line4xPos, hfieldext/2 + yTrasl1],  [line4xPos, hfieldext/2 - yTrasl1],  [line4xPos, hfieldext/2 + 3*rad + 2],  [line4xPos, hfieldext/2 - 3*rad - 2],        #fila di 4 palle
#        [line5xPos, hfieldext/2],  [line5xPos, hfieldext/2 + yTrasl2],  [line5xPos, hfieldext/2 - yTrasl2],  [line5xPos, hfieldext/2 + 2*yTrasl2],  [line5xPos, hfieldext/2 - 2*yTrasl2]]      #fila di 5 palle

pos = [[wfieldext/4, hfieldext/2],  [line1xPos, hfieldext/2],  [line2xPos, hfieldext/2 + yTrasl1],  [line2xPos, hfieldext/2 - yTrasl1],           #bianca e prime tre palle
       [line3xPos, hfieldext/2],  [line3xPos, hfieldext/2 + yTrasl2],  [line3xPos, hfieldext/2 - yTrasl2],                #fila di tre palle
       [line4xPos, hfieldext/2 + yTrasl1],  [line4xPos, hfieldext/2 - yTrasl1],  [line4xPos, hfieldext/2 + 3*rad + 2],  [line4xPos, hfieldext/2 - 3*rad - 2],        #fila di 4 palle
       [line5xPos, hfieldext/2],  [line5xPos, hfieldext/2 + yTrasl2],  [line5xPos, hfieldext/2 - yTrasl2],  [line5xPos, hfieldext/2 + 2*yTrasl2],  [line5xPos, hfieldext/2 - 2*yTrasl2]]      #fila di 5 palle

n = shape(pos)[0]         #essenzialmente il numero delle palline

posint = np.rint(pos).astype(int)

vin = [[0 for x in range(2)] for y in range(n)]                 #matrice velocità delle palle
v = [[0 for x in range(2)] for y in range(n)]
vmod = [0 for x in range(n)]                                    #moduli delle velocità
vprec = [0,0]                                                   #serve per la sezione attrito

#vettore imbucamento
imb = [0 for x in range(n)]

#disegno delle palline
pygame.draw.circle(screen, white, posint[0], rad, 0)            #bianca
for i in range(n-1):                                            #hfieldextre palle
    pygame.draw.circle(screen, red, posint[i+1], rad, 0)

clock = pygame.time.Clock()
done = False

#FUNZIONI

def inhole(ballPos):
    holeSize = 2.5*rad
    return ((ballPos[0] < holeSize and ballPos[1] < holeSize) or                                    #buca in alto a sinistra
        (ballPos[0] > wfieldext-holeSize and ballPos[1] > hfieldext-holeSize) or            #buca in basso a destra
        (ballPos[0] > wfieldext-holeSize and ballPos[1] < holeSize) or                      #buca in basso a sinistra
        (ballPos[0] < holeSize and ballPos[1] > hfieldext-holeSize))                        #buca in alto a destra

#INIZIO PROGRAMMA

ResetxPos = 0
ResetyPos = hfieldext
wReset = 100
hReset = 50
label = myfont.render("Reset", 1, black)

while not done:
    #refresh campo da gioco
    pygame.draw.rect(screen, white, pygame.Rect(ResetxPos, ResetyPos, wReset, hReset))   #ricomincia partita
    pygame.draw.rect(screen, darkgreen, pygame.Rect(0, 0, wfieldext, hfieldext))   #Campo da gioco, inutile al momento
    pygame.draw.rect(screen, green, pygame.Rect((wfieldext-wfieldint)/2, (hfieldext-hfieldint)/2, wfieldint, hfieldint))   #Campo da gioco, inutile al momento
    screen.blit(label, (ResetxPos+wReset/8, ResetyPos+hReset/4))
    #ricezione degli eventi input

    for event in pygame.event.get():
        if event.type == pygame.MOUSEBUTTONDOWN:        #Partenza pallina con click del mouse
            mousepos = pygame.mouse.get_pos()
            #movimento palla bianca
            if (mousepos[0] > (wfieldext-wfieldint)/2 and mousepos[0] < wfieldext - (wfieldext-wfieldint)/2 and
                mousepos[1] > (hfieldext-hfieldint)/2 and mousepos[1] < hfieldext - (hfieldext-hfieldint)/2):
                dist1 = sqrt((pos[0][0]-mousepos[0])**2+(pos[0][1]-mousepos[1])**2)
                v[0][0] = -fatt*(pos[0][0] - mousepos[0])/dist1
                v[0][1] = -fatt*(pos[0][1] - mousepos[1])/dist1
            #reset partita

            elif mousepos[0] > ResetxPos and mousepos[0] < ResetxPos+wReset and mousepos[1] > ResetyPos and mousepos[1] < ResetyPos+hReset:            #pulsante riavvia partita
                v = [[0 for x in range(2)] for y in range(n)]
                pos = [[wfieldext/4, hfieldext/2],  [line1xPos, hfieldext/2],  [line2xPos, hfieldext/2 + yTrasl1],  [line2xPos, hfieldext/2 - yTrasl1],           #bianca e prime tre palle
                       [line3xPos, hfieldext/2],  [line3xPos, hfieldext/2 + yTrasl2],  [line3xPos, hfieldext/2 - yTrasl2],                #fila di tre palle
                       [line4xPos, hfieldext/2 + yTrasl1],  [line4xPos, hfieldext/2 - yTrasl1],  [line4xPos, hfieldext/2 + 3*rad + 2],  [line4xPos, hfieldext/2 - 3*rad - 2],        #fila di 4 palle
                       [line5xPos, hfieldext/2],  [line5xPos, hfieldext/2 + yTrasl2],  [line5xPos, hfieldext/2 - yTrasl2],  [line5xPos, hfieldext/2 + 2*yTrasl2],  [line5xPos, hfieldext/2 - 2*yTrasl2]]      #fila di 5 palle
                imb = [0 for x in range(n)]
                screen.fill(black)
                pygame.draw.rect(screen, white, pygame.Rect(ResetxPos, ResetyPos, wReset, hReset))   #ricomincia partita
                pygame.draw.rect(screen, darkgreen, pygame.Rect(0, 0, wfieldext, hfieldext))   #Campo da gioco, inutile al momento
                pygame.draw.rect(screen, green, pygame.Rect((wfieldext-wfieldint)/2, (hfieldext-hfieldint)/2, wfieldint, hfieldint))   #Campo da gioco, inutile al momento
        if event.type == pygame.KEYDOWN and event.key == pygame.K_SPACE:
            for i in range(n):                      #matrice velocità randomiche
                for j in range(shape(v)[1]):
                    v[i][j] = fatt*(random.random()-0.5)
        if event.type == pygame.QUIT:           #Uscita dal gioco
            done = True

    #inizio del gioco

    #attrito

    for i in range(n):
        vprec[0] = v[i][0]
        vprec[1] = v[i][1]
        vmod[i] = sqrt(v[i][0]**2+v[i][1]**2)
        if (v[i][0] != 0 and v[i][1] != 0):
            v[i][0] -= dim*v[i][0]/vmod[i]
            v[i][1] -= dim*v[i][1]/vmod[i]

        if vprec[0]*v[i][0] <= 0:
                v[i][0] = 0
        if vprec[1]*v[i][1] <= 0:
                v[i][1] = 0

    #Movimento palline

    for i in range(n):
        pos[i][0] += v[i][0]
        pos[i][1] += v[i][1]

    #imbucamento palle
    for i in range(n):
        if inhole([pos[i][0],pos[i][1]]):
            if i == 0:
                pos[i] = [wfieldext/4, hfieldext/2]
                v[i] = [0, 0]
            else:
                imb[i] = 1;
                pos[i] = [wfieldext/4 + 2*i*rad+1, hfieldext + yTrasl1]
                v[i] = [0, 0]

    #Rimbalzo su pareti laterali
    for i in range(n):
        if imb[i] == 0:
            if ((pos[i][0] > wfieldext-(wfieldext-wfieldint)/2-rad) or (pos[i][0] < (wfieldext-wfieldint)/2+rad)):
                v[i][0] = -v[i][0]
            if ((pos[i][1] > hfieldext-(hfieldext-hfieldint)/2-rad) or (pos[i][1] < (hfieldext-hfieldint)/2+rad)):
                v[i][1] = -v[i][1]

    #matrice delle distanze

    dist = zeros((n, n))
    for i in range(n):
        for j in range(n):
            dist[i][j] = sqrt((pos[i][0]-pos[j][0])**2+(pos[i][1]-pos[j][1])**2)

    #sistema di urti
    for i in range(n):
        for j in range(n):
            if dist[i][j] <= 2*rad and i < j:                        #Urto tra palline
                count += 1
                costeta = (pos[j][0] - pos[i][0])/dist[i][j]
                sinteta = (pos[i][1] - pos[j][1])/dist[i][j]
                if costeta >= 0:
                    teta = asin(sinteta)
                elif costeta < 0 and sinteta >= 0:
                    teta = pi-asin(sinteta)
                elif costeta < 0 and sinteta < 0:
                    teta = -pi-asin(sinteta)

                R = [costeta, -sinteta],[sinteta, costeta]
                Rt = [costeta, sinteta],[-sinteta, costeta]
                v1m = [R[0][0]*v[i][0]+R[0][1]*v[i][1], R[1][0]*v[i][0]+R[1][1]*v[i][1]]
                v2m = [R[0][0]*v[j][0]+R[0][1]*v[j][1], R[1][0]*v[j][0]+R[1][1]*v[j][1]]

                v2mp = v2m[0]
                v2m[0] = v1m[0]
                v1m[0] = v2mp

                v2m[0] = v2m[0]*1.01
                v1m[0] = v1m[0]*1.01

                v[i][0] = Rt[0][0]*v1m[0]+Rt[0][1]*v1m[1]
                v[i][1] = Rt[1][0]*v1m[0]+Rt[1][1]*v1m[1]
                v[j][0] = Rt[0][0]*v2m[0]+Rt[0][1]*v2m[1]
                v[j][1] = Rt[1][0]*v2m[0]+Rt[1][1]*v2m[1]

    #aggiornamento posizioni palle
    posint = np.rint(pos).astype(int)           #matrice posizioni intere delle palle

    #disegno nuove posizioni delle palle

    pygame.draw.circle(screen, white, posint[0], rad, 0)
    for i in range(n-1):
        pygame.draw.circle(screen, red, posint[i+1], rad, 0)

    #aggiornamento dello schermo e fine del ciclo

    pygame.display.flip()
    clock.tick(700)

    if done:
        pygame.quit()
