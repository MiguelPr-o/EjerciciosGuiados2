<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <title>Ejercicios Guiados 2</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f5f7fa;
      color: #222;
      line-height: 1.6;
      margin: 40px;
    }
    h1, h2, h3 {
      color: #2c3e50;
      text-align: center;
    }
    h1 {
      border-bottom: 3px solid #3498db;
      padding-bottom: 10px;
    }
    h2 {
      margin-top: 40px;
      color: #2980b9;
    }
    h3 {
      color: #34495e;
      margin-top: 20px;
    }
    img {
      border-radius: 8px;
      box-shadow: 0 3px 10px rgba(0,0,0,0.2);
    }
    .center {
      display: flex;
      justify-content: center;
      align-items: center;
      gap: 10px;
      flex-wrap: wrap;
    }
    table {
      width: 100%;
      border-collapse: collapse;
      margin: 20px auto;
      text-align: center;
      background-color: #fff;
      border-radius: 8px;
      overflow: hidden;
      box-shadow: 0 3px 10px rgba(0,0,0,0.1);
    }
    th, td {
      padding: 10px;
      border: 1px solid #ddd;
    }
    th {
      background-color: #3498db;
      color: white;
      text-transform: uppercase;
    }
    a {
      color: #2980b9;
      text-decoration: none;
      font-weight: bold;
    }
    a:hover {
      text-decoration: underline;
    }
    .reflection {
      background-color: #ecf0f1;
      padding: 15px;
      border-left: 5px solid #2980b9;
      margin-top: 20px;
      border-radius: 5px;
    }
  </style>
