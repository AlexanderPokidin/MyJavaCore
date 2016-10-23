package module9.homework;

import module7.homework.*;
import module7.homework.Currency;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(256, "Taras", "Kozlov", "Donetsk", 14500);
        User user2 = new User(286, "Oleg", "Orlov", "Odessa", 22300);
        User user3 = new User(475, "Ivan", "Kozlov", "Dnepr", 21500);
        User user4 = new User(958, "Alex", "Ivanov", "Kiev", 21900);
        User user5 = new User(548, "Gleb", "Petrov", "Dnepr", 12500);
        User user6 = new User(986, "Boris", "Petrov", "Donetsk", 14900);
        User user7 = new User(745, "Pavel", "Pavlov", "Lviv", 21100);
        User user8 = new User(236, "Taras", "Nikolaev", "Dnepr", 13200);
        User user9 = new User(689, "Oleg", "Petrov", "Kherson", 15100);
        User user10 = new User(526, "Viktor", "Kravtsov", "Poltava", 12900);

        Order order1 = new Order(8596545, 4250, Currency.UAH, "Volvo", "Perviy", user1);
        Order order2 = new Order(5487512, 2350, Currency.UAH, "Honda", "Vtoroy", user2);
        Order order3 = new Order(2546895, 260, Currency.USD, "Volvo", "Vtoroy", user3);
        Order order4 = new Order(2546895, 260, Currency.USD, "Volvo", "Vtoroy", user3);
        Order order5 = new Order(2014785, 150, Currency.USD, "GAZ", "Perviy", user9);
        Order order6 = new Order(8596154, 260, Currency.USD, "Volvo", "Vtoroy", user6);
        Order order7 = new Order(8956254, 950, Currency.UAH, "GAZ", "Perviy", user7);
        Order order8 = new Order(8587012, 220, Currency.USD, "Kia", "Tretiy", user7);
        Order order9 = new Order(2014785, 150, Currency.USD, "GAZ", "Perviy", user9);
        Order order10 = new Order(8041004, 250, Currency.USD, "Volvo", "Perviy", user10);

        List<Order> orderList = new ArrayList<>();
        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);
        orderList.add(order4);
        orderList.add(order5);
        orderList.add(order6);
        orderList.add(order7);
        orderList.add(order8);
        orderList.add(order9);
        orderList.add(order10);

        //Decrease Order 1
        orderList.stream()
                .sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("---------------------------------------------");

        //Decrease Order 2
        orderList.stream()
                .sorted((o1, o2) -> o2.getPrice() - o1.getPrice())
                .forEach(System.out::println);
        System.out.println("---------------------------------------------");

        //Increase Order and City
        orderList.stream().sorted((o1, o2) -> o1.getPrice() != o2.getPrice() ? o1.compareTo(o2)
                : o1.getUser().getCity().compareTo(o2.getUser().getCity())).collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("---------------------------------------------");

        //ItemName and Shop and City
        orderList.stream().sorted((o1, o2) -> o1.getItemName() != o2.getItemName() ? o1.compareTo(o2)
                : o1.getShopIdentificator() != o2.getShopIdentificator() ? o1.getShopIdentificator().compareTo(o2.getShopIdentificator())
                : o1.getUser().getCity().compareTo(o2.getUser().getCity())).collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("---------------------------------------------");

        //Delete dublicates 1
        orderList.stream().distinct().collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("---------------------------------------------");

        //Delete dublicates 2
        orderList.stream()
                .collect(Collectors.toSet())
                .forEach(System.out::println);
        System.out.println("---------------------------------------------");

        //Delete USD currency
        orderList.stream().filter(order -> order.getCurrency() != Currency.USD).collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("---------------------------------------------");

        //Check LastName
        orderList.stream().filter(order -> order.getUser().getLastName().equals("Petrov"))
                .forEach(System.out::println);
        System.out.println("---------------------------------------------");

        //Delete low prise
        orderList.stream().filter(order -> order.getPrice() >= 1500).collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("---------------------------------------------");

        //Separate Currency
        System.out.println(OrderUtils.separateCurrensy(orderList));
        System.out.println("---------------------------------------------");

    }
}