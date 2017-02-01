package com.processcentric.motivationalsentences.ws;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.jws.WebService;

import org.json.JSONObject;

import com.businesslogicservice.ws.BusinessLogicModel;
import com.businesslogicservice.ws.BusinessLogicService;
import com.storageservice.bmi.ws.Bmi;
import com.storageservice.bmi.ws.BmiApi;
import com.storageservice.bmi.ws.StorageServiceBmi;
import com.storageservice.fitbit.ws.Goal;
import com.storageservice.fitbit.ws.LocalApiFitBitModel;
import com.storageservice.fitbit.ws.StorageServiceFitBit;
import com.storageservice.fitbit.ws.WeightGoal;
import com.storageservice.person.ws.LocalApiPersonModel;
import com.storageservice.person.ws.Person;
import com.storageservice.person.ws.StorageServicePerson;
import com.storageservice.sport.ws.Activity;
import com.storageservice.sport.ws.LocalApiSportModel;
import com.storageservice.sport.ws.Sport;
import com.storageservice.sport.ws.StorageServiceSport;
import com.storageservice.weather.ws.StorageServiceWeather;
import com.storageservice.weather.ws.Weather;
import com.storageservice.weather.ws.WeatherApi;






//Service Implementation

@WebService(endpointInterface = "com.processcentric.motivationalsentences.ws.ProcessCentricMotivationalSentencesModel", serviceName = "processCentricMotivationalSentencesService")
public class ProcessCentricMotivationalSentencesImpl implements ProcessCentricMotivationalSentencesModel {

	@Override//attento bisogna ricambiare in cloudy
	public String DailymotivationalWeatherCalls(String lat,String lng) {
		StorageServiceWeather weatherservice = new StorageServiceWeather();
		WeatherApi weathers =weatherservice.getWeatherApiImplPort();
		BusinessLogicService businesss= new BusinessLogicService();
		BusinessLogicModel business=businesss.getBusinessLogicImplPort();
		StorageServiceSport sportservice = new StorageServiceSport();
		LocalApiSportModel sports = sportservice.getLocalApiSportImplPort();
		Weather weather=weathers.getWeatherByLatLng(lat, lng);
		List<Sport> sportWeather=sports.getSportsByWeather("Cloudy");
		String sentence= business.dailymotivationalWeather(sportWeather, weather);
		return sentence;
	}
	@Override
	public String DailyMotivationalCaloriesCalls(int idPerson,String access_token,String user_id,String refresh_token){
		StorageServicePerson personservice = new StorageServicePerson();
		LocalApiPersonModel people = personservice.getLocalApiPersonImplPort();
		BusinessLogicService businesss= new BusinessLogicService();
		BusinessLogicModel business=businesss.getBusinessLogicImplPort();
		Person p= people.getPersonInformation(idPerson);
		StorageServiceSport sportservice = new StorageServiceSport();
		LocalApiSportModel sports = sportservice.getLocalApiSportImplPort();
		List <Sport> sportlist= sports.getSportsList();
		String sentence= business.dailymotivationalCalories(sportlist, p, access_token, user_id, refresh_token);
	
		return sentence;
	}
	@Override
	public String motivationBaseOnBmiStatusCalls(int idPerson,String startDate,String access_token,String user_id,String refresh_token){
		StorageServicePerson personservice = new StorageServicePerson();
		StorageServiceBmi bmiservice = new StorageServiceBmi();
		BusinessLogicService businesss= new BusinessLogicService();
		BusinessLogicModel business=businesss.getBusinessLogicImplPort();
		BmiApi bmis = bmiservice.getBmiApiImplPort();
		Bmi bmi=bmis.getBmiByIdPerson(idPerson);
		LocalApiPersonModel people = personservice.getLocalApiPersonImplPort();
		Person p= people.getPersonInformation(idPerson);
		String sentence=business.motivationBaseOnBmiStatus(bmi, startDate, p, access_token, user_id, refresh_token);
		//cambiare nel business e guardare se è uguale
	
		return sentence;
	}
	@Override
	public String motivationBasedOnBmiValueDifferenceCalls(int idPerson,String startDate,String access_token,String user_id,String refresh_token){
		StorageServiceBmi bmiservice = new StorageServiceBmi();
		BmiApi bmis = bmiservice.getBmiApiImplPort();
		StorageServicePerson personservice = new StorageServicePerson();
		LocalApiPersonModel people = personservice.getLocalApiPersonImplPort();
		BusinessLogicService businesss= new BusinessLogicService();
		BusinessLogicModel business=businesss.getBusinessLogicImplPort();
		Person p= people.getPersonInformation(idPerson);
		

		Bmi bmi=bmis.getBmiByIdPerson(idPerson);
		String sentence= business.motivationBasedOnBmiValueDifference(p, startDate, bmi, access_token, user_id, refresh_token);
		
		return sentence;
	}
	@Override
	public String motivationBasedOnWeightDifferenceCalls(int idPerson,String startDate,String endDate,String access_token,String user_id,String refresh_token){
		StorageServiceFitBit fitbitservice = new StorageServiceFitBit();
		LocalApiFitBitModel fitbits = fitbitservice.getLocalApiFitBitImplPort();
		BusinessLogicService businesss= new BusinessLogicService();
		BusinessLogicModel business=businesss.getBusinessLogicImplPort();
		WeightGoal goal=fitbits.getWeightGoal(access_token, user_id, refresh_token);
		double goalWeight=goal.getGoalWeight();
		double startWeight= goal.getStartWeight();
		double weightDifference= fitbits.getPeriodWeightDifference(startDate, endDate, access_token, user_id, refresh_token);
		String sentence= business.motivationBasedOnWeightDifference(idPerson, startDate, endDate, startWeight, goalWeight, weightDifference);
		return sentence;
	}
	
