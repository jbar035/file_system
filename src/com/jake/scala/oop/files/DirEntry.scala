package com.jake.scala.oop.files

/**
  * Created by Jake Barnes on 26/11/2018
  */
abstract class DirEntry(val parentPath: String, val name: String) {

  def path: String = parentPath + Directory.SEPARATOR + name

}
