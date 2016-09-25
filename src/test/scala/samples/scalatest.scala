/*
 * Copyright 2001-2009 Artima, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package samples

import scala.collection.mutable.Stack
import org.scalatest.{Assertions, Matchers}
import org.junit.Test

import scala.collection.mutable

class StackSuite extends Assertions {

  @Test def stackShouldPopValuesIinLastInFirstOutOrder() {
    val stack = new mutable.Stack[Int]
    stack.push(1)
    stack.push(2)
    assert(stack.pop() === 2)
    assert(stack.pop() === 1)
  }

  @Test def stackShouldThrowNoSuchElementExceptionIfAnEmptyStackIsPopped() {
    val emptyStack = new mutable.Stack[String]
    intercept[NoSuchElementException] {
      emptyStack.pop()
    }
  }
}

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
@RunWith(classOf[JUnitRunner])
class ListSuite extends FunSuite with Matchers {

  test("An empty list should be empty") {
    List() should be ('empty)
    Nil should be ('empty)
  }

  test("A non-empty list should not be empty") {
    List(1, 2, 3) should not be 'empty
    List("fee", "fie", "foe", "fum") should not be 'empty
  }

  test("A list's length should equal the number of elements it contains") {
    List() should have length 0
    List(1, 2) should have length 2
    List("fee", "fie", "foe", "fum") should have length 4
  }
}

import org.scalatest.FunSpec
import scala.collection.mutable.Stack

class ExampleSpec extends FunSpec {

  describe("A Stack") {

    it("should pop values in last-in-first-out order") {
      val stack = new mutable.Stack[Int]
      stack.push(1)
      stack.push(2)
      assert(stack.pop() === 2)
      assert(stack.pop() === 1)
    }

    it("should throw NoSuchElementException if an empty stack is popped") {
      val emptyStack = new mutable.Stack[Int]
      intercept[NoSuchElementException] {
        emptyStack.pop()
      }
    }
  }
}
