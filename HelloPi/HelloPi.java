import javax.microedition.midlet.MIDlet;

class HelloPi extends MIDlet {
      public void startApp() {
            System.out.println("Hello Pi!!!");
      } 
      public void destroyApp(boolean unconditional) {
            System.out.println("Good-bye Pi!!!");
      } 
}