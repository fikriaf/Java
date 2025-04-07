/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Fikri
 */
public class methodArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Method
        System.out.println("Hello World");
        
        // Parameters dan Arguments
        printName("Liam");
        printName("Jenny");
        printName("Anja");
        
        // Multiple Parameters
        printAge("Liam", 5);
        printAge("Jenny", 8);
        printAge("Anja", 31);
        
        // Return Values
        System.out.println(sum(3));
        
        // Method menggunakan If...Else
        checkAge(20);
        
        // Method Overloading
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("Int: " + myNum1);
        System.out.println("Double: " + myNum2);
        
        // Rekursi
        int result = sumRecursive(10);
        System.out.println(result);
        
        // ArrayList
        java.util.ArrayList<String> cars = new java.util.ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        
        // Akses Item pada ArrayList
        System.out.println(cars.get(0));
        
        // Loop pada ArrayList
        for (String car : cars) {
            System.out.println(car);
        }
        
        // HashMap
        java.util.HashMap<String, String> capitalCities = new java.util.HashMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
    }
    
    static void printName(String fname) {
        System.out.println(fname + " Refsnes");
    }
    
    static void printAge(String fname, int age) {
        System.out.println(fname + " is " + age);
    }
    
    static int sum(int x) {
        return 5 + x;
    }
    
    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied");
        } else {
            System.out.println("Access granted");
        }
    }
    
    static int plusMethod(int x, int y) {
        return x + y;
    }
    
    static double plusMethod(double x, double y) {
        return x + y;
    }
    
    static int sumRecursive(int k) {
        if (k > 0) {
            return k + sumRecursive(k - 1);
        } else {
            return 0;
        }
    }
}
