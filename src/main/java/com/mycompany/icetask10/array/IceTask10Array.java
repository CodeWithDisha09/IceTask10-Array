/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask10.array;

/**
 *
 * @author disha
 */
public class IceTask10Array {
    public static void main(String[] args) {
        // Define the price and item arrays
        int[] price = {200, 350, 700, 400};
        String[] item = {"Shirt", "Pants", "Sneakers", "Jacket"};

        // Calculate the sum of all prices
        int sum = 0;
        for (int p : price) {
            sum += p;
        }

        // Calculate the average price
        double average = (double) sum / price.length;

        // Get the maximum and minimum prices
        int maxPrice = price[0];
        int minPrice = price[0];
        int maxIndex = 0;

        for (int i = 1; i < price.length; i++) {
            if (price[i] > maxPrice) {
                maxPrice = price[i];
                maxIndex = i;
            }
            if (price[i] < minPrice) {
                minPrice = price[i];
            }
        }

        // Get the item with the highest price
        String itemWithHighestPrice = item[maxIndex];

        // Output the results
        System.out.println("Sum of all prices: " + sum);
        System.out.printf("Average price: %.1f%n", average);
        System.out.println("Maximum price: " + maxPrice);
        System.out.println("Minimum price: " + minPrice);
        System.out.println("Item with the highest price: " + itemWithHighestPrice);
    }
}

    


    
