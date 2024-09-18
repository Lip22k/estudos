# A utilização dos operadores de identidade serve para saber se eles ocupam o mesmo lugar na memória

# utilizando IS e IS NOT o resultado me mostra um valor booleano

nome = "Philip"
nome_aluno = nome

print(nome is nome_aluno) # res: true

nome = "Philip"
nome_aluno = "philip"

print(nome is nome_aluno) # res: false

salario, aumento = 1000, 1000

print(salario is aumento) # res: true