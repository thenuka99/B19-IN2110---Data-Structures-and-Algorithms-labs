import java.sql.SQLOutput;
public class TowerOfHanoi {
    public static void main(String[] args){
        TowerOfHanoi rd=new TowerOfHanoi();
//        int ans = rd.fibo(10);
        rd.solveHanoi(3, 'A', 'B', 'C');
//        System.out.println("Fibo of is: " + ans);

    }
    public int sum(int no){
        if (no==1){
            return 1;
        }
        return no +sum(no -1 );
    }
    public int multi(int no){
        if (no==1){
            return 1;
        }
        return no * multi(no -1 );
    }
    public int multiply(int n, int m){
        if(n==1){
            return m;
        }
        return m + multiply(m, n-1);
    }
    public int fibo(int term){
        if(term == 0){
            return term;
        }
        if(term==1){
            return term;
        }
        return fibo(term - 1)+ fibo (term -2);

    }
    //from, middle, to
    public void solveHanoi(int n, char A, char B, char C){
        if(n==0){
            return;
        }
        solveHanoi(n-1, A, C, B);
        System.out.println("Move plate "+n+" from "+A+" to " + C);
        solveHanoi(n-1, B, A, C);
    }
}





