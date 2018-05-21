linha = input().split(" ")

a = float(linha[0])
b = float(linha[1])
c = float(linha[2])

delta = (b**2) - (4 * a * c) 

if a == 0 or
    print("Impossivel calcular")
elif delta < 0 :
    print("Impossivel calcular")
else:
    raiz1 = (-b + delta**0.5) / (2*a)
    raiz2 = (-b - delta**0.5) / (2*a)

    print("R1 = {:.5f}".format(raiz1))
    print("R2 = {:.5f}".format(raiz2))
