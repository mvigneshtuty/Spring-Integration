
package org.codehowpedia.sif.hellosi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class GateWayProxyDemoApp {

    public static void main(String arg[]) {
        String cfg = "gateway-proxy-demo.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(cfg);
        HelloSpringService helloService = context.getBean("helloGateway", HelloSpringService.class);
        helloService.forwardMsg("Guest");
    }
}
