package com.weasels.portal.api.bootstrap;

import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.weasels.portal.api.users.data.Authority;
import com.weasels.portal.api.users.data.User;
import com.weasels.portal.api.users.data.UsersRepository;

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
		
		usersRepository.save(User.builder()
				.userId(UUID.randomUUID().toString())
				.firstName("CEO_First_name")
				.lastName("CEO_Last_name")
				.fullName("CEO_Full_name")
				.sex("(FE)MALE")
				.title("CEO")
				.department("-")
				.nationality("USA")
				.country("USA")
				.address("7179 Hickman Cemetery Rd\r\n"
						+ "Radford, Virginia(VA), 24141")
				.dateOfBirth("01/01/1989")
				.entranceDate("01/01/2020")
				.phoneNumber("(540) 639-5891")
				.email("CEO@weasels.io")
				.password(passwordEncoder.encode("{noop}CEO12345678"))
				.education("ODTU")
				.salary(10000)
				.remote(0)
				.role(Authority.builder().role("ROLE_CEO").build())
				.build());
		
		usersRepository.save(User.builder()
				.userId(UUID.randomUUID().toString())
				.firstName("DS_First_name")
				.lastName("DS_Last_name")
				.fullName("DS_Full_name")
				.sex("MALE")
				.title("DEPARTMENT SUPERVISOR")
				.department("-")
				.nationality("USA")
				.country("USA")
				.address("2501 W Cheryll Ave\r\n"
						+ "Porterville, California(CA), 93257")
				.dateOfBirth("01/01/1989")
				.entranceDate("01/01/2020")
				.phoneNumber("(540) 639-5891")
				.email("DS@weasels.io")
				.password(passwordEncoder.encode("DS12345678"))
				.education("ODTU")
				.salary(10000)
				.remote(0)
				.role(Authority.builder().role("ROLE_DEPARTMENT_SUPERVISOR").build())
				.build());
		
		usersRepository.save(User.builder()
				.userId(UUID.randomUUID().toString())
				.firstName("MM_First_name")
				.lastName("MM_Last_name")
				.fullName("MM_Full_name")
				.sex("MALE")
				.title("MISSION MANAGER")
				.department("-")
				.nationality("USA")
				.country("USA")
				.address("2501 W Cheryll Ave\r\n"
						+ "Porterville, California(CA), 93257")
				.dateOfBirth("01/01/1989")
				.entranceDate("01/01/2020")
				.phoneNumber("(540) 639-5891")
				.email("MM@weasels.io")
				.password(passwordEncoder.encode("MM12345678"))
				.education("ODTU")
				.salary(10000)
				.remote(0)
				.role(Authority.builder().role("ROLE_MISSION_MANAGER").build())
				.build());
		
		usersRepository.save(User.builder()
				.userId(UUID.randomUUID().toString())
				.firstName("TL_First_name")
				.lastName("TL_Last_name")
				.fullName("TL_Full_name")
				.sex("MALE")
				.title("TEAM LEAD")
				.department("-")
				.nationality("USA")
				.country("USA")
				.address("2501 W Cheryll Ave\r\n"
						+ "Porterville, California(CA), 93257")
				.dateOfBirth("01/01/1989")
				.entranceDate("01/01/2020")
				.phoneNumber("(540) 639-5891")
				.email("TL@weasels.io")
				.password(passwordEncoder.encode("TL12345678"))
				.education("ODTU")
				.salary(10000)
				.remote(0)
				.role(Authority.builder().role("ROLE_TEAM_LEAD").build())
				.build());
		
		usersRepository.save(User.builder()
				.userId(UUID.randomUUID().toString())
				.firstName("EMP_First_name")
				.lastName("EMP_Last_name")
				.fullName("EMP_Full_name")
				.sex("MALE")
				.title("DEPARTMENT SUPERVISOR")
				.department("-")
				.nationality("USA")
				.country("USA")
				.address("2501 W Cheryll Ave\r\n"
						+ "Porterville, California(CA), 93257")
				.dateOfBirth("01/01/1989")
				.entranceDate("01/01/2020")
				.phoneNumber("(540) 639-5891")
				.email("EMP@weasels.io")
				.password(passwordEncoder.encode("EMP12345678"))
				.education("ODTU")
				.salary(10000)
				.remote(0)
				.role(Authority.builder().role("ROLE_EMPLOYEE").build())
				.build());
		
		log.info("Loading Users: " + usersRepository.count());
		
	}

	@Override
	public void run(String... args) throws Exception {

		loadUserData();
		
	}

}
