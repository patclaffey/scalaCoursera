package introFuncProgramming.week1
import org.scalatest.junit.AssertionsForJUnit
import org.junit.Assert._
import org.junit._
/**
  * Created by patclaffey on 11/11/2017.
  */
class countChangeTest extends AssertionsForJUnit{
  import introFuncProgramming.week1.exercises.countChange

  @Test
  def verifyExampleInInstructions  = {
    assertEquals("example given in instructions", countChange(4,List(1,2))  , 3)
  }

  @Test
  def verifySorted  = {
    assertEquals("countChange: sorted CHF", countChange(300,List(5,10,20,50,100,200,500)) , 1022)
  }

  @Test
  def verifyNoPennies  = {
    assertEquals("countChange: no pennies", countChange(301,List(5,10,20,50,100,200,500)) , 0)
  }

  @Test
  def verifyUnsorted  = {
    assertEquals("countChange: unsorted CHF", countChange(300,List(500,5,50,100,20,200,10)) , 1022)
  }

}
