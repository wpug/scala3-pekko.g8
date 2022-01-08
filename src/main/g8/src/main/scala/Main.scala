object AkkaIntro {
  import akka.actor.{ActorSystem, Actor, ActorRef, Props}

  class MyActor extends Actor {
    def receive: Receive = {
      case msg => println(s"Odebrałem wiadomość: \${msg}")
    }
  }

  @main
  def main: Unit = {
    val system = ActorSystem("HaloAkka")
    try {
      val leonardo = system.actorOf(Props[MyActor](), "leonardo")
      leonardo ! "Dostałeś Oskara!"
      println(">>> Naciśnij ENTER żeby zakończyć <<<")
      io.StdIn.readLine()
    } finally {
      system.terminate()
    }
  }
}
