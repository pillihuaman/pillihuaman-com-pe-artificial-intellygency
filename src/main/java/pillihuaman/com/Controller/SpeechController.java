package pillihuaman.com.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pillihuaman.com.Help.Constants;
import pillihuaman.com.Service.SpeechService;
import pillihuaman.com.base.request.ReqBase;
import pillihuaman.com.base.request.ReqSpeech;
import pillihuaman.com.base.response.RespBase;
import pillihuaman.com.security.MyJsonWebToken;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RestController
@Tag(name = "Product", description = "")
//@RequestMapping("Product/")

public class SpeechController {
	@Autowired
	private HttpServletRequest httpServletRequest;
	@Autowired
	private SpeechService speechService;
	

	
	@Operation(summary = "speech voice", description = "speech voice", tags = { "" }, security = {
			@SecurityRequirement(name = Constants.BEARER_JWT) })
	@ApiResponses(value = {
			@ApiResponse(responseCode = Constants.SERVER_200, description = Constants.OPERACION_EXITOSA),
			@ApiResponse(responseCode = Constants.SERVER_400, description = Constants.ERROR_VALIDACION, content = {
					@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = RespBase.class))}),
			@ApiResponse(responseCode = Constants.SERVER_500, description = Constants.ERROR_INTERNO, content = {
					@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = RespBase.class))}) })
	@PostMapping(path = { Constants.BASE_ENDPOINT + "/speechVoice" }, produces = {MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<RespBase<Object>> speechVoice(
			@PathVariable String access,
			@Valid @RequestBody ReqBase<ReqSpeech> request){
		
		MyJsonWebToken jwt = (MyJsonWebToken) httpServletRequest.getAttribute("jwt");
		RespBase<Object> response = speechService.speechByChatGPT(request);
		return ResponseEntity.ok(response);
	}





	    
}