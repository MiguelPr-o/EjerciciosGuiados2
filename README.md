# 🧩 Ejercicios Guiados 2

Este repositorio recopila las actividades prácticas desarrolladas durante la **Unidad 2**, enfocadas en la implementación de **listas enlazadas**, **pilas** y **estructuras de datos** en **Java** y **VisuAlgo**.

---

## 🔷 U2ACT1 - Lista Enlazada Simple con VisuAlgo

### 🧱 Parte 1: Inicialización o creación

<img src="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/U2ACT1%20-%20ListaEnlazada%20-%20VisuAlgo%20(capturas)/Captura%20de%20pantalla%202025-10-18%20184030.png?raw=true" width="250px" height="250px">

### 🔹 Parte 2: Insertar elementos

<img src="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/U2ACT1%20-%20ListaEnlazada%20-%20VisuAlgo%20(capturas)/Captura%20de%20pantalla%202025-10-18%20184034.png?raw=true" width="250px" height="250px">

### 🔹 Parte 3: Eliminar elementos

<img src="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/U2ACT1%20-%20ListaEnlazada%20-%20VisuAlgo%20(capturas)/Captura%20de%20pantalla%202025-10-18%20184039.png?raw=true" width="250px" height="250px">

### 🔹 Parte 4: Buscar elementos

<img src="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/U2ACT1%20-%20ListaEnlazada%20-%20VisuAlgo%20(capturas)/Captura%20de%20pantalla%202025-10-18%20184044.png?raw=true" width="250px" height="250px">

### 💭 Cierre Reflexivo

| Pregunta                                                             | Respuesta                                                    |
| -------------------------------------------------------------------- | ------------------------------------------------------------ |
| ¿Qué sucede con los punteros cuando se inserta o elimina un nodo?    | Los punteros del nodo cambian de referencia.                 |
| ¿Cómo afecta la posición de un nodo al tiempo de búsqueda?           | Se tarda más dependiendo de la posición del nodo.            |
| ¿Qué ventajas tiene recorrer una lista enlazada frente a un arreglo? | Las listas enlazadas pueden crecer o decrecer dinámicamente. |
| ¿Cómo comprobar si una lista está vacía en Java?                     | Verificando que la cabeza (`head`) sea `null`.               |

---

## 🔷 U2ACT2 - Lista Enlazada Humana en Java

<table>
  <tr>
    <td><img src="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/U2ACT2%20-%20ListaEncantadaHumanaEnJava/Captura%20de%20pantalla%202025-10-19%20112037.png?raw=true" width="250px" height="250px"></td>
    <td><img src="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/U2ACT2%20-%20ListaEncantadaHumanaEnJava/Captura%20de%20pantalla%202025-10-19%20112048.png?raw=true" width="250px" height="250px"></td>
  </tr>
  <tr>
    <td colspan="2" align="center"><img src="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/U2ACT2%20-%20ListaEncantadaHumanaEnJava/Captura%20de%20pantalla%202025-10-19%20112055.png?raw=true" width="250px" height="300px"></td>
  </tr>
</table>

### 💭 Cierre Reflexivo

| Pregunta                                                     | Respuesta                                                                   |
| ------------------------------------------------------------ | --------------------------------------------------------------------------- |
| ¿Qué aprendiste sobre las referencias en una lista enlazada? | Son punteros que indican el siguiente nodo.                                 |
| ¿Qué pasa si se rompe un enlace?                             | El puntero del nodo anterior apunta al siguiente del nodo eliminado.        |
| ¿Cómo se relaciona con el código en Java?                    | Refleja cómo las estructuras dinámicas manejan las referencias entre nodos. |

---

## 🔷 U2ACT3 - Ejercicio de Pila con VisuAlgo

| Parte | Descripción        | Imagen                                                                                                                                                                                                           |
| ----- | ------------------ | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 1     | Crear una pila     | <img src="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/U2ACT2%20-%20Ejercicio%20de%20Pila%20con%20VisuAlgo%20(capturas)/Captura%20de%20pantalla%202025-10-19%20111801.png?raw=true" width="200px"> |
| 2     | Insertar elementos | <img src="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/U2ACT2%20-%20Ejercicio%20de%20Pila%20con%20VisuAlgo%20(capturas)/Captura%20de%20pantalla%202025-10-19%20111806.png?raw=true" width="200px"> |
| 3     | Eliminar elementos | <img src="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/U2ACT2%20-%20Ejercicio%20de%20Pila%20con%20VisuAlgo%20(capturas)/Captura%20de%20pantalla%202025-10-19%20111811.png?raw=true" width="200px"> |
| 4     | Peek               | <img src="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/U2ACT2%20-%20Ejercicio%20de%20Pila%20con%20VisuAlgo%20(capturas)/Captura%20de%20pantalla%202025-10-19%20111815.png?raw=true" width="200px"> |

