package com.example.event.management.project.symboisys.demo.event.management.project.symboisys.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.event.management.project.symboisys.demo.event.management.project.symboisys.entity.AddVenue;
@Repository
public interface AddVenueRepository extends JpaRepository<AddVenue, Integer> {

	
	
}
