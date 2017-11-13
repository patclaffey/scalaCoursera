package introFuncProgramming.week2

/**
  * Created by patclaffey on 13/11/2017.
  */
object exerciseSets {

  /**
    * We represent a set by its characteristic function, i.e.
    * its `contains` predicate.
    */
  type Set = Int => Boolean


  /**
    * Indicates whether a set contains a given element.
    */
  def contains(s: Set, elem: Int): Boolean = s(elem)

  /**
    * Returns the set of the one given element.
    */



  def singletonSet(elem: Int): Set =
  {
    //singletonSet needs to return a value of type Set
    // the type of Set is int => Boolean
    // the above is a function type
    // so it can return any possible function that meets the following condition
    //      takes one input parameter, and Int
    //      returns a value that is Boolena
    // innerFunc meets the above criteria
    def innerFunc(num:Int):Boolean = if (num == elem ) true else false

    // here we return the value of the function simply by giving its name
    innerFunc
  }



  /**
    * Returns the union of the two given sets,
    * the sets of all elements that are in either `s` or `t`.
    */
  def union(s: Set, t: Set): Set = {
    def innerFunc(num:Int):Boolean = {s(num) || t(num)}
    innerFunc
  }

  /**
    * Returns the intersection of the two given sets,
    * the set of all elements that are both in `s` and `t`.
    */
  def intersect(s: Set, t: Set): Set = {
    def innerFunc(num:Int):Boolean = {s(num) && t(num)}
    innerFunc
  }

  /**
    * Returns the difference of the two given sets,
    * the set of all elements of `s` that are not in `t`.
    */
  def diff(s: Set, t: Set): Set = {
    def innerFunc(num:Int):Boolean = {s(num) && !t(num)}
    innerFunc
  }

  /**
    * Returns the subset of `s` for which `p` holds.
    */
  def filter(s: Set, p: Int => Boolean): Set = ???


  /**
    * The bounds for `forall` and `exists` are +/- 1000.
    */
  val bound = 1000

  /**
    * Returns whether all bounded integers within `s` satisfy `p`.
    */
  def forall(s: Set, p: Int => Boolean): Boolean = {
    def iter(a: Int): Boolean = {
      if (???) ???
      else if (???) ???
      else iter(???)
    }
    iter(???)
  }

  /**
    * Returns whether there exists a bounded integer within `s`
    * that satisfies `p`.
    */
  def exists(s: Set, p: Int => Boolean): Boolean = ???

  /**
    * Returns a set transformed by applying `f` to each element of `s`.
    */
  def map(s: Set, f: Int => Int): Set = ???

  /**
    * Displays the contents of a set
    */
  def toString(s: Set): String = {
    val xs = for (i <- -bound to bound if contains(s, i)) yield i
    xs.mkString("{", ",", "}")
  }

  /**
    * Prints the contents of a set on the console.
    */
  def printSet(s: Set) {
    println(toString(s))
  }

}
