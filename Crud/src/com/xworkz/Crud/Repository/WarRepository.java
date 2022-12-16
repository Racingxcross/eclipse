package com.xworkz.Crud.Repository;

import java.time.LocalDateTime;

import com.xworkz.Crud.dto.WarDTO;

public interface WarRepository  {
boolean create(WarDTO war);

default int total() {
	return 0;
	
}
WarDTO findByStartedBy(String startedBy);
WarDTO findByStartedByAndStartedWith(String StartedWith ,String startedBy);
WarDTO findByStartDateGreaterThanOrEqualTo(LocalDateTime date);
WarDTO findByStartDateLesserThanOrEqualTo(LocalDateTime date);
WarDTO findByStartAndEndDate(LocalDateTime start, LocalDateTime end);
}
