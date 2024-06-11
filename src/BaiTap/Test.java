package BaiTap;

public class Test {
    public static void main(String[] args) {
        int[] x={1,9,3,2};
        for(int i=0; i<x.length-1; i++){
            for(int j=i+1; j<x.length; j++){
                if(x[i]>x[j]){
                    int a=x[i];
                    x[i]=x[j];
                    x[j]=a;
                }
            }
            System.out.println(x[i]);
        }

    }
}
