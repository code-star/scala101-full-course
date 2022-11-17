package exercise2

// TODO: Follow the instructions in the app and add the code needed to make it print
// "Hamlet, by William Shakespeare, as published in 1603" to the screen

object Hamlet extends App {
  trait PrettyPrintable {
    def prettyPrint: String
  }

  def toScreen(p: PrettyPrintable): Unit = {
    // ---- Add anything you need below this line
    ???
    // ---- Add anything you need above this line
  }

  // --- Add case classes below this line ---
  // --- Add case classes above this line ---

  // --- uncomment the lines below this line ---

  //val shakespeare = Author("William", "Shakespeare")
  //val hamlet = Book("Hamlet", shakespeare, 1603)

  //toScreen(hamlet)

  // --- uncomment the lines above this line ---
}
