package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;

public class Program {
	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY):: ");
		Date birthDate = sdf1.parse(sc.next());
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		sc.next();
		String status = sc.nextLine();
		Date now = new Date();
		
		Order order = new Order(String.valueOf(sdf2.format(now)), status);
		
		System.out.print("How many items to this order? ");
		int orders = sc.nextInt();
		
		for (int i=1; i<=orders; i++) {
			
			System.out.println("Enter #" + i +" item data:");
			
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			Product product = new Product(productName, productPrice);
			
			System.out.print("Quantity: ");
			int productQuantity = sc.nextInt();
			OrderItem orderItem = new OrderItem(productQuantity, productPrice);
			
		}
		
		System.out.println("ORDER SUMMARY");
		System.out.println(order);
		System.out.println(client);
		
	}

}
