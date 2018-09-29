package com.yunjae.scalacheck

object MayApp {
  def add(x: Int, y: Int): Int = x + y

  def multiply(x: Int, y: Int): Int =
    if (x == 99) x + y else x * y
}
