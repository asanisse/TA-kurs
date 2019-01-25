package se.claremont.test.petStore;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.junit.Assert;
import org.junit.Test;
import se.claremont.test.Vehicle;

import java.io.IOException;

public class PetStoreTest {

    @Test
    public void putPetInPetStore () throws UnirestException, JsonProcessingException {
        String[] photoUrls = {"http://apa.se", "http://apa.fi"};
        Pet myPet = new Pet();
        myPet.setId(666);
        myPet.setName("Fido");
        myPet.setPhotoUrls(photoUrls);

        new PetStoreClient().putPetInPetStore(myPet);



     /*   HttpResponse<String> response = Unirest.post("https://petstore.swagger.io/v2/pet")
                .header("Content-Type", "application/json")
                .body(new ObjectMapper().writeValueAsString(myPet))
        .asString();

        Assert.assertEquals(200, response.getStatus());*/
    }

    @Test
    public void getPetfromStore() throws IOException, UnirestException {
       /* PetStoreClient restClient = new PetStoreClient();
       restClient.putPetInPetStore(myPet);

        */

        String[] photoUrls = {"http://apa.se", "http://apa.fi"};
        Pet myPet = new Pet();
        myPet.setId(666);
        myPet.setName("Fido");
        myPet.setPhotoUrls(photoUrls);

        Pet myNewPet = new PetStoreClient().getPetFromPetStore(666);
        Assert.assertEquals("Fido", myNewPet.getName());

    }
    @Test // Förvandla java object till textsträng
    public void serializeVehicle() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

       String myVolvo = mapper.writeValueAsString(new Vehicle("Volvo", "v40"));
        System.out.println(myVolvo);


    }

    @Test
    public void deserializeVehicle() throws IOException {
        String myVolvoJson ="{\"make\":\"Volvo\",\"model\":\"v40\",\"price\":0,\"owner\":null}\n";
        ObjectMapper mapper = new ObjectMapper();

        Vehicle myVolvo = mapper.readValue(myVolvoJson, Vehicle.class);
        Assert.assertEquals("v40",myVolvo.getModel());


    }
}
