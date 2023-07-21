abstract class animal {
 public abstract void sound ( ) ;
    }
 class abstraction extends animal {
 public void sound ( ) {
System.out.println ("roar" );
}
public static void main ( String args [ ] ) {
abstraction obj= new abstraction();
obj. sound ();
}
}