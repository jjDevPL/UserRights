package com.jj.userrights.dao;

import com.jj.userrights.domain.UserRights;
import com.jj.userrights.domain.UserRightsInput;

public interface UserRightsDao {
    UserRights getById(Long id);
    UserRights newRights(String rights);
}
