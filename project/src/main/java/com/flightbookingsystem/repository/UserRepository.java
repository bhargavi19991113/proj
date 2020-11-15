package com.flightbookingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flightbookingsystem.model.User;


@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

}
