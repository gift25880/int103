/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saraf
 */
public class Prime {

    int primeNumber[];
    int count;

    public Prime(int size) {
        if (size <= 0) {
            primeNumber = new int[100];
        }
        primeNumber = new int[size];
    }

    public boolean checkOnePrime(int num) {
        int i;
        for (i = 2; i <= num; i++) {
            if (num % i == 0) {
                System.out.println("This number is not prime");
                return false;
            }
        }
        if (num == i) {
            if(isFull()) {
                System.out.println("Full");
                return false;
            } else if (isMatch(num)) {
                System.out.println("This number is already add!");
                return false;
            } else {
                primeNumber[count++] = num;
            }
        }
        return true;
    }

    public boolean checkPrime(int num1, int num2) {
        if (num1 > num2) {
            return false;
        }
        int i, j;
        for (i = num1; i <= num2; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                if (isFull()) {
                    System.out.println("Full");
                    return false;
                } else if (isMatch(i)) {
                    System.out.println("Number is already add!");
                    return false;
                } else {
                    primeNumber[count] = i;
                    count++;
                }
            }
        }
        return true;
    }

    public void printArrayWithForI() {
        for (int i = 0; i < count; i++) {
            System.out.print(primeNumber[i] + " ");
        }
        System.out.println();
    }

    public void printArrayWithForE() {
        for (int temp : primeNumber) {
            if (temp != 0) {
                System.out.print(temp + " ");
            }
        }
        System.out.println();
    }

    public boolean isFull() {
        return count == primeNumber.length;
    }

    public boolean isMatch(int num) {
        for (int i = 0; i < count; i++) {
            if (num == primeNumber[i]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Prime p1 = new Prime(100);
        System.out.println(p1.primeNumber.length);

        System.out.println(p1.checkPrime(0, 100));

        p1.printArrayWithForI();
        p1.printArrayWithForE();

        System.out.println(p1.checkOnePrime(100));
        
        p1.printArrayWithForI();
    }
}
