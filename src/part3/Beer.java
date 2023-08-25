package part3;

public enum Beer {

    KF,KO,RC,FO;

    Beer(){
        System.out.println("constructor");
    }
}
class Test{
    public static void main(String[] args) {
        Beer b=Beer.RC;
        System.out.println("Hello");
    }
}
