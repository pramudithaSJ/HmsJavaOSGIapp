package hospitalshuttlepiublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class ShuttleActivator implements BundleActivator {
	
	public static BundleContext context;

	static BundleContext getContext() {
		return context;
	}
	ServiceRegistration publishServiceRegistration;
	
	@Override
	public void start(BundleContext bundleContext) throws Exception {
		ShuttleActivator.context = bundleContext;
		
		System.out.println("!!------Welcome to Hospital Shuttle Publisher-------------!!");
		ShuttlePublish ShuttleService = new ShuttlePublisher_Implement();
		publishServiceRegistration = context.registerService(ShuttlePublish.class.getName(), ShuttleService, null);
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		
		ShuttleActivator.context = context;
		System.out.println("!!------Hospital shuttle Publisher is Currently Unavailable------!!");
		publishServiceRegistration.unregister();
	}

}
