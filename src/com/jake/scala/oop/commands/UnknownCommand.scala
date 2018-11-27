package com.jake.scala.oop.commands
import com.jake.scala.oop.filesystem.State

/**
  * Created by Jake Barnes on 27/11/2018
  */
class UnknownCommand extends Command {

  override def apply(state: State): State =
    state.setMessage("Command not found...")
}
