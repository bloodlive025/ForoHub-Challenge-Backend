<h1>Challenge Foro Hub ALURA LATAM</h1>
Proyecto final de la formacion Especializacion Backend del programa ALURA LATAM.
<h2>Descripcion del proyecto</h2>
El proyecto siguiente es la creacion de un foro. Un foro es un lugar en donde 
podemos preguntar nuestras dudas y consultas sobre diversos temas, para luego ser respondido
por otros usuarios.

Por ello crearemos una aplicacion Backend que se encargue de gestionar este foro. Almacenando cada
nueva pregunta del foro en una base de datos.

Este proyecto sera creado usando los conocimientos obtenidos en los cursos: 

Spring Boot 3: desarrollar una API Rest en Java

Spring Boot 3: aplique las mejores practicas y proteja una API Rest.

Spring Boot 3: documentar, probar y preparar una API para su  implement.

<h3>OPERACIONES CRUD</h3>
Haremos uso de las operaciones CRUD para la entidad topico. CRUD son las siglas de
create, read, update y delete. 

<h3>Seguridad de la Api Rest</h3>
Se implementara Spring Security, el cual nos servira para que solo los usuarios logueados
 en nuestra base de datos tenga la capacidad de usar las operaciones CRUD para
los topicos. Para ello se cada vez que un usuario sea logueado se le brindara un token
que durara un par de horas y que sirve para autentificarse en nuestro sistema.