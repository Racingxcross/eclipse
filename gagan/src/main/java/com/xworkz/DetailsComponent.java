package com.xworkz;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.BeverageDTO;
import com.xworkz.dto.ChatsDto;
import com.xworkz.dto.EducationDTO;
import com.xworkz.dto.FamilyDTO;
import com.xworkz.dto.MobileDTO;

@Component
@RequestMapping("/")
public class DetailsComponent {

	public DetailsComponent() {
		System.out.println("created details component");
		// TODO Auto-generated constructor stub
	}

	@GetMapping("/email")
	public String onEmail(Model model) {

		System.out.println("running on email");
		model.addAttribute("email", "gagansv.xworkz@gmail.com");

		return "index.jsp";
	}

	@GetMapping("/mobile")
	public String onMobile(Model model) {

		System.out.println("running on mobile");
		model.addAttribute("num", 7996258738l);

		return "index.jsp";
	}

	@GetMapping("/aadhar")
	public String onAadhar(Model model) {

		System.out.println("running on Aadhar");
		model.addAttribute("aadhar", 6555741256358l);

		return "index.jsp";
	}

	@GetMapping("/age")
	public String onAge(Model model) {

		System.out.println("running on age");
		model.addAttribute("age", 24);

		return "index.jsp";
	}

	@GetMapping("/dob")
	public String onDob(Model model) {

		System.out.println("running on dob");
		model.addAttribute("dob", LocalDateTime.of(2000, 03, 04, 12, 00));

		return "index.jsp";
	}

	@GetMapping("/sal")
	public String onSal(Model model) {

		System.out.println("running on sal");
		model.addAttribute("sal", 500000.0);

		return "index.jsp";
	}

	@GetMapping("/best")
	public String obBest(Model model) {

		System.out.println("running on best");
		List<String> ref = new ArrayList<>();
		ref.add("ME");
		ref.add("MYSELF");
		ref.add("I");
		model.addAttribute("bestf", ref);
		return "index.jsp";
	}

	@GetMapping("/place")
	public String onPlace(Model model) {

		System.out.println("running on place");
		List<String> ref1 = new ArrayList<>();
		ref1.add("SIGANDOOR");
		ref1.add("MANDAGADDE");
		ref1.add("THIRTHALLI");
		model.addAttribute("pl", ref1);
		return "index.jsp";
	}

	@GetMapping("/skill")
	public String onSkill(Model model) {

		System.out.println("running on skills");
		List<String> ref2 = new ArrayList<>();
		ref2.add("JAVA");
		ref2.add("HTML");
		ref2.add("WEBTECHNOLOGY");
		model.addAttribute("skills", ref2);
		return "index.jsp";
	}

	@GetMapping("/edu")
	public String onEdu(Model model) {

		System.out.println("running on edu");
		EducationDTO dto = new EducationDTO();
		dto.setCollege("JNNCE");
		dto.setDegree("BE");
		dto.setFee(100000.0);
		dto.setLoc("BHADRAVATHI");
		dto.setName("GAGAN");
		dto.setFName("VISHWANATH");
		dto.setAge(22);
		dto.setDob(LocalDateTime.of(2000, 03, 04, 12, 00));
		model.addAttribute("edu", dto);
		return "index.jsp";
	}

	@GetMapping("/fam")
	public String onFam(Model model) {
		FamilyDTO dto1 = new FamilyDTO();
		dto1.setFamname("BESTAR");
		dto1.setFather("VISHWANATH");
		dto1.setMother("MANJULA");
		dto1.setLoc("BHADRAVATHI");
		dto1.setIncome(5000000);
		dto1.setHead("APPA");
		dto1.setJob("KPTCL");
		dto1.setGrandpa("SUBBANNA");
		model.addAttribute("fam", dto1);
		return "index.jsp";
	}

	@GetMapping("/mob")
	public String onMob(Model model) {
		MobileDTO dt = new MobileDTO();
		dt.setMname("OPPOF11PRO");
		dt.setMbrand("OPPO");
		dt.setCountry("CHINA");
		dt.setStorage(128);
		dt.setRam(6);
		model.addAttribute("mobi", dt);
		return "index.jsp";

	}

	@GetMapping("/bev")
	public String onBev(Model model) {
		BeverageDTO d = new BeverageDTO();
		d.setName("IMPERIALBLUE");
		d.setPrice(672);
		d.setMfg(LocalDate.of(2000, 03, 04));
		d.setAdd("yes");
		d.setAddHero("GAGAN");
		d.setMadeIn("INDIA");
		d.setColor("BROWN");
		d.setFlavour("MAST");
		model.addAttribute("bev", d);
		return "index.jsp";
	}

	@GetMapping("/chat")
	public String onChat(Model model) {
		ChatsDto d1 = new ChatsDto();
		d1.setName("panipuri");
		d1.setPrice(30);
		d1.setColor("green");
		d1.setFlavour("good");
		d1.setLocation("shimoga");
		d1.setMadeBy("puri");
		d1.setStartedIn(LocalDate.of(2010, 01, 10));
		d1.setCrowd("high");
		d1.setTypes(4);
		d1.setTime("evening");
		d1.setSpicy("medium");
		model.addAttribute("chat", d1);
		return "index.jsp";
	}

}
