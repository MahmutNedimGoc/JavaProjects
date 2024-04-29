package birincisoru;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
        

        System.out.print("Please enter an upper bound: ");
        int N=input.nextInt();
        System.out.println(N);


        if(N<0){
            System.out.println("Upper bound cannot be negative.");
            System.exit(1);
        }
        else if(N<100){
            System.out.println("Upper bound must have more than or equal to three digits.");
            System.exit(1);
        }
        UMNprint(UMNnumbers(N));
        System.out.println();
        System.out.println("There are "+UMNcounter(UMNnumbers(N))+" ultra magic numbers up to "+N+".");
        
    }

    public static boolean isUMN(int number){
        int x=1;
        int reversed=0;
        int ourNumber=number;
        for(int i=10;i<=number;i*=10){
            x++;
        }
        
        for(int j=x;j>0;j--){
            
            reversed+=(number%10)*Math.pow(10,j-1);

            number/=10;
        }

        if(ourNumber!=reversed){
            return false;
        }
        else{
            if(ourNumber%10==(ourNumber/10)%10){
                return false;
            }
            else
                return true;
        }
    }
    public static int[][] UMNnumbers(int N) {
        int[][] result = new int[N][99];//arrayin two-dimensional olması işlevsiz.
        int temp = 0;

        for (int i=100;i<=N;i++) {
            if (isUMN(i)) {
                result[temp/10][temp%10]=i;
                temp++;
            }
        }

        return result;
    }

    public static void UMNprint(int[][] numbers) {
        int temp=0;
        for (int i=0;i<numbers.length;i++) {
            for (int j=0;j<10;j++) {
                if (numbers[i][j]!=0) {//kodun ilk halinde arrayin bütün elemanları 0dı bunu yazmam gerekti.
                    System.out.print(numbers[i][j]+" ");
                    temp++;
                    if (temp==9){
                        System.out.println();
                        temp=0;
                    }
                }
            }
            //System.out.println(); count kullanmadan enter atmaya çalıştım fakat olmadı.
        }
    }

    public static int UMNcounter(int[][] numbers){//UMNprint koduyla aynı kod ama yazdırmayıp counterı 1 arttırıyor.
        int count=0;
        for (int i=0;i<numbers.length;i++) {
            for (int j=0;j<10;j++) {
                if (numbers[i][j]!=0) {
                    count++;
                }
            }
        }
        return count;
    }
}
