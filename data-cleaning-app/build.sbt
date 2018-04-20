name := "DataCleaningApp"

version := "1.0"

scalaVersion := "2.11.8"

val sparkVersion = "2.2.0"
val scalatestVersion = "3.0.1"
val configVersion = "1.3.0"


dependencyOverrides ++= Seq(
  "io.netty" % "netty" % "3.9.9.Final",
  "commons-net" % "commons-net" % "2.2",
  "com.google.guava" % "guava" % "11.0.2"
)

libraryDependencies ++= Seq(
  "com.typesafe" % "config" % configVersion,
  "org.apache.spark" % "spark-core_2.11" % sparkVersion
//    % "provided"
  ,
  "org.apache.spark" %% "spark-sql" % sparkVersion
//    % "provided"
  ,
  "com.github.scopt" %% "scopt" % "3.7.0",
  "com.chuusai" %% "shapeless" % "2.3.3",
  "com.amazonaws" % "aws-java-sdk" % "1.9.6",
  "org.scalatest" %% "scalatest" % scalatestVersion % "test"
)

parallelExecution in Test := false      
