

import pygame
import math
from math import sqrt, pi, asin
import time
import numpy as np
from numpy import shape, zeros
import random

#COLORI
black = (0, 0, 0)
white = (255, 255, 255)
red = (200, 0, 0)
green = (0, 200, 0)
lightblue = (20, 20, 200)
darkgreen = (0, 100, 0)

#INITIALIZATION

pygame.init()

fontSize = 17
myfont = pygame.font.SysFont("monospace", fontSize)

wScreen = 400                      #schermo
hScreen = 700
screen = pygame.display.set_mode((wScreen, hScreen))
screen.fill(black)
pygame.display.set_caption('Battleship')

clock = pygame.time.Clock()
done = False

wFieldAI = 300
hFieldAI = 300
xFieldAI = 0
yFieldAI = 0
pygame.draw.rect(screen, white, pygame.Rect(xFieldAI, yFieldAI, wFieldAI, hFieldAI))

wFieldPlayer = 300
hFieldPlayer = 300
xFieldPlayer = 0
yFieldPlayer = 350
pygame.draw.rect(screen, white, pygame.Rect(xFieldPlayer, yFieldPlayer, wFieldPlayer, hFieldPlayer))

nCells = 10
wCells = wFieldAI/nCells
hCells = hFieldAI/nCells


Field = [[0 for x in range(10)] for y in range(10)]

Letters = ['A','B','C','D','E','F','G','H','I','L']
Numbers = ['0','1','2','3','4','5','6','7','8','9']

for i in range(len(Letters)):
	screen.blit(myfont.render(Letters[i], 1, white), (wCells*i+wCells/3, yFieldAI+hFieldAI))      #Campo AI
	screen.blit(myfont.render(Numbers[i], 1, white), (xFieldAI+wFieldAI+wCells/3, wCells*i+wCells/3))
	screen.blit(myfont.render(Letters[i], 1, white), (wCells*i+wCells/3, yFieldPlayer+hFieldPlayer))      #Campo Player
	screen.blit(myfont.render(Numbers[i], 1, white), (wCells*i+wCells/3, yFieldPlayer+hFieldPlayer))

pygame.display.flip()



#FUNZIONI

def isIn(mousePos,xPosRect,yPosRect,wFieldAI,hFieldAI):
    return (mousePos[0] > xPosRect and mousePos[0] < xPosRect+wFieldAI and
            mousePos[1] > yPosRect and mousePos[1] < yPosRect+hFieldAI)


def isPositionable(Field, row, column, dim, Verse):
	bool = True
	if Verse == 0:
		if column >= 10-(dim-1):
			bool = False
		for i in range(dim):
			if Field[row][column+i] == 1:
				bool = False
	else:
		if row >= 10-(dim-1):
			bool = False
		for i in range(dim):
			if Field[row+i][column] == 1:
				bool = False
	return bool


def randPos(Field):
    randRow = 0
    randCol = 0
    Verse = 0
    Dims = [5, 4, 3, 3, 2, 1]

    for i in range(len(Dims)):
        limit = nCells - Dims[i]
        Verse = random.randint(0, 1)
        if Verse == 0:
            randRow = random.randint(0, 9)
            randCol = random.randint(0, limit)
        else:
            randRow = random.randint(0, limit)
            randCol = random.randint(0, 9)
        while not isPositionable(Field, randRow, randCol, Dims[i], Verse):
             Verse = random.randint(0, 1)
             if Verse == 0:
                 randRow = random.randint(0, 9)
                 randCol = random.randint(0, limit)
             else:
                 randRow = random.randint(0, limit)
                 randCol = random.randint(0, 9)
        if Verse == 0:
            for j in range(Dims[i]):
                Field[randRow][randCol+j] = 1
        else:
            for j in range(Dims[i]):
                Field[randRow+j][randCol] = 1
    return Field

#POSIZIONAMENTO NAVI PLAYER
phase = 1

while phase == 1:
	for event in pygame.event.get():

		if event.type == pygame.MOUSEBUTTONDOWN:        #Partenza pallina con click del mouse
			mousePos = pygame.mouse.get_pos()
			if isIn(mousePos,xFieldPlayer,yFieldPlayer,wFieldPlayer,hFieldPlayer):
				xCoord = int(math.floor((mousePos[0]-xFieldPlayer)/wCells))
				yCoord = int(math.floor((mousePos[1]-yFieldPlayer)/hCells))

				xHit = xFieldPlayer + xCoord*wCells
				yHit = yFieldPlayer + yCoord*hCells
				pygame.draw.rect(screen, lightblue, pygame.Rect(xHit, yHit, wCells, hCells))
				pygame.display.flip()
	#phase = 2

#POSIZIONAMENTO NAVI AI
randField = randPos(Field)

#INIZIO CICLO WHILE


while not done:

    for event in pygame.event.get():

        if event.type == pygame.MOUSEBUTTONDOWN:        #Partenza pallina con click del mouse
            mousePos = pygame.mouse.get_pos()
            if isIn(mousePos,xFieldAI,yFieldAI,wFieldAI,hFieldAI):
                xCoord = int(math.floor(mousePos[0]/wCells))
                yCoord = int(math.floor(mousePos[1]/hCells))
                xHit = xCoord*wCells
                yHit = yCoord*hCells
                if Field[yCoord][xCoord] == 1:
                    pygame.draw.rect(screen, red, pygame.Rect(xHit, yHit, wCells, hCells))
                else:
                    pygame.draw.rect(screen, lightblue, pygame.Rect(xHit, yHit, wCells, hCells))

        if event.type == pygame.QUIT:           #Uscita dal gioco
            done = True

    pygame.display.flip()
    clock.tick(30)

    if done:
        pygame.quit()
