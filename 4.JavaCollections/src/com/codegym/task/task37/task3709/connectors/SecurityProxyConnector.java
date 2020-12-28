package com.codegym.task.task37.task3709.connectors;

import com.codegym.task.task37.task3709.security.SecurityChecker;
import com.codegym.task.task37.task3709.security.SecurityCheckerImpl;

public class SecurityProxyConnector implements Connector {

    SecurityChecker securityChecker;
    SimpleConnector simpleConnector;

    public SecurityProxyConnector(String s) {
         simpleConnector = new SimpleConnector(s);
         securityChecker = new SecurityCheckerImpl();

    }

    @Override
    public void connect() {
        boolean b = securityChecker.performSecurityCheck();
        if(b)
            simpleConnector.connect();

    }
}
