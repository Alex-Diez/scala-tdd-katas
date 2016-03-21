name := "scala-sbt"

lazy val root = Project("scala-sbt", file(".")).aggregate(listKataDay1, listKataDay2)

lazy val listKataDay1 = Project("list-kata-day-1", file("list-kata/list-kata-day-1"))
  .settings(version := "1.0.0",
      scalaVersion := "2.11.7",
      libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "2.2.4" % "test"),
      scalacOptions ++= Seq("-deprecation", "-feature"))

lazy val listKataDay2 = Project("list-kata-day-2", file("list-kata/list-kata-day-2"))
  .settings(version := "1.0.0",
        scalaVersion := "2.11.7",
        libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "2.2.4" % "test"),
        scalacOptions ++= Seq("-deprecation", "-feature"))