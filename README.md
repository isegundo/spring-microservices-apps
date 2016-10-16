# spring-microservices-apps
A study about microservices using Spring Boot, Eureka, Hystrix, Turbine, Spring Cloud.

The config files used by Spring Config is in this repository: https://github.com/isegundo/spring-microservices-config

##What to do...

I recommend the following order to start up the services. In parentheses are the ports used by the services (you can change then in config files used by spring-config-server).

1. spring-config-server (8888)
2. spring-eureka-server (8761)
3. hystrix-turbine (11000)
4. hystrix-dashboard (11001)
5. spring-service-one (10001)
6. spring-service-two (10002)
7. spring-service-three (10003)

When the services are up you can access http://localhost:8761 and see the services registered at Eureka.

Then access http://localhost:10002/message and see a message method from service-two. The same happens with service-three in http://localhost:10003/message

The service-one provides a REST method consumed by both two and three methods. So, to see the hystrix circuit break working you can stop service one and try to access service-two and service-three again. A fallback message should appear.

In http://localhost:11001/hystrix you can access Turbine Dashboard. In the textfield put http://localhost:11000/turbine.stream and hit "Monitor Stream"
