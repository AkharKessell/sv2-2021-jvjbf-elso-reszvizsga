package numbers;

public class PerfectNumbers {

    public boolean isPerfectNumber(int number) {

        int Sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                Sum = Sum + i;
            }
        }
        if (Sum == number) {
            return true;
        }
        return false;
    }
}