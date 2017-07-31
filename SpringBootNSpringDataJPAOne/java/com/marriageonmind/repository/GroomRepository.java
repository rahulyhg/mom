package com.marriageonmind.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marriageonmind.model.marriage.groom.Groom;
import com.marriageonmind.model.marriage.occupation.Occupation;

public interface GroomRepository extends JpaRepository<Groom, Long> {
List<Groom> findByOccupation(Occupation occupation);
}
