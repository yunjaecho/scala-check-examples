package com.yunjae.scalacheck

import org.scalacheck._
import org.scalacheck.Prop._

class MayAppCheckSpec extends Properties("String") {
  property("add(Int, Int) should add both Int values and result the result") =
    forAll { (x: Int, y: Int) =>
      //println(s"x: $x , y: $y")
      val expected = x + y
      val actual = MayApp.add(x, y)
      actual == expected
  }



  property("multiply(Int, Int) should add both Int values and result the result") =
    forAll(Gen.choose(1, 100), Gen.choose(1, 10)) { (x: Int, y: Int) =>
      println(s"[1] x: $x , y: $y")
      (x >= 1 && x <= 100 && y >= 1 && y <= 10) ==> {
        println(s"[2] x: $x , y: $y")
        val expected = x * y
        val actual = MayApp.multiply(x, y)
        actual == expected
      }
    }

}
