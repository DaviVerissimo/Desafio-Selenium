# language: pt

Funcionalidade: Automação de Cotação de Seguro

Cenário: Preencher o formulário de seguro e enviar a cotação

    Dado que eu navego para "http://sampleapp.tricentis.com/101/app.php"
    Quando eu preencho os dados do veículo e avanço para a próxima etapa
    E eu preencho os dados do segurado e avanço para a próxima etapa
    E eu preencho os dados do produto e avanço para a próxima etapa
    E eu seleciono uma opção de preço e avanço para a próxima etapa
    E eu envio a cotação
    Então eu devo ver a mensagem "Envio de e-mail bem-sucedido!"