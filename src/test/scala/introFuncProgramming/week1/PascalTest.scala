package introFuncProgramming.week1
import org.scalatest.junit.AssertionsForJUnit
import org.junit.Assert._
import org.junit._
/**
  * Created by patclaffey on 11/11/2017.
  */
class PascalTest extends AssertionsForJUnit{
  import introFuncProgramming.week1.exercises._

  @Test
  def verifyPascalCol0Row2() {
    assertEquals(1,pascal(0,2) )
  }

  @Test
  def verifyPascalCol1Row2() {
    assertEquals(2,pascal(1,2) )
  }

  @Test
  def verifyPascalCol1Row3() {
    assertEquals(3,pascal(1,3) )
  }

}
