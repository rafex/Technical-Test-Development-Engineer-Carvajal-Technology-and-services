# Caso de estudio Prueba Técnica Ingeniero de Desarrollo Carvajal Tecnología y servicios

## Run Back-end

First Enter directory **service-factorial**, example:

```Shell
cd service-factorial
```

Run application in windows

```Shell
mvnw.cmd spring-boot:run
```

Run application in *unix

```Shell
./mvnw spring-boot:run
```

Endpoint running in port 8081

Testing endpont with cURL with factorial number six

```Shell
curl --location --request GET 'http://localhost:8081/api/factorial/6'
```

Example response:

```json
[{"id":1,"number":1,"value":1},{"id":2,"number":2,"value":4},{"id":3,"number":3,"value":18},{"id":4,"number":4,"value":96},{"id":5,"number":5,"value":600},{"id":6,"number":6,"value":4320}]
```

## Run Front-end

First Enter directory **examen**, example:

```Shell
cd examen
```

###### Install dependencies

```Shell
npm install
```

Run application
```Shell
npm start
```

Front-end running in port 4200

**Angular Live Development Server is listening on 0.0.0.0:4200, open your browser on http://localhost:4200/**
