package com.kuldeep.Relocator.ServiceRecord;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kuldeep.Relocator.Services.ServiceTheme;

public interface ServiceRecordRepository extends JpaRepository<ServiceRecord,Long> {
	
	List<ServiceRecord> findAllByUserId(long id);

}
