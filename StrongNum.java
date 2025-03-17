import java.util.Scanner;
class StrongNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem = 0, temp = num, sn = 0;

        while (temp != 0) {
            rem = temp % 10;
            sn = sn + factorial(rem);   
            temp = temp / 10;
        }

        System.out.println(sn);

        if (sn == num) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
    static int factorial(int N) {
        int fact = 1;
        for (int i = 1; i <= N; i++) {  
            fact *= i;
        }
        return fact;
    }
}
