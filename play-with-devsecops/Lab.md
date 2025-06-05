


```bash
sudo apt update
sudo apt install maven
mvn -version
```

### build the application
```bash
cd play-with-devsecops
mvn clean install
```

### run the application
```bash
java -jar transfer-service/target/transfer-service-0.0.1-SNAPSHOT.jar
```


