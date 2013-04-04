package cn.smartlab.net;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Properties;
import java.util.logging.Logger;

import org.glassfish.grizzly.filterchain.FilterChainBuilder;
import org.glassfish.grizzly.filterchain.TransportFilter;
import org.glassfish.grizzly.nio.transport.TCPNIOTransport;
import org.glassfish.grizzly.nio.transport.TCPNIOTransportBuilder;
import org.glassfish.grizzly.utils.StringFilter;

public class DataBaseServer {

	private static final Logger logger = Logger.getLogger(DataBaseServer.class.getName());
	/**
	 * @param args
	 */
	
	private static String dbIP = null;
	private static String dbPort = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a FilterChain using FilterChainBuilder
        FilterChainBuilder filterChainBuilder = FilterChainBuilder.stateless();

        // Add TransportFilter, which is responsible
        // for reading and writing data to the connection
        filterChainBuilder.add(new TransportFilter());

        // StringFilter is responsible for Buffer <-> String conversion
//        filterChainBuilder.add(new StringFilter(Charset.forName("UTF-8")));
        filterChainBuilder.add(new SMARTFilter());

        // EchoFilter is responsible for echoing received messages
        filterChainBuilder.add(new DataBaseServerFilter());
        
        // Create TCP transport
        final TCPNIOTransport transport =
                TCPNIOTransportBuilder.newInstance().build();
        
        transport.setProcessor(filterChainBuilder.build());

        try {
        	Prop();// 获取IP和端口
            // binding transport to start listen on certain host and port
            transport.bind(dbIP, Integer.parseInt(dbPort));

            // start the transport
            transport.start();

            logger.info("Press any key to stop the DataBaseServer...");
            System.in.read();
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
            logger.info("Stopping DataBaseServerTransport...");
            // stop the transport
            try {
				transport.stop();
				logger.info("Stopped DataBaseServerTransport...");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }

	}
	
	// IP and Port
	private static void Prop() throws FileNotFoundException, IOException {
		FileInputStream in = new FileInputStream(
				"C:/Workspaces/MyEclipse 8.5/Listen/bin/db.properties");
		Properties dbconfig = new Properties();
		dbconfig.load(in);
		dbIP = dbconfig.getProperty("dbIP");
		dbPort = dbconfig.getProperty("dbPort");
	}

}
