package com.candice.webproject.repositoty;

import com.candice.webproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by candice on 2018/4/13.
 */
@Repository
public interface UserRepositoty extends JpaRepository<User,Long> {

    @Query("select t from User t where t.userName = :userName")
    User findByUserName(@Param("userName") String userName);
}
