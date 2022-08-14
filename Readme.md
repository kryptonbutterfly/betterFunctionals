# moreFunctionals
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