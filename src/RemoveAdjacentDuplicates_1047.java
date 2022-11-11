public class RemoveAdjacentDuplicates_1047 {
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }

    public static String removeDuplicates(String s) {

        int n = s.length();

        for(int i=0;i<n-1;i++){

            if(s.charAt(i) == s.charAt(i+1)){
                return removeDuplicates(s.substring(0,i)+s.substring(i+2));
            }

        }
    return s;
    }
}
