package net.zm123.serveradmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableAdminServer
@SpringBootApplication
public class ServerAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerAdminApplication.class, args);
    }

}
