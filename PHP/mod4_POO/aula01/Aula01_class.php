<?php
    // Para definir uma classe iniciamos com a tag "class" seguida do nome da classe, iniciado por maiuscula e seguida por CamelCase, e iniciado e termiinado por chaves.
    // Uma classe pode ter suas proprias variaveis chamadas de propriedade e funções chamados de metoddos, cada um com sua propria padronização padrão.    
    class FirstClassExemple{
        // para declarar uma propriedade global utilizamos a tag "public" seguida da variavel
        public $prop1 = "Eu sou uma propriedade muito foda";
        public $peso = 18;

        // a declaração de um metodo global é feito utilizando "puplic" também seguida de uma criação de function.
        // Tudo que estiver como public posso acionar em um objeto instaciado.
        public function Met1(){
            // a pseudo-variavel $this serve para executar ações dentro da classe.
            $this->Met2();
            echo $this->prop1;
        }
        private function Met2(){
            echo $this->peso;
        }
    }
    // Instanciamos uma classe em um objeto utilizando a tag "new" seguida do nome da classe;
    $obj = new FirstClassExemple();
    // Acessamos seus metodos utilizando as flechas (->).
    $obj->Met1();

    // $obj->Met2();
    // Me retornar um erro dizendo que não posso acessar metodos privados
?>