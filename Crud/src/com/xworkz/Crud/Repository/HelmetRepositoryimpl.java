package com.xworkz.Crud.Repository;

import com.xworkz.Crud.dto.HelmetDTO;

public class HelmetRepositoryimpl implements HelmetRepository {

	private HelmetDTO dtoarray[] = new HelmetDTO[10];
	private int index = 0;

	@Override
	public boolean saveData(HelmetDTO dto) {
		if (index >= dtoarray.length) {
			System.out.println("array index is exceeded" + index);
		}
		dtoarray[index] = dto;
		index++;
		return true;
	}

}
