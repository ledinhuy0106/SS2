public class DemoFori {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (checkPrime(i)) {
                System.out.print(" "+i);
            }
        }
        int number = 0;
        int count = 0;
        while (count < 100) {
            if (checkPrime(number)) {
                count++;
                System.out.println("20 so nt dau tien: " + count + " " + number);
            }
            number++;
        }
    }

    public static boolean checkPrime(int num) {
        if (num == 0) {
            return false;
        }
        if (num == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
