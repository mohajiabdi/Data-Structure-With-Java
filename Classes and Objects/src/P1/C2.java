package P1;

public class C2 {
    public static void main(String[] args) {
        C1 o = new C1(10,20,30);
        o.x =40;  // can access
        o.y =50;  // can access
        //o.z =60;  // can not access
        //o.name ="Ali";  // can not access


        o.m1(); // can invoke
        o.m2(); // can invoke
        //o.m3(); // can not invoke


       String display =  o.toString(); // can invoke

        System.out.println(display);

       // display(); //can not invoke instance method in static method....

        System.out.println("Age is: "+C1.age);
    }

    public void display(){
        //try accessing static variable field in c1 class using object
        //System.out.println(o.age); // can not acccess.... Wrong!!!!

        //this one is the right way
        System.out.println("Age is: "+C1.age);
    }

}
