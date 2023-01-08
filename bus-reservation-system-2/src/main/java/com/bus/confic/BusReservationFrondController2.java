package com.bus.confic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class BusReservationFrondController2 extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		Class[] arr = {BusReservationConfic.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {

		String[] arr = {"/"};
		return arr;
	}

}
