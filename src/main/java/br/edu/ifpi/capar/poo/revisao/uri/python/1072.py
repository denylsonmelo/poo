qtd_numeros_ler = int(input())

numeros_dentro, numeros_fora = 0, 0

for i in range(1, qtd_numeros_ler+1):
    numero = int(input())

    if 10 <= numero <= 20:
        numeros_dentro += 1
    else:
        numeros_fora += 1

print("{} in".format(numeros_dentro))
print("{} out".format(numeros_fora))