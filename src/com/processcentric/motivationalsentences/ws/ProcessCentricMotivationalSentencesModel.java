package com.processcentric.motivationalsentences.ws;


import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.WebResult;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.storageservice.person.ws.Person;
import com.storageservice.sport.ws.Sport;
import com.storageservice.weather.ws.Weather;


//service definition
@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL) 
public interface ProcessCentricMotivationalSentencesModel {
	
	@WebMethod(operationName="registration")
    @WebResult(name="idPerson") 
    public int registration(@WebParam(name="person") Person p);
 
    @WebMethod(operationName="login")
    @WebResult(name="idPerson") 
    public int login(@WebParam(name="email")String email,@WebParam(name="password")String pwd);
    
	 @WebMethod(operationName="dailymotivationalWeatherCalls")
	    @WebResult(name="sentence") 
	    public String DailymotivationalWeatherCalls(@WebParam(name="lat")String lat,@WebParam(name="lng")String lng);
	 
	 @WebMethod(operationName="dailymotivationalCaloriesCalls")
	    @WebResult(name="sentence") 
	    public String DailyMotivationalCaloriesCalls(@WebParam(name="idPerson")int idPerson,@WebParam(name="access_token")String access_token,@WebParam(name="user_id")String user_id,@WebParam(name="refresh_token")String refresh_token);
	 
	 @WebMethod(operationName="motivationBaseOnBmiStatusCalls")
	    @WebResult(name="sentence") 
	    public String motivationBaseOnBmiStatusCalls(@WebParam(name="idPerson")int idPerson,@WebParam(name="startDate")String startDate,@WebParam(name="access_token")String access_token,@WebParam(name="user_id")String user_id,@WebParam(name="refresh_token")String refresh_token);

	 @WebMethod(operationName="motivationBasedOnWeightDifferenceCalls")
	    @WebResult(name="sentence") 
	    public String motivationBasedOnWeightDifferenceCalls(@WebParam(name="idPerson")int idPerson,@WebParam(name="startDate")String startDate,@WebParam(name="endDate")String endDate,@WebParam(name="access_token")String access_token,@WebParam(name="user_id")String user_id,@WebParam(name="refresh_token")String refresh_token);

	 @WebMethod(operationName="motivationBasedOnBmiValueDifferenceCalls")
	    @WebResult(name="sentence") 
	    public String motivationBasedOnBmiValueDifferenceCalls(@WebParam(name="idPerson")int idPerson,@WebParam(name="startDate")String startDate,@WebParam(name="access_token")String access_token,@WebParam(name="user_id")String user_id,@WebParam(name="refresh_token")String refresh_token);
	 
	 @WebMethod(operationName="motivationBasedOnGoalStepsCalls")
	    @WebResult(name="sentence")
	 public String motivationBasedOnGoalStepsCalls(@WebParam(name="access_token")String access_token,@WebParam(name="user_id")String user_id,@WebParam(name="refresh_token")String refresh_token);
	 
	 @WebMethod(operationName="motivationBasedOnFavouriteActivitiesCalls")
	    @WebResult(name="sentence")
	 public String motivationBasedOnFavouriteActivitiesCalls(@WebParam(name="access_token")String access_token,@WebParam(name="user_id")String user_id,@WebParam(name="refresh_token")String refresh_token);
	 

	 @WebMethod(operationName="motivationBasedOnGoalAchievedLevelCalls")
	    @WebResult(name="sentence")
	 public String motivationBasedOnGoalAchievedLevelCalls(@WebParam(name="idPerson")int idPerson);
	 
	 @WebMethod(operationName="motivationBasedonForecastCalls")
	    @WebResult(name="sentence")
	 public String motivationBasedonForecastCalls(@WebParam(name="lat")String lat,@WebParam(name="lng")String lng);
	 
	 @WebMethod(operationName="verifyAndIncrementDailyGoalAchieved")
	    @WebResult(name="sentence")
	 public int verifyAndIncrementDailyGoalAchieved(@WebParam(name="idPerson")int idPerson,@WebParam(name="access_token")String access_token,@WebParam(name="user_id")String user_id,@WebParam(name="refresh_token")String refresh_token);
}