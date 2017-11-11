package introFuncProgramming.week1

/**
  * Created by patclaffey on 11/11/2017.
  */
object exercises {
  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || r==c) 1 else  pascal(c-1,r-1) + pascal(c,r-1)
  }

  /**
    * Exercise 2
    */
  //def balance(chars: List[Char]): Boolean = {false}

  def balance(chars: List[Char]): Boolean = {

    if (chars.isEmpty) throw new NoSuchElementException

    def checkChar(c:Char):Int = {
      if (c == '(')  1 else
      if ( c == ')' ) -1 else 0
    }

    def loop(st: List[Char], acc:Int ): Boolean = {

      val firstChar = st.head
      val restSt = st.tail
      val weight = checkChar(firstChar) + acc

      if (weight < 0) false
      else if (restSt.isEmpty && weight > 0) false
      else if (restSt.isEmpty && weight == 0) true
      else loop(restSt, weight)

    }
    loop(chars,0)

  }


  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = {

    val coinsSort = coins.sorted
    def coinNumLimit(coin: Int): Int = (money / coin) + 1

    def numChoices = {
      def loopCoins1(co:List[Int],acc:Int):Int = {
        val coin = co.head
        val coinsRemaining = co.tail

        if (coinsRemaining.isEmpty) acc * coinNumLimit (coin)
        else loopCoins1(coinsRemaining, acc * coinNumLimit(coin))
      }
      loopCoins1(coinsSort, 1)
    }

    def calculateChange(choice:Int) = {
      def loopCoin( co:List[Int], choice:Int, acc:Int ):Int = {
        val coin = co.head
        val coinsRemaining = co.tail
        val coinLimit =  coinNumLimit(coin)
        val quotient =  choice  / coinLimit
        val remainder =  choice  % coinLimit

        if (quotient == 0) remainder*coin + acc
        else  loopCoin (coinsRemaining, quotient, remainder*coin + acc )
      }
      loopCoin(coinsSort, choice,0)
    }


    def loopChoices (choice:Int, acc:Int):Int = {

      if (choice == numChoices) acc
      else loopChoices (choice + 1,
        if ( calculateChange(choice ) == money ) acc + 1 else acc)
    }
    loopChoices(0, 0)
  }


}
