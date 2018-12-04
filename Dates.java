import java.util.Arrays;
import java.util.Scanner;

/*major concerns: This will all dissapear once the program ends, we need to find a way to save information to a file
and retrieve it. Additionally this currently can only save one line of input for the agenda at a time, and it's very
vulnerable to improperly formatted/mistyped inputs from the user. More of a minimal viable product than an actual
finished project. */
public class Dates{
  //These are all static arrays for each month containing a block for each day in the respective month.
  static String[] jan = new String[31];
  static String[] feb = new String[28];
  static String[] mar = new String[31];
  static String[] apr = new String[30];
  static String[] may = new String[31];
  static String[] jun = new String[30];
  static String[] jul = new String[31];
  static String[] aug = new String[31];
  static String[] sep = new String[30];
  static String[] oct = new String[31];
  static String[] nov = new String[30];
  static String[] dec = new String[31];
  public static void main(String[] args){
    System.out.println("Welcome to the MY CALENDAR app!");
//This while loop makes it so they can continue checking and editing the calendar until they choose to exit the program.
    int exit = 0; // if this variable becomes 1 then the loop will end and the program will terminate.
    while(exit !=1){
//This is the main menu which allows the user to check their agenda for a given day, or add an agenda to another day.
      System.out.printf("%n%nMAIN MENU:%n Please enter the number which corresponds to your desired option.%n");
      System.out.printf("1 add an agenda for a day%n2 check an agenda for a day%n3 exit program%n%n");
      Scanner console = new Scanner(System.in);
      int option = console.nextInt();
      switch(option){
        case 1: addAgenda(); break;
        case 2: checkAgenda(); break;
        case 3: System.out.println("goodbye"); exit = 1; break;
      }
    }
  }
  public static void checkAgenda(){
    System.out.printf("Please enter the date you would like to access with the format: first three letters of month [space] day.%n");
    Scanner console = new Scanner(System.in);
    String month = console.next();
    int day = console.nextInt()-1;
    System.out.printf("%nGreat! your agenda for %s %d is \"",month,day+1);
    switch(month){
      case "jan": System.out.printf(jan[day].toString()); break;
      case "feb": System.out.printf(feb[day].toString()); break;
      case "mar": System.out.printf(mar[day].toString()); break;
      case "apr": System.out.printf(apr[day].toString()); break;
      case "may": System.out.printf(may[day].toString()); break;
      case "jun": System.out.printf(jun[day].toString()); break;
      case "jul": System.out.printf(jul[day].toString()); break;
      case "aug": System.out.printf(aug[day].toString()); break;
      case "sep": System.out.printf(sep[day].toString()); break;
      case "oct": System.out.printf(oct[day].toString()); break;
      case "nov": System.out.printf(nov[day].toString()); break;
      case "dec": System.out.printf(dec[day].toString()); break;
    }
    System.out.printf("\"");

  }
//This is my code for putting a note or an agenda on the calendar for a given day.
  public static void addAgenda(){
    System.out.println("To add an agenda please enter a date with the format: first three letters of month [space] day. ");
    System.out.println("For example March 24th should be written mar 24");
    Scanner console = new Scanner(System.in);
    String month = console.next();
    int day = console.nextInt()-1;
    System.out.println("Great! Now please enter the agenda/notes you would like to make");
  //For some reason the program didn't wait for a new input here, and just ended the program, so I
  //Made a temporary fix by creating a new Scanner. Not sure what the original problem was though.
  Scanner input = new Scanner(System.in);
    String agenda = input.nextLine();
    switch(month){
      case "jan": jan[day]=agenda; System.out.printf("%nYou have added the agenda item \""+jan[day].toString()+ "\" to jan "+(day+1)); break;
      case "feb": feb[day]=agenda; System.out.printf("%nYou have added the agenda item \""+feb[day].toString()+ "\" to feb "+(day+1)); break;
      case "mar": mar[day]=agenda; System.out.printf("%nYou have added the agenda item \""+mar[day].toString()+ "\" to mar "+(day+1)); break;
      case "apr": apr[day]=agenda; System.out.printf("%nYou have added the agenda item \""+apr[day].toString()+ "\" to apr "+(day+1)); break;
      case "may": may[day]=agenda; System.out.printf("%nYou have added the agenda item \""+may[day].toString()+ "\" to may "+(day+1)); break;
      case "jun": jun[day]=agenda; System.out.printf("%nYou have added the agenda item \""+jun[day].toString()+ "\" to jun "+(day+1)); break;
      case "jul": jul[day]=agenda; System.out.printf("%nYou have added the agenda item \""+jul[day].toString()+ "\" to jul "+(day+1)); break;
      case "aug": aug[day]=agenda; System.out.printf("%nYou have added the agenda item \""+aug[day].toString()+ "\" to aug "+(day+1)); break;
      case "sep": sep[day]=agenda; System.out.printf("%nYou have added the agenda item \""+sep[day].toString()+ "\" to sep "+(day+1)); break;
      case "oct": oct[day]=agenda; System.out.printf("%nYou have added the agenda item \""+oct[day].toString()+ "\" to oct "+(day+1)); break;
      case "nov": nov[day]=agenda; System.out.printf("%nYou have added the agenda item \""+nov[day].toString()+ "\" to nov "+(day+1)); break;
      case "dec": dec[day]=agenda; System.out.printf("%nYou have added the agenda item \""+dec[day].toString()+ "\" to dec "+(day+1)); break;
    }
  }
}
