package com.oracle.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oracle.model.Image;

@Repository
public interface ImageDao extends JpaRepository<Image, Long> {

}
