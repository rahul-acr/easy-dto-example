# EasyDto Example Project

This is a sample Spring Boot project to demonstrate EasyDto library.

clone, build run the `com.example.dtotest.SampleApplication class` to start the application.

Once up the following REST endpoints should be available

`POST localhost:8080/student`

```json
{
  "name": "John Doe",
  "dept": "CS"
}
```


`GET localhost:8080/student`


`GET localhost:8080/student/{id}`

Please make sure the [easy-dto-core](https://github.com/rahul-acr/easy-dto-core) and [
easy-dto-jackson](https://github.com/rahul-acr/easy-dto-jackson) libraries are present in the classpath. 

