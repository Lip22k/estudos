# O for em python usamos de forma totalmente diferente 
# do comum em liguagens de programação

# Podemos está verificando algo em um objeto interavel
# utilizando o IN, NOT IN

"""
s = "Jandira"
for x in s:
    print(x) # Aqui ele assume cada valor do objeto e imprime ele
"""



# Para ele ser usado da forma convecional utilizamos o range
"""
for x in range(6):
    print(x) #ele percorre o objeto que possui 6 valores inteiros (0 a 5)
"""
senha = str(input("digite sua senha do banco: \n"))
nums = "0,1,2,3,4,5,6,7,8,9"

senhaUser = ""

for x in senha:
    if x in nums:
        a = True
        senhaUser += x
    else:
        a = False
        print("Sua senha só pode ter numeros")

if a == True:
    print("Senha Cadastrada")