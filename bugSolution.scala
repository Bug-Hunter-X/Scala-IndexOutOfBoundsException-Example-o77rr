```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)

  // Safe access using getOrElse
  val element = list.lift(5).getOrElse(0) 
  println(element)

  //Alternative using if condition
  val index = 5
  if (index >= 0 && index < list.length) {
    println(list(index))
  } else {
    println("Index out of bounds")
  }
}
```