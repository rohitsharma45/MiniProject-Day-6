package com.cg.miniproject.dao;

import java.sql.Date;
import java.util.ArrayList;

import com.cg.miniproject.bean.MacBean;
import com.cg.miniproject.bean.MiniprojectBean;
import com.cg.miniproject.bean.ProgramBean;
import com.cg.miniproject.bean.ProgramsOfferedBean;

public interface IMiniprojectDao {

	int insertData(MiniprojectBean bean);

	String getProgramId();


	ArrayList<MacBean> allLogin(MacBean mac);

	ArrayList<MacBean> adminLogin(MacBean mac);

	String getId(String id);

	ArrayList<String> retrieveDetails();

	ArrayList<MiniprojectBean> getApplicantList(String programName);

	int updateStatus(MiniprojectBean bean);

	ArrayList<MiniprojectBean> retrieveStatus(String pgmName);

	int updateCnfStatus(MiniprojectBean bean);

	ArrayList<MiniprojectBean> getCnfApplicantList(String programName);

	ArrayList<ProgramBean> retrievePgms();

	ArrayList<MiniprojectBean> getApplicantStatus(int applicationId);

	ArrayList<String> retrievePrograms();

	ArrayList<MiniprojectBean> retrieveAllDetails();

	int addProgramOffered(ProgramsOfferedBean pgmbean);

	int deleteProgramOffered(String programName);

	void deleteProgramOffered(ProgramsOfferedBean pgmbean);

	int addScheduleProgram(ProgramBean progmbean);

	int deleteProgramSchedule(String programSchId);
}
