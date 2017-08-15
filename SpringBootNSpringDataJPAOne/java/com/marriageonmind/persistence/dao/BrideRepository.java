package com.marriageonmind.persistence.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marriageonmind.model.marriage.bride.Bride;
import com.marriageonmind.model.marriage.groom.Groom;
import com.marriageonmind.model.marriage.occupation.Occupation;

public interface BrideRepository extends JpaRepository<Bride, Long> {
List<Bride> findByOccupation(Occupation occupation);

}
