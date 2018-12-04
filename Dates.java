import java.util.Arrays;
import java.util.Scanner;
/*major concerns: This will all dissapear once the program ends, we need to find a way to save information to a file
and retrieve it. Additionally this currently can only save one line of input for the agenda at a time, and it's very
vulnerable to improperly formatted/mistyped inputs from the user. More of a minimal viable product than an actual
finished product. */
public class Dates{
  public static void main(String[] args){
//Here we create an array for each month with a space for each day.
    String[] jan = new String[31];
    String[] feb = new String[28];
    String[] mar = new String[31];
    String[] apr = new String[30];
    String[] may = new String[31];
    String[] jun = new String[30];
    String[] jul = new String[31];
    String[] aug = new String[31];
    String[] sep = new String[30];
    String[] oct = new String[31];
    String[] nov = new String[30];
    String[] dec = new String[31];

//Next we place all of these arrays into a new array so that the correct date can be edited in one step
//Not sure if this is actually helpful, feel free to tweak it.
    String[][] dates = {jan,feb,mar,apr,may,jun,jul,aug,sep,oct,nov,dec};
//This is my code for putting a note or an agenda on the calendar for a given day.
    System.out.println("To add an agenda please enter a date with the format: number of month [space] day. ");
    System.out.println("For example March 24th should be written 3 24");
    Scanner console = new Scanner(System.in);
    int month = console.nextInt()-1;
    int day = console.nextInt()-1;
    System.out.println("Great! Now please enter the agenda/notes you would like to make");
  //For some reason the program didn't wait for a new input here, and just ended the program, so I
  //Made a temporary fix by creating a new Scanner. Not sure what the original problem was though.
  Scanner input = new Scanner(System.in);
    String agenda = input.nextLine();
    dates[month][day] = agenda;
    System.out.println(Arrays.deepToString(dates));
  //So up to this point we can put an agenda/note into the two dimensional array which represents every
  //day of the year, and then print out the entire array, with all 365 elements coming up null except
  //for the one we just changed, but I don't know how to make it print just one date's info, and I want
  //to make it so it will keep repeating this process until the user types something like "end" in.
  }
}
