name := """play-java-hello-world-tutorial"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.6"

libraryDependencies += guice


enablePlugins(PlayEbean)
libraryDependencies += evolutions
libraryDependencies += jdbc

libraryDependencies += "com.h2database" % "h2" % "1.4.200"
libraryDependencies ++= Seq(
  javaJdbc
)
libraryDependencies += "org.postgresql" % "postgresql" % "42.2.12"



libraryDependencies ++= Seq(
  ehcache
)