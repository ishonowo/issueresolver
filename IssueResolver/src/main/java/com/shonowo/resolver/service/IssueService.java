package com.shonowo.resolver.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shonowo.resolver.model.Issue;
import com.shonowo.resolver.repo.IssueRepo;

@Service
public class IssueService {

	@Autowired
	private IssueRepo issueRepo;
	
	public List<Issue> getAll() {
		return issueRepo.findAll();
	}
	
	public Issue getATMIssue(String terminalId,String issue, String logger,String loggerEmail,String loggerPhoneNo) {
		
		Date date = new Date();
		
/*		//establish connection to the database
		Configuration config= new Configuration().configure().addAnnotatedClass(Issue.class);
		ServiceRegistry registry=new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory sf=config.buildSessionFactory(registry);
		Session session=sf.openSession();
		
		//begin transaction
		session.beginTransaction();
		
		Query q1=session.createQuery("select b.contact, a.branchemail, c.branch_name, c.ATM_name, a.PhysicalAddress,  "+
				" c.Vendor from [BranchAddresses] a join [VendorTerminals] c "+
				  " on a.solid=substring(c.terminal_id,5,3) "+
				  " join [VendorContacts] b "+
				  " on b.Vendor=c.VENDOR "+
				  " where c.TERMINAL_ID = :Terminal_ID" );
		
		q1.setParameter("Terminal_ID",terminalId);
		String[] a = (String[]) q1.uniqueResult();*/
		
		String[] a = new String[10];

		Issue atmIssue= new Issue(terminalId,issue, logger, loggerEmail,loggerPhoneNo, date,"ATMSupport@fidelitybank.ng",a[0], a[1], a[2], a[3], a[4], a[5]);
		
		//end transaction
		//session.getTransaction().commit();
		
		return atmIssue;
	}
	
	public void save(Issue issue) {
		try {
			issueRepo.save(issue);
		}catch(Exception e) {
			System.out.println("Unable to save atm issue into the database -> "+e.getMessage());
		}
	}
}
