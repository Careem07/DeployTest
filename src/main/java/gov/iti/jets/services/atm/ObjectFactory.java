
package gov.iti.jets.services.atm;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.iti.jets.services.atm package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _Deposite_QNAME = new QName("http://services.day1.example.com/", "Deposite");
    private static final QName _DepositeResponse_QNAME = new QName("http://services.day1.example.com/", "DepositeResponse");
    private static final QName _Exception_QNAME = new QName("http://services.day1.example.com/", "Exception");
    private static final QName _ViewBalance_QNAME = new QName("http://services.day1.example.com/", "ViewBalance");
    private static final QName _ViewBalanceResponse_QNAME = new QName("http://services.day1.example.com/", "ViewBalanceResponse");
    private static final QName _Withdraw_QNAME = new QName("http://services.day1.example.com/", "Withdraw");
    private static final QName _WithdrawResponse_QNAME = new QName("http://services.day1.example.com/", "WithdrawResponse");
    private static final QName _Login_QNAME = new QName("http://services.day1.example.com/", "login");
    private static final QName _LoginResponse_QNAME = new QName("http://services.day1.example.com/", "loginResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.iti.jets.services.atm
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Deposite }
     * 
     * @return
     *     the new instance of {@link Deposite }
     */
    public Deposite createDeposite() {
        return new Deposite();
    }

    /**
     * Create an instance of {@link DepositeResponse }
     * 
     * @return
     *     the new instance of {@link DepositeResponse }
     */
    public DepositeResponse createDepositeResponse() {
        return new DepositeResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     * @return
     *     the new instance of {@link Exception }
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link ViewBalance }
     * 
     * @return
     *     the new instance of {@link ViewBalance }
     */
    public ViewBalance createViewBalance() {
        return new ViewBalance();
    }

    /**
     * Create an instance of {@link ViewBalanceResponse }
     * 
     * @return
     *     the new instance of {@link ViewBalanceResponse }
     */
    public ViewBalanceResponse createViewBalanceResponse() {
        return new ViewBalanceResponse();
    }

    /**
     * Create an instance of {@link Withdraw }
     * 
     * @return
     *     the new instance of {@link Withdraw }
     */
    public Withdraw createWithdraw() {
        return new Withdraw();
    }

    /**
     * Create an instance of {@link WithdrawResponse }
     * 
     * @return
     *     the new instance of {@link WithdrawResponse }
     */
    public WithdrawResponse createWithdrawResponse() {
        return new WithdrawResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     * @return
     *     the new instance of {@link Login }
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     * @return
     *     the new instance of {@link LoginResponse }
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deposite }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Deposite }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.day1.example.com/", name = "Deposite")
    public JAXBElement<Deposite> createDeposite(Deposite value) {
        return new JAXBElement<>(_Deposite_QNAME, Deposite.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepositeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DepositeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.day1.example.com/", name = "DepositeResponse")
    public JAXBElement<DepositeResponse> createDepositeResponse(DepositeResponse value) {
        return new JAXBElement<>(_DepositeResponse_QNAME, DepositeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.day1.example.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewBalance }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ViewBalance }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.day1.example.com/", name = "ViewBalance")
    public JAXBElement<ViewBalance> createViewBalance(ViewBalance value) {
        return new JAXBElement<>(_ViewBalance_QNAME, ViewBalance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewBalanceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ViewBalanceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.day1.example.com/", name = "ViewBalanceResponse")
    public JAXBElement<ViewBalanceResponse> createViewBalanceResponse(ViewBalanceResponse value) {
        return new JAXBElement<>(_ViewBalanceResponse_QNAME, ViewBalanceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Withdraw }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Withdraw }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.day1.example.com/", name = "Withdraw")
    public JAXBElement<Withdraw> createWithdraw(Withdraw value) {
        return new JAXBElement<>(_Withdraw_QNAME, Withdraw.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WithdrawResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WithdrawResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.day1.example.com/", name = "WithdrawResponse")
    public JAXBElement<WithdrawResponse> createWithdrawResponse(WithdrawResponse value) {
        return new JAXBElement<>(_WithdrawResponse_QNAME, WithdrawResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.day1.example.com/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.day1.example.com/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

}
