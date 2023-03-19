package freemedicalcheckuppublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class MedicalCheckupActivator implements BundleActivator {
	

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}
	ServiceRegistration publishServiceRegistration;

	@Override
	public void start(BundleContext bundleContext) throws Exception {
		
		MedicalCheckupActivator.context = bundleContext;
		
		System.out.println("!!------Welcome To Free Yearly Medical Checkup Publisher--!!");
		
		MedicalCheckupPublish MedicalCheckupService = new MedicalCheckup_Implement();
		publishServiceRegistration = context.registerService(MedicalCheckupPublish.class.getName(), MedicalCheckupService, null);
	}
	
	
	@Override
	public void stop(BundleContext context) throws Exception {
		
		
		MedicalCheckupActivator.context = context;	
		
		System.out.println("!!------Free Yearly Medical Checkup Publisher is Currently Unavailable--!!");
		publishServiceRegistration.unregister();
	}

}
