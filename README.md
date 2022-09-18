# WhySoJava_2

![objects-objects-everywhere-1](https://user-images.githubusercontent.com/44260690/190913179-4712aa58-610c-47d1-8f53-b1e8218a6f58.jpg)

Summary (KeyNotes)
1. What is RMI in simple words ? - mechanism to remotely call java methods from different JVM

2. Can RMI utlize tls/ssl in communication ? - yes

3. Which tcp port is common for RMI registry ? - 1090

4. What is Java interface in simple words ? - blueprint for java methods

5. What to do if we can't find interface in the internet ? - search in internal confluence/bitbucket portals, ask politely developers for the interface, try to bruteforce methods and its parameters

6. How to redirect attacker's localhost to server locahost ? - port forwarding (using socat for example)

7. What is PATCH JEP-290 ?  -Patch JEP-290 introduced in 2016 enables filtering incoming serialized objects

  Fillters can be configured via:\
  • parameter jdk.serialFilter;\
  • parameter jdk.serialFilter in file conf/security/java.properties.

8. What is JMX in simple words ? - remote monitoring/managment of JVM

9. What are default Spring JMX credentials ? - admin:springsource


10. useful utility commands:

`sudo update-alternatives --config java`

`sudo update-alternatives --config javac`

`jar cvf YourJar.jar *`

`socat TCP-LISTEN:50651,fork TCP:192.168.233.1:50651`

References:

https://mogwailabs.de/en/blog/2019/03/attacking-java-rmi-services-after-jep-290/

https://docs.oracle.com/javase/8/docs/technotes/guides/rmi/rmi_security_recommendations.html

https://github.com/NickstaDB/BaRMIe

https://github.com/BishopFox/rmiscout

https://github.com/STMCyber/RmiTaste

https://github.com/STMCyber/RmiServerExample

https://github.com/qtc-de/remote-method-guesser

https://github.com/frohoff/ysoserial

https://github.com/nccgroup/jmxbf

https://github.com/mirchr/jmxshell
