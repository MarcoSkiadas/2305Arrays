package org.example;

public class Arrays {
    public static void main(String[] args) {

        int[] numbers1 = {1,2,3,4,5,6,7,8,9,10};
        int[] numbers2 = {11,12,13,14,15,16,17,18,19,20};
        int[] numbers3 = new int[10];

        System.out.println("--Step1--\n");
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println("Arraynumber["+i +"] "+numbers1[i]);
        }
        System.out.println("\n--Step2--\n");
        int sum = 0;
for (int i = 0; i < numbers1.length; i++) {

            sum += numbers1[i];
}
        System.out.println("Total sum of the first array: "+sum);
        System.out.println("\n--Step3--\n");
int max=0;
for (int i = 0; i < numbers1.length; i++) {

    if (max < numbers1[i]) {
        max = numbers1[i];
    }
}
        System.out.println("Largest number in the first array: "+max);
        System.out.println("\n--Step4&5--\n");

for (int i = 0; i < numbers2.length; i++) {
    numbers3[i] = numbers1[i]+numbers2[i];
    System.out.println("sum of first and second array: "+numbers1[i]+" + "+numbers2[i]+" = "+numbers3[i]);
}

    }
}