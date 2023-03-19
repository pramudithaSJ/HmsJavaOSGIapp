//IT19208718 | S.M.H.M.Suraweera | MTIT Assignment 01

package patientsubscriber;

import admissionpublisher.AdmitionPublish;
import doctorpublisher.DoctorPublish;
import nursepublisher.NursePublish;
import java.util.Scanner;
import org.osgi.framework.AdminPermission;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import paymentpublisher.PaymentPublish;

@SuppressWarnings("unused")
public class Activator implements BundleActivator {
	
	private static BundleContext context;
	
	@SuppressWarnings("rawtypes")
	public ServiceReference admissionService;
	@SuppressWarnings("rawtypes")
	public ServiceReference doctorService;
	@SuppressWarnings("rawtypes")
	public ServiceReference nurseService;
	@SuppressWarnings("rawtypes")
	public ServiceReference paymentService;

	static BundleContext getContext() {
		return context;
	}

	//activating the patient subscriber 
	@SuppressWarnings({ "resource", "unchecked" })
	@Override
	public void start(BundleContext bundleContext) throws Exception {
		
		Activator.context = bundleContext;
		
		System.out.println("-----Patient Subscriber is Activated-----");

		//Initialize the admission service
		admissionService = context.getServiceReference(AdmitionPublish.class.getName());
		AdmitionPublish admitionPublish = (AdmitionPublish) context.getService(admissionService);
		
		//Initialize the doctor service
		doctorService = context.getServiceReference(DoctorPublish.class.getName());
		DoctorPublish doctorPublish = (DoctorPublish) context.getService(doctorService);
		
		//Initialize the nurse service
		nurseService = context.getServiceReference(NursePublish.class.getName());
		NursePublish nursePublish = (NursePublish) context.getService(nurseService);
		
		//Initialize the payment service
		paymentService = context.getServiceReference(PaymentPublish.class.getName());
		PaymentPublish paymentPublish = (PaymentPublish) context.getService(paymentService);
		
		System.out.println("\n");
		System.out.println("Hello Patient, Welcome to ABC Hospital Service!\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		while(true) {
			
			//getting the service that the patient needs
			System.out.println("Please select the service that you want");
			System.out.println("Admission Service ------- [1]");
			System.out.println("Doctor Service ---------- [2]");
			System.out.println("Nurse Service ----------- [3]");
			System.out.println("Payment Service --------- [4]");
			System.out.println("Exit -------------------- [5]");
			
			Scanner select_service_sc = new Scanner(System.in);
			System.out.print("Enter the service number : ");
			
			String user_input = select_service_sc.nextLine();
			System.out.println("\n");
			
			//exit from the execution
			if(user_input.equals("5")) {
				return;
			}
			
			//validating the user input - it will ask again until providing a valid input.
			if((user_input.equals("1"))||(user_input.equals("2"))||(user_input.equals("3"))||(user_input.equals("4"))) {
				
				//if the admission service is selected
				if(user_input.equals("1")) {
					
					System.out.println("You have selected Admission Service");
					System.out.println("-----------------------------------");
					
					System.out.print("Enter your name : ");
					Scanner patient_name_sc = new Scanner(System.in);
					String patient_name = patient_name_sc.nextLine();
					
					System.out.print("Enter your Age : ");
					Scanner patient_age_sc = new Scanner(System.in);
					String patient_age = patient_age_sc.nextLine();
					
					System.out.print("Enter your address : ");
					Scanner patient_address_sc = new Scanner(System.in);
					String patient_address = patient_address_sc.nextLine();
					
					System.out.print("Enter your mobile number : ");
					Scanner patient_mobile_sc = new Scanner(System.in);
					String patient_mobile = patient_mobile_sc.nextLine();
					
					System.out.print("Please explain the illness : ");
					Scanner illness_sc = new Scanner(System.in);
					String illness = illness_sc.nextLine();
					
					System.out.println("\n");
					System.out.println(admitionPublish.AdmisionService());
					System.out.println("\n");
					break;
				}
				
				//if the doctor service is selected
				if(user_input.equals("2")) {
					
					System.out.println("You have selected Doctor Service");
					System.out.println("--------------------------------");
					
					System.out.print("Enter your name : ");
					Scanner patient_name_sc = new Scanner(System.in);
					String patient_name = patient_name_sc.nextLine();
					
					System.out.print("Enter your age : ");
					Scanner patient_age_sc = new Scanner(System.in);
					String patient_age = patient_age_sc.nextLine();
					
					System.out.print("Enter your address : ");
					Scanner patient_address_sc = new Scanner(System.in);
					String patient_address = patient_address_sc.nextLine();
					
					System.out.print("Enter your mobile number : ");
					Scanner patient_mobile_sc = new Scanner(System.in);
					String patient_mobile = patient_mobile_sc.nextLine();
					
					System.out.print("Enter the doctor's specialty : ");
					Scanner patient_selected_specailty_sc = new Scanner(System.in);
					String patient_selected_specailty = patient_selected_specailty_sc.nextLine();
					
					System.out.print("Enter doctor's name : ");
					Scanner patient_selected_doctor_name_sc = new Scanner(System.in);
					String patient_selected_doctor_name = patient_selected_doctor_name_sc.nextLine();
					
					System.out.print("Enter the prefered date : ");
					Scanner patient_selected_date_sc = new Scanner(System.in);
					String patient_selected_date = patient_selected_date_sc.nextLine();
					
					System.out.print("Enter the prefered time : ");
					Scanner patient_selected_time_sc = new Scanner(System.in);
					String patient_selected_time = patient_selected_time_sc.nextLine();
					
					System.out.println("\n");
					System.out.println(doctorPublish.DoctorService());
					System.out.println("\n");
					break;
				}
				
				//if the nurse service is selected
				if(user_input.equals("3")) {
					
					System.out.println("You have selected Nurse Service");
					System.out.println("-------------------------------");
					
					System.out.print("Enter your name : ");
					Scanner patient_name_sc = new Scanner(System.in);
					String patient_name = patient_name_sc.nextLine();
					
					System.out.print("Enter your age : ");
					Scanner patient_age_sc = new Scanner(System.in);
					String patient_age = patient_age_sc.nextLine();
					
					System.out.print("Enter your address : ");
					Scanner patient_address_sc = new Scanner(System.in);
					String patient_address = patient_address_sc.nextLine();
					
					System.out.print("Enter your mobile number : ");
					Scanner patient_mobile_sc = new Scanner(System.in);
					String patient_mobile = patient_mobile_sc.nextLine();
					
					System.out.print("Enter the reason for requesting Nurse Service : ");
					Scanner patient_selected_specailty_sc = new Scanner(System.in);
					String patient_selected_specailty = patient_selected_specailty_sc.nextLine();
					
					System.out.print("Enter the prefered date : ");
					Scanner patient_selected_date_sc = new Scanner(System.in);
					String patient_selected_date = patient_selected_date_sc.nextLine();
					
					System.out.print("Enter the prefered time : ");
					Scanner patient_selected_time_sc = new Scanner(System.in);
					String patient_selected_time = patient_selected_time_sc.nextLine();
					
					System.out.println("\n");
					System.out.println(nursePublish.NurseService());
					System.out.println("\n");
					break;
				}
				
				//if the payment service is selected
				if(user_input.equals("4")) {
					
					System.out.println("You have selected payment service");
					System.out.println("----------------------------------");
					
					System.out.print("Enter your name : ");
					Scanner patient_name_sc = new Scanner(System.in);
					String patient_name = patient_name_sc.nextLine();
					
					System.out.print("Enter your age : ");
					Scanner patient_age_sc = new Scanner(System.in);
					String patient_age = patient_age_sc.nextLine();
					
					System.out.print("Enter your address : ");
					Scanner patient_address_sc = new Scanner(System.in);
					String patient_address = patient_address_sc.nextLine();
					
					System.out.print("Enter your mobile number : ");
					Scanner patient_mobile_sc = new Scanner(System.in);
					String patient_mobile = patient_mobile_sc.nextLine();
					
					System.out.print("Enter the amount : ");
					Scanner patient_selected_specailty_sc = new Scanner(System.in);
					String patient_selected_specailty = patient_selected_specailty_sc.nextLine();
					
					System.out.print("Enter the payment details : ");
					Scanner patient_selected_time_sc = new Scanner(System.in);
					String patient_selected_time = patient_selected_time_sc.nextLine();
					
					System.out.println("\n");
					System.out.println(paymentPublish.PaymentService());
					System.out.println("\n");
					break;
				}
				
				
			}else {
				
				System.out.println("-----The number you entered is not valid. Please enter a valid number-----\n");
				continue;
				
			}
			
			
		}
		
		
		
	}
	
	//deactivating the patient subscriber 
	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		
		context.ungetService(admissionService);
		context.ungetService(doctorService);
		context.ungetService(nurseService);
		context.ungetService(paymentService);
		
		Activator.context = null;
		
		System.out.println("-----Patient Subscriber is Deactivated-----");

		
		
	}

}
