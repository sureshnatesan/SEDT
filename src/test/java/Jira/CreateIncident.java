package Jira;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class CreateIncident {
	
	int id=0;
	@Test(groups={"CreateIncident.create"})
	public void CreateRecord() {
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
						"        \"summary\": \"create issue in RA project\",\r\n" + 
						"        \"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\r\n" + 
						"        \"issuetype\": {\r\n" + 
						"            \"name\": \"Bug\"\r\n" + 
						"        }\r\n" + 
						"    }\r\n" + 
						"}");
		
		Response response = inputRequest
				.when()
				.post("rest/api/2/issue/")
				.then()
				.log()
				.all()
				.extract()
				.response();
		//Assert.assertEquals(201, response.statusCode());
		id=response.getBody().path("id");
		
		/*	inputRequest.when()
		.post("rest/api/2/issue/")
		.then()
		.log()
		.all()
		.extract();
		
	ResponseSpecification res=	inputRequest.response();
*/
	}
}
