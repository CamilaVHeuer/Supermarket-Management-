# 🛒 SupermarketManagement

A modern Java project that demonstrates the power of **functional programming** for managing supermarket products using Streams API.

## 📝 Description

This project was born as an integrative practical work for the **Functional Programming in Java** course at TodoCode Academy. It implements a supermarket product management system applying advanced functional programming concepts such as collection transformations, aggregations, and higher-order functions.

## ✨ Implemented Features

The project includes the following functional operations on a product collection:

### 🔍 **1. Category Filtering**

- Filters products by specific category (e.g., "Fruits")
- Uses `filter()` and `equals()` for exact searches

### 💰 **2. Total Calculation**

- Calculates total price of products by category
- Combines `filter()`, `mapToDouble()`, and `sum()`

### 🎯 **3. Minimum Search**

- Finds the product with the lowest price
- Uses `min()` with `Comparator.comparingDouble()`
- Implements safe handling with `ifPresentOrElse()`

### 📊 **4. Category Grouping**

- Groups products using `Collectors.groupingBy()`
- Generates a `Map<String, List<Product>>` organized by category

### 📈 **5. Average Analysis**

- Calculates average price per category
- Identifies the category with the highest average price
- Uses `parallelStream()` for optimization
- Combines `Collectors.averagingDouble()` with `max()`

## 🏗️ Project Structure

```
src/
├── main/java/org/example/
│   ├── Main.java              # Main class with all demonstrations
│   └── logica/
│       └── Product.java       # Product data model
```

## 🗃️ Sample Dataset

The project includes a diverse dataset with 21 products distributed across 5 categories:

- **🍎 Fruits**: Apple, Banana, Orange, Strawberry
- **🥬 Vegetables**: Carrot, Broccoli, Lettuce, Potato
- **🥩 Meat**: Chicken, Beef, Pork, Turkey (6 products)
- **🌾 Grocery**: Flour, Rice, Pasta, Sugar
- **🥛 Dairy**: Milk, Cheese, Yogurt

## 🚀 How to Compile and Run

### Requirements

- **Java 11+** (JDK 17 recommended)
- **Maven 3.6+**

### Compilation

```bash
mvn clean package
```

### Execution

```bash
# Run from target/classes
java -cp target/classes org.example.Main
```

**Alternatively**, from IntelliJ IDEA: run the `org.example.Main` class with the run configuration.

## 📊 Sample Output

When running the program, you'll see:

```
Products in category 'Fruits':
The list of fruits is: [Apple, Banana, Orange, Strawberry]

Total price of all products in category 'Dairy':
The total price of dairy products is: 5.6

Product with the lowest price:
The product with the lowest price is: Carrot

Products grouped by category:
{Fruits=[Apple, Banana, Orange, Strawberry], Vegetables=[Carrot, Broccoli, Lettuce, Potato], ...}

Category with the highest average price:
The price by category is: {Meat=5.67, Dairy=1.87, Fruits=0.85, Grocery=0.95, Vegetables=0.53}
The category with the highest average price is: Meat
```

## 🛠️ Applied Functional Programming Concepts

- **Stream API**: For declarative collection processing
- **Filter**: Predicate-based filtering
- **Map**: Element transformation
- **Reduce**: Value aggregation (sum, min, max)
- **Collectors**: Grouping and statistical calculations
- **Method References**: `Product::getPrice`, `Product::getCategory`
- **Optional**: Safe null value handling
- **Parallel Streams**: Optimization with `parallelStream()`

## 🎯 Key Features

- ✅ **Immutability**: Immutable product list with `List.of()`
- ✅ **Pure Functions**: Methods without side effects
- ✅ **Functional Composition**: Stream operation chaining
- ✅ **Error Handling**: Use of `Optional` and `ifPresentOrElse()`
- ✅ **Performance**: Implementation with parallel streams where beneficial

## 💡 Key Learnings

This project demonstrates how functional programming in Java can make code:

- More **readable** and **expressive**
- Less **error-prone**
- Easier to **maintain** and **test**
- Optimized for **parallel processing**

## 📞 Contact

Educational project developed as part of the TodoCode Academy course.

**Camila Villalba Heuer**

- 📧 Email: [cbvillalbaheuer@gmail.com](mailto:cbvillalbaheuer@gmail.com)
- 💼 LinkedIn: [linkedin.com/in/camilavheuer](https://www.linkedin.com/in/camilavheuer/)
