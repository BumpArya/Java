package package1;

import Java_Ch_12.*;

public class Java_66_Access_Modifiers_In_Java_p1  {
    public static void main(String[] args) { // outside package (not within subclass)
        Java_66_Access_Modifiers_In_Java obj = new Java_66_Access_Modifiers_In_Java();
        obj.pubMethod();
        // obj.proMethod(); --> not valid
        // obj.defMethod(); --> not valid
        // obj.priMethod(); --> not valid
    }
}
class Access_Modifiers_p1 extends Java_66_Access_Modifiers_In_Java{ // outside package (within subclass)
    public void method(){
        Access_Modifiers_p1 obj = new Access_Modifiers_p1();
        obj.pubMethod();
        obj.proMethod();
        // obj.defMethod(); --> not valid
        // obj.priMethod(); --> not valid
    }
}

