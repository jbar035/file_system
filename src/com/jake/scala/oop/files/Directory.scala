package com.jake.scala.oop.files

/**
  * Created by Jake Barnes on 26/11/2018
  */
class Directory(override val parentPath: String, override val name: String, val contents:List[DirEntry]) extends DirEntry(parentPath, name) {

  def hasEntry(name: String): Boolean = ???

  def getAllFoldersInPath: List[String] =
    path.substring(1).split(Directory.SEPARATOR).toList

  def findDescendant(path: List[String]): Directory = ???

  def addEntry(newEntry: DirEntry): Directory = ???
}

object Directory {
  val SEPARATOR = "/"
  val ROUTE_PATH = "/"
  def ROOT: Directory = Directory.empty("", "")
  def empty(parentPath: String, name: String): Directory =
    new Directory(parentPath, name, List())
}