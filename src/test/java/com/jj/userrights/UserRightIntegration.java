package com.jj.userrights;

import com.jj.userrights.controller.RestCtrl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserRightIntegration {
    @Value("${local.server.port}")
    private int port;
    @Autowired
    private TestRestTemplate restTemplate;

/*    private WebTestClient webClient;*/

    @BeforeEach
    public void set(ApplicationContext context) {
    }

    @Test
    public void basicLoad() {
        String respo  = this.restTemplate.getForObject("http://localhost:" + port + "/alive",String.class);
            assertThat(respo).isEqualTo("Alive");
    }
    @Test
    public void withWebClient() {
        WebTestClient webClient =
            WebTestClient.bindToController(new RestCtrl()).build();
        webClient.get().uri("http://localhost:" + port + "/alive").exchange().expectBody(String.class).isEqualTo("Alive");
    }
}
