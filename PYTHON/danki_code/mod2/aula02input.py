# Função input - receber dados do usuario
"""
nome = input("Qual seu nome: ")
idade = int(input("Qual sua idade: "))

Podemos executar apenas um print com os 2 valores utilizando {} para
especificar onde cada varaivel deve ficar e a função formart() para passar
as variaveis

print("Olá, {0}, seja bem-vindo. Você possui {1} anos?".format(nome, idade))

confirme = input("Digite [Y] ou [N]: ")

if confirme == "y":
    print("parabens, você foi cadastrado.")
elif confirme == "n":
    print("Nós vemos mais tarde então")
"""
"""Outra forma é utilizando print(f'text {varivel}')"""

nome = str(input("Digite seu nome: "))
idade = input("Digite sua idade: ")

print(f"seu nome é {nome} e sua idade é {idade}")