name := "hello-akka"
version := "0.0.1"

scalaVersion := "2.13.5"
scalacOptions := Seq("-unchecked", "-deprecation", "-explaintypes", "-encoding", "utf8")

libraryDependencies ++= {
  val akkaV = "2.6.14"
  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaV
  )
}
