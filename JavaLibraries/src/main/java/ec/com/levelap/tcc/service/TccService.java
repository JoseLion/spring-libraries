package ec.com.levelap.tcc.service;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import ec.com.levelap.tcc.entity.wsrecogidas.ArrayOfClsRecogida;
import ec.com.levelap.tcc.entity.wsrecogidas.EstadoRecogida;
import ec.com.levelap.tcc.entity.wsrecogidas.EstadoRecogidaResponse;

public class TccService extends WebServiceGatewaySupport {
	public EstadoRecogidaResponse getPickupStatus(ArrayOfClsRecogida pickups) {
		EstadoRecogida request = new EstadoRecogida();
		request.setClave("ACORDOVEZ");
		request.setRecogidas(pickups);
		
		EstadoRecogidaResponse response = (EstadoRecogidaResponse)getWebServiceTemplate()
				.marshalSendAndReceive("http://clientes.tcc.com.co/testservicios/wsrecogidas.asmx", request, new SoapActionCallback("http://clientes.tcc.com.co/EstadoRecogida"));
		
		return response;
	}
}
