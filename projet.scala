import swing.
import swing.event.
object MyApp extends SimpleSwingApplicationþ{
  val myButton = new Button {
    action = Action ("Clickþhere"){
      println("Thanks")
    }
  }
    def top =  new MainFrame {
    title = "MyApplicationþ"
      contents = myButton
  }
}