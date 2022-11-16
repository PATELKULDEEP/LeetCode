public class GuessNumberHigherOrLower_374 {

    static int pick = 6;
    public static void main(String[] args) {

        int n = 10;
       System.out.println(guessNumber(n));

    }
    public static int guessNumber(int n) {

        int i = 1, j = n;
        while(i < j) {
            int mid = i + (j - i) / 2;
            if(guess(mid) == 0) {
                return mid;
            } else if(guess(mid) == 1) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }
        return i;

    }
   public static int guess(int num){

        if(num == pick){
            return 0;
        }
        else if(num < pick){
            return 1;
        }
        else {
            return -1;
        }

    }

}
