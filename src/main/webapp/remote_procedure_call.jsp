<%@ page import="java.io.*" %>
<%@ page import="com.baidu.adxgate.remote.*" %>

<%
    InputStream is = new FileInputStream("/Users/berryjam/Documents/workspace/Test/target/classes/TestClass.class");
    byte[] b = new byte[is.available()];
    is.read(b);
    is.close();

    out.println("<textarea style='width:1000;height=800'>");
    out.println(JavaClassExecuter.execute(b));
    out.println("</textarea>");
%>