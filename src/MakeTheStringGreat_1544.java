public class MakeTheStringGreat_1544 {

    public static void main(String[] args) {

        String s = "RLlr";

        System.out.println(makeGood(s));
    }

    public static String makeGood(String s) {

        int len = s.length();
        String newS = "" ;

        if(len == 1){
            return s;
        }
        boolean check = true;
        for(int i = 0 ; i < len-1 ; i++){

            if( ( Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(i+1))) && ( Character.isUpperCase(s.charAt(i)) ^ Character.isUpperCase(s.charAt(i+1)) )){
                i=i+1;
                check = false;
            }
            else{

                newS = newS + s.charAt(i);
                check = true;

            }


        }
        if(check) {
            newS += s.charAt(len-1);
        }


        if(checkString(newS)){
            return newS;
        }else {
            return makeGood(newS);
        }

    }

   public static boolean checkString(String s){

        int len = s.length();

       for(int i = 0 ; i < len-1 ; i++){

           if( ( Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(i+1))) && ( Character.isUpperCase(s.charAt(i)) ^ Character.isUpperCase(s.charAt(i+1)) )){
               return false;
           }
       }
       return true;

    }

}
