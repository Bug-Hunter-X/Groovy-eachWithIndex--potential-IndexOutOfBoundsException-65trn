```groovy
def myMethod(List<String> list) {
    list.eachWithIndex { item, index ->
        println "Item at index $index: $item"
        if (index > list.size()) { //Error: IndexOutOfBoundsException
            println "This will never be printed"
        }
    }
}

myMethod(['a', 'b', 'c']) 
```