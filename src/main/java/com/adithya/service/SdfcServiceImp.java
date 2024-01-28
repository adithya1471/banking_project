package com.adithya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adithya.model.Sdfc;
import com.adithya.repo.SdfcRepo;

@Service
public class SdfcServiceImp implements SdfcService {
	
	@Autowired
	private SdfcRepo repo;

	@Override
	public Sdfc saveSdfc(Sdfc sdfc) {  
	 	   return repo.save(sdfc);   
	}
	@Override
	public Sdfc getSdfc(int acc_no) {
		Sdfc get = repo.findById(acc_no).get();
		return get;
	}
	@Override
	public Sdfc depositSdfc(Sdfc sdfc) {
		
	   
		Sdfc a=repo.findById(sdfc.getAcc_no()).get();
		String uname = a.getName();
		String pwd = a.getPsw();
		String accname=sdfc.getName();
		String pwdd = sdfc.getPsw();
		
		if(uname.equals(accname)&&pwd.equals(pwdd)) {
			double amount = a.getAmt();
			double amount1 = sdfc.getAmt();
			double namount = amount+amount1;
			a.setAmt(namount);
			
		}
		return repo.save(a);		
	}
	
	@Override
	public Sdfc withdrawSdfc(Sdfc sdfc) {
         
		Sdfc wd = repo.findById(sdfc.getAcc_no()).get();
		String uname = wd.getName();
		String pwd = wd.getPsw();
		String accname = sdfc.getName();
		String pwdd = sdfc.getPsw();
		
		if(uname.equals(accname)&&pwd.equals(pwdd))
		{
			double amt1 = sdfc.getAmt();
			double amt2 = wd.getAmt();
			double namount = amt2-amt1;
			wd.setAmt(namount);
		}
		return repo.save(wd);
	}

	@Override
	public Sdfc transferSdfc(Sdfc sdfc, Sdfc bank) {
		Sdfc db1 = repo.findById(sdfc.getAcc_no()).get();
		Sdfc db2 = repo.findById(bank.getAcc_no()).get();
		String uname = db1.getName();
	    String pwd = db1.getPsw();
	    String accname = sdfc.getName();
	    String pwdd = sdfc.getPsw();
	    double amt1 = sdfc.getAmt();
	    if(uname.equals(accname)&&pwd.equals(pwdd))
	    {
	    	double amt2 = db1.getAmt();
	    	double old_amt = amt2-amt1;
	    	db1.setAmt(old_amt); 
	    
	     
	        double amt = sdfc.getAmt();
	        double amt3 = db2.getAmt();
         	double new_amt = amt3+amt;
        	db2.setAmt(new_amt);
	    }
	       repo.save(db2);
		return repo.save(db1);
	}     
	@Override
	public void deleteSdfc(int acc_no) {
		
		
	}
	

	

}
