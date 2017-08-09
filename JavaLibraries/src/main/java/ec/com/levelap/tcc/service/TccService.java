package ec.com.levelap.tcc.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import ec.com.levelap.tcc.wsdl.clientes.AnularDespacho;
import ec.com.levelap.tcc.wsdl.clientes.AnularDespachoResponse;
import ec.com.levelap.tcc.wsdl.clientes.GrabarDespacho4;
import ec.com.levelap.tcc.wsdl.clientes.GrabarDespacho4Response;

public class TccService extends WebServiceGatewaySupport {
	@Value("${tcc-configuration.key}")
	private String tccKey;
	
	@Value("${tcc-configuration.url}")
	private String tccUrl;
	
	/*public EstadoRecogidaResponse getPickupStatus(ArrayOfClsRecogida pickups) {
		EstadoRecogida request = new EstadoRecogida();
		request.setClave(tccKey);
		request.setRecogidas(pickups);
		
		EstadoRecogidaResponse response = (EstadoRecogidaResponse)getWebServiceTemplate()
				.marshalSendAndReceive("http://clientes.tcc.com.co/servicios/wsrecogidas.asmx", request, new SoapActionCallback("http://clientes.tcc.com.co/EstadoRecogida"));
		
		return response;
	}*/
	
	public GrabarDespacho4Response saveDelivery(GrabarDespacho4 request) {
		GrabarDespacho4Response response = (GrabarDespacho4Response)getWebServiceTemplate().marshalSendAndReceive(tccUrl + "/wsDespachos.asmx", request, new SoapActionCallback("http://clientes.tcc.com.co/GrabarDespacho4"));
		return response;
	}
	
	public AnularDespachoResponse cancelDelivery(AnularDespacho request) {
		AnularDespachoResponse response = (AnularDespachoResponse)getWebServiceTemplate().marshalSendAndReceive(tccUrl + "/wsDespachos.asmx", request, new SoapActionCallback(tccUrl + "/AnularDespacho"));
		return response;
	}
}