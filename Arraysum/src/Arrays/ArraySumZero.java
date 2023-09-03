package Arrays;

import java.util.Scanner;

public class ArraySumZero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str = sc.next();
        int size = sc.nextInt();
//            int arr[] = {-4 , 1 , 3 , -2 , 1};
        int arr[] = new int [size];
        for(int i=0 ; i<size ; i++){
            arr[i] = sc.nextInt();
        }

        int n =((int)Math.pow(2 , arr.length))-1;
        // System.out.print(n);

        while(n>=0){
            String ans="";
            String b = Integer.toString(n , 2);
            // System.out.print(b+" ");

            int x = arr.length-b.length();

            for(int k=0 ; k<x ; k++){
                b = '0' +  b  ;
            }
            int sum = 0;
            for(int j=0 ; j<b.length() ; j++){
                if(b.charAt(j)=='1'){
                    ans = ans + ""+ arr[j]+" ";
                    sum+=arr[j];
                }
            }

            if(sum==0){
                System.out.print(ans+" ");
                return;
            }

            // System.out.print(ans+" ");
            n--;
            // System.out.println();
        }
    }

}