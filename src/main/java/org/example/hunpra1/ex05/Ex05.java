package org.example.hunpra1.ex05;

public class Ex05 {
    public static void main(String[] args) {
        String input = "helloWorlD";
        char []arr;
        arr = input.toCharArray();
        System.out.println(arr);
        System.out.println();
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] >= 'a' && arr[i] <='z'){
                arr[i] = (char)(arr[i] + 'A' - 'a');
            } else if (arr[i] >= 'A' && arr[i] <= 'z') {
                arr[i] = (char)(arr[i] - ('A'-'a'));
            }
        }
        System.out.println(arr);
    }
}
