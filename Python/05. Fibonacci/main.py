n = int(input("Inserisci la lunghezza della sequenza di fibonacci: "))
n1 = 0
n2 = 1
for i in range(n):
	print(n1)
	num = n1 + n2
	n1 = n2
	n2 = num
