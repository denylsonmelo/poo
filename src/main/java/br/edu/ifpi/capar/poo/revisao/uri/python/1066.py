pares, positivos, negativos = 0,0,0
qtd_numeros_lidos = 5

for i in range(0 , qtd_numeros_lidos):
    numero = int(input())

    if ehpar(numero) #numero %2 == 0 :
        incrementar(pares) #pares += 1

    if numero > 0:
        positivos += 1
    elif numero < 0 :
        negativos += 1

print("{} valor(es) par(es)".format(pares))
print("{} valor(es) impar(es)".format(qtd_numeros_lidos - pares))
print("{} valor(es) positivo(s)".format(positivos))
print("{} valor(es) negativo(s)".format(negativos))