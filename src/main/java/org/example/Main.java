package org.example;

import org.example.logica.Product;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Products list
        List<Product> products = List.of(
                new Product("Apple", "Fruits", 50, 0.5),
                new Product("Banana", "Fruits", 30, 0.3),
                new Product("Orange", "Fruits", 40, 0.6),
                new Product("Strawberry", "Fruits", 25, 2.0),

                new Product("Carrot", "Vegetables", 20, 0.2),
                new Product("Broccoli", "Vegetables", 15, 0.8),
                new Product("Lettuce", "Vegetables", 18, 0.7),
                new Product("Potato", "Vegetables", 50, 0.4),

                new Product("Chicken", "Meat", 10, 5.0),
                new Product("Pollo", "Meat", 12, 5.5),
                new Product("Beef", "Meat", 5, 7.0),
                new Product("Bife", "Meat", 6, 7.5),
                new Product("Pork", "Meat", 8, 4.5),
                new Product("Turkey", "Meat", 6, 6.0),

                new Product("Flour", "Grocery", 25, 1.0),
                new Product("Rice", "Grocery", 40, 0.9),
                new Product("Pasta", "Grocery", 35, 1.1),
                new Product("Sugar", "Grocery", 20, 0.8),

                new Product("Milk", "Dairy", 60, 1.2),
                new Product("Cheese", "Dairy", 20, 3.5),
                new Product("Yogurt", "Dairy", 30, 0.9)
        );

        //1) Filter producst by category "Fruits" and print them
        System.out.println("\nProducts in category 'Fruits':");
       List<Product> fruits =  products.stream()
               .filter(p-> p.getCategory().equals("Fruits"))
               .toList();
        System.out.println("\nThe list of fruits is: " + fruits);

         //2) Total price of all products in category "Dairy"
        System.out.println("\nTotal price of all products in category 'Dairy':");
        double totalDairyPrice = products.stream()
                .filter(p-> p.getCategory().equals("Dairy"))
                .mapToDouble(Product::getPrice)
                .sum();
        System.out.println("The total price of dairy products is: " + totalDairyPrice);

        //3) Product whit de lower price
        System.out.println("\nProduct with the lowest price:");
        products.stream()
                .min(Comparator.comparingDouble(Product::getPrice))
                .ifPresentOrElse(
                        p -> System.out.println("The product with the lowest price is: " + p),
                        () -> System.out.println("No products available")
                );

        //4) Group products by category
        System.out.println("\nProducts grouped by category:");
        Map<String,List<Product>> prodByCategory = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));
        System.out.println(prodByCategory);

        //5) Calculate the average price of each category and display the category with the highest average.
        System.out.println("\nCategory with the highest average price:");
        Map<String, Double> avgPriceByCategory = products.parallelStream()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.averagingDouble(p-> p.getPrice())
                ));
        System.out.println("The price by category is: " + avgPriceByCategory);
        String expensiveCategory = avgPriceByCategory.entrySet().parallelStream()
                .max(Comparator.comparingDouble(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse("No categories available");
        System.out.println("The category with the highest average price is: " + expensiveCategory);
    }
}