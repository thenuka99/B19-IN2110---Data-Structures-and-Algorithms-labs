
import java.util.Scanner;

public class TakeHomeExercise {
    boolean isArrComplete(char[] arr){
        if(arr[arr.length-1]!='\0'){
            return true;
        }
        return false;

    }
    void shiftArray(char[] arr,char lastElement){
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=lastElement;
    }
    int countItems(char[] arr, int position){
        int count=0;
        for(int i=position;i< arr.length;i++){
            if(arr[i]==arr[position])
                count++;
        }
        return count;
    }
    boolean isCounted(char arr[],int position){
        for (int i=0;i<position;i++){
            if(arr[i]==arr[position]){
                return true;
            }
        }
        return false;
    }
    void noOccurrences(char[] arr){
        for(int i=0;i<arr.length;i++){
            if(!isCounted(arr,i)) {
                System.out.print(arr[i] + "->" + countItems(arr, i) + " ");
            }
        }
        System.out.print("\n");
    }
}

class Test{
    public static void main(String[] args) {
        TakeHomeExercise e = new TakeHomeExercise();
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter memory size:");
        int size = sn.nextInt();
        char[] array = new char[size];
        char temp;

        while(true){
            if(!e.isArrComplete(array)) {
                for (int i = 0; i < size; i++) {
                    System.out.print("Enter data(type 'e' for end):");
                    array[i] = sn.next().charAt(0);
                    if(array[i]=='e'||array[i]=='E') {
                        System.out.println("Good bye");
                        return;
                    }
                }
                e.noOccurrences(array);
            }

            temp = sn.next().charAt(0);
            if(temp=='e'||temp=='E'){
                System.out.println("Good bye");
                return;
            }
            e.shiftArray(array,temp);
            e.noOccurrences(array);
        }
    }
}