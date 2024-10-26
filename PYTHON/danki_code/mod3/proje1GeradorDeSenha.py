"""
caracterEspecial = ['!', '@', '#', '%', '&', '*']

senha = input("Digite a sua Senha:\n-> ")
confirmaSenha = input("Confirme a sua Senha:\n-> ")

while senha != confirmaSenha:
    print("\nAs senha não coincidem")
    senha = input("Digite a sua Senha:\n-> ")
    confirmaSenha = input("Confirme a sua Senha:\n-> ")
while len(senha) < 8:
    print("As senha devem possuir no minimo 8 caracteres\n")
    senha = input("Digite a sua Senha:\n-> ")
    confirmaSenha = input("Confirme a sua Senha:\n-> ")
"""