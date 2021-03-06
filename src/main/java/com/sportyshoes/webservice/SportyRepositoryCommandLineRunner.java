package com.sportyshoes.webservice;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sportyshoes.webservice.model.Products;
import com.sportyshoes.webservice.model.PurchaseReport;
import com.sportyshoes.webservice.model.User;
import com.sportyshoes.webservice.repository.ProductsRepository;
import com.sportyshoes.webservice.repository.PurchaseReportRepository;
import com.sportyshoes.webservice.repository.UserRepository;

@Component
public class SportyRepositoryCommandLineRunner implements CommandLineRunner{

	private static final Logger log = 
			LoggerFactory.getLogger(SportyRepositoryCommandLineRunner.class);
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ProductsRepository productRepository;
	
	@Autowired
	private PurchaseReportRepository purchaseReportRepository;
	
	@Override
	public void run(String... arg0) throws Exception {
		User user1 = new User("John", "Admin");
		userRepository.save(user1);
		log.info("New User is created : " + user1);
		
		User user2 = new User("Thomas", "Customer");
		userRepository.save(user2);
		log.info("New User is created : " + user2);
		
		User user3 = new User("Kumar", "Customer");
		userRepository.save(user3);
		log.info("New User is created : " + user3);
		
		User user4 = new User("David", "Customer");
		userRepository.save(user4);
		log.info("New User is created : " + user4);
		
		User user5 = new User("Rahman", "Customer");
		userRepository.save(user5);
		log.info("New User is created : " + user5);
		
		User user6 = new User("Smith", "Staff");
		userRepository.save(user6);
		log.info("New User is created : " + user6);

		List<User> users = userRepository.findAll();
		log.info("All Users : " + users);					
		

		Products pd1 = new Products("Running Shoes", 3, "Adidas");
		productRepository.save(pd1);
		log.info("New Shoe Product is created : " + pd1);
		
		Products pd2 = new Products("Formal Shoes", 2, "Rebok");
		productRepository.save(pd2);
		log.info("New Shoe Product is created : " + pd2);
		
		Products pd3 = new Products("Indoor Shoes", 5, "Puma");
		productRepository.save(pd3);
		log.info("New Shoe Product is created : " + pd3);
		
		Products pd4 = new Products("Office Shoes", 10, "INJK");
		productRepository.save(pd4);
		log.info("New Shoe Product is created : " + pd4);

		List<Products> products = productRepository.findAll();
		log.info("All Products : " + products);		
		
		
		PurchaseReport pr1 = new PurchaseReport("Running Shoes", "03-11-2022", user1, pd1);
		purchaseReportRepository.save(pr1);
		log.info("New PurchaseReport is created : " + pr1);
		
		PurchaseReport pr2 = new PurchaseReport("Office Shoes", "05-06-2022", user2, pd2);
		purchaseReportRepository.save(pr2);
		log.info("New PurchaseReport is created : " + pr2);

		PurchaseReport pr3 = new PurchaseReport("Running Shoes", "12-12-2021", user3, pd3);
		purchaseReportRepository.save(pr3);
		log.info("New PurchaseReport is created : " + pr3);
		
		PurchaseReport pr4 = new PurchaseReport("Party Shoes", "02-02-2022", user4, pd4);
		purchaseReportRepository.save(pr4);
		log.info("New PurchaseReport is created : " + pr4);

		
		List<PurchaseReport> reports = purchaseReportRepository.findAll();
		log.info("All PurchaseReports : " + reports);	
	}
	
}