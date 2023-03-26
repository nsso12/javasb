package ch07;

public class ArrayList {
    public static void main(String[] args) {
        int arr1[] = new int[10];
        int[] arr2 = new int [10];

        int[] numbers = {1,2,3,4,5,6,7,8};

        for(int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // 향상된 for문으로 나열하기
        int[] ids;
        ids = new int[] {10, 20, 30};

        for(int id : ids) {
            System.out.println(id);
        }

        // 배열 속 합 구하기
        int arr[] = new int[10];
        for(int i=0, num=1; i<arr.length; i++, num++) {
            arr[i] = num;
        }
        int total = 0;
        for(int i = 0; i<arr.length; i++) {
            total += arr[i];
        }
        System.out.println(total);


        // 알파벳 출력하기
        char[] alphabets = new char[26];
        char ch = 'A';

        for(int i=0; i<alphabets.length; i++) {
            alphabets[i] = ch++;
        }
       for(char alpha : alphabets) {
           System.out.print(alpha + " ");
       }


    }
}
