public class pratice {
    /*
    static void multi(int n){
        for (int i =1;i <=10;i++){
            System.out.format("%d * %d = %d\n",n , i, n*i);
        }
    }
    static void pattn(int n){
        for (int i = 0; i<n;i++){
            for (int j = 0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patt1(int n){
        for (int i = n; i>0;i--){
            for (int j = 0;j<i;j++){
                System.out.print("*");
            }
        }
            System.out.println("\nn");
    }
    */


    public static void main(String[] args) {
         int n = 4;
         for (int i=n;i>0;i--){
             for (int j = 0;j<i;j++){
                 System.out.print("*");
             }
             System.out.println("\n");
         }
    }
}
