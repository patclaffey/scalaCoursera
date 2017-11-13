package introFuncProgramming.week2

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Assert._
import org.junit._
/**
  * Created by patclaffey on 11/11/2017.
  */
class setsTest extends  AssertionsForJUnit{
  import introFuncProgramming.week2.exerciseSets._

  @Test
  def singletonInSet  = {
    // use the singletonSet function to create a set with one item 55
    val set55Single:Set = singletonSet(55)
    // we use the result of the function to call to test that 55 was added
    // this will give a boolean result
    val is55inSet:Boolean = set55Single(55)
    // assert True
    assertTrue("testing singleton", is55inSet )
  }

  @Test
  def singletonNotInSet  = {
    // use the singletonSet function to create a set with one item 55
    val set55Single:Set = singletonSet(55)
    val is999inSet:Boolean = set55Single(999)
    assertFalse("testing singleton", is999inSet )
  }



}



