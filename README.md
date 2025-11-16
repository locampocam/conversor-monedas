```markdown
# 💱 Conversor de Monedas – Java + API ExchangeRate

Aplicación de consola desarrollada en **Java 17** utilizando **Maven**, que permite convertir valores entre distintas monedas en tiempo real accediendo a una API externa.  
Este proyecto forma parte de mi formación en desarrollo backend y representa una aplicación realista que integra:

- Consumo de API REST  
- Procesamiento de JSON con Gson  
- Manejo de excepciones  
- Arquitectura por capas (servicios, lógica y presentación)  
- Generación de .JAR ejecutable  

---

## 🚀 Funcionalidades

✔ Conversión en tiempo real utilizando **ExchangeRate API**  
✔ Soporte para monedas:  
- USD ↔ ARS  
- USD ↔ BRL  
- USD ↔ COP  

✔ Menú interactivo por consola  
✔ Manejo de errores (API down, valores incorrectos, JSON inválido)  
✔ API Key protegida mediante archivo `config.properties`  
✔ Proyecto empaquetado como **JAR ejecutable** para distribución

---

## 🧩 Arquitectura del Proyecto

```

src/main/java/com/locampocam/
├── Main.java                     # Punto de entrada
├── Conversor.java                # Lógica del menú y flujo de la app
├── ProcesadorDeMoneda.java       # Conversión y validaciones
└── ServicioExchangeRate.java     # Cliente HTTP + parseo JSON
src/main/resources/
└── config.properties             # API Key protegida

```

---

## 🛠️ Tecnologías Utilizadas

- **Java 17**
- **Maven**
- **Gson (Google)**
- **HTTP Client nativo de Java**
- **ExchangeRate API**
- **IntelliJ IDEA**

---

## 🔑 Configuración de la API Key

Crear el archivo:

```

src/main/resources/config.properties

```

Agregar tu clave:

```

API_KEY=tu_clave_aqui

```

⚠️ *Este archivo está incluido en `.gitignore` para proteger la clave.*

---

## ▶️ Cómo ejecutar el proyecto

### 1️⃣ Clonar el repositorio

```

git clone [https://github.com/tuusuario/conversor-monedas.git](https://github.com/tuusuario/conversor-monedas.git)

```

---

### 2️⃣ Compilar y generar el ejecutable JAR

Desde el directorio del proyecto:

```

mvn clean package

```

Esto generará:

```

target/conversor-monedas-1.0-SNAPSHOT.jar

```

---

### 3️⃣ Ejecutar el JAR

Ir a la carpeta `target` y ejecutar:

```

java -jar conversor-monedas-1.0-SNAPSHOT.jar

```

---

## 📸 Capturas del Proyecto

> Aquí puedes añadir capturas reales desde GitHub:

### 📌 Vista del menú:
*(imagen)*

### 📌 Ejemplo de conversión:
*(imagen)*

---

## 🎥 Video demostración

> Puedes grabar un video corto mostrando la ejecución y dejar aquí el enlace.

---

## 💼 Sobre este proyecto

Este proyecto refleja mi conocimiento actual en:

- Integración de APIs externas  
- Manejo de datos en formato JSON  
- Programación orientada a objetos  
- Buenas prácticas y organización de código  
- Desarrollo de aplicaciones Java basadas en terminal  
- Documentación profesional de software  

Forma parte de mi portafolio como desarrolladora backend.

---

## 🌐 Conectemos

- **LinkedIn:** https://www.linkedin.com/in/TU_USUARIO  
- **GitHub:** https://github.com/TU_USUARIO  

---

## ⭐ ¿Te gustó este proyecto?

Si te fue útil o te parece interesante, ¡considera dejar una estrella ⭐ en el repositorio!
```
