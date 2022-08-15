# betterFunctionals
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

## Download

java version | library version | Download
:----------: | :-------------: | :-------
18+          | 1.0.0           | [better_functionals-1.0.0.jar](https://github-registry-files.githubusercontent.com/520194187/a8ac4680-1c74-11ed-8aae-8026dc765d3a?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAIWNJYAX4CSVEH53A%2F20220815%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20220815T122028Z&X-Amz-Expires=300&X-Amz-Signature=8bc4a6d1f5d97952a7e1b35ad621d03b8ea08c65d846c3f19a8148b30ceffa01&X-Amz-SignedHeaders=host&actor_id=0&key_id=0&repo_id=520194187&response-content-disposition=filename%3Dbetter_functionals-1.0.0.jar&response-content-type=application%2Foctet-stream)
