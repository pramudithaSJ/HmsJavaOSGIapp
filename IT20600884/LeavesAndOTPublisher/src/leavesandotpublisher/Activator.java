package leavesandotpublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;



public class Activator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	public void start(BundleContext context) throws Exception {
			
			System.out.println("Welcome To Leaves and OT Service....");
			LeavesAndOTPublish LeavesAndOTService = new LeavesAndOTPublish_Imp();
			publishServiceRegistration = context.registerService(
					LeavesAndOTPublish.class.getName(), LeavesAndOTService, null);
			
		}
		
		public void stop(BundleContext context) throws Exception {
			System.out.println("Leaves and OT Service is Deactivate");
			System.out.println("Thank You. Have a nice day !");
			publishServiceRegistration.unregister();
		}

	}

