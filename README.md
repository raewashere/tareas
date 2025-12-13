<a id="readme-top"></a>


<!-- PROJECT LOGO -->
<br />
<div align="center">

  <h3 align="center">Prueba técnica Tareas</h3>

  <p align="center">
    <br />
    <a href="http://4.239.127.201:8080/docs/swagger-ui/index.html"><strong>Swagger</strong></a>
    <br />
    <br />
    <a href="http://4.239.127.201:8080">API</a>
</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Tabla de contenido</summary>
  <ol>
    <li>
      <a href="#about-the-project">Sobre la API</a>
      <ul>
        <li><a href="#built-with">Hecho con</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Iniciando</a>
      <ul>
        <li><a href="#prerequisites">Prerequisitos</a></li>
        <li><a href="#installation">Instalación</a></li>
      </ul>
    </li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## Sobre el proyecto
Este proyecto implementa una API REST para gestionar tareas utilizando Spring Boot, aplicando principios avanzados de arquitectura y patrones de diseño:

Clean Architecture

Repository Pattern

Dependency Injection (DI)

Separación clara entre entidades, servicios, consultas, controladores

Adaptadores JPA desacoplados del dominio

El objetivo es crear un backend mantenible, escalable y fácil de probar.

Con Workflows para creación de empaquetado en imagen para su reproducción en contenedores

Y despliegue en Azure Web App
<p align="right">(<a href="#readme-top">back to top</a>)</p>



### Hecho con

Hecho con Java 21 y  Postgresql


<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- GETTING STARTED -->
## Iniciando
Así es como se puede clonar la aplicación

### Prerequisitos

Para usarlo se debe de tener instalado correctamente Docker


### Instalación

Abajo se describe como instalaro en tu propia computadora

1. Ir a la pagina https://github.com/raewashere/tareas/pkgs/container/tareas
2. Pull a imagen de acuerdo a la última versión disponible, ejemplo:
   ```sh
   docker pull ghcr.io/raewashere/tareas:14957b82b94d0a4f8e5aa18e6d2ab1b08756c86a
   ```
3. Ejecutar
   ```sh
   docker run ghcr.io/raewashere/tareas:14957b82b94d0a4f8e5aa18e6d2ab1b08756c86a
   ```

<p align="right">(<a href="#readme-top">back to top</a>)</p>



