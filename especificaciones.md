Especificaciones del Proyecto 

Nombre del proyecto

MiniFutbolInfo

Descripción

MiniFutbolInfo es una aplicación sencilla en Java que permite buscar un equipo de fútbol por su nombre y mostrar información básica como país, estadio, año de fundación y el escudo del club.
Está pensada para practicar el consumo de APIs REST, el manejo de JSON y el diseño de clases.

API utilizada

Campo	        Detalle

Nombre	        TheSportsDB
URL base	    https://www.thesportsdb.com/api/
Documentación	https://www.thesportsdb.com/api.php
Autenticación requerida	Si (el 123 de la url es la test api key)
Formato de respuesta	JSON


Endpoints que voy a usar

Endpoint	Descripción	Ejemplo de llamada
/searchteams.php?t={nombre}	Busca un equipo por nombre	https://www.thesportsdb.com/api/v1/json/123/searchteams.php?t=Barcelona


Funcionalidades principales

Buscar un equipo por nombre.

Mostrar información básica del equipo:

Nombre

País

Estadio

Año de fundación

URL del escudo


Clases previstas

Clase	        Responsabilidad

Equipo	        Representa los datos del equipo obtenidos de la API.
ApiClient	    Realiza la llamada y devuelve el JSON.
EquipoService	Procesa el JSON y crea objetos Equipo.
App	            Clase principal que pide el nombre del equipo y muestra los datos.


Diagrama de clases UML 


Ejemplo de respuesta JSON de la API, devuelve mas campos pero usaremos estos
json
{
  "teams": [
    {
      "strTeam": "Barcelona",
      "strCountry": "Spain",
      "intFormedYear": "1899",
      "strStadium": "Camp Nou",
      "strTeamBadge": "https://www.thesportsdb.com/images/media/team/badge/..."
    }
  ]
}

Dudas o decisiones pendientes
¿Añadir jugadores del equipo?

¿Mostrar más datos como liga o descripción