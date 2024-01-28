package com.adithya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.adithya.model.Sdfc;
import com.adithya.service.SdfcServiceImp;

@Controller
public class SdfController {

	@Autowired
	SdfcServiceImp service;
	
	@RequestMapping("/")
	public String homePage()
	{
		return "home"; 
	}
	@RequestMapping("/newAccount")
	public String newAccountForm(Sdfc sdfc){

		return "register";
	}
	@RequestMapping("/register")
	public String registerForm(Sdfc sdfc)
	{
		 if(sdfc.getPsw().equals(sdfc.getCon_psw())) {
			 Sdfc s1 = service.saveSdfc(sdfc);
				return "success";
		 }
		 else {
			 return"erreo";
		 }	
	}
	@RequestMapping("/balance1")
	public String balanceForm(Sdfc sdfc)
	{ 
				return "balance";
	}
	@RequestMapping("/viewData")
	public String viewForm(@RequestParam int acc_no, ModelMap model,Sdfc sdfc)
	{
		Sdfc sd = service.getSdfc(sdfc.getAcc_no());
		if(sd.getPsw().equals(sdfc.getPsw()) && sdfc.getName().equals(sd.getName()))
		{
		   model.put("bank", service.getSdfc(acc_no));
		    return "view";
		} 
        	else {
			 return"errorDeposit";
		 }
	}
	@RequestMapping("/deposit1")
	public String depositForm()
	{
		return "deposit";
	}
	@RequestMapping("/viewDeposit")
	public String viewDeposit1(Sdfc sdfc)
	{
		service.depositSdfc(sdfc);
		return "successDeposit";
	}
	@RequestMapping("/withdraw1")
	public String withdrawForm()
	{
		return "withdraw";
	}
	@RequestMapping("/withdrwView")
	public String viewWithdraw1(Sdfc sdfc)
	{
		service.withdrawSdfc(sdfc);
		return "successWithdraw";
	}
	@RequestMapping("/transfer1")
	public String transferForm(Sdfc sdfc)
	{
		return "transfer";
	}
	@RequestMapping("/successView")
	public String viewTransfer(Sdfc sdfc,Sdfc bank)
	{
		service.transferSdfc(sdfc, bank);
		return "successTransform";
	}

}


