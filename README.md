# Projeto Ninja: Herança e Arrays em Java ☕

E aí, beleza? Nesse projeto, meu foco foi mexer com herança em Java e também botar pra funcionar um menu interativo usando arrays.

Aqui eu trabalhei com duas “tribos” de ninjas:

- Ninja comum (a base, simples e direto)  
- Ninja Uchiha (que tem uma habilidade especial a mais)

No meio disso tudo, usei uns conceitos que você já deve conhecer:  
`switch-case`, `if/else`, `for` e claro, a herança, que é o pulo do gato pra especializar as classes.

---

## O que rola no projeto

- Cadastro de ninja comum ou Uchiha  
- Atualizar a habilidade especial do Uchiha pelo nome (com busca “flexível”, que não liga pra maiúscula/minúscula)  
- Listar os nomes  
- Mostrar todas as infos dos ninjas cadastrados

---

## Uma parada que achei massa

Usei essa função aqui pra comparar o nome que o usuário digitou com os que já existem no array:

``java
ninjaUchiha[i].nome.equalsIgnoreCase(buscaNinja)``

Isso permite achar o ninja mesmo se o usuário digitar com letra maiúscula ou minúscula — tipo “Itachi” ou “itachi” são considerados a mesma coisa.

O que aprendi:
- Como trabalhar com herança e estender classes no Java.
- Usar arrays pra guardar objetos
- Fazer menus que recebem opção do usuário e tratam exceção (pra não travar se o cara digita bobagem)

###Rodando o projeto
- Clona o repo
- Compila as classes
- Roda a classe principal Desafio3

Segue o menu que aparece no console e testa as funções

Se quiser trocar ideia, dar uma dica, só chamar!

Autor: TonGonzalez
