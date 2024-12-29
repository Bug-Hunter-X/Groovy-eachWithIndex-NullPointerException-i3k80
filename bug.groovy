```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { item, index ->
    println "Item ${index + 1}: $item"
  }
}

myMethod(null)
```