package com.ticom.config;

import com.soap.client.alu.APCHandlingServiceLocator;
import com.soap.client.alu.APCHandlingSoapBindingStub;
import org.apache.axis.client.Stub;
import org.apache.axis.message.PrefixedQName;
import org.apache.axis.message.SOAPHeaderElement;
import org.springframework.context.annotation.Configuration;

import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import java.net.MalformedURLException;
import java.net.URL;

@Configuration
public class SoapHeaderConfig {

    String bscsUsername = "ALU";
    String bscsPassword = "SY";
    Integer bscsTimeOut = 10000;
    String urlApchandling = "http://192.168.10.11:8080/BscsWs/services/APCHandling?wsdl";
    String uri = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
    String sec = "wsse";
    public Stub consumeSoap(Stub bind) throws SOAPException {
        bind.setTimeout(bscsTimeOut);
        bind.setHeader(buildHeader());
        return bind;
    }
    public SOAPHeaderElement buildHeader() throws SOAPException {
        SOAPHeaderElement header = new SOAPHeaderElement(new PrefixedQName(uri, "Security", sec));
        SOAPElement usernameToken = header.addChildElement("UsernameToken", sec);
        usernameToken.addChildElement("Username", sec).addTextNode(bscsUsername);
        usernameToken.addChildElement("Password", sec).addTextNode(bscsPassword);
        return header;
    }
    public APCHandlingSoapBindingStub consumeAPCHandling() throws SOAPException, ServiceException, MalformedURLException {
        return (APCHandlingSoapBindingStub) consumeSoap((APCHandlingSoapBindingStub)
                new APCHandlingServiceLocator().getAPCHandling(new URL(urlApchandling)));
    }
}
