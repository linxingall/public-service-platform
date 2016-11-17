package com.ygjt.gdn.whm;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;

public class AppTests {
    public static String context            = "/";

    public static String webAppPath         = "src/main/webapp";

    public static String defaultsDescriptor = "src/test/resources/webdefault.xml";

    public static int    port               = 8001;

    public static void main(String[] args) {

        try {
            if (testPort(port)) {
                throw new BindException("The port:: [" + port + "]  " + "is already in Use...");
            }

            Server server = new Server(port);
            WebAppContext webContext = new WebAppContext(webAppPath, context);

            webContext.setDefaultsDescriptor(defaultsDescriptor);

            webContext.setClassLoader(Thread.currentThread().getContextClassLoader());

            server.setHandler(webContext);

            server.setStopAtShutdown(true);

            server.start();

        } catch (Exception e) {
            System.err.print(e.toString());
        }
    }
    private static boolean testPort(int port) {
        try {
            ServerSocket ss = new ServerSocket(port);
            ss.close();
            return false;
        } catch (IOException e) {
            return true;
        }
    }
}
