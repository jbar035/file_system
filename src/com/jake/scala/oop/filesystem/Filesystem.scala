package com.jake.scala.oop.filesystem

import java.util.Scanner

import com.jake.scala.oop.commands.Command
import com.jake.scala.oop.files.Directory

/**
  * Created by Jake Barnes on 26/11/2018
  */
object Filesystem extends App {

  val root = Directory.ROOT
  var state = State(root, root)
  val scanner = new Scanner(System.in)

  while (true) {
    state.show()
    val input = scanner.nextLine()
    state = Command.from(input).apply(state)
  }

}
