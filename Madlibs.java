import java.util.Scanner;
/**
 * To create a madlib using the users input
 *
 * @Ashton Guvenir
 * @9/16/2022
 */
public class Madlibs
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //name and date
        System.out.print("Enter your name (First, Last): ");
        String name = input.nextLine();
        System.out.print("Enter the month(mm): ");
        int month = input.nextInt();
        input.nextLine();
        System.out.print("Enter the day(dd): ");
        int day = input.nextInt();
        input.nextLine();
        System.out.print("Enter the year(yyyy): ");
        int year = input.nextInt();
        input.nextLine();
        
        //the words that are going to be put in the madlib
        System.out.print("Enter a adjective: ");
        String adjective1 = input.nextLine();
        
        System.out.print("Enter another adjective: ");
        String adjective2 = input.nextLine();
        
        System.out.print("Enter a type of bird: ");
        String bird = input.nextLine();
        
        System.out.print("Enter a room in a house: ");
        String room = input.nextLine();
        
        System.out.print("Enter a past tense verb: ");
        String verbPastTense = input.nextLine();
        
        System.out.print("Enter any verb: ");
        String verb = input.nextLine();
        
        System.out.print("Enter a relative's name: ");
        String relativeName = input.nextLine();
        
        System.out.print("Enter a noun: ");
        String noun1 = input.nextLine();
        
        System.out.print("Enter a liquid: ");
        String liquid = input.nextLine();
        
        System.out.print("Enter a verb ending in -ing: ");
        String verbIng1 = input.nextLine();
        
        System.out.print("Enter the name of a body part (plural): ");
        String bodyPart = input.nextLine();
        
        System.out.print("Enter a plural noun: ");
        String pluralNoun = input.nextLine();
        
        System.out.print("Enter another verb ending in -ing: ");
        String verbIng2 = input.nextLine();
        
        System.out.print("Enter another noun: ");
        String noun2 = input.nextLine();
        
        System.out.println();
        
        System.out.print("Are you ready to see the madlib? (y/n): ");
        String messingWithUser = input.nextLine();
        System.out.println("I don't know yet how to tell whether or not you");
        System.out.println("said y or n so I'm just going to give it to you.");
        
        System.out.println();
        
        System.out.println("Your Madlib");
        System.out.println("Name: "+name);
        System.out.println("Date: "+month+"/"+day+"/"+year);
        
        System.out.println();
        
        System.out.println("It was a "+adjective1+", cold November day. I");
        System.out.println("woke up to the "+adjective2+" smell of "+bird);
        System.out.println("roasting in the "+room+" downstairs. I");
        System.out.println(verbPastTense+" down the stairs to see if I could");
        System.out.println("help "+verb+" the dinner. My mom said,");
        System.out.println("See if "+relativeName+" needs a fresh "+noun1+". So I");
        System.out.println("carried a tray of glasses full of "+liquid+" into");
        System.out.println("the "+verbIng1+" room. When I got there, I");
        System.out.println("couldn't believe my "+bodyPart+"! There were");
        System.out.print(pluralNoun+" "+verbIng2+" on the "+noun2+"!");
    }
}
