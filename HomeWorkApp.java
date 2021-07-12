public class HomeWorkApp {
    public static void main(String[] args) {
      printThreeWords();
     checkSumSign();
        printColor();
        compareNumbers();

    }
    static void  printThreeWords() {
    System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    static void checkSumSign() {
        int a = 3;
        int b = 1;
        int c = (a + b);
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }
         static void  printColor() {
             int value = 102;
             if (value <= 0) {
                 System.out.println("Красный");
             }
             if (value >= 1 && value <= 100) {
                 System.out.println("Желтый");
             }
             if (value >= 101) {
                 System.out.println("Зеленый");
             }
         }
    static void compareNumbers(){
        int a = 10;
        int b = 11;
        if (a >= b){
            System.out.println("a>=b");
        }
        else{
            System.out.println("a<b");
        }


    }
}







