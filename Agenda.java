public static void checkAgenda(){
  System.out.printf("Please enter the date you would like to access with the format: first three letters of month [space] day.%n");
  Scanner console = new Scanner(System.in);
  String month = console.next();
  int day = console.nextInt()-1;


  switch(month){
    case "jan": String[] checkAgenda = jan[day].split(";"); break;
    case "feb": String[] checkAgenda = feb[day].split(";"); break;
    case "mar": String[] checkAgenda = mar[day].split(";"); break;
    case "apr": String[] checkAgenda = apr[day].split(";"); break;
    case "may": String[] checkAgenda = may[day].split(";"); break;
    case "jun": String[] checkAgenda = jun[day].split(";"); break;
    case "jul": String[] checkAgenda = jul[day].split(";"); break;
    case "aug": String[] checkAgenda = aug[day].split(";"); break;
    case "sep": String[] checkAgenda = sep[day].split(";"); break;
    case "oct": String[] checkAgenda = oct[day].split(";"); break;
    case "nov": String[] checkAgenda = nov[day].split(";"); break;
    case "dec": String[] checkAgenda = dec[day].split(";"); break;
  }

  System.out.printf("%n Great! there are %d items on the agenda for %s %d is \"",checkAgenda.length-1,month,day+1);
  System.out.printf("%n Your agenda for %s %d is \"",month,day+1);
  for(int i=0; i<checkAgenda.length; i++){
  System.out.printf(checkAgenda[i])
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
  String agenda = ";"+ input.nextLine();
  switch(month){
    case "jan": jan[day]+=agenda; System.out.printf("%nYou have added the agenda item %s to jan %d",agenda,day+1); break;
    case "feb": feb[day]+=agenda; System.out.printf("%nYou have added the agenda item %s to feb %d",agenda,day+1); break;
    case "mar": mar[day]+=agenda; System.out.printf("%nYou have added the agenda item %s to mar %d",agenda,day+1); break;
    case "apr": apr[day]+=agenda; System.out.printf("%nYou have added the agenda item %s to apr %d",agenda,day+1); break;
    case "may": may[day]+=agenda; System.out.printf("%nYou have added the agenda item %s to may %d",agenda,day+1); break;
    case "jun": jun[day]+=agenda; System.out.printf("%nYou have added the agenda item %s to jun %d",agenda,day+1); break;
    case "jul": jul[day]+=agenda; System.out.printf("%nYou have added the agenda item %s to jul %d",agenda,day+1); break;
    case "aug": aug[day]+=agenda; System.out.printf("%nYou have added the agenda item %s to aug %d",agenda,day+1); break;
    case "sep": sep[day]+=agenda; System.out.printf("%nYou have added the agenda item %s to sept %d",agenda,day+1); break;
    case "oct": oct[day]+=agenda; System.out.printf("%nYou have added the agenda item %s to oct %d",agenda,day+1); break;
    case "nov": nov[day]+=agenda; System.out.printf("%nYou have added the agenda item %s to nov %d",agenda,day+1); break;
    case "dec": dec[day]+=agenda; System.out.printf("%nYou have added the agenda item %s to dec %d",agenda,day+1); break;
  }
}
