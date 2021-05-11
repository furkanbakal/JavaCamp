package com.Hrms.hrms.business.abstracts;

import java.util.List;

import com.Hrms.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();
}
