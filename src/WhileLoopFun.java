public class WhileLoopFun {

    public WhileLoopFun() { }

    public void printDigits(int number) {
        while (number > 0) {
            int digit = number % 10;
            System.out.println(digit);
            number /= 10;
        }
    }

    public int countLetter(String word, String letter) {
        int letterCount = 0;
        int count = 0;
        while (letterCount < word.length()) {
            if (word.substring(letterCount, letterCount + 1).equals(letter)) {
                count ++;
            }
            letterCount ++;
        }
        return count;
    }

    public int maxDoubles(int number, int threshold) {
        int count = 0;
        int multiple = number;
        while (multiple * 2 <= threshold) {
            count ++;
            multiple *= 2;
        }
        return count;
    }

    public boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        int num = 2;
        while (num < number) {
            if (number % num == 0) {
                return false;
            }
            num ++;
        }
        return true;
    }
}
