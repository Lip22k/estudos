# 01 - Área do retangulo - Pegue dados do usuario e calcule a área do retangulo
"""
largura = int(input("Qual a largura do retangulo: "))
altura = int(input("Qual a altura do retangulo: "))

area = int(largura*altura)

print("A área do seu retangulo é igual:", str(area) + "M²")
"""

# 02 - Área do quadrdao - Pegue dados do usuario e calcule a área do quadrdao
"""
# coleta dos dados fornecido pelo usuario
lado = int(input("Qual o tamanho do lado do quadrado: "))

print("A area do quadrado é igual: {0}M²".format(lado*lado))
"""

# 03 - Calculo de desconto - Pegue o valor do produto (N) e calcule o desconto
# (D) de acordo com o valor do produto
"""
valorProd = float(input("Digite o valor do produto: "))
desconto = float(input("quanto % desconto o produto deve receber: "))

print(
    "O produto que custa R${0} terá um desconto de {1}%, passando a valer R${2}".format(
        valorProd, desconto, int(valorProd) - (valorProd * desconto / 100)
    )
)

# if valorProd <= 5:
# print(
#     "O produto que custa R${0} terá um desconto de 5%, passando a valer R${1}
# ".format(
#         valorProd, valorProd - (valorProd * 5 / 100)
#     )
# )
# elif valorProd <= 10:
#     print(
#         "O produto que custa R${0} terá um desconto de 10%, passando a valer R${1}".format(
#             valorProd, valorProd - (valorProd * 10 / 100)
#         )
#     )
# else:
#     print(
#         "O produto que custa R${0} terá um desconto de 20%, passando a valer R${1}".format(
#             valorProd, valorProd - (valorProd * 20 / 100)
#         )
#     )
"""

# 04 - Área do cirulo
"""
raio = float(input("Qual o tamanho do raio do circulo: "))
print("A área do cicrulo é igual {}".format(raio*raio*3.14))
"""
