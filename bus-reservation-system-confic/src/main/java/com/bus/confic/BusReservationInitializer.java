package com.bus.confic;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class BusReservationInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(BusReservationAppConfic.class);
		/**WebApplicationContext is an extension of a plain ApplicationContext. it is web aware
		 *  ApplicationContext i.e it has Servlet Context information. When DispatcherServlet 
		 *  is loaded, it looks for the bean configuration file of WebApplicationContext and 
		 *  initializes it*/
		// Create DispatcherServlet
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);
		
		// Register DispatcherServlet
		ServletRegistration.Dynamic myCustomServlet = servletContext.addServlet("myDispatcherServlet", dispatcherServlet);
		myCustomServlet.setLoadOnStartup(1);
		myCustomServlet.addMapping("/mywebapp.com/*");
	}

}
