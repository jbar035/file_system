package com.jake.scala.oop.filesystem

import com.jake.scala.oop.files.Directory

/**
  * Created by Jake Barnes on 26/11/2018
  */
class State(val root: Directory, val wd: Directory, val output: String) {

  def show(): Unit =
    println(output)
    print(State.SHELL_TOKEN)

  def setMessage(message: String): State =
    State(root, wd, message)

}

object State {
  val SHELL_TOKEN = "$ "

  def apply(root: Directory, wd: Directory, output: String = ""): State =
    new State(root, wd, output)
}