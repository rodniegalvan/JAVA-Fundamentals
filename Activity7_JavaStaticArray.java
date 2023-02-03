public class Activity7_JavaStaticArray {
    static String[] strings;

    public static void normal(){
        for(int n=0; n<strings.length; n++){
            System.out.println(strings[n]);
            }
      }
      public static void reverse(){
        for(int n=strings.length-1; n>=0; n--){
            System.out.println(strings[n]);
        }
      }
    public static void main(String[] args) {
    strings = new String[]{
            "First String",
            "Second String",
            "Third String",
            "Fourth String"
    };
    strings[0] = "Replace First String";
    normal();
    reverse();
    }
}
