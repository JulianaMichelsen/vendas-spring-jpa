# Projeto Vendas

Este é um projeto de estudo desenvolvido em **Java** com o framework **Spring Boot**. O objetivo principal foi aplicar conceitos de desenvolvimento de APIs RESTful, persistência de dados com JPA/Hibernate e arquitetura em camadas.

O sistema simula um ecossistema de vendas, gerenciando usuários, pedidos, produtos e categorias, com suporte a chaves compostas para itens de pedido e tratamento de exceções customizado.

---

## 🚀 Tecnologias Utilizadas

* **Java** (JDK 21)
* **Spring Boot** (Web, Data JPA, Validation)
* **H2 Database** (Banco de dados em memória para ambiente de teste)
* **Maven** (Gerenciador de dependências)

---

## 🏗️ Estrutura da Aplicação

O projeto está organizado seguindo as melhores práticas de separação de responsabilidades:

- **`entities`**: Contém as classes de domínio mapeadas para o banco de dados.
  - Inclui Enums para status de pedido (`OrderStatus`).
  - Utiliza chaves primárias compostas (`OrderItemPK`) para a relação entre pedidos e produtos.
- **`repositories`**: Interfaces que estendem `JpaRepository` para operações de CRUD.
- **`services`**: Camada de lógica de negócio, garantindo que os controladores permaneçam enxutos.
- **`resources`**: Controladores REST que definem os endpoints da API.
- **`config`**: Classes de configuração, como o `TestConfig` para instanciar dados iniciais (seeding).
- **`exceptions`**: Tratamento de erros personalizado para respostas HTTP claras (`ResourceNotFoundException`, `DatabaseException`).

---

## 📊 Modelo de Domínio

As entidades principais e suas relações incluem:

1. **User**: Clientes que realizam pedidos.
2. **Order**: Registros de vendas vinculados a um usuário.
3. **Product & Category**: Catálogo de itens com associação Many-to-Many.
4. **OrderItem**: Classe de associação que conecta pedidos e produtos, contendo quantidade e preço.
5. **Payment**: Detalhes do pagamento de um pedido concluído.

---

## 🛠️ Como Executar

1. **Pré-requisitos:**
   - Java 17+ instalado.
   - Maven instalado (opcional, pode usar o `./mvnw` incluso).

2. **Clonar o projeto:**
   ```bash
   git clone https://github.com/JulianaMichelsen/vendas-spring-jpa.git

3. **Rodar a aplicação:**
   ```bash
   ./mvnw spring-boot:run

### 📋 Endpoints Principais

| Recurso | Método | Endpoint | Descrição |
| :--- | :--- | :--- | :--- |
| Usuários | `GET` | `/users` | Retorna todos os usuários |
| Usuários | `GET` | `/users/{id}` | Retorna um usuário por ID |
| Produtos | `GET` | `/products` | Lista todos os produtos |
| Pedidos | `GET` | `/orders` | Lista todos os pedidos realizados |

---

### ✍️ Autor

Desenvolvido por **Juliana Michelsen**.  
Projeto voltado para o aprofundamento em ecossistema Spring e modelagem de dados robusta.

   
