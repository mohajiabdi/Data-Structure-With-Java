package P2;

import P1.C1;

public class C3 {
    public static void main(String[] args) {
        C1 o = new C1();

        o.x = 10; //can access
        //o.x = 10; //can not access
        //o.z = 10; //can not access
        //o.name = "Ali"; //can not access


        o.m1(); // can invoke
        //o.m2(); // can not invoke
        //o.m3(); // can not invoke

        o.setY(500);
        o.setName("MoHaji Abdi");
        o.setZ(300);


        System.out.println(o.toString());

    }
}
