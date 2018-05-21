numero_funcionario = int(input())
qtd_hrs_trabalhadas = int(input())
valor_hora = float(input())

salario = qtd_hrs_trabalhadas * valor_hora

print("NUMBER = {}".format(numero_funcionario))
print("SALARY = U$ {:.2f}".format(salario))