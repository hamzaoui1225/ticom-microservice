package com.billcom.createcustomer.configuration;

import com.billcom.soap.client.alu.CustomerHandlingServiceLocator;
import com.billcom.soap.client.alu.CustomerHandlingSoapBindingStub;
import com.billcom.soap.client.bankSearch.BanksSearchServiceSoap11Stub;
import com.billcom.soap.client.bankSearch.BanksSearchService_ServiceLocator;
import com.billcom.soap.client.billingAccountSearch.BillingAccountSearchServiceSoap11Stub;
import com.billcom.soap.client.billingAccountSearch.BillingAccountSearchService_ServiceLocator;
import com.billcom.soap.client.billingAccountWrite.BillingAccountWriteServiceSoap11Stub;
import com.billcom.soap.client.billingAccountWrite.BillingAccountWriteService_ServiceLocator;
import com.billcom.soap.client.customerTaxExemptionRead.CustomerTaxExemptionsReadServiceSoap11Stub;
import com.billcom.soap.client.customerTaxExemptionRead.CustomerTaxExemptionsReadService_ServiceLocator;
import com.billcom.soap.client.customerTaxExemptionWrite.ws_CIL_7.CustomerTaxExemptionsWriteServiceSoap11Stub;
import com.billcom.soap.client.customerTaxExemptionWrite.ws_CIL_7.CustomerTaxExemptionsWriteService_ServiceLocator;
import org.apache.axis.client.Stub;
import org.apache.axis.message.PrefixedQName;
import org.apache.axis.message.SOAPHeaderElement;
import org.springframework.stereotype.Component;
import com.billcom.createcustomer.bean.Extern;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import java.net.MalformedURLException;
import java.net.URL;

@Component
public class SoapHandler {

    public Stub consumeSoapBSCS(Stub bind) throws SOAPException {
        bind.setTimeout(Integer.parseInt(Extern.getBscsWsTimeout()));
        bind.setHeader(buildHeaderBscs());
        return bind;
    }

    public Stub consumeSoapCMS(Stub bind) throws SOAPException {
        bind.setTimeout(Integer.parseInt(Extern.getBscsWsTimeout()));
        bind.setHeader(buildHeaderCMS());
        return bind;
    }
    public SOAPHeaderElement buildHeaderBscs() throws SOAPException {
        SOAPHeaderElement header = new SOAPHeaderElement(new PrefixedQName(Extern.getBscsWsSeqName(), "Security", Extern.getBscsWsUserSec()));
        SOAPElement usernameToken = header.addChildElement("UsernameToken", Extern.getBscsWsUserSec());
        SOAPElement username = usernameToken.addChildElement("Username", Extern.getBscsWsUserSec());
        username.addTextNode(Extern.getBscsWsUsername());
        SOAPElement password = usernameToken.addChildElement("Password", Extern.getBscsWsUserSec());
        password.addTextNode(Extern.getBscsWsPassword());
        return header;
    }

    public SOAPHeaderElement buildHeaderCMS() throws SOAPException {
        SOAPHeaderElement header = new SOAPHeaderElement(new PrefixedQName(Extern.getBscsWsSeqName(), "Security", Extern.getBscsWsUserSec()));
        SOAPElement usernameToken = header.addChildElement("UsernameToken", Extern.getBscsWsUserSec());
        SOAPElement username = usernameToken.addChildElement("Username", Extern.getBscsWsUserSec());
        username.addTextNode("ADMX");
        SOAPElement password = usernameToken.addChildElement("Password", Extern.getBscsWsUserSec());
        password.addTextNode("ADMX");
        return header;
    }

    public CustomerHandlingSoapBindingStub generateHeaderCustomerHandling() throws MalformedURLException, ServiceException, SOAPException {
        return (CustomerHandlingSoapBindingStub) consumeSoapBSCS(
                (CustomerHandlingSoapBindingStub) new CustomerHandlingServiceLocator()
                        .getCustomerHandling(
                                new URL(Extern.getCustomerHandlingUrl())
                        )
        );
    }

       public BanksSearchServiceSoap11Stub generateHeaderBanksSearch() throws MalformedURLException, ServiceException, SOAPException {
        return (BanksSearchServiceSoap11Stub) consumeSoapCMS(
                (BanksSearchServiceSoap11Stub) new BanksSearchService_ServiceLocator()
                        .getBanksSearchServiceSoap11(
                                new URL("http://192.168.10.95:13001/wsi/services/ws_CIL_7_BanksSearchService.wsdl")
                        )
        );
    }
    public BillingAccountSearchServiceSoap11Stub generateHeaderBillingAccountSearch() throws MalformedURLException, ServiceException, SOAPException {
        return (BillingAccountSearchServiceSoap11Stub) consumeSoapCMS(
                (BillingAccountSearchServiceSoap11Stub) new BillingAccountSearchService_ServiceLocator()
                        .getBillingAccountSearchServiceSoap11(
                                new URL("http://192.168.10.95:13001/wsi/services/ws_CIL_7_BillingAccountSearchService.wsdl")
                        )
        );
    }
    public BillingAccountWriteServiceSoap11Stub generateHeaderBillingAccountWrite() throws MalformedURLException, ServiceException, SOAPException {
        return (BillingAccountWriteServiceSoap11Stub) consumeSoapCMS(
                (BillingAccountWriteServiceSoap11Stub) new BillingAccountWriteService_ServiceLocator()
                        .getBillingAccountWriteServiceSoap11(
                                new URL("http://192.168.10.95:13001/wsi/services/ws_CIL_7_BillingAccountWriteService.wsdl")
                        )
        );
    }
    public CustomerTaxExemptionsReadServiceSoap11Stub generateHeaderCustomerTaxExemptionsRead() throws MalformedURLException, ServiceException, SOAPException {
        return (CustomerTaxExemptionsReadServiceSoap11Stub) consumeSoapCMS(
                (CustomerTaxExemptionsReadServiceSoap11Stub) new CustomerTaxExemptionsReadService_ServiceLocator()
                        .getCustomerTaxExemptionsReadServiceSoap11(
                                new URL("http://192.168.10.95:13001/wsi/services/ws_CIL_7_CustomerTaxExemptionsReadService.wsdl")
                        )
        );
    }

   public CustomerTaxExemptionsWriteServiceSoap11Stub generateHeaderCustomerTaxExemptionsWrite() throws MalformedURLException, ServiceException, SOAPException {
        return (CustomerTaxExemptionsWriteServiceSoap11Stub) consumeSoapCMS(
                (CustomerTaxExemptionsWriteServiceSoap11Stub) new CustomerTaxExemptionsWriteService_ServiceLocator()
                        .getCustomerTaxExemptionsWriteServiceSoap11(
                                new URL("http://192.168.10.95:13001/wsi/services/ws_CIL_7_CustomerTaxExemptionsWriteService.wsdl")
                        )
        );
    }
}
