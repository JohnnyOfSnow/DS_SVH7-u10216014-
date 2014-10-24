public class EmptyListException extends RuntimeException {
   int status = 0;
   // no-argument constructor
   public EmptyListException(){
      this( "List" ); // call other EmptyListException constructor
   } // end EmptyListException no-argument constructor

   // one-argument constructor
   public EmptyListException( String name ){
      setStatus(0);
      
   } // end EmptyListException one-argument constructor

   public void setStatus(int newStatus){
      status = newStatus;
   }

   public int getStatus(){
      return status;
   }
} // end class EmptyListException


