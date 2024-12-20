# Scala IndexOutOfBoundsException Example

This repository demonstrates a common error in Scala: the `IndexOutOfBoundsException`. This exception is thrown when you try to access an element in a collection (like a `List`) using an index that is out of range.  The index must be between 0 (inclusive) and the size of the collection (exclusive).

The file `bug.scala` contains the erroneous code. The `bugSolution.scala` file shows how to prevent this error using safe access methods.