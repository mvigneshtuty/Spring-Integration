#Hello World Demo

This project contains two applications

1) HelloWorldDemoApp
2) GateWayProxyDemoApp

#HelloWorldDemoApp

The message flow for this demo is as follows:

`Message -> Channel -> ServiceActivator -> Channel -> stdout-channel-adapter` 

The message is passed through the input channel which is then given to service-activator.
From the service activator the message is directed to stdout-channel-adapter via channel.

The stdout-channel-adapter prints the message to console.

Execute the `HelloWorldDemoApp` in package `org.codehowpedia.sif.hellosi`

You should see the following output:

`Hello Guest, Welcome to HELLO WORLD demo of Spring Integration!`

#GateWayProxyDemoApp

The message flow is as follows:

`Message -> Gateway -> Channel -> ServiceActivator -> Channel -> stdout-channel-adapter` 

Here the only difference is the input message is passed on to channel via gateway.
Gateway will take care of sending the message to appropriate channel.

Execute the `GateWayProxyDemoApp` in package `org.codehowpedia.sif.hellosi`

You should see the following output:

`Hi Guest, Welcome to GATEWAY PROXY demo of Spring Integration!`




