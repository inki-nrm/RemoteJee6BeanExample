RemoteJee6BeanExample
=====================

This is a Netbeans Java EE6 Project, based on ANT.
Deployed in Glassfish.
Deploying a remote bean, dependency to the project 'servicedomain' ( where the interface resides ).
J2SE-client (JNDI), dependency to the project 'servicedomain'.
A single method is defined in the remote interface.

obs: J2SE-client.

Dependencies to the following 3 jar-files ( in that order )

(top) appserv-rt

(middle) gf-client

(buttom) Java EE 6 API Library

Don't forget to change the ip-number ( set the ip-number to the nr where your bean resides )

Below -> my ip-address is '172.16.23.29', change to yours ....

 jndiProps.setProperty("org.omg.CORBA.ORBInitialHost", "172.16.23.29"); 
 
 


