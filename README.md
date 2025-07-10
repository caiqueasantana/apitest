# 📚 API de Livros - Spring Boot

API RESTful para gerenciamento de livros, construída com Java 17, Spring Boot 3.5, DTOs, validação, tratamento global de erros e documentação Swagger.

---

## 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot 3.5.x
- Spring Web
- Spring Data JPA
- H2 Database (banco em memória)
- Lombok
- springdoc-openapi (Swagger)
- JUnit & Mockito

---

## 📁 Estrutura de Pacotes

```
com.exemplo.livros
├── controller   # Camada de controle (REST)
├── service      # Lógica de negócio
├── model        # Entidades JPA
├── dto          # Data Transfer Objects
├── mapper       # Conversão entre entidades e DTOs
├── repository   # Acesso a dados
├── exception    # Tratamento global de exceções
```

---

## ⚙️ Como rodar o projeto

1. **Clone o repositório:**
   ```bash
   git clone <url-do-repositorio>
   cd apitest
   ```

2. **Build do projeto:**
   ```bash
   ./mvnw clean install
   ```

3. **Execute a aplicação:**
   ```bash
   ./mvnw spring-boot:run
   ```
   A aplicação estará disponível em:  
   [https://verbose-space-zebra-vj9wxj79p75fpx6w-8080.app.github.dev/livros](https://verbose-space-zebra-vj9wxj79p75fpx6w-8080.app.github.dev/livros)

---

## 🛠️ Exemplos de uso

### Listar livros

```http
GET /livros
```

### Adicionar livro

```http
POST /livros
Content-Type: application/json

{
  "titulo": "O Senhor dos Anéis",
  "autor": "J.R.R. Tolkien",
  "anoPublicacao": 1954
}
```

### Buscar livro por ID

```http
GET /livros/1
```

### Atualizar livro

```http
PUT /livros/1
Content-Type: application/json

{
  "titulo": "O Hobbit",
  "autor": "J.R.R. Tolkien",
  "anoPublicacao": 1937
}
```

### Remover livro

```http
DELETE /livros/1
```

---

## ✅ Validação e Tratamento de Erros

- Todos os campos obrigatórios são validados.
- Erros de validação retornam JSON detalhado, exemplo:
  ```json
  {
    "titulo": "O título é obrigatório.",
    "anoPublicacao": "O ano de publicação deve ser no mínimo 1500."
  }
  ```

---

## 🗄️ Banco de Dados H2

Acesse o console do H2 em:  
[https://verbose-space-zebra-vj9wxj79p75fpx6w-8080.app.github.dev/h2-console](https://verbose-space-zebra-vj9wxj79p75fpx6w-8080.app.github.dev/h2-console)  
JDBC URL padrão: `jdbc:h2:mem:testdb`

---

## 📖 Documentação Swagger

Acesse a documentação interativa em:  
[https://verbose-space-zebra-vj9wxj79p75fpx6w-8080.app.github.dev/swagger-ui.html](https://verbose-space-zebra-vj9wxj79p75fpx6w-8080.app.github.dev/swagger-ui.html)

---

## 📝 Licença

Este projeto é apenas para fins de estudo e demonstração.
