linha = input().split(" ")

lista = sorted(map(float, linha))

ladoA = lista[2]
ladoB = lista[1]
ladoC = lista[0]

if ladoA >= (ladoB + ladoC):
    print("NAO FORMA TRIANGULO")
elif ladoA**2 == (ladoB**2 + ladoC**2):
        print("TRIANGULO RETANGULO")
    elif ladoA**2 > (ladoB**2 + ladoC**2):
            print("TRIANGULO OBTUSANGULO")
        elif ladoA**2 < (ladoB**2 + ladoC**2):
            print("TRIANGULO ACUTANGULO")
        elif ladoA == ladoB and ladoB == ladoC:
            print("TRIANGULO EQUILATERO")
        elif ladoA == ladoB or ladoA == ladoC or ladoB == ladoC:
            print("TRIANGULO ISOSCELES")
            
