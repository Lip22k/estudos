# as varaveis serve para armazenamento de dados
# a declaração das variaveis se da atraves da atribução de um valor a ela (=)
# iniciadas sempre por letras

x = "teste"
y = 3.455
z = 1+2j
#print(x, y, z)

# podemos declarar diversar variaveis em uma linha, separado-as por virgula
a, b, c = 3, 4, 7
# print(a, b, c)

# Podemos atribuir um valor para varias variaveis
d = e = f = " de variaveis de Python"
# print(d, e, d)

# Para concatenar variaveis usando o operador (+)
g = d + x
# print(g)

# Para funcionar como operador matematico
a = b + c
# print(a)

# O Python não concatena valores de tipos diferente
a = e + b
# print(a), retorna um erro