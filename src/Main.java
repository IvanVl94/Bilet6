public class Main {
    public  static  void main (String[] args) {
int[] numbers = {1,2,3,4,5,6,7,8,9,10};
massive(numbers);
    }
    public static  void massive ( int[]number){
        for (int i = 0; i < number.length ; i++) {
            System.out.println(number[i]);
            if (number[i] % 2 == 0) {
                number[i] +=1;
            }

        }
        for (int i = 2; i < 7; i++) {
            System.out.println(number[i]);

        }
    }
}
