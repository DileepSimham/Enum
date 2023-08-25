package part2;

public enum Beer {

    KF, KO, RC, FO;
}

class Test{
    public static void main(String[] args) {
        Beer[] values = Beer.values();
        for (Beer b:values) {
            System.out.println(b+" -> "+b.ordinal());
        }
    }
}
