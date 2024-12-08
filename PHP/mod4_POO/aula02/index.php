<?php
    // Para conseguir usar o objetos é necessario incluir-lo no projeto
    include "Aula02_ExempleClass.php";

    // Instanciar um objeto
    $exem = new ExempleClass;

    // Para chamar um atributo segue a mesma logica do metodo utilizando a flecha(->)
    // $exem->var1 = "Caralho"; #nos retorna um erro por ser um atributo privado

    /*$exem->var2 = "Philip"; #funciona normal por ser publico
    echo $exem->var2; #funciona normal por ser publico

    ExempleClass::$var3 = "Viana"; #chamando um metodo estico
    echo ExempleClass::$var3;*/

    echo $exem->Soma2Valores(14, 16);
    
?>