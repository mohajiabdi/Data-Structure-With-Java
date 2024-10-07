package P1;

public class C1 {
    //Field
    public int x;
    int y;
    private int z;
    private String name;

    //Constructor


    public C1() {
    }

    public C1(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //Method
    public void m1(){}
    void m2(){}
    private void m3(){}

    //getter and Setters of private fields

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }


    @Override
    public String toString() {
        return "C1:" +
                "\n\tx= " + x +
                "\n\ty= " + y +
                "\n\tz= " + z+
                "\n\tName= " + name;
    }
}
