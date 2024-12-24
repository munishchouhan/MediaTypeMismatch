## Regression in Micronaut 4

the problem arises when the server declares an endpoint GET /foo and the client makes a request POST /foo using application/x-www-form-urlencoded as media type. It returns error 415 instead of 405 Method not found.

