# 🚀 **Conversor de Monedas – Java + API ExchangeRate**

Aplicación de consola desarrollada en **Java 17** utilizando **Maven**, que permite convertir valores entre diferentes monedas en tiempo real mediante una API externa.
Forma parte de mi formación en backend y representa una aplicación práctica con arquitectura limpia y orientada a buenas prácticas.

![Demo](https://static.wixstatic.com/media/c15b34_72e15f254c6645fe85e6b735d613e983~mv2.gif)

---

## ✨ **Funcionalidades**

* 🔄 Conversión en tiempo real usando **ExchangeRate API**
* 💱 Soporte para monedas:

  * USD → ARS
  * ARS → USD
  * USD → BRL
  * BRL → USD
  * USD → COP
  * COP → USD
* 🧭 Menú interactivo por consola
* 🛡️ Manejo de errores:

  * API down
  * Moneda inexistente
  * JSON inválido
  * Problemas de red
* 🔐 API Key protegida mediante `config.properties`
* 📦 Generación de **JAR ejecutable** listo para distribución

---

## 🏗️ **Arquitectura del Proyecto**

El proyecto está estructurado en capas:

```
src/main/java/com.locampocam/
│── Main.java                 → Punto de entrada
│── Conversor.java            → Interacción con el usuario (menú)
│── ProcesadorDeMoneda.java   → Lógica de negocios
│── ServicioExchangeRate.java → Llamadas a la API y parseo JSON
```

```
src/main/resources/
│── config.properties         → Contiene la API Key (no se sube al repo)
```

---

## 📁 **Estructura del Proyecto**

```
conversor-monedas/
│── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   └── test/
│── target/
│── pom.xml
│── .gitignore
│── README.md
```

---

## 🧪 **Ejemplo de Uso**

```
===== Conversor de Monedas =====
1) USD → ARS
2) ARS → USD
3) USD → BRL
4) BRL → USD
5) USD → COP
6) COP → USD
7) Salir
Seleccione una opción: 1
Ingrese el valor a convertir: 100

100.0 USD equivalen a 140500.0 ARS
```

---

## ⚙️ **Cómo Ejecutar el Proyecto**

### 🔧 Requisitos

* Java 17+
* Maven 3+

### ▶️ Ejecutar desde consola

```sh
mvn package
java -jar target/conversor-monedas-1.0-SNAPSHOT.jar
```

---

## 🔐 API Key (Segura)

Tu key se guarda en:

```
src/main/resources/config.properties
```

Y tu `.gitignore` evita que se suba:

```
src/main/resources/config.properties
```

✔️ Tu clave está protegida.

---

## 👩‍💻 **Tecnologías utilizadas**

* Java 17
* Maven
* Gson
* HTTP Client nativo de Java
* ExchangeRate API

---

## 📜 Licencia

Proyecto de práctica – uso educativo.

