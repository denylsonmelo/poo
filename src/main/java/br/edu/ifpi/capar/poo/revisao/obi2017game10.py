#n posicoes
#numero minimo de vezes que o jogador aperta o botao
#numero de linhas maior igual a 3 e menor igual a 100
n=int(input())
if n >= 3 and n <= 100:
    posi_disco=int(input())
    posi_aviao=int(input())
    if posi_disco and posi_aviao >= 1:
        if posi_disco <= n and posi_aviao <= n:


            if posi_disco < posi_aviao:
                x=n + posi_disco-posi_aviao

            else:
                x=(posi_disco-posi_aviao)
            print(x)
