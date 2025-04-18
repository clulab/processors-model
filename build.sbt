name := "Processors Model"
description := "This project is used to publish a resource: microsoft_deberta_v3_base_mtl/avg_export."

val scala11 = "2.11.12" // up to 2.11.12
val scala12 = "2.12.13" // up to 2.12.13
val scala13 = "2.13.5"  // up to 2.13.5

ThisBuild / crossScalaVersions := Seq(scala12, scala11)
ThisBuild / scalaVersion := crossScalaVersions.value.head

// Do not depend on Scala libraries since there is no code here.
ThisBuild / autoScalaLibrary := false
// This is only a resource.
ThisBuild / crossPaths := false

// libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.5" % Test // up to 3.2.5
