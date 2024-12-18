# GenFit

## Sobre o Projeto

**GenFit** é uma plataforma de fitness personalizada, projetada para criar séries de exercícios adaptadas às necessidades individuais dos usuários. Com funcionalidades completas de CRUD (Create, Read, Update, Delete), o sistema permite gerenciar usuários, exercícios e séries de maneira eficiente.

---

## Funcionalidades

- **Usuários**
  - Cadastro de usuários com informações como nome, e-mail, senha, foto, altura e peso.
- **Exercícios**
  - Gerenciamento de exercícios personalizados.
- **Séries**
  - Criação de séries de exercícios para usuários com descrição detalhada e período.

---

## Estrutura das Entidades

### Usuário
| Atributo    | Tipo   | Descrição                 |
|-------------|--------|---------------------------|
| `id`        | Long   | Identificador único       |
| `nome`      | String | Nome do usuário           |
| `usuario`   | String | E-mail do usuário         |
| `senha`     | String | Senha do usuário          |
| `foto`      | String | URL da foto do usuário    |
| `altura`    | Float  | Altura do usuário         |
| `peso`      | Float  | Peso do usuário           |

### Exercício
| Atributo  | Tipo   | Descrição                 |
|-----------|--------|---------------------------|
| `id`      | Long   | Identificador único       |
| `exercicio` | String | Nome do exercício       |

### Série
| Atributo      | Tipo   | Descrição                       |
|---------------|--------|---------------------------------|
| `id`          | Long   | Identificador único            |
| `id_usuario`  | Long   | Referência ao usuário          |
| `id_exercicio` | Long   | Referência ao exercício        |
| `descricao`   | String | Descrição da série             |
| `periodo`     | String | Período da série               |

---

## Tecnologias Utilizadas

- **Linguagem:** Java 17
- **Framework:** Spring Boot
- **Banco de Dados:** SQL
- **Docker**
- **Deploy**
- **Spring security**
- **Swagger**

---

## Como Acessar o Projeto

1. Acesse pela web nesse link: [GenFIt](https://genfit-ibf9.onrender.com)


## Melhorias Futuras
 
- Criação de uma interface de usuário para melhorar a experiência dos clientes

### Desenvolvido por:

- [Estafany Santos](https://www.linkedin.com/in/estefany-santos/)
- [Lucas Matheus](https://www.linkedin.com/in/lucas-matheus-lima/)
- [Kevin Schuab](https://www.linkedin.com/in/kevin-schuab/)
- [Priscila Soares](https://www.linkedin.com/in/priscila-soares-161644111/)
- [Rayane Moara](https://www.linkedin.com/in/rayane-moara/)
- [Sarah Tavares](https://www.linkedin.com/in/sarahtavaresl)
