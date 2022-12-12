package com.xworkz.Crud.Repository;

import com.xworkz.Crud.dto.IPL;

public interface IPLRepository {
boolean create(IPL ipl) throws Exception;

default int total() {
	return 0;
}


}
