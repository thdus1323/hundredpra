package org.example.hunpra1.ex04;

public class Ex04 {
    public static void main(String[] args) {
        int inputNum = 19;
        //25도 해보셈
        int bin[] = new int[100];
        //19를 계속 2로 나누삼
        int i = 0;
        int mok = inputNum;

        while (mok > 0){
            bin[i] = mok % 2;
            mok /= 2;
            i++;
        }
            i--;
        for (; i>=0; i--) {
            System.out.println(bin[i]);
            
        }
    }
}
