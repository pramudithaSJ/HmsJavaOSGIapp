package hospitaltransferpublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {
	
	
	ServiceRegistration publishServiceRegistration;

public void start(BundleContext context) throws Exception {
		
		System.out.println("Welcome To Hospital Transfer Service....");
		HospitalTransferPublish HospitalTransferService = new HospitalTransferPublish_Imp();
		publishServiceRegistration = context.registerService(
				HospitalTransferPublish.class.getName(), HospitalTransferService, null);
		
	}
	
	public void stop(BundleContext context) throws Exception {
		System.out.println("Hospital Transfer Service is Deactivate");
		System.out.println("Thank You. Have a nice day !");
		publishServiceRegistration.unregister();
	}

}
