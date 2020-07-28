# springjwt-base

Base proyect for spring jwt api.
Exe JAR or gradle bootrun and consume API:

Authenticate:

``` bash
curl -i -H "Content-Type: application/json" -X POST -d '{ "username":"abc123.."}' http://localhost:8080/authenticate
```

Get resources: (change "xxx.yyy.zzz" for token jwt)

``` bash
curl -H "Authorization: Bearer xxx.yyy.zzz" http://localhost:8080/saludo
```

## Admin actions

New user:

``` bash
curl -i -H "Content-Type: application/json" -H "Authorization: Bearer xxx.yyy.zzz" -X POST -d '{"name": "newuser","password":"$2y$12$b69LWwDuQ7kARZQy9Hfpne938ArU6WHsZau9CEFnaVGUqX1oz0VBa","active":true,"roles":"ROLE_USER"}' http://localhost:8080/users
```

Delete user:

``` bash
curl -i -H "Content-Type: application/json" -H "Authorization: Bearer xxx.yyy.zzz" -X DELETE  http://localhost:8080/users/newuser
```

Get one or all users:

``` bash
curl -i -H "Content-Type: application/json" -H "Authorization: Bearer xxx.yyy.zzz" -X GET  http://localhost:8080/users/newuser
```

``` bash
curl -i -H "Content-Type: application/json" -H "Authorization: Bearer xxx.yyy.zzz" -X GET  http://localhost:8080/users
```

## Reference Documentation

For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.1.RELEASE/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.1.RELEASE/gradle-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.3.1.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)

## Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

## Additional Links

These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)
