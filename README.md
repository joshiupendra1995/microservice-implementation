Microservices also known as the microservice architecture is an architectural style that structures an application as a collection of services that are. 
Highly maintainable and testable. Loosely coupled. Independently deployable. 
Organized around business capabilities.

So in short you can individually run the small module without it interfering with other modules of a huge application.
Lets take an example of Uber.
Uber has different modules booking, scheduling ,payments module.
Lets say you book a cab from uber and you are redirected to payments module if due to some bank transaction failure the
payment fails the cab scheduling still works so irrespective of one module failure others will work fine individually thats microservice
Its a complete transformation from monolithic and SOA to microservices.

Service registry: - https://spring.io/guides/gs/service-registration-and-discovery/

The service registry is a database populated with information on how to dispatch requests to microservice instances. 
Interactions between the registry and other components can be divided into two groups, 
each with two subgroups: Interactions between microservices and the registry registration.

A service registry Eureka Server, a REST service which registers itself at the registry Eureka Client and. a web application, 
which is consuming the REST service as a registry-aware client Spring Cloud Netflix Feign Client.

This service registry will act as server for other services and will give you the details of the other microservice connected to this Erureka registry.
Any microservice connected to this registry will be visible to you on this location : - http://localhost:8761/eureka/

First of all you need to run the service-registry microservice before starting any other microservice.

Cloud-gateway :- https://spring.io/guides/gs/gateway/

Second microservice to run is the cloud-gateway service

Spring Cloud Gateway aims to provide a simple, yet effective way to route to APIs and 
provide cross cutting concerns to them such as security, monitoring/metrics, and resiliency.

So here we are going to route our user-service and department-service APIS the reason specified above.

Hystrix Dashboard:-  https://cloud.spring.io/spring-cloud-netflix/multi/multi__circuit_breaker_hystrix_dashboard.html

One of the main benefits of Hystrix is the set of metrics it gathers about each HystrixCommand. 
The Hystrix Dashboard displays the health of each circuit breaker in an efficient manner.

To know more about hystrix visit below location:-
https://howtodoinjava.com/spring-cloud/microservices-monitoring/

So hystrix-dashboard is the 3rd microservice you will need to run.
http://localhost:9094/hystrix

Finally you need to run your actual business services which is user-service and department-service.

*****************************CONGRATS YOU ARE ONE STEP CLOSER TO BECOME A MICROSERVICE EXPERT***********************************
