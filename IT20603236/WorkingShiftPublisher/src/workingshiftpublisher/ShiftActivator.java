package workingshiftpublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class ShiftActivator implements BundleActivator {


	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}
	ServiceRegistration publishServiceRegistration;
	
	@Override
	public void start(BundleContext bundleContext) throws Exception {
		
		ShiftActivator.context = bundleContext;
		
		System.out.println("!!------Welcome to Working Shift Publisher----------------!!");
		ShiftPublish ShiftService = new ShiftPublisher_Implement();
		publishServiceRegistration =context.registerService(ShiftPublish.class.getName(), ShiftService, null);
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		
		ShiftActivator.context = context;
		System.out.println("!!------Working Shift Publisher is Currently Unavailable------!!");
		publishServiceRegistration.unregister();
	}

}
