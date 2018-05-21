linha = input().split(" ")
a = int(linha[0])
b = int(linha[1])
c = int(linha[2])
d = int(linha[3])

if b > c and d > a and ((c+d)>(a+b)) and c > 0 and d > 0 and (a%2==0):
    print("Valores aceitos")
else:    
    print("Valores nao aceitos")
