import random
import time
import os

def writeM (camp):
	print("  0 1 2 3 4 5 6 7 8 9")
	for i in range(10):
		print(chr(i+65), end=' ')
		for j in range(10):
			print(camp[i][j], end=' ')
		print("")
	print()


def isPositionable (camp, r, c, dim, s):
	b = True
	v = [4, 3, 3, 2, 2, 1]

	if s == 0:
		if c >= 10-(v[dim]-1):
			b = False
		for i in range(v[dim]):
			if camp[r][c+i] == '-' or camp[r][c+i] == '|':
				b = False
	else:
		if r >= 10-(v[dim]-1):
			b = False
		for i in range(v[dim]):
			if camp[r+i][c] == '-' or camp[r+i][c] == '|':
				b = False

	return b


def enterB (camp):
	v = [4, 3, 3, 2, 2, 1]

	for j in range(6):
		coord = str(input("Inserisci le coordinate della la nave: "))
		r = ord(coord[0]) - 65
		c = int(coord[1])

		print("Come vuoi inserire la nave?\n0. Orizzontale\n1. Verticale")
		s = int(input(""))

		while isPositionable(camp, r, c, j, s) == False:
			os.system('clear')
			writeM(camp)
			print("Impossibile posizionare la nave\n")
			coord = str(input("Reinserisci le coordinate della la nave: "))
			r = ord(coord[0]) - 65
			c = int(coord[1])

			print("Come vuoi inserire la nave?\n0. Orizzontale\n1. Verticale")
			s = int(input(""))

		if s == 0:
			for i in range(v[j]):
				camp[r][c+i] = '-'
		else:
			for i in range(v[j]):
				camp[r+i][c] = '|'

		os.system('clear')
		writeM(camp)


def randomPlace (camp):
	r = 0
	c = 0
	s = 0
	v = [4, 3, 3, 2, 2, 1]

	for j in range(6):
		limit = 10-(v[j])

		s = random.randint(0, 1)
		if s == 0:
			r = random.randint(0, 9)
			c = random.randint(0, limit)
		else:
			r = random.randint(0, limit)
			c = random.randint(0, 9)

		while isPositionable(camp, r, c, j, s) == False:
		 	s = random.randint(0, 1)
		 	if s == 0:
		 		r = random.randint(0, 9)
		 		c = random.randint(0, limit)
		 	else:
		 		r = random.randint(0, limit)
		 		c = random.randint(0, 9)

		if s == 0:
			for i in range(v[j]):
				camp[r][c+i] = '-'
		else:
			for i in range(v[j]):
				camp[r+i][c] = '|'


def isFinished (camp):
	f = True

	for i in range(10):
		for j in range(10):
			if camp[i][j] == '-' or camp[i][j] == '|':
				f = False

	return f


def game(camp1, camp2, camp3, debug):
	win = False
	f = False

	os.system('clear')
	if debug == True:
		writeM (camp2)
	else:
		writeM (camp3)
	writeM (camp1)

	while f == False:
		isHit = True
		while isHit == True:
			coord = str(input("Inserisci le coordinate di dove colpire: "))
			r = ord(coord[0]) - 65
			c = int(coord[1])


			if camp2[r][c] == '-' or camp2[r][c] == '|':
				camp2[r][c] = 'X'
				camp3[r][c] = 'X'
				os.system ('clear')
				if debug == True:
					writeM (camp2);
				else:
					writeM (camp3);
				writeM (camp1)
				isHit = True
				print("Hai colpito")
			else:
				camp2[r][c] = '*'
				camp3[r][c] = '*'
				os.system ('clear')
				if debug == True:
					writeM (camp2);
				else:
					writeM (camp3);
				writeM (camp1)
				isHit = False
				print("Hai colpito acqua")
			time.sleep(1.5)

			if isFinished(camp2) == True:
				win = True
				f = True
				break


		isHit = True
		while isHit == True:

			b = False
			while b == True:
				r = random.randint(0, 9)
				c = random.randint(0, 9)
				if camp1[r][c] == 'X' or camp1[r][c] == '*':
					b = True
				else:
					b = False

			if camp1[r][c] == '-' or camp1[r][c] == '|':
				camp1[r][c] = 'X'
				os.system ('clear')
				if debug == True:
					writeM (camp2);
				else:
					writeM (camp3);
				writeM (camp1)
				isHit = True
				print("Ti hanno colpito")
			else:
				camp1[r][c] = '*'
				os.system ('clear')
				if debug == True:
					writeM (camp2);
				else:
					writeM (camp3);
				writeM (camp1)
				isHit = False
				print("Non ti hanno colpito")
			time.sleep(1.5)
			if isFinished(camp1) == True:
				f = True


	return win



camp1 = [[" " for x in range(10)] for y in range(10)]
camp2 = [[" " for x in range(10)] for y in range(10)]
camp3 = [[" " for x in range(10)] for y in range(10)]

randomPlace (camp2)

debug = int(input("Attivare debug?\n0. No\n1. Si\n"))
os.system ('clear')

randomPlace (camp1)

writeM (camp1)
#enterB (camp1)

win = game(camp1, camp2, camp3, debug)

os.system('clear')

if win == True:
	print("Hai vinto!")
else:
	print("Hai perso!")
