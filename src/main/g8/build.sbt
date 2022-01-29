name := "$name$"
version := "1.0.0"

scalaVersion := "3.1.1"
scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val akkaV = "2.6.18"
  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaV
  )
}
