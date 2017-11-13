package introFuncProgramming.week2

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Assert._
import org.junit._
/**
  * Created by patclaffey on 11/11/2017.
  */
class setsTest extends  AssertionsForJUnit{
  import introFuncProgramming.week2.exerciseSets._

  // use the singletonSet function to create a set with one item 55
  val set55Single:Set = singletonSet(55)
  val set66Single:Set = singletonSet(66)
  val set77Single:Set = singletonSet(77)
  val set88Single:Set = singletonSet(88)

  @Test
  def verifySingletonSet  = {

    // we use the result of the function to call to test that 55 was added
    // this will give a boolean result
    val set55:Set = singletonSet(55)
    // assert True
    assertTrue("testing that 55 is in set", set55(55) )
    assertFalse("testing that 999 is not in set", set55(999) )
  }


  @Test
  def verifyUnionSet  = {
    // use the singletonSet function to create a set with one item 55
    val unionSet:Set = union(union(set55Single, set66Single),union(set77Single, set88Single) )
    assertTrue("testing 55", unionSet(55) )
    assertTrue("testing 66", unionSet(66) )
    assertTrue("testing 77", unionSet(77) )
    assertTrue("testing 88", unionSet(88) )
    assertFalse("testing 99", unionSet(99) )
  }

  @Test
  def verifyInterSectSet  = {
    // use the singletonSet function to create a set with one item 55
    val set1:Set = union(union(set55Single, set66Single),union(set77Single, set88Single) )
    val set2:Set = union(set55Single, set66Single)
    val intersectSet = intersect(set1,set2)
    assertTrue("testing 55", intersectSet(55) )
    assertTrue("testing 66", intersectSet(66) )
    assertFalse("testing 77", intersectSet(77) )
    assertFalse("testing 88", intersectSet(88) )
    assertFalse("testing 99", intersectSet(99) )
  }

  @Test
  def verifyDiffSet  = {
    // use the singletonSet function to create a set with one item 55
    val set1:Set = union(union(set55Single, set66Single),union(set77Single, set88Single) )
    val set2:Set = union(set55Single, set66Single)
    val diffSet = diff(set1,set2)
    assertFalse("testing 55", diffSet(55) )
    assertFalse("testing 66", diffSet(66) )
    assertTrue("testing 77", diffSet(77) )
    assertTrue("testing 88", diffSet(88) )
    assertFalse("testing 99", diffSet(99) )
  }

  @Test
  def verifyFilter  = {
    // use the singletonSet function to create a set with one item 55
    val set1:Set = union(union(set55Single, set66Single),union(set77Single, set88Single) )
    val intersectSet = filter(set1, x=> {if(x==55 || x==88 || x==99) true else false } )
    assertTrue("testing 55", intersectSet(55) )
    assertFalse("testing 66", intersectSet(66) )
    assertFalse("testing 77", intersectSet(77) )
    assertTrue("testing 88", intersectSet(88) )
    assertFalse("testing 99", intersectSet(99) )
  }

}



