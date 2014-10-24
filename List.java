class ListNode< T > {
   // package access members; List can access these directly
   T data; // data for this node
   ListNode< T > nextNode; // reference to the next node in the list

   // constructor creates a ListNode that refers to object
   ListNode( T object ) { 
      this( object, null ); 
   } // end ListNode one-argument constructor 

   // constructor creates ListNode that refers to the specified
   // object and to the next ListNode
   ListNode( T object, ListNode< T > node ){
      data = object;    
      nextNode = node;  
   } // end ListNode two-argument constructor

   // return reference to data in node
   T getData() { 
      return data; // return item in this node
   } // end method getData

   // return reference to next node in list
   ListNode< T > getNext() { 
      return nextNode; // get next node
   } // end method getNext
} // end class ListNode< T >

// class List definition
public class List< T >{
   private ListNode< T > firstNode;
   private ListNode< T > lastNode;
   private String name; // string like "list" used in printing

   // constructor creates empty List with "list" as the name
   public List() { 
      this( "list" ); 
   } // end List no-argument constructor

   // constructor creates an empty List with a name
   public List( String listName ){
      name = listName;
      firstNode = lastNode = null;
   } // end List one-argument constructor

   // insert item at front of List
   public void insertAtFront( T insertItem ){
      if ( isEmpty() ) // firstNode and lastNode refer to same object
         firstNode = lastNode = new ListNode< T >( insertItem );
      else // firstNode refers to new node
         firstNode = new ListNode< T >( insertItem, firstNode );
   } // end method insertAtFront

   // insert item at end of List
   public void insertAtBack( T insertItem ){
      if ( isEmpty() ) // firstNode and lastNode refer to same object
         firstNode = lastNode = new ListNode< T >( insertItem );
      else // lastNode's nextNode refers to new node
         lastNode = lastNode.nextNode = new ListNode< T >( insertItem );
   } // end method insertAtBack

   // remove first node from List
   public T removeFromFront() throws EmptyListException{
      if ( isEmpty() ) // throw exception if List is empty
         throw new EmptyListException( name );

      T removedItem = firstNode.data; // retrieve data being removed

      // update references firstNode and lastNode 
      if ( firstNode == lastNode )
         firstNode = lastNode = null;
      else
         firstNode = firstNode.nextNode;

      return removedItem; // return removed node data
   } // end method removeFromFront

   // remove last node from List
   public T removeFromBack() throws EmptyListException{
      if ( isEmpty() ) // throw exception if List is empty
         throw new EmptyListException( name );

      T removedItem = lastNode.data; // retrieve data being removed

      // update references firstNode and lastNode
      if ( firstNode == lastNode )
         firstNode = lastNode = null;
      else // locate new last node
      { 
         ListNode< T > current = firstNode;

         // loop while current node does not refer to lastNode
         while ( current.nextNode != lastNode )
            current = current.nextNode;
   
         lastNode = current; // current is new lastNode
         current.nextNode = null;
      } // end else

      return removedItem; // return removed node data
   } // end method removeFromBack

   // determine whether list is empty
   public boolean isEmpty(){ 
      return firstNode == null; // return true if list is empty
   } // end method isEmpty

   // output list contents
   public String print(){
	   StringBuilder a = new StringBuilder();
      if ( isEmpty() ) {
         a.append("Empty " + name);
         String result = new String(a);
         return result;
      } // end if

      a.append("The " + name + " is: \n");

      ListNode< T > current = firstNode;
      int n = 1;
      // while not at end of list, output current node's data
      while ( current != null ) {
         if(current.nextNode != lastNode && n != 0){
            a.append(current.data + "--->");
         }else if(n == 0){
            a.append(current.data);
         }else{
            n = n - 1; 
            a.append(current.data + "--->");
         }
         current = current.nextNode;
      } // end while

      String result = new String(a);
      return result;
   } // end method print

   public T getFromBack() throws EmptyListException{
	if ( isEmpty() ) // throw exception if List is empty
         throw new EmptyListException( name );

      T removedItem = lastNode.data; // retrieve data being removed

      return removedItem; // return removed node data
   }

   public T getFromFront() throws EmptyListException{
	if ( isEmpty() ) // throw exception if List is empty
         throw new EmptyListException( name );

      T removedItem = firstNode.data; // retrieve data being removed


      return removedItem; // return removed node data
   }
} // end class List< T >
