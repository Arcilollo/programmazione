def writeV (v, n):
	for i in range(n):
		print(v[i])

def readV (v, n):
	for i in range(n):
		num = int(input("Inserisci l'elemento il numero " + str(i) + ": "))
		v.append(num)

v1 = []
v2 = []
v3 = []

n = int(input("inserisci lunghezza degli array: "))
readV (v1, n)
readV (v2, n)

for i in range(n):
	v3.append(v1[i] + v2[i])

for i in range(n):
	print(str(v1[i]) + " " + str(v2[i]) + " " + str(v3[i]) )
