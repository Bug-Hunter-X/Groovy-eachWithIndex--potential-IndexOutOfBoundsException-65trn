# Groovy eachWithIndex potential IndexOutOfBoundsException
This example demonstrates a potential `IndexOutOfBoundsException` in Groovy's `eachWithIndex` method.  The provided code iterates through a list using `eachWithIndex`, and includes a condition check (`if (index > list.size())`) which is never executed, due to the exception being thrown before the index exceeds the list size.

The issue arises because the condition `if (index > list.size())` aims to prevent accessing an index outside the list bounds.  However, `eachWithIndex` implicitly throws an `IndexOutOfBoundsException` when the index reaches the list size, thereby making the condition unreachable.

The solution avoids potential exceptions by using a safer iteration technique.