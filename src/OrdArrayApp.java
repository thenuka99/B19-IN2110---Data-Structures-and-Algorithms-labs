
class OrdArray {
    private long[] a;//ref to array a
    private int nEliments;//number of data items

    public OrdArray(int max) {//constructor
        this.a = new long[max];
        this.nEliments=0;
    }

    public int size() { // return max size of the array
        return this.a.length;
    }

    public boolean find(long SearchKey) {//find specified value
        for (int i = 0; i<this.nEliments;i++){
            if(this.a[i]==SearchKey){
                return true;
            }
        }
        return false;
    }// end find()

    public void insert(long value) {//put element into array
        if(nEliments==size()){
            System.out.println("array is full.....insertion terminated.");
            return;
        }
        if(find(value)){
            System.out.println("value duplicated.....insertion terminated.");
        }else{
            for (int i = 0; i<this.nEliments;i++) {
                if (a[i] > value){
                    for(int j=nEliments-1;j>=i;j--){
                        a[j+1]=a[j];
                    }
                    a[i]=value;
                    System.out.println("value inserted");
                    nEliments++;
                    return;
                }
            }
            a[nEliments]=value;
            nEliments++;
            System.out.println("value inserted");
        }
    }//end insert()

    public boolean delete(long value) {//delete the element if it found
        for (int i = 0; i<this.nEliments;i++){
            if(a[i]==value){
                for (int j = i+1; j<this.nEliments;j++){
                    a[j-1]=a[j];
                }
                nEliments--;
                System.out.println("value deleted");
                return true;
            }
        }
        System.out.println("value not found to delete");
        return false;
    }//end delete()

    public void display() {//display array contents
        for (int i = 0; i<this.nEliments;i++){
            System.out.print(a[i]+" ");
        }
    } //end display()
}

public class OrdArrayApp {
    public static void main(String[] args) {

        OrdArray n =new OrdArray(8);
        n.insert(7);
        n.insert(3);
        n.insert(6);
        n.insert(5);
        n.insert(8);
        n.insert(3);
        n.insert(18);
        n.insert(20);
        n.insert(13);
        n.insert(113);
        n.display();
        n.delete(9);
        n.delete(8);
        n.display();

    }
}
