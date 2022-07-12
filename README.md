# Alticci REST API

## Overview
This is Alticci REST service. It contains one endpoint that takes an integer parameter and returns an integer result based on the following formula:
```n=0 => a(0) = 0
   n=1 => a(1) = 1
   n=2 => a(2) = 1
   n>2 => a(n) = a(n-3) + a(n-2)
```

## How to build and run
`mvn install`

Go to `target` directory and run:
`java -jar [JAR FILE]`

## API Documentation
Open API docs can be found at http://localhost:8080/swagger-ui/index.html
