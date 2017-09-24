# API para o blog

Esta API será responsável por salvar um usuário na base de dados caso ele ainda não exista, retornando o valor 'true' para o caso do usuário ter sido inserido na base com sucesso e 'false' para o caso de usuário já existir na base.
Esta API está utilizando MySQL.
Esta API irá funcionar na porta 9999

# CONTRATO DE ENTRADA
Esta API espera um contrato de entrada no formato JSON, como no exemplo a seguir.

{"nome":"TESTE4", "email":"teste4@email.com", "ip":"0.0.0.0"}

