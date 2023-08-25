package part3;

public enum Beer2 {

    KF(70),KO(80),RC(90),FO;

    int price;
    Beer2(int price) {
        this.price=price;
    }

    Beer2() {
        this.price=65;
    }

    public int getPrice(){
        return price;
    }
}

class Test2{
    public static void main(String[] args) {
        Beer2[] values = Beer2.values();
        for(Beer2 b:values){
            System.out.println(b+"--------"+b.getPrice());
        }
    }
}
