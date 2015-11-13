package com.general
object GroupBy extends App {

  /*  def groupBy [K] (f: (A) ⇒ K): Map[K, Traversable[A]] 
  
  f is a so called discriminator function. 
  You use that function to specify the criteria by which you want to group the values in the Traversable. 
  K is the type of the keys used in the returned Map. 
  The return value is a Map with a key K and a Traversable of A which is the type contained in the Traversable.*/

  val cats = List("Tiger", "Lion", "Puma", "Leopard", "Jaguar", "Cheetah", "Bobcat")
  val groupedBy = cats.groupBy(cat => cat.contains("C"))
  println(groupedBy)
  val groupedByFirstLetter = cats.groupBy(_.charAt(0))
  println(groupedByFirstLetter)
  
  val raptors = List("Golden Eagle", "Bald Eagle", "Prairie Falcon", "Peregrine Falcon", "Harpy Eagle", "Red Kite")
  val kinds = raptors.groupBy {
    case bird if bird.contains("Eagle")  => "eagle"
    case bird if bird.contains("Falcon") => "falcon"
    case _                               => "unknown"
  }
  println(kinds)

  val words = List("one", "two", "one", "three", "four", "two", "one")
  
    /**
     * mapValues
     *  Transforms this map by applying a function to every retrieved value.
   *  @param  f   the function used to transform values of this map.
   *  @return a map view which maps every key of this map
   *          to `f(this(key))`. The resulting map wraps the original map without copying any elements.
   */
  val counts = words.groupBy(w => w).mapValues(value => value.length)
  println(words.groupBy(w => w))
  println(counts)

}