---

## 🧱 Especificación de la Pila

| Método      | Descripción                                      |
| ----------- | ------------------------------------------------ |
| `push()`    | Inserta un nuevo elemento en la parte superior.  |
| `pop()`     | Elimina el elemento superior.                    |
| `peek()`    | Permite ver el elemento superior sin eliminarlo. |
| `isEmpty()` | Verifica si la pila está vacía.                  |

---

## 📚 Listas en Java (Nearpod)

<table>
  <tr>
    <td><img src="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/nearpod%20-%20capturas/Captura%20de%20pantalla%202025-10-08%20210924.png?raw=true" width="200px"></td>
    <td><img src="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/nearpod%20-%20capturas/Captura%20de%20pantalla%202025-10-08%20210935.png?raw=true" width="200px"></td>
    <td><img src="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/nearpod%20-%20capturas/Captura%20de%20pantalla%202025-10-08%20211010.png?raw=true" width="200px"></td>
    <td><img src="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/nearpod%20-%20capturas/Captura%20de%20pantalla%202025-10-08%20211128.png?raw=true" width="200px"></td>
  </tr>
</table>

[Galería completa](https://github.com/MiguelPr-o/EjerciciosGuiados2/tree/main/nearpod%20-%20capturas)

---

## 🔷 U2ACT3 - Práctica Manual y Algorítmica de Listas

<img src="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/U2ACT3%20Pr%C3%A1ctica%20Manual%20y%20Algor%C3%ADtmica%20Lista%20(capturas)/WhatsApp%20Image%202025-10-19%20at%2011.55.24.jpeg?raw=true" width="250px">

### Actividad 1: Lista Simplemente Enlazada

<table>
  <tr>
    <td><img src="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/U2ACT3%20Pr%C3%A1ctica%20Manual%20y%20Algor%C3%ADtmica%20Lista%20(capturas)/WhatsApp%20Image%202025-10-20%20at%2022.16.32%20(1).jpeg?raw=true" width="200px"></td>
    <td><img src="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/U2ACT3%20Pr%C3%A1ctica%20Manual%20y%20Algor%C3%ADtmica%20Lista%20(capturas)/WhatsApp%20Image%202025-10-20%20at%2022.16.32.jpeg?raw=true" width="200px"></td>
  </tr>
</table>

### Actividad 2: Lista Doblemente Enlazada

<table>
  <tr>
    <td><img src="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/U2ACT3%20Pr%C3%A1ctica%20Manual%20y%20Algor%C3%ADtmica%20Lista%20(capturas)/WhatsApp%20Image%202025-10-20%20at%2022.16.31.jpeg?raw=true" width="200px"></td>
    <td><img src="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/U2ACT3%20Pr%C3%A1ctica%20Manual%20y%20Algor%C3%ADtmica%20Lista%20(capturas)/WhatsApp%20Image%202025-10-20%20at%2022.16.31%20(1).jpeg?raw=true" width="200px"></td>
  </tr>
</table>

---

## ⚙️ Implementación de Pilas en Java

| Tipo         | Enlace                                                                                                                                                 |
| ------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| 💻 Código    | [Repositorio “Colas”](https://github.com/MiguelPr-o/EjerciciosGuiados2/tree/main/Colas)                                                                |
| 📘 Documento | [Implementación de Cola - VisuAlgo.pdf](https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/Implementaci%C3%B3n%20de%20cola%20-%20VisuAlgo.pdf) |

---

## 🎥 Video

[🔗 Ver video de Pilas](https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/videoPilas.mp4)

---

## 🧮 Actividad - Ordenamiento Burbuja

| Tipo         | Enlace                                                                                                            |
| ------------ | ----------------------------------------------------------------------------------------------------------------- |
| 📄 Documento | [Ordenamiento Burbuja.pdf](https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/Ordenamiento%20Burbuja.pdf) |

---

👨‍💻 **Autor:** Miguel Angel Hernández Godínez
🎓 **Materia:** Estructuras de Datos
