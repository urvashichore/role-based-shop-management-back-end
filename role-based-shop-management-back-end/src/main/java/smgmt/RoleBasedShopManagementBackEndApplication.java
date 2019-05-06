package smgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RoleBasedShopManagementBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoleBasedShopManagementBackEndApplication.class, args);
	}

}
