<?php
    // Funções serve para executar um trecho de código afim de minimizar redundancias e repetições de códigos.
    // Podemos atribuir uma function a um variavel ou passar ela "solta"
    $function = function() {
        return "Sou uma função";
    };
    
    // Quando definimos uma função o seu nome deve sempre começar com letra maiúscula
    // Podemos passar argumentos, variaveis, para essa função dentro dos parentêses
    function CalculaIMC($peso, $altura) {
        $altura = ($altura/100)*($altura/100);
        $imc = $peso/$altura;
        // O comando "return" mostra o que será retornado pela função
        // Podemos utilizar funções, já existe no seu código, dentro de outras funções
        return number_format($imc,2);
    };

    // Como definimos somente o que será retornado pela função, definimos fora como ela será manipulada.
    // Os valoraes dos argumentos passamos dentro dos parênteses, separados por vigula. Tome cuidado com o tipo dos valores desses argumentos, como PHP não é uma linguagem fotemente tipada, sempre documente o que cada varivel é e deve receber.
    echo CalculaIMC(70, 180);

    // Funções nativas são funções já existentes dentro do proprio PHP
?>