public class Activity5_StringConcatenation{
    public static void main(String[] args) {
        String str="";
 
        for(int i=0; i<=1000000;i++){
            str = str.concat("x");
        }
        System.out.println(str);
    }
}
