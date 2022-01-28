import java.util.Scanner;
public class UserInput extends ShowPatterns {


    static int count, choice, item;
    static String itemDisplay;

    static void userInputNumbers() {
        Scanner intake = new Scanner(System.in);
        System.out.println("Enter the numbers to print pattern");
        //no of display rows
        count = intake.nextInt();
        userInputDisplayItem();
        choiceOfPattern();

    }
    static void userInputDisplayItem(){
        Scanner inDisplay=new Scanner(System.in);
        System.out.println("Enter what you want to display");
        item=inDisplay.nextInt();
        switch (item)
        {
            case 1:
            {
                itemDisplay=" *";
                break;
            }
            case 2:
            {
                itemDisplay=" a";
                break;
            }
            case 3:
            {
                itemDisplay=" A";
                break;
            }
            default:
            {
                System.out.println("Design is not available");
                break;
            }
        }

    }

    static void choiceOfPattern()
    {
        Scanner inPatttern=new Scanner(System.in);
      System.out.println("Enter pattern choice");
        choice=inPatttern.nextInt();

        switch (choice)
        {
            case 1:
            {
                PatternCollection.pattern1(count);
                break;
            }
            case 2:
            {
                PatternCollection.pattern2(count);
                break;
            }
            default:
            {
                System.out.println("No such pattern");
                break;
            }
        }


    }




        //pattern count















}
