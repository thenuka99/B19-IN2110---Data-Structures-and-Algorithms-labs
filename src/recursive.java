public class recursive {
    public static void main(String[] args) {
        System.out.println(sumOfEven(0));
    }
    //base case
    static int sumOfEven(int num){
        if(num>10){
            return 0;
        }
        else{
            //inductive case
            return num + sumOfEven(num+2);
        }
    }

}
