
class ADTFraction {
    private int n; //numerator
    private int d; //denominator
    //---------------------------------------------------
    public ADTFraction() {
        this.n=0;
        this.d=1;

    }
    //---------------------------------------------------
    public ADTFraction(int a, int b) {
        set(a,b);
    }
    //---------------------------------------------------
    public void set(int a, int b) {
        if(b!=a){
            this.n=a;
            this.d=b;
        }else{
            this.n=0;
            this.d=1;
            System.out.println("Denominator cannot be zero");
        }
    }
    //---------------------------------------------------
    public ADTFraction plus(ADTFraction x) {
        int num,max;
        if(this.d>x.d){
            max=this.d;
        }else{
            max=x.d;
        }
        int comDen=max;
        while(true){
            if(comDen % this.d==0 && comDen% x.d==0){
                break;

            }else{
                comDen=comDen+max;
            }

        }


        num= comDen/this.n*this.n + comDen/x.d*x.n;
        return new ADTFraction(num, comDen);

    }
//---------------------------------------------------

    public ADTFraction times(int a) {
        int num, den;
        num=this.n*a;
        den=this.d;
        return new ADTFraction(num, den);
    }
    //---------------------------------------------------

    public ADTFraction times(ADTFraction x) {
        int num, den;
        num=this.n*x.n;
        den=this.d*x.d;
        return new ADTFraction(num, den);
    }
    //---------------------------------------------------
    public ADTFraction reciprocal() {
        return new ADTFraction(this.d, this.n);
    }
    //---------------------------------------------------
    public float value() {
        float value=(float)this.n/this.d;
        return value;
    }
    //---------------------------------------------------
    public void display() {
        System.out.println("fraction="+this.n+"/"+this.d);
    }
//---------------------------------------------------

    public void refine() {
        int min;
        if(this.n<this.d){
            min=this.n;
        }else{
            min = this.d;
        }
        for(int i = min; i>=2; i--){
            if(this.n%i==0 && this.d%i==0){
                this.n=this.n/i;
                this.d=this.d/i;
            }
        }
    }
}

public class ADTFractionApp {
    public static void main(String[] args) {
        ADTFraction f1= new ADTFraction();
        f1.display();
        f1.set(12,30);
        f1.display();
        ADTFraction f2=new ADTFraction(3,7);
        f2.display();
        ADTFraction f3=f1.plus(f2);
        f3.display();
        f3.refine();
        f3.display();
        ADTFraction f4=f1.times(3);
        f4.display();
        f4.refine();
        f4.display();
        ADTFraction f5=f1.times(f2);
        f5.display();
        f5.refine();
        f5.display();
        ADTFraction f6=f1.reciprocal();
        f6.display();
        float v=f1.value();
        System.out.println("value is: "+ v);
    }
}