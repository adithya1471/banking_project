package com.adithya.service;

import com.adithya.model.Sdfc;

public interface SdfcService {

	public Sdfc saveSdfc(Sdfc sdfc);
	public Sdfc depositSdfc(Sdfc sdfc);
	public void deleteSdfc(int acc_no);
	public Sdfc getSdfc(int acc_no);
	public Sdfc withdrawSdfc(Sdfc sdfc);
	public Sdfc transferSdfc(Sdfc sdfc,Sdfc bank);
}

