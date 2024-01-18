# betterFunctionals [![Maven Package](https://github.com/kryptonbutterfly/betterFunctionals/actions/workflows/maven-publish.yml/badge.svg)](https://github.com/kryptonbutterfly/betterFunctionals/actions/workflows/maven-publish.yml)
more @FunctionalInterfaces with some helpful extras

## Extra: Partial function application

Where applicable the supplied @FunctionalInterfaces implement the methods applyLeft and applyRight

### Example aptFirst
```java
IntBiConsumer biCon = (a, b) -> System.out.println("first: " + a + " second: " + b);
IntConsumer leftAppliedBiCon = biCon.aptFirst(5);
leftAppliedBiCon.accept(23);
```

Output:
```shell
first: 5 second: 23
```

### Example aptLast
```java
IntBinaryOperator div = (a, b) -> a / b;
IntUnaryOperator divBy3 = div.aptLast(3);
System.out.println(divBy3.apply(7));
```

Output:
```shell
2
```

## Getting the latest release

```xml
<repository>
  <id>github</id>
  <url>https://maven.pkg.github.com/kryptonbutterfly/maven-repo</url>
</repository>
```

```xml
<dependency>
  <groupId>kryptonbutterfly</groupId>
  <artifactId>better_functionals</artifactId>
  <version>3.0.0</version>
</dependency>
```

## Download

java version | library version | Download
:----------: | :-------------: | :-------
18+          | 3.0.0           | [better_functionals-3.0.0.jar](https://github-registry-files.githubusercontent.com/731108692/c212a880-b647-11ee-871c-4af6931b65a2?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20240118%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20240118T202821Z&X-Amz-Expires=300&X-Amz-Signature=a41171a8f6f67e9791a5e9960d1047334387d75dae36d6ea8ede7ec7f56ff4c3&X-Amz-SignedHeaders=host&actor_id=0&key_id=0&repo_id=731108692&response-content-disposition=filename%3Dbetter_functionals-3.0.0.jar&response-content-type=application%2Foctet-stream)
18+          | 2.0.0           | [better_functionals-2.0.0.jar](https://github-registry-files.githubusercontent.com/731108692/d2e15600-99d9-11ee-82c2-57c206357a76?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAVCODYLSA53PQK4ZA%2F20240118%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20240118T200503Z&X-Amz-Expires=300&X-Amz-Signature=5086b305e605cb68e559fb3be4d34f2957394256f545538359b0c364e7db5ee5&X-Amz-SignedHeaders=host&actor_id=0&key_id=0&repo_id=731108692&response-content-disposition=filename%3Dbetter_functionals-2.0.0.jar&response-content-type=application%2Foctet-stream)
18+          | 1.0.0           | [BetterFunctionals.jar](https://github.com/kryptonbutterfly/betterFunctionals/releases/download/v1.0.0/BetterFunctionals.jar)
