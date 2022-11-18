// Count number of prime number TLE COMES

public class CountPrimes_204 {

    public static void main(String[] args) {
        int n = 11;
        System.out.println(countPrimes(n));
    }
    public static int countPrimes(int n) {

        if(n == 0 || n == 1) return 0;
        if(n == 2) return 1;
        int count = 1;


        for(int i=3;i<n;i++){
            boolean check = true;
            for(int j=2;j<i;j++){
                if(i%j == 0){
                    check = false;
                    break;

                }
            }
            if(check) count++;

        }

        return count;

    }

}
