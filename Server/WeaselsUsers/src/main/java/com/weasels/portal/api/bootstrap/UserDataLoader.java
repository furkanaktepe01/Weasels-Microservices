package com.weasels.portal.api.bootstrap;

import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.weasels.portal.api.users.entity.Authority;
import com.weasels.portal.api.users.entity.Department;
import com.weasels.portal.api.users.entity.Mission;
import com.weasels.portal.api.users.entity.Team;
import com.weasels.portal.api.users.entity.User;
import com.weasels.portal.api.users.repo.UsersRepository;
import com.weasels.portal.api.utils.UserUtils;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Component
public class UserDataLoader implements CommandLineRunner {
	
	private final UsersRepository usersRepository;
	private final PasswordEncoder passwordEncoder;
	
	@Transactional
	private void loadUserData() {
		
		// - User Loading
		User ceo = createUser("Safa", "Karsli");
		
		User ds1 = createUser("Teresa", "Kelly");
		User ds2 = createUser("Ebony", "Hudson");
		
		User mm = createUser("Kara", "Romero");
		
		User tl1 = createUser("Anne", "Hayes");
		User emp1 = createUser("Orlando", "Pearson");
		User emp2 = createUser("Mamie", "Daniel");
		User emp3 = createUser("Jesus", "Colon");
		
		User tl2 = createUser("Ramon", "Powell");
		User emp4 = createUser("Doyle", "Chambers");
		User emp5 = createUser("Daryl", "Cohen");
		User emp6 = createUser("Elijah", "Cooper");
		
		log.info("Loading Users: " + usersRepository.count());
		
	}
	
	@Transactional
	private User createUser(String firstName, String lastName) {
		return usersRepository.save(User.builder()
				.userId(UUID.randomUUID().toString())
				.firstName(firstName)
				.lastName(lastName)
				.fullName(firstName + " " + lastName.toUpperCase())
				.sex("MALE")
				.nationality("USA")
				.country("USA")
				.address("2501 W Cheryll Ave\r\n"
						+ "Porterville, California(CA), 93257")
				.dateOfBirth("01/01/1989")
				.entranceDate("01/01/2020")
				.phoneNumber("(540) 639-5891")
				.email(firstName+ "."+ lastName+"@weasels.io")
				.password(passwordEncoder.encode("EMP12345678"))
				.education("ODTU")
				.salary(10000)
				.remote(0)
				.build());
	}

	@Override
	public void run(String... args) throws Exception {

		if(usersRepository.count() == 0) {
			loadUserData();
		}
		
		
	}

}
