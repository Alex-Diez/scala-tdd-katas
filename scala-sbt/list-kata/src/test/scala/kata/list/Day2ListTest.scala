package kata.list

import org.scalatest.{FlatSpec, Matchers}

class Day2ListTest extends FlatSpec with Matchers {

  it should " create a list " in {
    val list = new Day2List

    list.size shouldBe 0
    list.isEmpty shouldBe true
  }

  it should " add to the front of list " in {
    var list = new Day2List

    list = 1 :: list
    list(0) shouldBe 1
    list.size shouldBe 1
  }

  it should " add to the from of list with correct index " in {
    var list = new Day2List

    list = 3 :: 2 :: 1 :: list
    list(0) shouldBe 3
    list(1) shouldBe 2
    list(2) shouldBe 1
  }

  it should " concatenate two lists " in {
    val listOne = 3 :: 2 :: 1 :: new Day2List
    val listTwo = 6 :: 5 :: 4 :: new Day2List

    val list = listTwo ::: listOne
    list shouldBe 6 :: 5 :: 4 :: 3 :: 2 :: 1 :: new Day2List
  }
}
