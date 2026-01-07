# 🧮 Calculadora de Consola en Java

Aplicación de consola desarrollada en Java que permite realizar operaciones matemáticas básicas entre dos números enteros.  
El usuario puede **sumar, restar, multiplicar o dividir** y decidir si desea continuar o finalizar la ejecución del programa.

Este proyecto fue desarrollado con fines **educativos**, aplicando buenas prácticas de Java, uso de `Scanner`, control de flujo, manejo de excepciones y documentación con **JavaDoc**.

---

## 🚀 Funcionalidades

- Ingreso de dos números enteros por teclado
- Selección de operador matemático:
  - ➕ Suma
  - ➖ Resta
  - ✖️ Multiplicación
  - ➗ División
- Validación del operador ingresado
- Manejo básico de errores
- Ejecución continua hasta que el usuario decida detener la aplicación

---

## 🛠️ Tecnologías utilizadas

- **Java** (JDK 17+ / compatible con versiones superiores)
- Aplicación de consola
- Compilación manual con `javac`
- Empaquetado manual en `.jar`

---

## 📂 Estructura del proyecto

```
CalculadoraAppConsola/
├── src/
│ └── main/
│ └── java/
│ └── calculadoraappconsola/
│ └── App.java
├── out/ (generada al compilar)
└── Calculadora.jar (ejecutable)
```

---

## ▶️ Cómo ejecutar la aplicación

### 1️⃣ Requisitos
- Tener Java instalado  
Verifica con:
```bash
java -version
```

## 2️⃣ Ejecutar el archivo .jar

Desde la carpeta donde se encuentra el archivo:

```bash
java -jar Calculadora.jar
```
## 🧑‍💻 Ejemplo de uso

```bash
Bienvenido a la calculadora de consola
Ingrese el primer número:
5
Ingrese el segundo número:
3
Ingrese el operador (+ - * /):
+
El resultado de 5 + 3 es: 8

'Stop' para detener la app, 's' para seguir
```

