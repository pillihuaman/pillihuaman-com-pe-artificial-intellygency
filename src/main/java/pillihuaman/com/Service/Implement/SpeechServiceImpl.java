package pillihuaman.com.Service.Implement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import pillihuaman.com.Service.SpeechService;
import pillihuaman.com.base.request.ReqBase;
import pillihuaman.com.base.request.ReqSpeech;
import pillihuaman.com.base.response.RespBase;


@Component
public class SpeechServiceImpl implements SpeechService {


	protected final Log log = LogFactory.getLog(getClass());


	@Override
	public RespBase<Object> speechByChatGPT(ReqBase<ReqSpeech> request) {
		

		/*System.setProperty("mbrola.base", "D:\\ApowerREC");
		try {
			Voice voice;//Creating object of Voice class
	        voice = VoiceManager.getInstance().getVoice("Kevin");//Getting voice
	        if (voice != null) {
	            voice.allocate();//Allocating Voice
	        }
	        try {
	            voice.setRate(190);//Setting the rate of the voice
	            voice.setPitch(150);//Setting the Pitch of the voice
	            voice.setVolume(3);//Setting the volume of the voice
	            voice.speak(request.getData().getKeyWord());//Calling speak() method
	  
	        }
	        catch(Exception e)
	        {
	       e.printStackTrace();
	        }
	 

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;*/
		return null;
	}
}
