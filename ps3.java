import java.io.*;
import java.util.*;

public class ps3 {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = scn.nextInt();
        }
        int num = scn.nextInt();
        int ans = first(arr,0,num);
        System.out.println(ans);
    }

    public static int first(int[] arr, int idx, int num){
        if(idx == arr.length){
            return -1;
        }
        if(num == arr[idx]){
            return idx;
        }
        int ans = first(arr,idx+1,num);
        return ans;
    }
}
