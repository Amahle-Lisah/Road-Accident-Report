/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.roadaccidentreport;
import java.util.Scanner;

/**
 *
 * @author Amahle Lisah Khumalo
 */

public class RoadAccidentReport {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Single (1D) array to store the city names
        String[] cities = {"Cape Town", "Johannesburg", "Port Elizabeth"};

        // Two-dimensional array to store accident numbers
        // Each row = a city, column 0 = car accidents, column 1 = motorbike accidents
        int[][] accidents = new int[3][2];

        // Single (1D) array to store the total accidents per city
        int[] totals = new int[3];

        // ---------- Get input from the user ----------
        for (int i = 0; i < cities.length; i++) {
            System.out.print("Enter the number of car accidents for " + cities[i] + ": ");
            accidents[i][0] = input.nextInt();

            System.out.print("Enter the number of motor bike accidents for " + cities[i] + ": ");
            accidents[i][1] = input.nextInt();
        }

        // ---------- Print the report table ----------
        System.out.println("\n----------------------------------------------------");
        System.out.println("ROAD ACCIDENT REPORT");
        System.out.println("----------------------------------------------------");
        System.out.printf("%-15s %-10s %-10s%n", "", "CAR", "MOTOR BIKE");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-15s %-10d %-10d%n", cities[i], accidents[i][0], accidents[i][1]);
        }

        // ---------- Calculate totals for each city ----------
        for (int i = 0; i < cities.length; i++) {
            totals[i] = accidents[i][0] + accidents[i][1];
        }

        // ---------- Print totals ----------
        System.out.println("\n----------------------------------------------------");
        System.out.println("ROAD ACCIDENT TOTALS FOR EACH CITY");
        System.out.println("----------------------------------------------------\n");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-15s %d%n", cities[i], totals[i]);
        }

        // ---------- Find the city with the most accidents ----------
        int highestIndex = 0; // assume the first city has the most, for now

        for (int i = 1; i < totals.length; i++) {
            if (totals[i] > totals[highestIndex]) {
                highestIndex = i;
            }
        }

        System.out.println("\n----------------------------------------------------");
        System.out.println("CITY WITH THE MOST VEHICLE ACCIDENTS: " + cities[highestIndex]);
        System.out.println("----------------------------------------------------");

        input.close();
    }
} //End of class