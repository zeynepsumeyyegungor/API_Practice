import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetRequest01 {
    @Test
    public void test01(){
        String url = "https://restful-booker.herokuapp.com/booking/1215";

        Response response = given().when().get(url);
        //given().when().get(url); yazdigimiz bu satir ile end point'e gondermek icin request olusturmus olduk.
        // Response response -> API tarafindan bana donen response (cevap).

        // Response response = given().auth().basic("user","password").when().get(url);
        // basic aut ile request gondermek icin

        //response.prettyPrint();  //response'taki body'i yazdirir

        response.prettyPeek();  //response'taki herseyi yazdirir

        //response.peek();
    }
}
