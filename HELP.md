
> Create a new app using Maven
```
quarkus create app br.com.marcelocbasilio:quarkus3 --stream=3.0
```

> Create a new app using Gragle
```
quarkus create app br.com.marcelocbasilio:quarkus3 --stream=3.0 --gradle
```

> Remove application
```
rm -rf quarkus3
```

> Enter in the application
```
cd quarkus3
```

> Run the application
```
./gradlew quarkusDev
```

> Update project
```
./gradlew clean build
```
# Extension
> Install extension
```
quarkus ext add quarkus-info
```
```
./gradlew addExtension --extensions="io.quarkus:quarkus-resteasy-reactive-jackson"
```