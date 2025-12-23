# 🛒 SupermarketManagement

Un proyecto Java moderno que demuestra el poder de la **programación funcional** para gestionar productos de supermercado usando Streams API.

## 📝 Descripción

Este proyecto nació como trabajo práctico integrador del curso de **Programación Funcional en Java** de TodoCode Academy. Implementa un sistema de gestión de productos de supermercado aplicando conceptos avanzados de programación funcional como transformaciones de colecciones, agregaciones y funciones de orden superior.

## ✨ Funcionalidades Implementadas

El proyecto incluye las siguientes operaciones funcionales sobre una colección de productos:

### 🔍 **1. Filtrado por Categoría**

- Filtra productos por categoría específica (ej: "Fruits")
- Utiliza `filter()` y `equals()` para búsquedas exactas

### 💰 **2. Cálculo de Totales**

- Calcula el precio total de productos por categoría
- Combina `filter()`, `mapToDouble()` y `sum()`

### 🎯 **3. Búsqueda de Mínimos**

- Encuentra el producto con el menor precio
- Usa `min()` con `Comparator.comparingDouble()`
- Implementa manejo seguro con `ifPresentOrElse()`

### 📊 **4. Agrupación por Categoría**

- Agrupa productos usando `Collectors.groupingBy()`
- Genera un `Map<String, List<Product>>` organizado por categoría

### 📈 **5. Análisis de Promedios**

- Calcula el precio promedio por categoría
- Identifica la categoría con mayor precio promedio
- Utiliza `parallelStream()` para optimización
- Combina `Collectors.averagingDouble()` con `max()`

## 🏗️ Estructura del Proyecto

```
src/
├── main/java/org/example/
│   ├── Main.java              # Clase principal con todas las demostraciones
│   └── logica/
│       └── Product.java       # Modelo de datos del producto
```

## 🗃️ Dataset de Ejemplo

El proyecto incluye un dataset diverso con 21 productos distribuidos en 5 categorías:

- **🍎 Fruits**: Apple, Banana, Orange, Strawberry
- **🥬 Vegetables**: Carrot, Broccoli, Lettuce, Potato
- **🥩 Meat**: Chicken, Beef, Pork, Turkey (6 productos)
- **🌾 Grocery**: Flour, Rice, Pasta, Sugar
- **🥛 Dairy**: Milk, Cheese, Yogurt

## 🚀 Cómo Compilar y Ejecutar

### Requisitos

- **Java 11+** (recomendado JDK 17)
- **Maven 3.6+**

### Compilación

```bash
mvn clean package
```

### Ejecución

```bash
# Ejecutar desde target/classes
java -cp target/classes org.example.Main
```

**Alternativamente**, desde IntelliJ IDEA: ejecutar la clase `org.example.Main` con la configuración de ejecución.

## 📊 Ejemplo de Salida

Al ejecutar el programa, verás:

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

## 🛠️ Conceptos de Programación Funcional Aplicados

- **Stream API**: Para procesamiento declarativo de colecciones
- **Filter**: Filtrado basado en predicados
- **Map**: Transformación de elementos
- **Reduce**: Agregación de valores (sum, min, max)
- **Collectors**: Agrupación y cálculos estadísticos
- **Method References**: `Product::getPrice`, `Product::getCategory`
- **Optional**: Manejo seguro de valores nulos
- **Parallel Streams**: Optimización con `parallelStream()`

## 🎯 Características Destacadas

- ✅ **Inmutabilidad**: Lista de productos inmutable con `List.of()`
- ✅ **Funciones Puras**: Métodos sin efectos secundarios
- ✅ **Composición Funcional**: Encadenamiento de operaciones stream
- ✅ **Manejo de Errores**: Uso de `Optional` y `ifPresentOrElse()`
- ✅ **Performance**: Implementación con streams paralelos donde es beneficioso

## 💡 Aprendizajes Clave

Este proyecto demuestra cómo la programación funcional en Java puede hacer el código:

- Más **legible** y **expresivo**
- Menos **propenso a errores**
- Más **fácil de mantener** y **testear**
- Optimizado para **procesamiento paralelo**

## 📞 Contacto

Proyecto educativo desarrollado como parte del curso de TodoCode Academy.

**Camila Villalba Heuer**

- 📧 Email: [cbvillalbaheuer@gmail.com](mailto:cbvillalbaheuer@gmail.com)
- 💼 LinkedIn: [linkedin.com/in/camilavheuer](https://www.linkedin.com/in/camilavheuer/)
