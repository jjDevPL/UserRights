package com.jj.userrights.dao;

import com.jj.userrights.domain.UserRights;
import com.jj.userrights.domain.UserRightsInput;
import com.jj.userrights.respositories.UserRightsRepository;
import org.springframework.stereotype.Component;

import java.util.Random;
@Component
public class UserRightsDaoImpl implements UserRightsDao {
/*    private UserRightsRepository userRightsRepository;

    public UserRightsDaoImpl(UserRightsRepository userRightsRepository) {
        this.userRightsRepository = userRightsRepository;
    }*/

    @Override
    public UserRights getById(Long id) {
        return new UserRights();/*userRightsRepository.findById(id).orElseThrow(NotFoundException::new);*/
    }

    @Override
    public UserRights newRights(String rights) {
        return convert(rights);
    }

    UserRights convert(String  input) {
        UserRights toReturn= new UserRights();
        toReturn.setName(input);
        toReturn.setId(12344l);
        return  toReturn;
    }
}
