def mcd(a, b):
	while b != 0:
		r = a % b
		a = b
		b = r
	return a

a = int(input("Inserisci a: "))
b = int(input("Inserisci b: "))

print("il minimo comune multiplo è:", mcd(a, b))
