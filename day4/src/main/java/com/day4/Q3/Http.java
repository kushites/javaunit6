package com.day4.Q3;

public class Http {

	public static void main(String[] args) {
		System.out.println("Ans3:-A simple request message from a client computer consists of the following components:\r\n"
				+ "\r\n"
				+ "1.A request line to get a required resource, for example a request GET /content/page1.html is requesting a resource called /content/page1.html from the server.\r\n"
				+ "2.Headers (Example – Accept-Language: EN).\r\n"
				+ "3.An empty line.\r\n"
				+ "4.A message body which is optional.\r\n"
				+ "5.All the lines should end with a carriage return and line feed. The empty line should only contains carriage return and line feed without any spaces."
				+ "\n\n"
				+ "Http header Request:-An HTTP request header primarily enables a user in accessing a website. Each time a user website or webpage in a browser, an HTTP request header is generated by the browser and is sent to the website / Web server. Typically, the information within the HTTP request header is in form of plain text record of data/page request made by the user. Some of the information within an HTTP request header includes:\r\n"
				+ "\r\n"
				+ "1.Source IP address and port number\r\n"
				+ "2.Requested URI (data or web page)\r\n"
				+ "3.Host (Destination website or web server)\r\n"
				+ "4.Type of data the browser will accept in return (text, html, xml etc)\r\n"
				+ "5.User’s browser type (Mozilla, Chrome, IE) so that the Web server can send compatible data\r\n"
				+ "In response, the Web server/host sends back an HTTP response header containing the requested data.");

	}

}