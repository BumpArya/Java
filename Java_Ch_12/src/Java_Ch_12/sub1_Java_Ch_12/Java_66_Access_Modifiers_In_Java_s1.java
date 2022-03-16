// Warning - look at the objects created

package Java_Ch_12.sub1_Java_Ch_12;

import Java_Ch_12.*;

public class Java_66_Access_Modifiers_In_Java_s1 {
    public static void main(String[] args) { // within sub-package (not within subclass)
        Java_66_Access_Modifiers_In_Java obj = new Java_66_Access_Modifiers_In_Java();
        obj.pubMethod();
        // obj.proMethod(); --> not valid
        // obj.defMethod(); --> not valid
        // obj.priMethod(); --> not valid

    }
}

class Access_Modifiers_s1 extends Java_Ch_12.Java_66_Access_Modifiers_In_Java {
    public void method() { // within sub-package (within subclass)
        Java_66_Access_Modifiers_In_Java obj = new Java_66_Access_Modifiers_In_Java();
        obj.pubMethod();
        // obj.proMethod(); --> not valid
        // obj.defMethod(); --> not valid
        // obj.priMethod(); --> not valid

    }
}