let qtd = 3

fetch('http://servicodados.ibge.gov.br/api/v3/noticias/?')
    .then(response => response.json())
    .then(data => {
        console.log(data);

    })
    .catch(error => {
        console.error('Erro:', error);
    });