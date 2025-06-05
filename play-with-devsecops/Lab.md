

install openjdk 17 on ubuntu

```bash
sudo apt update
sudo apt install openjdk-17-jdk
java -version
```

install maven on ubuntu

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


docker setup on ubuntu

```bash
docker --version
sudo apt update -y
sudo apt install apt-transport-https ca-certificates curl software-properties-common -y
curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -
sudo add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu focal stable"
apt-cache policy docker-ce
sudo apt install docker-ce -y
sudo systemctl status docker
sudo usermod -aG docker ${USER}
docker version
```





### run the application
```bash
java -jar transfer-service/target/transfer-service-0.0.1-SNAPSHOT.jar
```


