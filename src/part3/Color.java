package part3;

public enum Color {
    BLUE, RED{
        public void info(){
            System.out.println("Dangerous color");
        }
    },

    GREEN;

    public void info(){
        System.out.println("Universal color");
    }
}

class Test4{
    public static void main(String[] args) {
        for(Color color:Color.values()){
            color.info();
        }
    }
}

