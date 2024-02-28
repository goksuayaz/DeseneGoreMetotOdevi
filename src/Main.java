public class Main {
    public static void sequence(int num){
        if(num <= 0){
            System.out.println(num + " ");
            return;
        }

        System.out.println(num + " ");
        sequence(num-5);
        System.out.println(num + " ");



    }

    public static void main(String[] args) {
        sequence(16);

    }




    }
