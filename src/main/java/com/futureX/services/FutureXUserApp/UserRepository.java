package com.futureX.services.FutureXUserApp;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User,BigInteger> {
    List<User> findByUserid(BigInteger id);
    List<User> findByCourseid(BigInteger id);
}
