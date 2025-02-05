```groovy
def myMethod(List<String> list) {
    for (int i = 0; i < list.size(); i++) { 
        println "Item at index $i: "+ list[i]
    }
}

myMethod(['a', 'b', 'c']) 
```