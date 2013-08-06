RemoteJee6BeanExample
=====================

This is a Netbeans Java EE6 Project, based on ANT.
Deployed in Glassfish.
Deploying a remote bean, dependency to the project 'servicedomain' ( where the interface resides ).
J2SE-client (JNDI), dependency to the project 'servicedomain'.
A single method is defined in the remote interface.

OBS 1 :  J2SE-client and Dependencies

Dependencies to the following 3 jar-files ( in that order )

(top) appserv-rt

(middle) gf-client

(buttom) Java EE 6 API Library

OBS 2: J2SE-Client and ip-nr of the machine where the EJB is deployed

Don't forget to change the ip-number ( set the ip-number to the nr where your bean resides )

Below -> my ip-address is '172.16.23.29', change to yours ....

 jndiProps.setProperty("org.omg.CORBA.ORBInitialHost", "172.16.23.29"); 
 
OBS 3 : User the 'project'-name slash 'bean'-name as it is in netbeans,
so if you refactor those name, be sure you change the name here as well.

bean = (AsyncRemote) ctx.lookup("java:global/NRMBean/TestEnterpriseBean");
 


