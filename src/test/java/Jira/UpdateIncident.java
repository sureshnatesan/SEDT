package Jira;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateIncident  {
	
	int id;
	@Test(dependsOnGroups= {"CreateIncident.create"})
	public void updateusingPut(){
		CreateIncident idvalue= new CreateIncident();
		id=idvalue.id;
		RestAssured.baseURI="https://testjirafeb2023.atlassian.net";
		RequestSpecification inputRequest = RestAssured.given()
				.auth()
				.preemptive()
				.basic("feb2023restapi@gmail.com", "ATATT3xFfGF0HqLS2OkkQJ5k68KolhpN968I7LfMbbsPezisiOslvSjjhjh-J76OHQCa36-ghdgMPxzI3IjGSXe6zU9UiiMzdC1GsDTzNiTx-FFxsjeEWBygX96bUUSV4jVA81V6CzU14KqQSr-SGSQmU0UhI5I-L5cwGezZQaNFnzXbpphX_cQ=DFD8DB94")
				.accept("application/json")
				.contentType("application/json")
				.body("{\r\n" + 
						"    \"fields\": {\r\n" + 
						"        \"project\": {\r\n" + 
						"            \"key\": \"TES\"\r\n" + 
						"        },\r\n" + 
						"        \"summary\": \"create issue in RA project for put method\",\r\n" + 
						"        \"description\": \"updating the using the put method\",\r\n" + 
						"        \"issuetype\": {\r\n" + 
						"            \"name\": \"Bug\"\r\n" + 
						"        }\r\n" + 
						"    }\r\n" + 
						"}");
		
		Response response = inputRequest
				.when()
				.put("rest/api/2/issue/"+id)
				.then()
				.log()
				.all()
				.extract()
				.response();
		Assert.assertEquals(200, response.statusCode());
	}

}