</head>
<body>

  <h1>📘 Ejercicios Guiados 2</h1>

  <h2>U2ACT1 - Ejercicio de Lista Enlazada Simple con VisuAlgo</h2>

  <h3>Parte 1: Inicialización o creación</h3>
  <div class="center">
    <img src="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/U2ACT1%20-%20ListaEnlazada%20-%20VisuAlgo%20(capturas)/Captura%20de%20pantalla%202025-10-18%20184030.png?raw=true" width="250" height="250">
  </div>

  <h3>Parte 2: Insertar elementos en la lista</h3>
  <div class="center">
    <img src="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/U2ACT1%20-%20ListaEnlazada%20-%20VisuAlgo%20(capturas)/Captura%20de%20pantalla%202025-10-18%20184034.png?raw=true" width="250" height="250">
  </div>

  <h3>Parte 3: Eliminar elementos de la lista</h3>
  <div class="center">
    <img src="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/U2ACT1%20-%20ListaEnlazada%20-%20VisuAlgo%20(capturas)/Captura%20de%20pantalla%202025-10-18%20184039.png?raw=true" width="250" height="250">
  </div>

  <h3>Parte 4: Buscar elementos en la lista</h3>
  <div class="center">
    <img src="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/U2ACT1%20-%20ListaEnlazada%20-%20VisuAlgo%20(capturas)/Captura%20de%20pantalla%202025-10-18%20184044.png?raw=true" width="250" height="250">
  </div>

  <div class="reflection">
    <h3>🧠 Cierre de reflexión</h3>
    <ul>
      <li><b>¿Qué sucede con los punteros cuando se inserta o elimina un nodo?</b> Los punteros del nodo cambian de referencia.</li>
      <li><b>¿Cómo afecta la posición de un nodo al tiempo de búsqueda?</b> Se tarda más dependiendo de la posición del nodo.</li>
      <li><b>¿Qué ventajas tiene una lista enlazada frente a un arreglo?</b> Puede crecer o decrecer dinámicamente.</li>
      <li><b>¿Cómo comprobar si una lista está vacía en Java?</b> Verificando que la cabeza no sea <code>null</code>.</li>
    </ul>
  </div>

  <h2>U2ACT2 - Lista Encantada Humana en Java</h2>

  <table>
    <tr>
      <td><img src="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/U2ACT2%20-%20ListaEncantadaHumanaEnJava/Captura%20de%20pantalla%202025-10-19%20112037.png?raw=true" width="250" height="250"></td>
      <td><img src="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/U2ACT2%20-%20ListaEncantadaHumanaEnJava/Captura%20de%20pantalla%202025-10-19%20112048.png?raw=true" width="250" height="250"></td>
    </tr>
    <tr>
      <td colspan="2"><img src="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/U2ACT2%20-%20ListaEncantadaHumanaEnJava/Captura%20de%20pantalla%202025-10-19%20112055.png?raw=true" width="300" height="300"></td>
    </tr>
  </table>

  <div class="reflection">
    <h3>🧩 Cierre reflexivo</h3>
    <ul>
      <li><b>¿Qué aprendiste sobre las referencias?</b> Son punteros que indican el siguiente nodo.</li>
      <li><b>¿Qué pasa si se rompe un enlace?</b> Se pierde la conexión con los nodos siguientes.</li>
      <li><b>¿Cómo se relaciona con Java?</b> Representa estructuras dinámicas donde los nodos están conectados entre sí.</li>
    </ul>
  </div>

  <h2>U2ACT2 - Ejercicio de Pila con VisuAlgo</h2>

  <div class="center">
    <img src="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/U2ACT2%20-%20Ejercicio%20de%20Pila%20con%20VisuAlgo%20(capturas)/Captura%20de%20pantalla%202025-10-19%20111801.png?raw=true" width="250" height="250">
    <img src="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/U2ACT2%20-%20Ejercicio%20de%20Pila%20con%20VisuAlgo%20(capturas)/Captura%20de%20pantalla%202025-10-19%20111806.png?raw=true" width="250" height="250">
    <img src="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/U2ACT2%20-%20Ejercicio%20de%20Pila%20con%20VisuAlgo%20(capturas)/Captura%20de%20pantalla%202025-10-19%20111811.png?raw=true" width="250" height="250">
    <img src="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/U2ACT2%20-%20Ejercicio%20de%20Pila%20con%20VisuAlgo%20(capturas)/Captura%20de%20pantalla%202025-10-19%20111815.png?raw=true" width="250" height="250">
  </div>

  <h2>Listas en Java</h2>
  <!-- Aquí irían todas las tablas de capturas Nearpod -->
  <p style="text-align:center;">(Galería de capturas de listas en Java con Nearpod)</p>

  <h2>U2ACT3 - Práctica Manual y Algorítmica Lista</h2>
  <div class="center">
    <img src="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/U2ACT3%20Pr%C3%A1ctica%20Manual%20y%20Algor%C3%ADtmica%20Lista%20(capturas)/WhatsApp%20Image%202025-10-19%20at%2011.55.24.jpeg?raw=true" width="250" height="250">
  </div>

  <h3>Actividad 1: Lista Simplemente Enlazada</h3>
  <div class="center">
    <img src="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/U2ACT3%20Pr%C3%A1ctica%20Manual%20y%20Algor%C3%ADtmica%20Lista%20(capturas)/WhatsApp%20Image%202025-10-20%20at%2022.16.32%20(1).jpeg?raw=true" width="250" height="250">
    <img src="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/U2ACT3%20Pr%C3%A1ctica%20Manual%20y%20Algor%C3%ADtmica%20Lista%20(capturas)/WhatsApp%20Image%202025-10-20%20at%2022.16.32.jpeg?raw=true" width="250" height="250">
  </div>

  <h3>Actividad 2: Lista Doblemente Enlazada</h3>
  <div class="center">
    <img src="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/U2ACT3%20Pr%C3%A1ctica%20Manual%20y%20Algor%C3%ADtmica%20Lista%20(capturas)/WhatsApp%20Image%202025-10-20%20at%2022.16.31.jpeg?raw=true" width="250" height="250">
    <img src="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/U2ACT3%20Pr%C3%A1ctica%20Manual%20y%20Algor%C3%ADtmica%20Lista%20(capturas)/WhatsApp%20Image%202025-10-20%20at%2022.16.31%20(1).jpeg?raw=true" width="250" height="250">
  </div>

  <h2>Actividad - Implementación de Pilas en Java</h2>

  <table>
    <thead>
      <tr><th>📂 Archivos del código</th></tr>
    </thead>
    <tbody>
      <tr><td><a href="https://github.com/MiguelPr-o/EjerciciosGuiados2/tree/main/Colas">Colas</a></td></tr>
      <tr><td><a href="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/Implementaci%C3%B3n%20de%20cola%20-%20VisuAlgo.pdf">Implementación de Cola - PDF</a></td></tr>
    </tbody>
  </table>

  <h3>🎥 Video</h3>
  <p style="text-align:center;"><a href="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/videoPilas.mp4">Ver video de pilas</a></p>

  <h2>Actividad - Ordenamiento Burbuja</h2>

  <table>
    <thead><tr><th>📂 Actividad</th></tr></thead>
    <tbody>
      <tr><td><a href="https://github.com/MiguelPr-o/EjerciciosGuiados2/blob/main/Ordenamiento%20Burbuja.pdf">Ordenamiento Burbuja (PDF)</a></td></tr>
    </tbody>
  </table>

</body>
</html>
