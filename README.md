
# movies

A simple REST API using spring boot.

The API exposes a few endpoints to manage a movie library.

### Endpoints:

* `/movies/create`

	Method: POST

	Sample request:

	```json
	{
	  "title":"Avengers: Infinity War",
	  "director":"Anthony RUSSO, Joe RUSSO",
	  "releaseDate":"25/04/2018",
	  "type":"sci-fi"
	}
	```
	Sample response:
	```json
	{
	  "id": 1,
	  "title":"Avengers: Infinity War",
	  "director":"Anthony RUSSO, Joe RUSSO",
	  "releaseDate":"25/04/2018",
	  "type":"sci-fi"
	}
	```

* `/movies/<id>`

	Method: GET

	Sample response:
	```json
	{
	  "id": 1,
	  "title":"Avengers: Infinity War",
	  "director":"Anthony RUSSO, Joe RUSSO",
	  "releaseDate":"25/04/2018",
	  "type":"sci-fi"
	}
	```
* `/movies/update`

	Method: PUT

	Sample request:

	```json
	{
	  "id":1,
	  "title":"Avengers: Endgame",
	  "director":"Anthony RUSSO, Joe RUSSO",
	  "releaseDate":"25/04/2019",
	  "type":"sci-fi"
	}
	```
	Sample response:
	```json
	{
	  "id":1,
	  "title":"Avengers: Endgame",
	  "director":"Anthony RUSSO, Joe RUSSO",
	  "releaseDate":"25/04/2019",
	  "type":"sci-fi"
	}
	```
* `/movies/delete/<id>`

	Method: DELETE
	Sample response:
	```json
	{
	  "id":1,
	  "title":"Avengers: Endgame",
	  "director":"Anthony RUSSO, Joe RUSSO",
	  "releaseDate":"25/04/2019",
	  "type":"sci-fi"
	}
	```
* `/movies/all`

	Method: GET
	Sample response:
	```json
	[
	  {
	    "id":1,
	    "title":"Avengers: Endgame",
	    "director":"Anthony RUSSO, Joe RUSSO",
	    "releaseDate":"25/04/2019",
	    "type":"sci-fi"
	  },
	  {
	    "id":2,
	    "title":"Joker",
	    "director":"Todd Phillips",
	    "releaseDate":"04/10/2019",
	    "type":"Crime, Drama, Thriller"
	  }
	]
	```

### To run the project:

* Clone this repo

`git clone https://github.com/elourratabdellatif/movies`

`cd movies`

* Build the project

`./mvnw clean install`

* Run the application

`./mvnw spring-boot:run`

The app then runs on port 8888