package introFuncProgramming.week1
import org.scalatest.junit.AssertionsForJUnit
import org.junit.Assert._
import org.junit._
/**
  * Created by patclaffey on 11/11/2017.
  */
class BalanceBracketsTest extends  AssertionsForJUnit{
import introFuncProgramming.week1.exercises.balance

  @Test
  def verifyStringComplexBalanced  = {
    assertTrue("testing balanced string", balance("(if (zero? x) max (/ 1 x))".toList))
  }

  @Test
  def verifyStringUnbalanced: Unit = {
    assertFalse("testing unbalanced string", balance(":-)".toList))
  }

  @Test
  def countNotEnough = {
    assertFalse("counting brackets is not enough", balance("())(".toList))
  }

}