	@Override
	public String motivationBasedOnGoalStepsCalls(String access_token,String user_id,String refresh_token){
		StorageServiceFitBit fitbitservice = new StorageServiceFitBit();
		LocalApiFitBitModel fitbits = fitbitservice.getLocalApiFitBitImplPort();
		BusinessLogicService businesss= new BusinessLogicService();
		BusinessLogicModel business=businesss.getBusinessLogicImplPort();
		Goal goal=fitbits.getDailyGoal(access_token, user_id, refresh_token);
		String sentence= business.motivationBasedOnGoalSteps(goal);
		return sentence;
		
	}
	@Override
	public String motivationBasedOnFavouriteActivitiesCalls(String access_token,String user_id,String refresh_token){
		StorageServiceSport sportservice = new StorageServiceSport();
		LocalApiSportModel sports = sportservice.getLocalApiSportImplPort();
		BusinessLogicService businesss= new BusinessLogicService();
		BusinessLogicModel business=businesss.getBusinessLogicImplPort();
		List<Activity>favouriteActivities=sports.getFavouriteActivity(access_token, user_id, refresh_token);
		String sentence = business.motivationBasedOnFavouriteActivities(favouriteActivities);
		return sentence;
	}
	@Override
	public String motivationBasedOnGoalAchievedLevelCalls(int idPerson){
		StorageServicePerson personservice = new StorageServicePerson();
		LocalApiPersonModel people = personservice.getLocalApiPersonImplPort();
		BusinessLogicService businesss= new BusinessLogicService();
		BusinessLogicModel business=businesss.getBusinessLogicImplPort();
		Person p=people.getPersonInformation(idPerson);
		String level=p.getLevel();
		String description=p.getDescription();
		String sentence =  "Your level is "+level+ " "+description;
		return sentence;
	}
	@Override
	public String motivationBasedonForecastCalls(String lat,String lng){
		StorageServiceWeather weatherservice = new StorageServiceWeather();
		WeatherApi weathers =weatherservice.getWeatherApiImplPort();
		List <Weather> forecast= weathers.getForecastByLatLng(lat, lng);
		BusinessLogicService businesss= new BusinessLogicService();
		BusinessLogicModel business=businesss.getBusinessLogicImplPort();
		String sentence= business.motivationBasedonForecast(forecast);
		return sentence;
	}
	@Override
	public int registration(Person p) {
		StorageServicePerson personservice = new StorageServicePerson();
		LocalApiPersonModel people = personservice.getLocalApiPersonImplPort();
		return people.registration(p);	
	}
	@Override
public int login(String email,String pwd){
	StorageServicePerson personservice = new StorageServicePerson();
	LocalApiPersonModel people = personservice.getLocalApiPersonImplPort();
	Person p=people.login(email, pwd);
	return p.getIdPerson();	
}
	public int verifyAndIncrementDailyGoalAchieved(int idPerson,String access_token,String user_id,String refresh_token){
		StorageServiceFitBit fitbitservice = new StorageServiceFitBit();
		LocalApiFitBitModel fitbits = fitbitservice.getLocalApiFitBitImplPort();
		StorageServicePerson personservice = new StorageServicePerson();
		LocalApiPersonModel people = personservice.getLocalApiPersonImplPort();
		Person p =people.getPersonInformation(idPerson);	
		BusinessLogicService businesss= new BusinessLogicService();
		BusinessLogicModel business=businesss.getBusinessLogicImplPort();
		Goal goal=fitbits.getDailyGoal(access_token, user_id, refresh_token);
		p=business.verifyAndIncrementDailyGoalAchieved(goal, p);
		return people.updatePerson(p);
	}
	
}
