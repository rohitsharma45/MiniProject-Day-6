package com.cg.miniproject.service;

import java.sql.Date;
import java.util.ArrayList;

import com.cg.miniproject.bean.MacBean;
import com.cg.miniproject.bean.MiniprojectBean;
import com.cg.miniproject.bean.ProgramBean;
import com.cg.miniproject.bean.ProgramsOfferedBean;
import com.cg.miniproject.dao.IMiniprojectDao;
import com.cg.miniproject.dao.MiniprojectDaoImpl;

public class MiniprojectServiceImpl implements IMiniprojectService {

	IMiniprojectDao dao=null;
	public int insertData(MiniprojectBean bean) {
		 dao=new MiniprojectDaoImpl();
		return dao.insertData(bean);
	}
	public String getProgramId() {
		dao=new MiniprojectDaoImpl();
			return dao.getProgramId();
	}
	@Override
	public boolean checkLogin(MacBean mac) {
		dao=new MiniprojectDaoImpl();
		ArrayList<MacBean> list = null;
		list = dao.allLogin(mac);
		
		int flag = 0;
		for(MacBean b:list)
		{
		
			if((b.getLoginId().equals(mac.getLoginId())) && (b.getPassword().equals(mac.getPassword()))){
				flag = 1;
				break;
			}
				
		}
		
		if(flag == 1){
			return true;
		}
		else return false;
		
	}
	@Override
	public boolean checkAdminLogin(MacBean mac) {
		dao=new MiniprojectDaoImpl();
		ArrayList<MacBean> list = null;
		list = dao.adminLogin(mac);
		
		int flag = 0;
		for(MacBean b:list)
		{
			//System.out.println(b);
			
			if((b.getLoginId().equals(mac.getLoginId())) && (b.getPassword().equals(mac.getPassword()))){
				flag = 1;
				break;
			}
				
		}
		
		if(flag == 1){
			return true;
		}
		else return false;
		
	
	}
	@Override
	public String getId(String id) {
		
		dao=new MiniprojectDaoImpl();
		return dao.getId(id);
	}
	@Override
	public ArrayList<String> retrieveDetails() {
		dao=new MiniprojectDaoImpl();
		return dao.retrieveDetails();
	}
	@Override
	public ArrayList<MiniprojectBean> getApplicantList(String programName) {
		
		dao=new MiniprojectDaoImpl();
		return dao.getApplicantList(programName);
	}
	@Override
	public int updateStatus(MiniprojectBean bean) {
		dao=new MiniprojectDaoImpl();
		return dao.updateStatus(bean);
	}
	@Override
	public ArrayList<MiniprojectBean> retrieveStatus(String pgmName) {
		dao=new MiniprojectDaoImpl();
		return dao.retrieveStatus(pgmName);
	}
	@Override
	public int updateCnfStatus(MiniprojectBean bean) {
		dao=new MiniprojectDaoImpl();
		return dao.updateCnfStatus(bean);
	}
	@Override
	public ArrayList<MiniprojectBean> getCnfApplicantList(String programName) {
		dao=new MiniprojectDaoImpl();
		return dao.getCnfApplicantList(programName);
	}

	@Override
	public ArrayList<MiniprojectBean> getApplicantStatus(int applicationId) {
		dao=new MiniprojectDaoImpl();
		return dao.getApplicantStatus(applicationId);
	}
	@Override
	public ArrayList<String> retrievePrograms() {
		dao=new MiniprojectDaoImpl();
		return dao.retrievePrograms();
	}
	@Override
	public ArrayList<MiniprojectBean> retrieveAllDetails() {
		dao=new MiniprojectDaoImpl();
		return dao.retrieveAllDetails();
	}
	@Override
	public ArrayList<ProgramBean> retrievePgms() {
		dao=new MiniprojectDaoImpl();
		return dao.retrievePgms();
	}
	@Override
	public boolean validateForm(String qualification) {
		if(qualification.equals("HSC")){
			return true;
		}
		else{
			System.out.println("Your qualification should be HSC");
			System.exit(0);
			return false;
		}
		
	}
	@Override
	public int addProgramOffered(
			ProgramsOfferedBean pgmbean) {
		dao=new MiniprojectDaoImpl();
		return dao.addProgramOffered(pgmbean);
	}
	@Override
	public int deleteProgramOffered(String programName) {
		dao=new MiniprojectDaoImpl();
		return dao.deleteProgramOffered(programName);
	}
	@Override
	public void updateDetail(ProgramsOfferedBean pgmbean) {
		dao=new MiniprojectDaoImpl();
		dao.deleteProgramOffered(pgmbean);
	}
	@Override
	public int addScheduleProgram(ProgramBean progmbean) {
		
		return dao.addScheduleProgram(progmbean);
	}
	@Override
	public int deleteProgramSchedule(String programSchId) {
		
		return dao.deleteProgramSchedule(programSchId);
	}




}

