package ec.com.levelap.tcc.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import ec.com.levelap.tcc.entity.wsrecogidas.ArrayOfClsRecogida;
import ec.com.levelap.tcc.entity.wsrecogidas.EstadoRecogida;
import ec.com.levelap.tcc.entity.wsrecogidas.EstadoRecogidaResponse;

public class TccService extends WebServiceGatewaySupport {
	@Value("${tcc-configuration.key}")
	private String tccKey;
	
	public EstadoRecogidaResponse getPickupStatus(ArrayOfClsRecogida pickups) {
		EstadoRecogida request = new EstadoRecogida();
		request.setClave(tccKey);
		request.setRecogidas(pickups);
		
		EstadoRecogidaResponse response = (EstadoRecogidaResponse)getWebServiceTemplate()
				.marshalSendAndReceive("http://clientes.tcc.com.co/servicios/wsrecogidas.asmx", request, new SoapActionCallback("http://clientes.tcc.com.co/EstadoRecogida"));
		
		return response;
	}
}