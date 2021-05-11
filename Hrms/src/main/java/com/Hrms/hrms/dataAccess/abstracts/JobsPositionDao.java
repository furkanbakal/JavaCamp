package com.Hrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Hrms.hrms.entities.concretes.JobPosition;

public interface JobsPositionDao extends JpaRepository<JobPosition, Integer>{

}
