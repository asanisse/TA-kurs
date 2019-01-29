package se.claremont.test.petStore;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;
import org.junit.Assert;

import java.io.IOException;

public class PetStoreClient {

    public void putPetInPetStore(Pet myPet) throws JsonProcessingException, UnirestException {

        HttpResponse<String> response = Unirest.post("https://petstore.swagger.io/v2/pet")
                .header("Content-Type", "application/json")
                .body(new ObjectMapper().writeValueAsString(myPet))
                .asString();

        Assert.assertEquals(200, response.getStatus());
    }

    public Pet getPetFromPetStore(int id, int statusCode) throws IOException, UnirestException {
        HttpResponse<String> response = Unirest.get("https://petstore.swagger.io/v2/pet/"+id)
                .header("Content-Type", "application/json") //Header behövs egentligen inte här
                .asString();
        Assert.assertEquals(statusCode, response.getStatus());
        ObjectMapper mapper = new ObjectMapper();
        Pet myPet = mapper.readValue(response.getBody(), Pet.class);
        return myPet;
    }

   public void deletePet(int id) throws UnirestException {
       int response = Unirest.delete("https://petstore.swagger.io/v2/pet/"+id).asString().getStatus();
       Assert.assertEquals(200, response);
      /* HttpResponse<String> response = Unirest.get("https://petstore.swagger.io/v2/pet/"+id)
               .header("Content-Type", "application/json") //Header behövs egentligen inte här
               .asString();
       Assert.assertEquals(200, response.getStatus());*/

    }
}
