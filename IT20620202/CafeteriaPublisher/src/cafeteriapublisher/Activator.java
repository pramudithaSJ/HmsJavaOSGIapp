package cafeteriapublisher;

import org.osgi.framework.BundleActivator;  
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;
	
	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Hello CafeteriaPublisher!!");
		CafeteriaPublish cafeteriaService = new cafeteriaPublishImpl();
		publishServiceRegistration = context.registerService(
				CafeteriaPublish.class.getName(),cafeteriaService, null);
		
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Goodbye CafeteriaPublisher!!");
		publishServiceRegistration.unregister();
	}

}
