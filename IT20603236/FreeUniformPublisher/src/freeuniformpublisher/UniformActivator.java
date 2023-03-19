package freeuniformpublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class UniformActivator implements BundleActivator {

	private static BundleContext context;
	
	static BundleContext getContext() {
		return context;
	}
	ServiceRegistration publishServiceRegistration;
	
	@Override
	public void start(BundleContext bundleContext) throws Exception {
		
		UniformActivator.context = bundleContext;
		
		System.out.println("!!------Welcome to Free Uniform Publisher-----------------!!");
		FreeUniformPublish UniformService = new UniformPublisher_Implement();
		publishServiceRegistration = context.registerService(FreeUniformPublish.class.getName(), UniformService, null);
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		
		UniformActivator.context = context;
		System.out.println("!!------Uniform Publisher is Currently Unavailable----------!!");
		publishServiceRegistration.unregister();
	}

}
