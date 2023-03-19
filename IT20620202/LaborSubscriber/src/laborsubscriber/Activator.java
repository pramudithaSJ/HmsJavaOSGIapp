package laborsubscriber;

import atmpublisher.AtmPublish; 
import cafeteriapublisher.CafeteriaPublish;
import freemedicinepublisher.FreemedPublish;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import salarypublisher.SalaryPublish;

public class Activator implements BundleActivator {
	
	private static BundleContext context;
	
	static BundleContext getContext() {
		return context;
	}
	
	ServiceReference atm;
	ServiceReference cafeteria;
	ServiceReference freemed;
	ServiceReference salary;

	@Override
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Hello LaborSubscriber!!");
		atm = context.getServiceReference(AtmPublish.class.getName());
		AtmPublish atmPublish = (AtmPublish) context.getService(atm);
		
		cafeteria = context.getServiceReference(CafeteriaPublish.class.getName());
		CafeteriaPublish cafeteriaPublish = (CafeteriaPublish) context.getService(cafeteria);
		
		freemed = context.getServiceReference(FreemedPublish.class.getName());
		FreemedPublish freemedPublish = (FreemedPublish) context.getService(freemed);
		
		salary = context.getServiceReference(SalaryPublish.class.getName());
		SalaryPublish salaryPublish = (SalaryPublish) context.getService(salary);
		
			
			while(true) {
				System.out.println("\n");
				System.out.println(" Hello, You Are Welcome !!!");
				System.out.println("---------------------------------");
				System.out.println("Select Your Need: ");
                System.out.println("ATM - [1] ");
                System.out.println("Cafeteria - [2] ");
                System.out.println("Free Medicine - [3] ");
                System.out.println("Salary - [4] ");
				
                System.out.println("Enter the number : ");
    			Scanner obj = new Scanner(System.in);
    			String task = obj.nextLine();
    			System.out.println("\n");
                
                if (task.equals("0")) {
                	break;
                }
                if((task.equals("1"))||(task.equals("2"))||(task.equals("3"))||(task.equals("4"))){
					if (task.equals("1")) {
                	
                	System.out.println("You are Selected ATM Service");
    				System.out.println("----------------------------------");
                	
                	System.out.println("Enter the card number: ");
    				Scanner cardnumber = new Scanner(System.in);
    				String cnumber = cardnumber.nextLine();
                	
                	System.out.println("Enter the passcode:   ");
                	Scanner pcode = new Scanner(System.in);
    				String code = pcode.nextLine();
                	
                	//System.out.println("\n");
                	System.out.println("***You can get your Money***");
                	System.out.println(atmPublish.ATMService());
                	
                }
                if (task.equals("2")) {
                	
                	System.out.println("You are Selected Cafeteria Service");
    				System.out.println("----------------------------------");
                	
                	System.out.println("Please enter the type of food:   ");
                	Scanner tfood = new Scanner(System.in);
    				String food = tfood.nextLine();
                	
                	System.out.println("Please enter the amount:   ");
                	Scanner amnt = new Scanner(System.in);
    				String amount = amnt.nextLine();
                	
                	//System.out.println("\n");
                	System.out.println("***You can get your meal within few minutes***");
                	System.out.println(cafeteriaPublish.CafeteriaService());
                	
                }
                if(task.equals("3")) {
                	
                	System.out.println("You are Selected Free Medicine Service");
    				System.out.println("----------------------------------");
    				System.out.println("\n");
                	
                	System.out.println("Enter the symptoms:  ");
                	Scanner sympt = new Scanner(System.in);
    				String symptoms = sympt.nextLine();
                	
                	System.out.println("Enter the Medicine:  ");
                	Scanner fmed = new Scanner(System.in);
    				String medicine = fmed.nextLine();
                	
                	//System.out.println("\n");
                	System.out.println("***You can get your Medicine***");
                	System.out.println(freemedPublish.FreeMedService());
                	
                }
                if(task.equals("4")) {
                	
                	System.out.println("You are Selected Salary Service");
    				System.out.println("----------------------------------");
    				System.out.println("\n");
                	
                	System.out.println("Enter the number of hours worked : ");
    				Scanner ip = new Scanner(System.in);
    				double hours = ip.nextDouble();
    				
    				System.out.println("Enter the amount pay per hour : ");
    				Scanner ind = new Scanner(System.in);
    				int amount = ind.nextInt();
    				
    				double total = hours * amount;
    				System.out.println("\nTotal Amount = " + total );
    				
    				//System.out.println("\n");
    				System.out.println(salaryPublish.SalaryService());
    				
                	}
                }else {
                	
                	System.out.println("\n");
                	System.out.println("***You are Entered Invalid Service Number***");
    				break;
                }
			}
		
	} 
	
	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Thank you. Goodbye LaborSubscriber!!");
		context.ungetService(atm);
		context.ungetService(cafeteria);
		context.ungetService(freemed);
		context.ungetService(salary);
		
	}

}
