<!-- Improved compatibility of back to top link: See: https://github.com/othneildrew/Best-README-Template/pull/73 -->
<a id="readme-top"></a>
<!--
*** Thanks for checking out the Best-README-Template. If you have a suggestion
*** that would make this better, please fork the repo and create a pull request
*** or simply open an issue with the tag "enhancement".
*** Don't forget to give the project a star!
*** Thanks again! Now go create something AMAZING! :D
-->



<!-- PROJECT SHIELDS -->
<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->
[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![Unlicense License][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]



<!-- PROJECT LOGO -->
<br />
<div align="center">

  <h3 align="center">Prueba técnica Tareas</h3>

  <p align="center">
    <br />
    <a href="pruebastareas-dyaua7b7btcvdbbe.mexicocentral-01.azurewebsites.net/docs/swagger-ui.html"><strong>Swagger</strong></a>
    <br />
    <br />
    <a href="pruebastareas-dyaua7b7btcvdbbe.mexicocentral-01.azurewebsites.net">API</a>
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



