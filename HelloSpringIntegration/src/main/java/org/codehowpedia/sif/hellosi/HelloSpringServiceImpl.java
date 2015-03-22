
package org.codehowpedia.sif.hellosi;

/**
 * Hello world service implementation class
 *
 * forwards the message to default-request-channel configured in gateway
 */
public class HelloSpringServiceImpl implements HelloSpringService {

    public String forwardMsg(String msg) {
        System.out.println("forwarding your messaging for customization..hold tight..");
        return msg;
    }



}
