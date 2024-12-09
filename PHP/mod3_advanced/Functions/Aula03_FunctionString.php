<?php

    // A função substr(String, Int, Int) serve para recortar uma parte de uma string, em que o 1 argumento é a String que você quer manipular, o 2° é onde começa a contagem da String e o 3° é onde termina.
    $conteudo = "Lorem ipsum dolor sit amet";

    echo substr($conteudo, 0, 10);

    // A função explode(String, String). nos retorna um array que em que seus indices são dimensionados pelo 1° argumento, ou seja, caso definimos que ele gere uma array em que o ponto de divisão seja o espaço em branco ele vai nos retornar.
    print_r(explode(" ", $conteudo));
    // A função inpluide(String, String), no retorna o contrario da explode, ela passa os valores de uma array para uma string separadas por um caractere
?>