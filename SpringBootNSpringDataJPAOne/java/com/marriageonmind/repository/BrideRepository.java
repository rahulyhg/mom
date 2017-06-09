package com.marriageonmind.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marriageonmind.model.marriage.MarriagePerson;
import com.marriageonmind.model.marriage.Complexion;

public interface BrideRepository extends JpaRepository<MarriagePerson, Long> {
List<MarriagePerson> findByComplexion(Complexion complexion);
}
