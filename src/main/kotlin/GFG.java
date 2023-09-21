
import java.util.ArrayList;

class Solution
{

    public static void main(String[] args) {
        System.out.println(rotate(11070,6909));
    }

    static ArrayList<Integer> rotate(int N, int D) {
        // your code here
        int rot = D%16;
        int len = Integer.toBinaryString(N).length();
        System.out.println(len);
        int left = (N<<rot) | (N>>(16-rot)) & 0xFFFF;
        int right = (N>>rot) | (N<<(16-rot)) & 0xFFFF;
        System.out.println(Integer.toBinaryString((N>>(16-lengit ))));
        System.out.println(Integer.toBinaryString((N<<(16-rot))));
        System.out.println(0xffff);
        System.out.println(Integer.toBinaryString(N));
        System.out.println(D%16);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println(Integer.toBinaryString(left));
        System.out.println(Integer.toBinaryString(right));
        arr.add(left);
        arr.add(right);
        return arr;
        // 1100010101100111
    }
}