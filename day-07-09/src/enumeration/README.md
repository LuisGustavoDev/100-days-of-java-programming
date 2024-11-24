# Enumeration and Composition in Java

This project demonstrates how to use **enumerations** and **composition** in Java. It includes examples of working with `enum` to represent fixed sets of constants and implementing composition by defining relationships between classes. The project also highlights how to manage contracts for workers in different departments.

## Project Structure

- **ex1**: Demonstrates how to use an enum (`OrderStatus`) to model different stages of an order and how to use it in the `Order` class.

- **ex2**: Shows a more advanced usage of enums (`WorkerLevel`) and composition with the Worker, Department, and HourContract classes. The project also calculates the total income for workers based on their contracts.

## ex1

### Order Class
The **Order** class represents an order with an ID, a timestamp (`moment`), and a status (which is of type `OrderStatus`). The status can be one of the predefined values in the `OrderStatus` enum, which represents the state of an order in the system (e.g., pending payment, processing, shipped, or delivered).

```java
package enumeration.ex1.entities;

import java.util.Date;
import enumeration.ex1.enums.OrderStatus;

public class Order {
    private Integer id;
    private Date moment;
    private OrderStatus status;

    public Order() {
    }

    public Order(Integer id, Date moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    // Getters and setters...

    @Override
    public String toString() {
        return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
    }
}
```

### OrderStatus Enum

The **OrderStatus** enum defines the possible states of an order. This enum is used in the `Order` class to specify the current status of each order.

```java
package enumeration.ex1.enums;

public enum OrderStatus {
    PENDING_PAYMENT,
    PROCESSING,
    SHIPPED,
    DELIVERED;
}
```

### App Class

The **App** class demonstrates how to create an `Order` instance with an `OrderStatus` and how to use the `valueOf` method to convert a string to an enum constant.

```java
package enumeration.ex1;

import java.util.Date;
import enumeration.ex1.entities.Order;
import enumeration.ex1.enums.OrderStatus;

public class App {
    public static void main(String[] args) {
        Order order = new Order(1, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);
        
        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
    }
}
```

## ex2

### Department Class

The **Department** class represents a department in a company. It has a name attribute that is used to identify the department.

```java
package enumeration.ex2.entities;

public class Department {
    private String name;

    public Department() {
    }

    public Department(String name) {
        this.name = name;
    }

    // Getters and setters...
}
```

### HourContract Class

The **HourContract** class represents a contract between a worker and a company. The contract includes the date, the value per hour, and the number of hours worked. It also has a method to calculate the total value of the contract.

```java
package enumeration.ex2.entities;

import java.util.Date;

public class HourContract {
    private Date date;
    private Double valuePerHour;
    private Integer hours;

    public HourContract() {
    }

    public HourContract(Date date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public double totalValue() {
        return valuePerHour * hours;
    }

    // Getters and setters...
}
```

### Worker Class

The **Worker** class represents a worker who belongs to a department and can have multiple contracts (of type `HourContract`). The class includes a method (`income`) to calculate the total income for a specific month and year.

```java
package enumeration.ex2.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import enumeration.ex2.enums.WorkerLevel;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public double income(int year, int month) {
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract contract : contracts) {
            cal.setTime(contract.getDate());
            int contractYear = cal.get(Calendar.YEAR);
            int contractMonth = 1 + cal.get(Calendar.MONTH);
            if (year == contractYear && month == contractMonth) {
                sum += contract.totalValue();
            }
        }
        return sum;
    }

    // Getters and setters...
}
```

### WorkerLevel Enum

The **WorkerLevel** enum defines the possible levels of a worker in the company, such as junior, mid-level, or senior.

```java
package enumeration.ex2.enums;

public enum WorkerLevel {
    JUNIOR,
    MID_LEVEL,
    SENIOR;
}
```

### App Class

The **App** class allows users to input details about a worker and their contracts. The program calculates the worker's income based on the provided contracts for a specific month and year.

```java
package enumeration.ex2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import enumeration.ex2.entities.HourContract;
import enumeration.ex2.entities.Worker;
import enumeration.ex2.entities.Department;
import enumeration.ex2.enums.WorkerLevel;

public class App {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}
```

## What I Learned on Day 9

On **Day 9**, I focused on understanding `**Enumerations (Enums)** and Composition in Java. I learned that enums are a special type used to define a set of constant values, improving code clarity and reducing errors by restricting variables to predefined values, as demonstrated with OrderStatus and WorkerLevel. Composition, a design principle where one class contains references to other classes, was also explored. I applied this principle by creating relationships between classes such as Worker, Department, and HourContract, which resulted in a more modular and flexible design. Using enums and composition helps improve code maintainability, readability, and organization, making it easier to extend and manage.

## How to Run the Project

1. Clone the repository to your local machine using the following command:
```bash
git clone https://github.com/LuisGustavoDev/100-days-of-java-programming.git
```
2. Navigate to the `enumeration.ex1` package and compile and run the **App.java** file.

3. Observe how enums are used to define fixed sets of constants, as demonstrated with the OrderStatus enum, which represents the different states an order can have. This ensures that the status of an order is restricted to predefined values, improving code clarity and preventing invalid status assignments

4. Next, navigate to the `enumeration.ex2` package and compile and run the App.java file.

5. When prompted to enter the **Level** for the worker, enter one of the following values from the `WorkerLevel` enum:
- JUNIOR
- MID_LEVEL
- SENIOR

These are the valid options for the worker's level. The program will then calculate the worker's income based on the provided contracts for a specific month and year.




