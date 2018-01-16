package com.cgi.training.client.rest.get;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
@SuppressWarnings("deprecation")
public class RestClientGetDemo {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		
		String envHostname;
		String envPort;
		envPort = System.getProperty("port");
		envHostname = System.getProperty("hostname");
		
		if(envPort == null) {
			envPort = "8080";
		}
		
		if (envHostname == null) {
			envHostname = "localhost";
		}
		String hostAndPort = null;
		hostAndPort = envHostname+":"+envPort;
		System.out.println("hostname is " + envHostname + ", port is " + envPort);
		System.out.println();
		
		//HttpClient client = new DefaultHttpClient();
		DefaultHttpClient client = new DefaultHttpClient();
		
		for(int i=1; i<11; i++) {
			
			//DefaultHttpClient client = new DefaultHttpClient();
			
			System.out.println("Performing a GET request with ssnID " +i);
			HttpGet request = new HttpGet("http://"+hostAndPort+"/restfulproj/webapi/users/"+String.valueOf(i));
			HttpResponse response = client.execute(request);
			System.out.println("Response received for ssnID " +i +" is:");
			BufferedReader rd = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));
			String lineRead = null;
			while ((lineRead = rd.readLine()) != null) {
				System.out.println(lineRead);
				System.out.println();
			}
			//client.close();
		}
		client.close();
	}
}