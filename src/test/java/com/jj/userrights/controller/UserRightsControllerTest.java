package com.jj.userrights.controller;

import com.jayway.jsonpath.PathNotFoundException;
import com.jj.userrights.dao.UserRightsDao;
import com.jj.userrights.dao.UserRightsDaoImpl;
import com.jj.userrights.domain.UserRights;
import graphql.GraphQLException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.GraphQlTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.graphql.test.tester.GraphQlTester;
import org.springframework.graphql.test.tester.WebGraphQlTester;
import org.springframework.test.web.reactive.server.WebTestClient;
/*import org.springframework.graphql.test.tester.WebGraphQlTester;*/

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

/*@SpringBootTest*//*(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)*//*
@AutoConfigureGraphQlTester*/
/*@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)*/
/*@AutoConfigureGraphQlTester*/
@GraphQlTest(UserRightsController.class)
/*@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)*/
class UserRightsControllerTest {
    @Autowired
    private GraphQlTester graphQlTester;
    @MockBean
    private UserRightsDao userRightsDao;

    @BeforeEach
    void setup() {
       /* this.springFramework = new Project("spring-framework", "Spring Framework",
            "http://github.com/spring-projects/spring-framework", ProjectStatus.ACTIVE);
        this.latestRelease = new Release(this.springFramework, "5.3.0", ReleaseStatus.GENERAL_AVAILABILITY);*/
    }
    /*       WebTestClient webClient =
               WebTestClient.bindToController(new UserRightsController()).build();
           GraphQlTester tester = WebGraphQlTester.create(webClient);*/
    @Test
    void getDefault() {
        assertThat(graphQlTester.query(
                "        {userDefault {\n" +
                        "    id\n" +
                        "    name\n" +
                         "}}\n").execute()
            .path("userDefault.id").entity(Integer.class).get()).isEqualTo(1);
        assertThat(graphQlTester.queryName("default").execute().path("userDefault.name").entity(String.class).get()).isEqualTo("nameDefault");
    }

    @Test
    public void mutationTest() {
        UserRights returned = new UserRights();
        returned.setId(12344l);
        returned.setName("blblblb");
        given(userRightsDao.newRights("blblblb")).willReturn(returned);
        assertThat(graphQlTester.queryName("newRights").execute().path("newRights.id").entity(Integer.class).get()).isEqualTo(12344l);
    }
    @Test
    public void mutationExceptionTest() {
        UserRights returned = new UserRights();
        returned.setId(12344l);
        returned.setName("blblblb");
        given(userRightsDao.newRights(null)).willReturn(returned);
        graphQlTester.queryName("newRights").execute();
    }


    @Test
    void greetingTest() {
        assertThat(graphQlTester.query("query {greeting}").execute()).isNotNull();
        assertThat(graphQlTester.query("query {greeting}").execute().path("greeting").entity(String.class).get()).isEqualTo("done");
        assertThat(graphQlTester.queryName("greetings").execute().path("greeting").entity(String.class).get()).isEqualTo("done");
    }
}
