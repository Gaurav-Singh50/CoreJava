package com.nagarro.product_catalogue;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.nagarro.product_catalogue.model.Role;
import com.nagarro.product_catalogue.model.User;
import com.nagarro.product_catalogue.model.UserRole;
import com.nagarro.product_catalogue.service.UserService;

@SpringBootApplication
public class ProductCatalogueApplication implements CommandLineRunner{

	@Autowired
	private UserService userService;
	
	@Autowired
	private BCryptPasswordEncoder BcryptPasswordEncoder;
	
	public static void main(String[] args) {
		
		
		SpringApplication.run(ProductCatalogueApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("------------------Start");
//		User user=new User();
//		user.setFirstName("Simran");
//		user.setLastName("Krishna");
//		user.setUsername("simmo786");
//		user.setPassword(this.BcryptPasswordEncoder.encode("111"));
//		user.setEmail("simi123@gmail.com");
//		user.setPhone("8889998880");
//		
//		Role role=new Role();
//		role.setRoleId(01L);
//		role.setRolename("Admin");
//		
//		Set<UserRole> userRoleSet=new HashSet<>();
//		UserRole userRole=new UserRole();
//		userRole.setRole(role);
//		userRole.setUser(user);
//		userRoleSet.add(userRole);
//		
//		User user1=this.userService.createUser(user, userRoleSet);
//		System.out.println(user1.getFirstName());
		
	}

}
