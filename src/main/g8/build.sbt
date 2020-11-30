name := "hello-akka"
version := "0.0.1"

scalaVersion := "2.13.4"
scalacOptions := Seq("-unchecked", "-deprecation", "-explaintypes", "-encoding", "utf8")

libraryDependencies ++= {
  val akkaV = "2.6.10"
  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaV
  )
}
