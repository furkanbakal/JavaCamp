package com.Hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hrms.hrms.business.abstracts.JobPositionService;
import com.Hrms.hrms.dataAccess.abstracts.JobsPositionDao;
import com.Hrms.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{

	
	private JobsPositionDao jobsPositionPasion;
	
	
	@Autowired
	public JobPositionManager(JobsPositionDao jobsPositionPasion) {
		super();
		this.jobsPositionPasion = jobsPositionPasion;
	}



	@Override 
	public List<JobPosition> getAll() {
		return this.jobsPositionPasion.findAll();
	}

}
