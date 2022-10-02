public class Main {
    public static void main(String[] args) {
        for(int j=1;j<=5;j++){
           for(int i=j;i<=5;i++){
           System.out.print("  ");
           }
            for(int i=1;i<j;i++){
            System.out.print("* ");
            }
            for(int i=1;i<=j;i++){
            System.out.print("* ");
            }
           
           
             System.out.println();
        }   
    }
}