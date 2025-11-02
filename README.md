# 📬 Busca CEP — Java + API ViaCEP

Aplicação simples em **Java** que consome a **API ViaCEP** para buscar informações de endereço a partir de um **CEP brasileiro**.  
O programa faz a requisição HTTP, obtém o JSON da API e exibe os dados formatados no console usando a biblioteca **Gson**.

---

## 🚀 Tecnologias utilizadas

- ☕ **Java 17+**
- 🌐 **HttpClient (Java.net.http)**
- 🧩 **Gson (Google JSON Library)**
- 📡 **API pública ViaCEP**

---

## 📦 Dependências

Se estiver usando **Maven**, adicione ao seu `pom.xml`:

```xml
<dependency>
  <groupId>com.google.code.gson</groupId>
  <artifactId>gson</artifactId>
  <version>2.10.1</version>
</dependency>
