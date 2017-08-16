package com.marriageonmind.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marriageonmind.persistence.model.Bride;

public interface BrideRepository extends JpaRepository<Bride, Long> {
//List<Bride> findByOccupation(Occupation occupation);

}
