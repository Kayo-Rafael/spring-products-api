# **Produtos API**  
**Uma API REST para gerenciamento de produtos, desenvolvida com Spring Boot.**  
Este projeto permite realizar operações **CRUD** e busca personalizada por nome. Utiliza o banco de dados H2 para testes e desenvolvimento.  

---

## 🚀 **Tecnologias Utilizadas**  
- Java 17 
- Spring Boot 
- Spring Data JPA
- H2 Database (banco em memória)  

---

## 📦 **Dependências**  
As principais dependências utilizadas no projeto são:  
- Spring Web**: Para criação da API REST.  
- Spring Data JPA**: Para persistência de dados.  
- H2 Database**: Banco de dados em memória para testes e desenvolvimento.  

---

## ⚙️ **Configurações do Projeto**  
No arquivo `application.yml` estão as configurações do banco H2 e console:  
```yaml
spring:
  application:
    name: ProdutosAPI
  datasource:
    url: jdbc:h2:mem:produtos
    username: sa
    password: password
  jpa:
    database-platform: org.hibernate.dialect.H2Dialect
  h2:
    console:
      path: /h2-console
```

---

## 💾 **Banco de Dados**  
O banco de dados H2 é inicializado em memória com a seguinte estrutura:  

**Script de criação da tabela**:  
```sql
create table produto(
    id varchar(255) not null primary key,
    nome varchar(50) not null,
    descricao varchar(500),
    preco numeric(18,2)
);
```

---

## 🔧 **Endpoints da API**  
Os endpoints da API estão configurados no **ProdutoController**.  

1. Criar um Produto**  
- **POST** `/produtos`  
- **Exemplo de Request Body**:  
```json
{
  "nome": "Produto Teste",
  "descricao": "Descrição do produto",
  "preco": 99.99
}
```

---

2. Buscar Produto por ID**  
- **GET** `/produtos/{id}`  

---

3. Buscar Produtos por Nome**  
- **GET** `/produtos?nome={nome}`  

---

4. Atualizar Produto**  
- **PUT** `/produtos/{id}`  
- **Exemplo de Request Body**:  
```json
{
  "nome": "Produto Atualizado",
  "descricao": "Nova descrição",
  "preco": 149.99
}
```

---

5. Deletar Produto**  
- **DELETE** `/produtos/{id}`  

---

## 🛠️ **Como Executar o Projeto**  
1. Clone o repositório:  
   ```bash
   git clone https://github.com/seu-usuario/products-api.git
   cd products-api
   ```  
2. Execute o projeto:  
   ```bash
   ./mvnw spring-boot:run
   ```  
3. Acesse o **H2 Console** no navegador:  
   - URL: `http://localhost:8080/h2-console`  
   - **JDBC URL**: `jdbc:h2:mem:produtos`  
   - **Username**: `sa`  
   - **Password**: `password`  

---

## 
