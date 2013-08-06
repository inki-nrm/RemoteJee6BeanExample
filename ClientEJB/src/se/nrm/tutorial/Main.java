package se.nrm.tutorial;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import se.nrm.tutorial.bean.service.AsyncRemote;

/**
 * Lägg jarar i den ordningen: 1) appserv-rt 2) gf-client 3) Java EE 6 API
 * Library
 *
 * @author ingimar
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Start: ");
        AsyncRemote bean = getBean();
        System.out.println("Response coming from bean :" + bean.businessMethod());
        System.out.println("END:");
    }

    private static AsyncRemote getBean() {
        AsyncRemote bean = null;
        try {
            Properties jndiProps = new Properties();
            jndiProps.put("java.naming.factory.initial", "com.sun.enterprise.naming.impl.SerialInitContextFactory");
            jndiProps.put("java.naming.factory.url.pkgs", "com.sun.enterprise.naming");
            jndiProps.put("java.naming.factory.state", "com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");
            jndiProps.setProperty("org.omg.CORBA.ORBInitialHost", "172.16.23.18" ); // "172.16.23.29" // 172.16.23.18
            Context ctx = new InitialContext(jndiProps);
            bean = (AsyncRemote) ctx.lookup("java:global/NRMBean/TestEnterpriseBean");
            
            return bean;
        } catch (NamingException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bean;
    }
}
