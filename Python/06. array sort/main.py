def writeV (v, n):
	for i in range(n):
		print(v[i])

def readV (v, n):
	for i in range(n):
		num = int(input("Inserisci l'elemento: "))
		v.append(num)

v = []
n = int(input("Inserisci la dimesione del vettore: "))

readV (v, n)
v.sort()
writeV (v, n)
