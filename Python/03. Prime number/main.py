def prime(n):
	f = True
	i = int(2)
	while i < n:
		r = n % i
		if r == 0:
			f = False
		i += 1
	return f

n = int(input("inserisci un numero per verificare se è primo: "))

if prime(n) == True:
	print("Il numero inserito è primo\n")
else:
	print("Il numero inserito non è primo\n")
