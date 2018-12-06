import java.util.*;
class ReminderTask extends TimerTask {

  public void run(){
    System.out.println("Your reminder is: Go Grocery shopping Mar 24.");
    synchronized(Dates.obj){
      Dates.obj.notify();
    }

  }

}
