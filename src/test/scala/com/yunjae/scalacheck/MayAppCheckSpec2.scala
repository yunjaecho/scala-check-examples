package com.yunjae.scalacheck

import org.scalacheck._
import org.scalacheck.Prop._

class MayAppCheckSpec2 extends Properties("MayAppCheckSpec2") {
  property("add(Int, Int) has identity element") = {
    forAll {(x: Int) =>
      val expected = x
      val actual = MayApp.add(0, x)
      actual == expected
    }
  }

  property("add(Int, Int): test commutative law") = {
    forAll {(x: Int, y:Int) =>
      MayApp.add(x, y) == MayApp.add(y, x)
    }
  }

  property("add(Int, Int): test associative law") = {
    forAll {(x: Int, y:Int, z: Int) =>
      MayApp.add(MayApp.add(x, y), z) == MayApp.add(x, MayApp.add(y, z))
    }
  }
}
