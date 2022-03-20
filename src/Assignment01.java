import java.util.Scanner;

class ass01 {
    boolean isArrComplete(char[] arr){
        if(arr[arr.length-1]!='\0'){
            return true;
        }
        return false;

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

public class Assignment01 {

    public static void main(String[] args) {
        ass01 e = new ass01();
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
            System.out.print("Enter data(type 'e' for end):");
            temp = sn.next().charAt(0);
            if(temp=='e'||temp=='E'){
                System.out.println("Good bye");
                return;
            }else{
                for (int i = 0; i < size-1; i++) {
                    array[i]=array[i+1];
                }
                array[size-1]=temp;
                e.noOccurrences(array);
            }
        }
    }
}