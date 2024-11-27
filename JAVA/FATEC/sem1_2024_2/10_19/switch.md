# Comando de Decisão SWITCH

## ->Avalia um expressão enumeravel (Contavel)

*Sintaxe*
    Switch(expressão){
        case valor1:

        break;
        case valor2:

        break;

        default; //opcional
    }

> OBS
*1. A opção **default** não é obrigatória, assim como o else do **if**
*2. O uso do **break** pode ser necessario em alguns casos. Neste comando ele quebra o efeito cascata
*3. Não precisa seguir senquecialmente os valores de casos
*4. Você pode usar um grupo da seguinte forma:

```
switch(expression){
    case 1:
    case 7:
        int teste = "teste";
        ...
        break;
    case 2:
    case 3:
    case 4:
        ...
        break;
    default:
        ...
}
```
*4. as variaveis criadas dentro do escopo de caso fica amarradas ao escopo

# Comano de Decisão Operador ternario