package part1;

public enum Beer2 {

    KF,KO,RC,FO;
}

// enum Days{
//    KALYANI;
//}


class Test2{
    public static void main(String[] args) {
        Beer2 b=Beer2.KF;
//        Days d= Days.KALYANI;



        switch (b) {
            case KO -> System.out.println("it's too light");
            case RC -> System.out.println("it;s not that much kick");
            case FO -> System.out.println("Buy one get one");
            case KF -> System.out.println("it's childrens brand");
//            case KALYANI-> System.out.println("herllo");
        }
    }
}
