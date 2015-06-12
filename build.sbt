name := "headsup"

version := "1.0"

lazy val `headsup` = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.xerial" % "sqlite-jdbc" % "3.7.15-M1"
)