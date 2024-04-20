package com.classwork5.classwork5.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.classwork5.classwork5.model.Ce1Model;

@Repository
public interface Ce1Repo extends JpaRepository<Ce1Model,Integer> {
       @Query(value="select al from Ce1Model al order by ?1")
       List<Ce1Model> sorted(String str);
} 
