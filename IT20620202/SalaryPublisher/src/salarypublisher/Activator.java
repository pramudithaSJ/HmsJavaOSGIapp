package salarypublisher;

import org.osgi.framework.BundleActivator;  
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;
	
	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Hello SalaryPublisher!!");
		SalaryPublish salaryService = new salaryPublishImpl();
		publishServiceRegistration = context.registerService(
				SalaryPublish.class.getName(),salaryService, null);
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Goodbye SalaryPublisher!!");
		publishServiceRegistration.unregister();
	}

}
