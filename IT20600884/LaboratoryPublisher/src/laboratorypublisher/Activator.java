package laboratorypublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;



public class Activator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	public void start(BundleContext context) throws Exception {
			
			System.out.println("Welcome To Laboratory Service....");
			LaboratoryPublish LaboratoryService = new LaboratoryPublish_Imp();
			publishServiceRegistration = context.registerService(
					LaboratoryPublish.class.getName(), LaboratoryService, null);
			
		}
		
		public void stop(BundleContext context) throws Exception {
			System.out.println("Laboratory Service is Deactivate");
			System.out.println("Thank You. Have a nice day !");
			publishServiceRegistration.unregister();
		}

	}

