# Podemos para nosso loop quando uma condição for atendida

a = 0
while a <= 5:
    # if a == 4:
    #     break
    print(a)
    a += 1

print("")

# O while pode ter um código que é executado caso ele não
# seja atendido usando else.
b = 0
while b <= 6:
    print(b)
    b+=1
else:
    print("B não é menor que 6, veja: {0}".format(b))
