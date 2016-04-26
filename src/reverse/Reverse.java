package reverse;
public class Reverse {
    public static void main(String[] args) {
          System.out.print(reverse(1234455));
    }//end of main
    public static String reverse(int n){
        String reverse = "";
        String str = Integer.toString(n);
        for(int i = 0; i < str.length(); i++){
            reverse = str.charAt(i)+ reverse;   
        }
        return reverse;
    }//end of reverse 
}
