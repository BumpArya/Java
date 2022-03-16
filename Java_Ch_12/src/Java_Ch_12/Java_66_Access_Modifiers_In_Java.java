// Warning - look at the objects created

package Java_Ch_12;

public class Java_66_Access_Modifiers_In_Java {
    public int p = 1;
    protected int q = 2;
    int r = 3;
    private int s = 4;
    public void pubMethod(){
        System.out.println(p);
    }
    protected void proMethod(){
        System.out.println(q);
    }
    void defMethod(){
        System.out.println(r);
    }
    private void priMethod(){
        System.out.println(s);
    }

    public static void main(String[] args) { // within class
        Java_66_Access_Modifiers_In_Java obj = new Java_66_Access_Modifiers_In_Java();
        obj.pubMethod();
        obj.proMethod();
        obj.defMethod();
        obj.priMethod();
    }
}

class Access_Modifiers {
    public void method() { // within package
        Java_66_Access_Modifiers_In_Java obj = new Java_66_Access_Modifiers_In_Java();
        obj.pubMethod();
        obj.proMethod();
        obj.defMethod();
        // obj.priMethod(); --> not valid
    }
}
