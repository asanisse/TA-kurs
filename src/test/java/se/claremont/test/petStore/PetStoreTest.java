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

import static se.claremont.test.petStore.TestDataHelper.getPetWithId;

public class PetStoreTest {

    @Test
    public void putPetInPetStore () throws UnirestException, JsonProcessingException {
        //Pet myPet = TestDataHelper.getPetWithIdAndName(667, "Fluffy");
        Pet myPet = getPetWithId(999);
        new PetStoreClient().putPetInPetStore(myPet);

     /*   HttpResponse<String> response = Unirest.post("https://petstore.swagger.io/v2/pet")
                .header("Content-Type", "application/json")
                .body(new ObjectMapper().writeValueAsString(myPet))
        .asString();
    Assert.assertEquals(200, response.getStatus());*/
    }

    @Test
    public void getPetFromStore() throws IOException, UnirestException {

        Pet myPet = TestDataHelper.getPetWithIdAndName(668, "Fluffy"); //TestDataHelper kan importeras också
        new PetStoreClient().putPetInPetStore(myPet);
        Pet myNewPet = new PetStoreClient().getPetFromPetStore(668, 200);
        Assert.assertEquals("Fluffy", myNewPet.getName());

    }
@Test
   public void deletePetFromStore() throws IOException, UnirestException {
        int id = 669;
        Pet myPet = TestDataHelper.getPetWithIdAndName(id, "Snurre");
        PetStoreClient myNewPet = new PetStoreClient();
        myNewPet.putPetInPetStore(myPet);
    myNewPet.getPetFromPetStore(id, 200);
        myNewPet.deletePet(id);
       myNewPet.getPetFromPetStore(id, 404);

   // Assert.assertEquals(200, getPetFromStore().getStatus());




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
