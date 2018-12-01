package com.jake.scala.oop.files

/**
  * Created by Jake Barnes on 26/11/2018
  */
class Directory(override val parentPath: String, override val name: String, val contents:List[DirEntry]) extends DirEntry(parentPath, name) {

  def hasEntry(name: String): Boolean = ???
}

object Directory {
  val SEPARATOR = "/"
  val ROUTE_PATH = "/"
  def ROOT: Directory = Directory.empty("", "")
  def empty(parentPath: String, name: String): Directory =
    new Directory(parentPath, name, List())
}