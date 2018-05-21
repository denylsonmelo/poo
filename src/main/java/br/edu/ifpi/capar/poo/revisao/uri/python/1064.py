soma, positivos = 0, 0
for i in range(0,6):
    numero = float(input())
    
    if numero >= 0 :
        soma += numero
        positivos += 1

print("{} valores positivos".format(positivos))
print("{:.1f}".format(soma/positivos))