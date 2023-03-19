//IT19208718 | S.M.H.M.Suraweera | MTIT Assignment 01

package paymentpublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {
	
	@SuppressWarnings("rawtypes")
	ServiceRegistration publishServiceRegistration;
	
	//activating admission service
	public void start(BundleContext context) throws Exception {
		
		System.out.println("-----Payment Service is Activated--------");
		
		PaymentPublish admitionPublish = new PaymentPublisherImpl();
		
		publishServiceRegistration = context.registerService(PaymentPublish.class.getName(), admitionPublish, null);
		
	}
	
	//deactivating admission service
	public void stop(BundleContext context) throws Exception {
		System.out.println("-----Payment Service is Deactivated-----");
		publishServiceRegistration.unregister();
	}
}


