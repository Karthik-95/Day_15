package day19;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop l1 = new Laptop("Lenova", 45000, "Black");
		Laptop l2 = new Laptop("hp", 50000, "White");
		Laptop l3 = new Laptop("Lenovo", 70000, "Blue");
		Laptop l4 = new Laptop("Dell", 43000, "White");
		Laptop l5 = new Laptop("Lenovo", 23000, "Silver");
		Laptop l6 = new Laptop("Acer", 60000, "Black");
		ArrayList<Laptop> laptopDetails = new ArrayList<>();
		laptopDetails.add(l1);
		laptopDetails.add(l2);
		laptopDetails.add(l3);
		laptopDetails.add(l4);
		laptopDetails.add(l5);
		laptopDetails.add(l6);
		laptopDetails.stream().map(x -> x.getBrand().concat("-" + x.getColor())).forEach(System.out::println);
		System.out.println("------------------");
		List<String> p = laptopDetails.stream().map(x -> x.getBrand().concat("-"+x.getColor()))
				.collect(Collectors.toList());
		p.forEach(z -> System.out.println(z));
		System.out.println("--------------------");
		laptopDetails.stream().filter(x -> x.getColor().equalsIgnoreCase("black"))
				.forEach(z -> System.out.println(z.getBrand()));
		System.out.println("-----------------------");
		List<Laptop> b = laptopDetails.stream().filter(x -> x.getColor().equalsIgnoreCase("BLACK"))
				.collect(Collectors.toList());
		b.forEach(x -> System.out.println(x.getBrand().toUpperCase()));
		System.out.println("---------------------------");
		long laptopCount = laptopDetails.stream().count();
		System.out.println(laptopCount);
		System.out.println("--------------------------");
		long lenovoCount = laptopDetails.stream().filter(x -> x.getBrand().equalsIgnoreCase("lenovo")).count();
		System.out.println(lenovoCount);
		System.out.println("----------------------------");
		long lap = laptopDetails.stream().map(x -> x.getBrand().toLowerCase()).count();
		System.out.println(lap);
		System.out.println("-----------------------");
		System.out.println(laptopDetails);
		System.out.println("----------------------");
		laptopDetails.stream().filter(x -> x.getBrand().equals("hp")).collect(Collectors.toList())
				.forEach(x -> System.out.println(x));

	}

}
