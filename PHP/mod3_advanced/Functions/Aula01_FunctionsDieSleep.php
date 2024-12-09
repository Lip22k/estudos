<?php
    // A função sleep(args) serve para dar um atraso para iniciar o servidor, em que, "args" é o tempo em segundos (val_int) até o servidor responder.
    sleep(10);
    echo"Olá mundo";

    // A função die(args) serve para "matar" seu código ele termina de executar tudo que vir após ele, em que "args" é um texto livre (str_val)
    $nome = "Santos";
    if ($nome == "Philip") {
        die("Morreu na praia");
    }else {
        echo"aprovado";
    }
    sleep(2);
    echo"Olá mundo";
?>