import java.util.Scanner;

public class ListTest 
{
   public static void main( String[] args )
   {
      List< Integer > list = new List< Integer >(); // create a List
      Scanner input = new Scanner(System.in);
      int option = 0;

      
      while(option != 5){
      	option = choose();

      switch(option){
	case 1:
		System.out.println("please enter a number you want to insert at front: ");
		int number1 = input.nextInt();
    list.insertAtFront(number1);
    System.out.println(list.print());
	break;
	case 2:
 		System.out.println("please enter a number you want to insert at back: ");
		int number2 = input.nextInt();
                list.insertAtBack(number2);
        System.out.println(list.print());        
      		
	break;
	case 3:
 		
		
		try 
      		{ 
                	int removedItem = list.removeFromFront();
			System.out.println("-----------------------------");
			System.out.printf( "\n%d removed\n", removedItem );
			System.out.println("-----------------------------");
      System.out.println(list.print());
		}catch ( EmptyListException emptyListException ) 
      		{
         		emptyListException.printStackTrace();
      		} // end catch
	break;
	case 4:
		
		
                try 
      		{ 
                	int removedItem = list.removeFromBack();
			System.out.println("-----------------------------");
			System.out.printf( "\n%d removed\n", removedItem );
			System.out.println("-----------------------------");
      			System.out.println(list.print());
		}catch ( EmptyListException emptyListException ) 
      		{
         		emptyListException.printStackTrace();
      		} // end catch
	break;
	case 5:
	        System.out.println("End the program. ");
	break;	
	default:
		System.out.println("A worng option.");
	break;
		
      }//end switch

      }//end while
      
   } // end main
	static int choose(){
      		Scanner input = new Scanner(System.in);
		System.out.println("-----------------------------");
      		System.out.println("1.you want to insert at front");
      		System.out.println("2.you want to insert at back");
      		System.out.println("3.you want to delete at front");
      		System.out.println("4.you want to delete at back");
		System.out.println("5.you want to end the program");
		System.out.println("-----------------------------");
      		System.out.println("please enter a option: ");

      		int option = input.nextInt();
      		return option;
}
} // end class ListTest

