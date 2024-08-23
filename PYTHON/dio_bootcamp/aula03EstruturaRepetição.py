# Estrutura de repetição serve para fazer a repetição de um bloco de código por um determinado N° de vezes
# Esse n° pode ser preciamente conhecido ou determinado atravez de uma expressão logica

# Quando sabemos o numero de vezes que o código deve ser repetido utilizamos o FOR.

# O programa pega a palavra e informa q auanbtidade de vogais
texto = input("Digite uma palavra: ").lower()
vogais = "aeiou"
nVogais = 0
nConsoantes = 0
listaConsoantes = ""
listaVogais = ""
for i in texto:
    if i in vogais:
        if i not in listaVogais and i != " ":
            listaVogais += i
            nVogais+=1
    elif i != " ":
        listaConsoantes += i
        nConsoantes+=1
        
print("No texto informado temos um total de {0} vogais e {1} consoantes".format(nVogais, nConsoantes))
print("essas Vogais são: {0}".format(list(listaVogais)))
print("essas consoantes são: {0}".format(list(listaConsoantes)))