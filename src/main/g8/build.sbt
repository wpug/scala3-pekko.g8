name := "$name$"
version := "1.0.0"

scalaVersion := "3.2.1"

scalacOptions := Seq(
  "-unchecked",
  "-deprecation",
  "-encoding", "utf8"
)

libraryDependencies ++= {
  val akkaV = "2.6.20"
  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaV
  )
}
