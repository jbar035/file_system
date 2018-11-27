package com.jake.scala.oop.commands

import com.jake.scala.oop.filesystem.State

/**
  * Created by Jake Barnes on 26/11/2018
  */
trait Command {

  def apply(state: State): State
}

object Command {
  def from(input: String): Command =
    new UnknownCommand
}