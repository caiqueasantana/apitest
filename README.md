# 📚 API de Livros - Spring Boot

Projeto exemplo de uma API RESTful para gerenciamento de livros.

## 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot 3.x
- Spring Web
- Spring Data JPA
- H2 Database (banco em memória)
- Lombok

## 📁 Estrutura de Pacotes

```
com.exemplo.livros
├── controller   # Camada de controle (REST)
├── service      # Lógica de negócio
├── model        # Entidades JPA
├── repository   # Acesso a dados
```

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
   A aplicação estará disponível em: [http://localhost:8080](http://localhost:8080)

## 🛠️ Exemplos de uso

### Listar livros

```http
GET /api/livros
```

### Adicionar livro

```http
POST /api/livros
Content-Type: application/json

{
  "titulo": "O Senhor dos Anéis",
  "autor": "J.R.R. Tolkien",
  "anoPublicacao": 1954
}
```

### Buscar livro por ID

```http
GET /api/livros/1
```

### Atualizar livro

```http
PUT /api/livros/1
Content-Type: application/json

{
  "titulo": "O Hobbit",
  "autor": "J.R.R. Tolkien",
  "anoPublicacao": 1937
}
```

### Remover livro

```http
DELETE /api/livros/1
```

## 🗄️ Banco de Dados H2

Acesse o console do H2 em: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)  
JDBC URL padrão: `jdbc:h2:mem:testdb`

## 📝 Licença

Este projeto é apenas para fins de estudo e demonstração.
