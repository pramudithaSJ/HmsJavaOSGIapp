package vehicleparkingpublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;



public class Activator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	public void start(BundleContext context) throws Exception {
			
			System.out.println("Welcome To Vehicle Parking Service....");
			VehicleParkingPublish VehicleParkingService = new VehicleParkingPublish_Imp();
			publishServiceRegistration = context.registerService(
					VehicleParkingPublish.class.getName(), VehicleParkingService, null);
			
		}
		
		public void stop(BundleContext context) throws Exception {
			System.out.println("Vehicle Parking Service is Deactivate");
			System.out.println("Thank You. Have a nice day !");
			publishServiceRegistration.unregister();
		}

	}
