package BaiTap;

public class BaiTap1 {
    public static void main(String[] args) {
        String str= "- World llo";
        String str1="Hello llo";
        System.out.println(str.isEmpty());


        System.out.println(str1.equals(str));

        System.out.println(str.equalsIgnoreCase(str1));
        String[] str2=str.split(" ");
        for(String s: str2){
            System.out.println(s);
        }

        System.out.println(str1.concat(str));

        System.out.println(str.contains(str1));

        System.out.println(str.toUpperCase());

        System.out.println(str1.toLowerCase());

        System.out.println(str.replace("llo","new lo"));

        System.out.println(str.length());
    }

}
