package nursesubscriber;

import freemedicalcheckuppublisher.MedicalCheckupPublish;
import freeuniformpublisher.FreeUniformPublish;
import hospitalshuttlepiublisher.ShuttlePublish;
import workingshiftpublisher.ShiftPublish;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;




public class NurseActivator implements BundleActivator {


	private static BundleContext context;
	ServiceReference FreeMedCheck;
	ServiceReference FreeUniform;
	ServiceReference Shuttle;
	ServiceReference Shift;

	@Override
	public void start(BundleContext context) throws Exception {
		
		NurseActivator.context = context;
		
		FreeMedCheck = context.getServiceReference(MedicalCheckupPublish.class.getName());
		MedicalCheckupPublish medicheckPublish = (MedicalCheckupPublish) context.getService(FreeMedCheck);
		
		FreeUniform = context.getServiceReference(FreeUniformPublish.class.getName());
		FreeUniformPublish uniPublish = (FreeUniformPublish) context.getService(FreeUniform);
		
		Shuttle = context.getServiceReference(ShuttlePublish.class.getName());
		ShuttlePublish admitPublish = (ShuttlePublish) context.getService(Shuttle);
		
		Shift = context.getServiceReference(ShiftPublish.class.getName());
		ShiftPublish paymentPublish = (ShiftPublish) context.getService(Shift);
		
		
		while(true) {
			
			System.out.println("\n");
			System.out.println("!!------Welcome to Nurse Subscriber-----------------------!!");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Select your Service");
			System.out.println("Free Medical Checkup Service - 1");
			System.out.println("Free Uniform Service         - 2");
			System.out.println("Hospital Shuttle Service     - 3");
			System.out.println("Working Shift	             - 4");
			
			
			System.out.println("Enter the selected Service number   : ");
			Scanner obj = new Scanner(System.in);
			int no = obj.nextInt();
			System.out.println("\n");
			
			if((no==1)||(no==2)||(no==3)||(no==4)) {
				
				if(no==1) {
				
				System.out.println("You Have Selected yearly Free Medical Checkup Service");
				System.out.println("-----------------------------------------------------");
				
				System.out.println("Enter Your Name : ");
				Scanner iname = new Scanner(System.in);
				String name = iname.nextLine();
				
				System.out.println("Enter Your Age : ");
				Scanner iage = new Scanner(System.in);
				int age = iage.nextInt();
				
				System.out.println("Enter Your Address : ");
				Scanner iadd = new Scanner(System.in);
				String add = iadd.nextLine();
				
				System.out.println("Enter Your Mobile Number : ");
				Scanner ino = new Scanner(System.in);
				String number = ino.nextLine();
				
				System.out.println("Enter the Recent checkuped Year  : ");
				Scanner ispe = new Scanner(System.in);
				String spe = ispe.nextLine();
				
				System.out.println("Enter Month You got Last Checkup : ");
				Scanner cheyear = new Scanner(System.in);
				String cyear = cheyear.nextLine();
				
				System.out.println("Enter Month You Want to Checkup : ");
				Scanner cheyear1 = new Scanner(System.in);
				String chyear = cheyear1.nextLine();
				
				System.out.println("\n");
				System.out.println(medicheckPublish.MedicalCheckupService());
				System.out.println("\n");
				
				
				break;
				}
			
				else if(no==2) {
				
				System.out.println("You Have Selected Free Uniform Service");
				System.out.println("--------------------------------------");
				
				System.out.println("Enter Your Name : ");
				Scanner iname = new Scanner(System.in);
				String name = iname.nextLine();
				
				System.out.println("Enter Your Age : ");
				Scanner iage = new Scanner(System.in);
				String age = iage.nextLine();
				
				System.out.println("Enter Your Address : ");
				Scanner iadd = new Scanner(System.in);
				String add = iadd.nextLine();
				
				System.out.println("Enter Your Mobile Number : ");
				Scanner ino = new Scanner(System.in);
				String number = ino.nextLine();
				
				System.out.println("Enter Your Trouser Size (28,30,32,34,36,40) : ");
				Scanner itrou = new Scanner(System.in);
				String trou = itrou.nextLine();
				
				System.out.println("Enter Your Blouse Size (S,M,L,XL,XXL,XXXL): ");
				Scanner isize = new Scanner(System.in);
				String size = isize.nextLine();
				
				System.out.println("Enter Your Shoe Size (38,39,40,41,42) : ");
				Scanner ishoe = new Scanner(System.in);
				String shoe= ishoe.nextLine();
				
				System.out.println("\n");
				System.out.println(">>>>>Execute From The Uniform Service ");
				//System.out.println(FreeUniformPublish.UniformPublish());
				System.out.println("\n");
				
			
				break;
				}
				
				else if(no==3) {
					
					System.out.println("You Have Selected Hospital Shuttle Service");
					System.out.println("------------------------------------------");
					
					System.out.println("Enter Your Name : ");
					Scanner iname = new Scanner(System.in);
					String name = iname.nextLine();
					
					System.out.println("Enter Your Age : ");
					Scanner iage = new Scanner(System.in);
					String age = iage.nextLine();
					
					System.out.println("Enter Your Address : ");
					Scanner iadd = new Scanner(System.in);
					String add = iadd.nextLine();
					
					System.out.println("Enter Your Mobile Number : ");
					Scanner ino = new Scanner(System.in);
					String number = ino.nextLine();
					
					System.out.println("Select Days : ");
					System.out.println("Monday     - 1 ");
					System.out.println("Tuesday    - 2 ");
					System.out.println("Wednesday  - 3 ");
					System.out.println("Thursday   - 4 ");
					System.out.println("Friday     - 5 ");
					System.out.println("Saturday   - 6 ");
					System.out.println("Sunday     - 7 ");
					Scanner iday = new Scanner(System.in);
					String day = iday.nextLine();
					
					System.out.println("Select Route: ");
					System.out.println("Katugasthota    - 1 ");
					System.out.println("Waththegama     - 2 ");
					System.out.println("Theldeniya      - 3 ");
					System.out.println("Digana          - 4 ");
					System.out.println("Mawanella       - 5 ");
					
					Scanner iroute = new Scanner(System.in);
					String route = iroute.nextLine();
					
					System.out.println("\n");
					System.out.println(">>>>>Execute From the Hospital Shuttle Service");
					//System.out.println(ShuttlePublish.ShuttleService());
					System.out.println("\n");
					
					
					break;
					}
				
			
				else if(no==4) {
				
				System.out.println("You Have Selected Working Shift Service");
				System.out.println("---------------------------------------");
				
				System.out.println("Enter Your Name : ");
				Scanner iname = new Scanner(System.in);
				String name = iname.nextLine();
				
				System.out.println("Enter Your Age : ");
				Scanner iage = new Scanner(System.in);
				String age = iage.nextLine();
				
				System.out.println("Enter Your Address : ");
				Scanner iadd = new Scanner(System.in);
				String add = iadd.nextLine();
				
				System.out.println("Enter Your Mobile Number : ");
				Scanner ino = new Scanner(System.in);
				String number = ino.nextLine();
				
				System.out.println("Day And Night Working Days : ");
				System.out.println("Monday,Tuesday     - 1 ");
				System.out.println("Tuesday,Wednesday  - 2 ");
				System.out.println("Wednesday,Thursday - 3 ");
				System.out.println("Thursday,Friday    - 4 ");
				System.out.println("Friday,Saturday    - 5 ");
				System.out.println("Saturday,Sunday    - 6 ");
				System.out.println("Sunday,Monday      - 7 ");
				Scanner iday = new Scanner(System.in);
				String day = iday.nextLine();
				
				
				System.out.println("Change Days : ");
				System.out.println("Sunday,Monday      - 1 ");
				System.out.println("Monday,Tuesday     - 2 ");
				System.out.println("Tuesday,Wednesday  - 3 ");
				System.out.println("Wednesday,Thursday - 4 ");
				System.out.println("Thursday,Friday    - 5 ");
				System.out.println("Friday,Saturday    - 6 ");
				System.out.println("Saturday,Sunday    - 7 ");
				Scanner ishift = new Scanner(System.in);
				String shift = ishift.nextLine();

				System.out.println("\n");
				System.out.println(">>>>>Execute From the Working Shift Service");
				//System.out.println(ShiftPublish.ShiftService());
				System.out.println("\n");
				
				
				break;
				}
			
			}
			
			else {
				System.out.println("You Entered Invalid Number------!!");
				continue;
			}
			
		}
		
	}

	
	@Override
	public void stop(BundleContext dcontext) throws Exception {
		
		NurseActivator.context = dcontext;
		System.out.println("Thank You!!------Good Bye------!!");
		

		context.ungetService(FreeMedCheck);
		context.ungetService(FreeUniform);
		context.ungetService(Shuttle);
		context.ungetService(Shift);
	}

}
