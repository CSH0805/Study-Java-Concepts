package reference_variable;



public class Deaib {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("int a = " + a);
        cheinge(a);
        System.out.println("int a =" + a);
    }

    static void cheinge(int x){
        x = 20;
    }
}
