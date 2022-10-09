# Реализация проверки покупателей на микросервисной архитектуре

## Проект не завершен

### Оставлю тут для справки

### Генерация модулей Maven
```console
  mvn archetype:generate -DgroupId=com.example -DartifactId=microservices -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
   mvn archetype:generate -DgroupId=com.example -DartifactId=customer
```

### При желании залезть в постгрес через cli докера

```console
  psql dbname username
  \c dbname - use database
  \dt - show tables
```