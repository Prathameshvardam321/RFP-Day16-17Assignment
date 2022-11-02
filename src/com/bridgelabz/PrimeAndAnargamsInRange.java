package com.bridgelabz;

public class PrimeAndAnargamsInRange {
    static int i1;
    static int[] result =new int[200];
    static int checkPrime(int n) {
//        int[] result =new int[1000];
        int count = 0;
        int i = 0;
        int j =0;
        int notice =0;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                count = 1;
                break;
            }
        }
        while (j<=i1){
            notice =0;
            if (result[j]==i){
                notice=1;
                break;
            }
            j++;
        }
        if (notice==0){
            result[i1]=i;
            i1++;
        }
        return i;
//        return count == 0 ? false : true;
    }

    static void updateFreq(int n, int[] freq) {
        while (n > 0) {
            int digit = n % 10;
            freq[digit]++;
            n /= 10;
        }
    }

    static void checkAnagram(int a, int b) {

        int[] freqA = new int[10];
        int[] freqB = new int[10];
        updateFreq(a, freqA);
        updateFreq(b, freqB);
        int i = 0;
        for (i = 0; i < 10; i++) {
            if (freqA[i] == freqB[i]){
                System.out.println(i);
            }

        }
//        if (checkPrime(a)&&checkPrime(b)) {
//            return true;
//        }
//        return false;
    }

    public static void main(String[] args) {
        for (int j=0;j<=1000;j++) {
            for (int i = 0; i < 1000; i++) {
                checkAnagram(checkPrime(i), checkPrime(j));
            }
        }
            for (int i = 0; i < result.length; i++) {
                if (result[i] > 0)
                    System.out.println(result[i]);
            }

    }
}
