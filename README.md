# 🚗 Concesionario de Vehículos - Aplicación Java Swing

Esta es una aplicación de escritorio desarrollada en **Java Swing** que simula un sistema de gestión para un **concesionario de vehículos**. Permite visualizar un catálogo de vehículos, acceder a los detalles de cada uno y simular una compra. Fue creada con principios de **Programación Orientada a Objetos (POO)**.

---

## 🛠️ Tecnologías utilizadas

- **Lenguaje:** Java  
- **Interfaz gráfica:** Java Swing  
- **Paradigma:** Programación Orientada a Objetos (POO)  
- **Entorno de desarrollo:** NetBeans (recomendado)

---

## 📌 Funcionalidades principales

- Visualización del catálogo de vehículos disponibles (motos y coches).
- Selección de un vehículo desde una lista.
- Visualización de los detalles del vehículo.
- Simulación de la compra de un vehículo.
- Interacción entre ventanas de forma fluida.

---

## 🔁 Navegación entre ventanas

- `VentanaPrincipal`: Pantalla inicial con acceso al catálogo.
- `VentanaCatalogo`: Muestra la lista de vehículos y permite seleccionar uno.
- `VentanaCompra`: Muestra los detalles del vehículo seleccionado y simula su compra.

---

## 👨‍💻 Clases implementadas

- `Vehiculo`: Clase abstracta que contiene atributos comunes.
- `Coche` y `Moto`: Subclases que heredan de `Vehiculo`.
- `Cliente`: Clase que representa al comprador (lista para instanciar).
- Ventanas (`JFrame`):
  - `VentanaPrincipal`
  - `VentanaCatalogo`
  - `VentanaCompra`

---

## 📚 Principios de POO aplicados

- **Encapsulamiento:** Atributos privados con métodos `get` y `set`.
- **Herencia:** `Coche` y `Moto` heredan de `Vehiculo`.
- **Polimorfismo:** Uso potencial de métodos sobrescritos como `mostrarInformacion()`.
- **Clases y (en ejecución) objetos:** Las instancias de vehículos se crean al ejecutar el programa.

---

## 🎬 Video demostrativo

En el video se explican:
- Las funciones principales del sistema.
- Cómo están diseñadas las ventanas.
- Cómo se conectan entre sí.
- La ejecución del programa sin errores.

---

## ✅ Requisitos cumplidos

- [x] Aplicación desarrollada en Java Swing.
- [x] Mínimo tres ventanas interactivas.
- [x] Ventanas conectadas entre sí.
- [x] Estructura basada en POO.
- [x] Interfaz funcional con interacción básica.
- [x] Código organizado y comentado.

---

## 📄 Autor

Desarrollado por [Tu Nombre].

