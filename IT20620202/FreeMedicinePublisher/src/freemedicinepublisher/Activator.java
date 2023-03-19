package freemedicinepublisher;

import org.osgi.framework.BundleActivator;   
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class Activator implements BundleActivator {
	
	ServiceRegistration publishServiceRegistration;

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Hello FreeMedicinePublisher!!");
		FreemedPublish freemedService = new freemedPublishImpl();
		publishServiceRegistration = context.registerService(
				FreemedPublish.class.getName(),freemedService, null);
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Goodbye FreeMedicinePublisher!!");
		publishServiceRegistration.unregister();
	}

}
