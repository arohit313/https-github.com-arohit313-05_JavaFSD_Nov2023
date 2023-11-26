package map;
import java.util.*;

public class HashMapDemo {

	
    public static void main(String[] args) {
    	
        HashMap<String, Double> customerAccountBalanceMap = new HashMap<>();

        customerAccountBalanceMap.put("Maya", 3000.75);
        customerAccountBalanceMap.put("Peter", 4500.55);
        customerAccountBalanceMap.put("Bala", 2000.70);
        customerAccountBalanceMap.put("Jeny", 940.00);
        customerAccountBalanceMap.put("Sachin", 1100.45);
        
        Set<Map.Entry<String, Double>> entries = customerAccountBalanceMap.entrySet();

        for (Map.Entry<String, Double> entry : entries) {
            System.out.print(entry.getKey() + ": ");
            System.out.println(entry.getValue());
        }
        
        System.out.println();

        String customerName = "Peter";
        double accBalance = customerAccountBalanceMap.get(customerName);
        customerAccountBalanceMap.put(customerName, (accBalance + 250));

        System.out.println(customerName + "'s account balance : " 
        		+ customerAccountBalanceMap.get(customerName));
    }
}