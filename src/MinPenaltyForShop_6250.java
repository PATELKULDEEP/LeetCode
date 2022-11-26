public class MinPenaltyForShop_6250 {

    public static void main(String[] args) {

        String customers = "YYYY";

        System.out.println(bestClosingTime(customers));

    }

    public static int bestClosingTime(String customers) {

        int min = customers.length();
        int len = min;
        int position = len;

            int penalty = 0;
            int close = 0;
            for(int j=0;j<len;j++){

                if((customers.charAt(j) == 'Y' && j >= close) || ( j < close && customers.charAt(j) == 'N' )){
                    penalty++;
                }


                if(penalty < min) {
                    min = penalty;
                    position = close;
                }
                close++;
            }



        return position;
    }

}
