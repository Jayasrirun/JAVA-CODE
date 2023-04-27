package DAY3;
import java.util.*;
public class CustomerDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
			Scanner SS = new Scanner(System.in);
			String name, city;
			int id;
			System.out.println("Enter Customer ID");
			id = SS.nextInt();
			SS.nextLine();
			System.out.println("Enter Customer name");
			name = SS.nextLine();
			System.out.println("Enter Customer city");
			city = SS.nextLine();
			
			Customer obj = new Customer();
			obj.setCustomerName(name);
			obj.setCustomerId(id);
			obj.setCustomerCity(city);
			System.out.println(obj);
		}
	}

