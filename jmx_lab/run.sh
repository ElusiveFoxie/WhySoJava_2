#!/bin/sh
java -Dcom.sun.management.jmxremote \
     -Dcom.sun.management.jmxremote.authenticate=true \
     -Dcom.sun.management.jmxremote.ssl=false \
     -Dcom.sun.management.jmxremote.local.only=true\
     -Dcom.sun.management.jmxremote.port=1617\
     -Djava.rmi.server.hostname=127.0.0.1\
     SimpleAgent
#-Djava.rmi.server.hostname=192.168.43.229\

