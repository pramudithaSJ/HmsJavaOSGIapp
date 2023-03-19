package doctorsubscriber;

import java.security.Provider.Service;
import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;


import hospitaltransferpublisher.HospitalTransferPublish;
import laboratorypublisher.LaboratoryPublish;
import leavesandotpublisher.LeavesAndOTPublish;
import vehicleparkingpublisher.VehicleParkingPublish;


public class Activator implements BundleActivator {
	
	private static BundleContext context;
	
	ServiceReference hospital;
	ServiceReference laboratory;
	ServiceReference leavesAndOT;
	ServiceReference vehicleParking;
	
	static BundleContext getContext() {
		return context;
	}


	public void start(BundleContext context) throws Exception  {
		
		hospital = context.getServiceReference(HospitalTransferPublish.class.getName());
		HospitalTransferPublish hospitalTransferPublisher = (HospitalTransferPublish) context.getService(hospital);
		
		laboratory = context.getServiceReference(LaboratoryPublish.class.getName());
		LaboratoryPublish laboratoryPublisher = (LaboratoryPublish) context.getService(laboratory);
		
		leavesAndOT = context.getServiceReference(LeavesAndOTPublish.class.getName());
		LeavesAndOTPublish leavesAndOTPublisher = (LeavesAndOTPublish) context.getService(leavesAndOT);

		vehicleParking = context.getServiceReference(VehicleParkingPublish.class.getName());
		VehicleParkingPublish vehicleParkingPublisher = (VehicleParkingPublish) context.getService(vehicleParking);
		
		

			
			while(true) {
					System.out.println("\n");
					System.out.println("Hello Doctor, Welcome !!");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("                                            ");
				    System.out.println("Please Select Your requirement below ");
	                System.out.println("Select your Hospital Transfer Details - [1] ");
	                System.out.println("Get Laboratory Pass                   - [2] ");
	                System.out.println("Apply for your Leaves and OT          - [3] "); 
	                System.out.println("Get your Free Vehicle Parking         - [4] "); 
	                System.out.println("Exit Doctor Service                   - [5] ");
	            	
	    			System.out.println("Enter the number : ");
	    			Scanner object = new Scanner(System.in);
	    			
	    			int no = object.nextInt();
	    			System.out.println("\n");
	    			
	    			
	    			if((no==5)) {
	    				return;
	    			}	
	    				
	    			if((no==1)||(no==2)||(no==3)||(no==4)) {
	                
	                
	                if (no==1)
	                {
	                	System.out.println("You Have Selected Hospital Transfer Details");
	    				System.out.println("-------------------------------------------");
	    				
	    				
	                	System.out.println("Please enter the transfer hospital name : ");
	                	Scanner inputHPname = new Scanner(System.in);
	                	String HPname = inputHPname.nextLine();
	                	
	                	System.out.println("Please enter the transfer time : ");
	                	Scanner inputamountTFtime = new Scanner(System.in);
	                	String TFtime = inputamountTFtime.nextLine();
	                	
	                	System.out.println("\n");
	                	System.out.println(hospitalTransferPublisher.HpublishService());
	                	System.out.println("\n");
						break;
						
	                }
	                else if(no==2)
	                {
	                	System.out.println("You Have Selected Laboratory Pass");
	    				System.out.println("---------------------------------");
	    				
	                	System.out.println("Please enter you Laboratory name: ");
	                	Scanner inputLBname = new Scanner(System.in);
	                	String LBname = inputLBname.nextLine();
	                	
	                	System.out.println("Please enter your Laboratory number: ");
	                	Scanner inputLBnumber = new Scanner(System.in);
	                	String LBnumber = inputLBnumber.nextLine();
	                	
	                	System.out.println("\n");
	                	System.out.println(laboratoryPublisher.LpublishService());
	                	System.out.println("\n");
						break;
	                    
	                }
	                
	                else if(no==3)
	                {
	                	System.out.println("You Have Selected Apply for your Leaves and OT");
	    				System.out.println("----------------------------------------------");
	    				
	                	System.out.println("Please enter the type of leaves : ");
	                	Scanner inputleaves = new Scanner(System.in);
	                	String leaves = inputleaves.nextLine();
	                	
	                	System.out.println("Please enter the amount of OT : ");
	                	Scanner inputOT = new Scanner(System.in);
	                	String OT = inputOT.nextLine();
	                	
	                	System.out.println("\n");
	                	System.out.println(leavesAndOTPublisher.LOpublishService());
	                	System.out.println("\n");
						break;
						
	                }
	                
	                else if(no==4)
	                {
	                	System.out.println("You Have Selected Get your Free Vehicle Parking ");
	    				System.out.println("-----------------------------------------------");
	    				
	                	System.out.println("Please enter Vehicle Parking id: ");
	                	Scanner inputVP = new Scanner(System.in);	                	
	                	String VP = inputVP.nextLine();
	                	
	                	System.out.println("\n");
	                	System.out.println(vehicleParkingPublisher.VpublishService());
	                	System.out.println("\n");
						break;
	                	
	                }
	    		}
	                else
	                {
	                	System.out.println("Sorry! You are not Registered for the Service ");
	    				break;
	    			}
	    			
	    			}
			
	    		
	    	}
	

	public void stop(BundleContext context) throws Exception {

		
		System.out.println("Thank You. Have a nice day !");
		

		context.ungetService(hospital);
		context.ungetService(laboratory);
		context.ungetService(leavesAndOT);
		context.ungetService(vehicleParking);
	}

}
