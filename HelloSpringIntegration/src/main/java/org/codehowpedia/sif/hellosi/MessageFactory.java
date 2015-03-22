package org.codehowpedia.sif.hellosi;

public class MessageFactory {

    public String gateWayMessageEnricher(String msg) {
        return "Hi " + msg + ", Welcome to GATEWAY PROXY demo of Spring Integration!";
    }

    public String channelMessageEnricher(String msg) {
        return "Hello " + msg + ", Welcome to HELLO WORLD demo of Spring Integration!";
    }
}
