package sample

import sample.testLib

object TestGitObj {
  def main(args: Array[String]): Unit = {
    val b = testLib.main()
    System.out.print(b)
  }
}
