package atmpublisher;

import org.osgi.framework.BundleActivator;    
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {
	
	ServiceRegistration publishServiceRegistration;

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Hello ATMPublisher!!");
		AtmPublish atmService = new atmPublishImpl();
		publishServiceRegistration = context.registerService(
				AtmPublish.class.getName(),atmService, null);
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Goodbye ATMPublisher!!");
		publishServiceRegistration.unregister();
	}

}
