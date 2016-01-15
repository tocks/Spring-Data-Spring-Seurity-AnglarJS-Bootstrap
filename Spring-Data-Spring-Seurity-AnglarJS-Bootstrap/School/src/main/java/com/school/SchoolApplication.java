package com.school;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.school.dao.EtudiantRepository;
import com.school.entities.Etudiant;

@SpringBootApplication
public class SchoolApplication {

	public static void main(String[] args) throws ParseException {
		ApplicationContext ctx = SpringApplication.run(SchoolApplication.class, args);
		EtudiantRepository etudiantRepository = ctx.getBean(EtudiantRepository.class);

		/**DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		etudiantRepository.save(new Etudiant("Tocka", "KOITA", df.parse("1981-10-17")));
		etudiantRepository.save(new Etudiant("Nayé", "DiAGANA", df.parse("1991-10-08")));
		etudiantRepository.save(new Etudiant("Cheikna", "KOITA", df.parse("2015-04-13")));
		etudiantRepository.save(new Etudiant("Boubacar", "KOITA", df.parse("1981-10-17")));
		etudiantRepository.save(new Etudiant("Fatima", "DIAGANA", df.parse("1991-10-08")));
		etudiantRepository.save(new Etudiant("Cheikhou", "DIAGANA", df.parse("1981-10-17")));

		List<Etudiant> etds = etudiantRepository.findAll();
		etds.forEach(e->System.out.println(e.getNom()));
		*/
	}
}
