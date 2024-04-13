package org.example.hunpra1.ex03;

//제일 많이 출현한 수 출력
//1223142243532
//answer) 2가 5번
// gra : 배열, for

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //사용자한테 값을 받고
        Scanner scan = new Scanner(System.in);

        int[] inputNum = new int[10];
        for (int i = 0; i <10; i++){
            inputNum[i] = scan.nextInt();
        }
        //예를 들어 사용자
        //1223142243 숫자를 입력
        //1:2, 2:4, 3:2, 4:2번 (여기선 2가 최빈수)

        int[] mode = new int[10];

        //index-> 출현한 수
        //index 값 -> index(출현한 수)가 몇 번 나왔는지 저장하는 용도
        //mode array를 두고 각 숫자가 몇 번 나왔는지 저장
        //ex) mode[3] = 5 => 숫자 3이 5번 나왔어

        //inputNum => 1223142243
        for (int i = 0; i < 10; i++) {
            mode[inputNum[i]]++;
        }
        //mode[1] == 2
        //mode[2] == 4
        //mode[3] == 2
        //mode[4] == 2

        int modeNum = 0; // 최빈수
        int modCnt = 0; // 최빈수가 나온 횟수

        for (int i = 0; i < 10; i++) {
            if (modCnt < mode[i]) {
                modCnt = mode[i];
                modeNum = i;
            }
        }

        System.out.println("최빈수는" + modeNum + " cnt:" + modCnt);
    }
}

