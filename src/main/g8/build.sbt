name := "hello-akka"
version := "1.0.0"

scalaVersion := "2.13.1"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val akkaV = "2.6.4"
  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaV
  )
}
