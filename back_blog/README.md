# API para o blog

Esta API será responsável por salvar um usuário na base de dados caso ele ainda não exista, retornando o valor 'true' para o caso do usuário ter sido inserido na base com sucesso e 'false' para o caso de usuário já existir na base.
Esta API está utilizando MySQL.
Esta API irá funcionar na porta 9999.
Utilizando como localhost o endereço fica:
http://localhost:9999/salvarPessoa

# CONTRATO DE ENTRADA
Esta API espera um contrato de entrada no formato JSON, como no exemplo a seguir.

{"nome":"TESTE4", "email":"teste4@email.com", "ip":"0.0.0.0"}

#Subindo a API localmente
Para subir a API como localhost, basta ter o maven instalado na máquina.
Após isso, ir até a pasta do projeto abrir o terminal e rodar o comando:
	mvn clean install spring-boot:run

Ou é possível fazer isso também, navegando até a pasta target do projeto e executando o comando:
java -jar back_blog-0.0.1-SNAPSHOT.jar

Vale ressaltar que este arquivo jar é o mesmo que deverá ser utilizado para deploy

#BASE DE DADOS
Lembrando que a tabela está na schema pessoa, e configurado para a porta 3306
