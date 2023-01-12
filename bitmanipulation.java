public class bitmanpulation {
    public static void EvenorOdd(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
    public static int  get(int n,int i){
       return (n & (1<<i))!=0?1:0;
    }
    public static int set(int n,int i){
        int bm=1<<i;
        return n|bm;
    }
    public static int clear(int n,int i){
        int bm=  ~(1<<i);
        return n&bm;
    }
    public static void main(String []args){
        // System.out.println(5&6);
        // System.out.println(5|6);
        // System.out.println(5^6);
        // System.out.println(~5);
        // System.out.println(5<<2);
        // System.out.println(6>>1);
        // EvenorOdd(1);
        // EvenorOdd(0);
    //    int i= get(10, 3);
    //    System.out.println(i);
    int i= set(10, 2);
    System.out.println(i);
    int l= clear(10, 1);
    System.out.println(l);
    }
   
}
