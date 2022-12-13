package com.xworkz.Crud.boot;

import java.time.LocalDateTime;

import com.xworkz.Crud.Repository.IPLRepository;
import com.xworkz.Crud.Repository.IPLRepositoryImpl;
import com.xworkz.Crud.dto.IPL;

public class IPLRunner {
	public static void main(String[] args) throws Exception {
		IPLRepository repository = new IPLRepositoryImpl();

		IPL dto = new IPL();
		dto.setTeamName("RCB");
		dto.setCaptainName("Kohli");
		dto.setOwnerAlive(true);
		dto.setPurse(85);
		dto.setWins(107);
		dto.setDefeats(113);
		dto.setCreatedBy("SYSTEM");
		dto.setCreatedDate(LocalDateTime.now());
		repository.create(dto);
		
		
		IPL dto2 = new IPL();
		dto2.setTeamName("MI");
		dto2.setCaptainName("Rohit");
		dto2.setOwnerAlive(true);
		dto2.setPurse(1);
		dto2.setWins(107);
		dto2.setDefeats(113);
		dto2.setCreatedBy("Gagan");
		dto2.setCreatedDate(LocalDateTime.of(2022, 12, 12, 14, 27));
		dto2.setCreatedBy("gagan2");
		dto2.setCreatedDate(LocalDateTime.now());
		repository.create(dto2);
		System.out.println("\n");

		IPL dto3 = new IPL();
		dto3.setTeamName("SRH");
		dto3.setCaptainName("Bhuvaneshwar Kumar");
		dto3.setOwnerAlive(true);
		dto3.setPurse(10);
		dto3.setWins(105);
		dto3.setDefeats(54);
		dto3.setCreatedBy("gagan");
		dto3.setCreatedDate(LocalDateTime.of(2022, 12, 12, 14, 27));
		dto3.setCreatedBy("gagan1");
		dto3.setCreatedDate(LocalDateTime.now());
		repository.create(dto3);
		System.out.println("\n");

		IPL dto4 = new IPL();
		dto4.setTeamName("Delhi Captals");
		dto4.setCaptainName("Rishab Panth");
		dto4.setOwnerAlive(true);
		dto4.setPurse(18);
		dto4.setWins(107);
		dto4.setDefeats(113);
		dto4.setCreatedBy("gagan");
		dto4.setCreatedDate(LocalDateTime.of(2022, 12, 12, 14, 27));
		dto4.setCreatedBy("gagan1");
		dto4.setCreatedDate(LocalDateTime.now());
		repository.create(dto4);
		System.out.println("\n");

		IPL dto5 = new IPL();
		dto5.setTeamName("KKR");
		dto5.setCaptainName("Shreyas Iyer");
		dto5.setOwnerAlive(true);
		dto5.setPurse(18);
		dto5.setWins(107);
		dto5.setDefeats(113);
		dto5.setCreatedBy("gagan");
		dto5.setCreatedDate(LocalDateTime.of(2022, 12, 12, 14, 27));
		dto5.setCreatedBy("gagan1");
		dto5.setCreatedDate(LocalDateTime.now());
		repository.create(dto5);
		System.out.println("\n");

		IPL dto6 = new IPL();
		dto6.setTeamName("RR");
		dto6.setCaptainName("Sanju Samson");
		dto6.setOwnerAlive(true);
		dto6.setPurse(18);
		dto6.setWins(107);
		dto6.setDefeats(113);
		dto6.setCreatedBy("gagan");
		dto6.setCreatedDate(LocalDateTime.of(2022, 12, 12, 14, 27));
		dto6.setCreatedBy("gagan1");
		dto6.setCreatedDate(LocalDateTime.now());
		repository.create(dto6);
		System.out.println("\n");

		IPL dto7 = new IPL();
		dto7.setTeamName("Punjab Kings");
		dto7.setCaptainName("Virat");
		dto7.setOwnerAlive(true);
		dto7.setPurse(18);
		dto7.setWins(107);
		dto7.setDefeats(113);
		dto7.setCreatedBy("gagan");
		dto7.setCreatedDate(LocalDateTime.of(2022, 12, 12, 14, 27));
		dto7.setCreatedBy("gagan1");
		dto7.setCreatedDate(LocalDateTime.now());
		repository.create(dto7);
		System.out.println("\n");

		IPL dto8 = new IPL();
		dto8.setTeamName("CSK");
		dto8.setCaptainName("Ravindra Jadeja");
		dto8.setOwnerAlive(true);
		dto8.setPurse(18);
		dto8.setWins(107);
		dto8.setDefeats(113);
		dto8.setCreatedBy("gagan");
		dto8.setCreatedDate(LocalDateTime.of(2022, 12, 12, 14, 27));
		dto8.setCreatedBy("gagan1");
		dto8.setCreatedDate(LocalDateTime.now());
		repository.create(dto8);
		System.out.println("\n");

		IPL dto9 = new IPL();
		dto9.setTeamName("Lucknow Super Giants");
		dto9.setCaptainName("KL Rahul");
		dto9.setOwnerAlive(true);
		dto9.setPurse(18);
		dto9.setWins(107);
		dto9.setDefeats(113);
		dto9.setCreatedBy("gagan");
		dto9.setCreatedDate(LocalDateTime.of(2022, 12, 12, 14, 27));
		dto9.setCreatedBy("gagan1");
		dto9.setCreatedDate(LocalDateTime.now());
		repository.create(dto9);
		System.out.println("\n");

		IPL dto10 = new IPL();
		dto10.setTeamName("Gujrat Titans");
		dto10.setCaptainName("Hardik Pandya");
		dto10.setOwnerAlive(true);
		dto10.setPurse(18);
		dto10.setWins(107);
		dto10.setDefeats(113);
		dto10.setCreatedBy("gagan");
		dto10.setCreatedDate(LocalDateTime.of(2022, 12, 12, 14, 27));
		dto10.setCreatedBy("gagan1");
		dto10.setCreatedDate(LocalDateTime.now());
		repository.create(dto10);
		System.out.println("\n");

		IPL dto11 = new IPL();
		dto11.setTeamName("Kochi Tuskers Kerala");
		dto11.setCaptainName("Mahela Jayavardene");
		dto11.setOwnerAlive(true);
		dto11.setPurse(18);
		dto11.setWins(107);
		dto11.setDefeats(113);
		dto11.setCreatedBy("gagan1");
		dto11.setCreatedDate(LocalDateTime.of(2022, 12, 12, 14, 27));
		dto11.setCreatedBy("gagan");
		dto11.setCreatedDate(LocalDateTime.now());
		repository.create(dto11);
		System.out.println("\n");
		repository.create(dto);
	}

}
