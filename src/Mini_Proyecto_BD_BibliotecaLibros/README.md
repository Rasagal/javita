# 📚 Proyecto Biblioteca - CRUD con Java y MySQL

Este proyecto pequeño nació para que pudiera practicar y entender cómo conectar Java con bases de datos MySQL usando JDBC.  
Es una app de consola sencilla que permite gestionar libros: agregar, listar, actualizar y borrar.

---

## 🚀 Qué puede hacer

- Agregar libros nuevos a la biblioteca
- Ver todos los libros guardados
- Modificar datos de un libro por su ID
- Eliminar libros cuando ya no sean necesarios

---

## 🛠️ Tecnologías que usé

- Java 17+
- MySQL como base de datos
- JDBC para la conexión
- IntelliJ IDEA para programar

---

## 🗂️ Cómo está organizado el proyecto

Mini_Proyecto_BD_BibliotecaLibros/  
├── Libro.java               // Modelo de libro  
├── LibroCRUD.java           // CRUD con operaciones a la BD  
├── Conexion.java            // Configuración de conexión a MySQL  
├── Main.java                // Menú para interactuar en consola  
├── script.sql               // Script para crear la base de datos y tabla  
└── README.md                // Este archivo

---

## ⚙️ Cómo usarlo

1. Clona el repositorio con:

git clone https://github.com/Rasagal/javita.git

2. Crea la base de datos ejecutando el archivo `script.sql` en MySQL (puedes usar MySQL Workbench o consola):

CREATE DATABASE biblioteca;  
USE biblioteca;

CREATE TABLE libros (  
 id INT AUTO_INCREMENT PRIMARY KEY,  
 titulo VARCHAR(100),  
 autor VARCHAR(100),  
 aniopublicacion INT,  
 genero VARCHAR(100),  
 disponible BOOLEAN DEFAULT 1  
);

3. Configura tu clase `Conexion.java` con tu usuario y contraseña de MySQL:

String url = "jdbc:mysql://localhost:3306/biblioteca";  
String user = "root";  
String password = "tu_contraseña"; // Cambia esto por la tuya

4. Ejecuta el programa desde `Main.java` y disfruta del menú.

---

## 💡 Ideas para mejorar

Esto es solo el principio, algunas cosas que me gustaría agregar más adelante:

- Validar entradas para evitar datos incorrectos
- Agregar búsqueda por título o autor
- Crear una interfaz gráfica para facilitar su uso
- Organizar el proyecto con MVC para hacerlo más escalable

---

## 👨‍💻 Sobre mí

Soy Carlos Salcedo, un apasionado de la programación que está aprendiendo Java y bases de datos.  
Puedes ver más proyectos míos en mi GitHub:  
https://github.com/Rasagal?tab=repositories

---

## 📄 Licencia

Este proyecto es libre para usar con fines educativos y de aprendizaje.  
Siéntete libre de usarlo, modificarlo o adaptarlo a tus necesidades.
