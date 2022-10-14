package com.baeldung.scala3.matchtypes

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class FirstComponentOfScala2Spec extends AnyWordSpec with Matchers {
  "firstComponentOf" should {
    "return the first digit of an Int" in {
      FirstComponentOfScala2.firstComponentOf(-153) shouldEqual 1
    }

    "return the first char of a String" in {
      FirstComponentOfScala2.firstComponentOf("Baeldung") shouldEqual Some('B')
    }

    "return None if the String is empty" in {
      FirstComponentOfScala2.firstComponentOf("") shouldEqual None
    }

    "return the first element of a Seq" in {
      FirstComponentOfScala2.firstComponentOf(Seq(10, 42)) shouldEqual Some(10)
    }

    "return None if the Seq is empty" in {
      FirstComponentOfScala2.firstComponentOf(Seq.empty[Int]) shouldEqual None
    }

    "also work with other types" in {
      FirstComponentOfScala2.firstComponentOf(1.2f) shouldEqual 1.2f
    }
  }
}
