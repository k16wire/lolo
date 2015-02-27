package models;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.Test;
import play.libs.Json;

import static org.fest.assertions.Assertions.assertThat;

/**
 * User: k16wire
 * Date: 15. 2. 27.
 * Time: 오후 7:25
 */
public class ExecuteResultTest {
    @Test
    public void ok() throws Exception{
        //Given,When
        JsonNode jsonNode = Json.toJson(ExecuteResult.ok());
        //Then
        assertThat(jsonNode.get("resultCode").asText()).isEqualTo("OK");
    }

    @Test
    public void error() throws Exception{
        //Given,When
        JsonNode jsonNode = Json.toJson(ExecuteResult.error());
        //Then
        assertThat(jsonNode.get("resultCode").asText()).isEqualTo("ERROR");
    }
}
