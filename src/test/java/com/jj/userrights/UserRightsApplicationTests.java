package com.jj.userrights;

import com.jj.userrights.controller.UserRightsController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class UserRightsApplicationTests {
    @Autowired
    UserRightApplication userRightApplication;
    @Autowired
    UserRightsController userRightsController;
	@Test
	void contextLoads() {
	    assertThat(userRightApplication).isNotNull();
	    assertThat(userRightsController).isNotNull();
	}

}
