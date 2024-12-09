<?php
    class ExempleClass{
        // Private = Só podemos acessar algo private dentro da class
        #private $var1;
        // Public = Podemos acessar algo public em qualquer lugar do código
        #public $var2;

        // Podemos passar outro atriibuto para o public ou private que é o "static"
        // Apartir do Static não precisamo instaciar uma classe, podemos chamar ela diretamente pela classe
        #public static $var3;

        public $soma;
        public function Soma2Valores($var1, $var2){
            return $this->soma = $var1+$var2;
        }
    }
    
?>