# Escopo de variaveis

# As variaveis globais são declaradas fora de todos os blocos de funções e são acessevieis de qualquer parte do programa
# As variaveis locais são declaradas dentro de um bloco de funções e só existe dentro desse bloco, não podendo ser chamadas fora do bloco

x = 5

def funcao():
    x = 3
    print("teste",x)
funcao()

print("teste",x)