package BaiTap;

public class BaiTap2 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();


        System.out.println(str.append("World"));
        System.out.println(str.insert(2,"Hello"));
        System.out.println(str.replace(0,1,"Ho"));

        System.out.println(str.delete(1,3));
        System.out.println(str.length());
        System.out.println(str.reverse());
    }
}
