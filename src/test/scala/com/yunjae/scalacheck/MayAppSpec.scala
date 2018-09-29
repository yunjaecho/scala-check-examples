package com.yunjae.scalacheck

/*import org.scalacheck.Prop._
import org.scalacheck.Properties*/
import org.scalatest._

/*class MayAppSpec extends Properties("MyAppSpec") {

}*/

class MayAppSpec extends WordSpec with Matchers {
  "add(Int, Int)" should {
    "add both Int values and return the result" in {
      val expected = 2
      val actual = MayApp.add(1, 1)
      actual should be (expected)
    }
  }

  "multiply(2, 2)" should {
    "add both Int values and return the result 4" in {
      val expected = 4
      val actual = MayApp.multiply(2, 2)
      actual should be (expected)
    }
  }

}
