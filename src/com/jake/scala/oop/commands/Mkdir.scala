package com.jake.scala.oop.commands

import com.jake.scala.oop.files.Directory
import com.jake.scala.oop.filesystem.State

/**
  * Created by Jake Barnes on 01/12/2018
  */
class Mkdir(name: String) extends Command {

  override def apply(state: State): State = {
    val wd = state.wd
    if (wd.hasEntry(name)) {
      state.setMessage(s"Entry $name already exists!")
    } else if (name.contains(Directory.SEPARATOR)) {
      state.setMessage(s"$name must not contain separators!")
    } else if (checkIllegal(name)) {
      state.setMessage(s"$name: illegal entry name!")
    } else {
      doMkdir(state, name)
    }
  }

  def checkIllegal(str: String): Boolean = {
    str.contains(".")
  }

  def doMkdir(state: State, str: String): State = {

  }

}
