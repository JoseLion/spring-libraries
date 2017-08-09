package ec.com.levelap.tcc.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import ec.com.levelap.tcc.service.TccService;

@Configuration
public class SoapConfiguration {
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setPackagesToScan("ec.com.levelap.tcc.wsdl");
		
		return marshaller;
	}
	
	@Bean
	public TccService tccService(Jaxb2Marshaller marshaller) {
		TccService service = new TccService();
		service.setMarshaller(marshaller);
		service.setUnmarshaller(marshaller);
		
		return service;
	}
}