package com.jj.userrights.controller;

import com.jj.userrights.dao.UserRightsDao;
import com.jj.userrights.domain.UserRights;
/*import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;*/
import com.jj.userrights.domain.UserRightsInput;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.PostConstruct;

@Controller
public class UserRightsController {

    private UserRightsDao userRightsDao;

    public UserRightsController(UserRightsDao userRightsDao) {
        this.userRightsDao = userRightsDao;
    }

    @QueryMapping
    public UserRights userDefault() {
        return new UserRights(1L,"nameDefault");
    }
    @QueryMapping
    public String greeting() {
        return "done";
    }
    @MutationMapping
    public UserRights newRights(@Argument("input") String name) {
        return userRightsDao.newRights(name);
    }
}
