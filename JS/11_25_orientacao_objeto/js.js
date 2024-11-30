// Criar um objeto: passa um function com a 1º letra maiscula
function Pessoa(nome, idade, endereco) {
    // this - atributos do Obj
    this.name = nome
    this.idade = idade
    this.endereco = endereco

    // podemos passar functions dentro dos objetos, criando um atributo para ele
    this.printNome = function (nome) {
        console.log(nome)
    }
}
// Instancia um novo Obj com a tag *NEW*
var pessoaPhilip = new Pessoa("Philip", 18, "Rua odilon Correia Pires");

// Interação com o outro objeto
var pessoaKath = new Pessoa("Kath", 20, "Rua dos Acreanos")

// Voce deve passar um argumento ao atributo da funcão
pessoaKath.printNome(pessoaKath.name);
pessoaPhilip.printNome(pessoaKath.name);