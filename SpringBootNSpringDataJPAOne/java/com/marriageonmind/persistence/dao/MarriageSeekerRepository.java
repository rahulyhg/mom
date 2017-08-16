package com.marriageonmind.persistence.dao;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marriageonmind.persistence.model.ManglikStatus;
import com.marriageonmind.persistence.model.MarriageSeeker;

public interface MarriageSeekerRepository extends JpaRepository<MarriageSeeker, Long> {
 Set<MarriageSeeker> findByManglikStatus(ManglikStatus manglikStatus);

}
