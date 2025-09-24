import java.util.Scanner;

class Main {

    public static void main(String[] args){
        int a= 1, b = 1, c = 2, n, num;
        System.out.println("Enter number:");

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("\nFibonacci number:");

        for(int i = 3;i <= n; i++){
            if (n == 0) {
                System.out.println("0");
                break;
            }
            if (n == 1 || n == 2) {
                System.out.println("1");
                break;
            }
            num = a+b;
            a = b;
            b = num;
            if (i == n) {
                System.out.println(num);
                break;
            }
        }
    }
}
