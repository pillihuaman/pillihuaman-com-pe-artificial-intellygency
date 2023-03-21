package pillihuaman.com.Service;

import pillihuaman.com.base.request.ReqBase;
import pillihuaman.com.base.request.ReqSpeech;
import pillihuaman.com.base.response.RespBase;

public interface SpeechService {
	RespBase<Object> speechByChatGPT( ReqBase<ReqSpeech> request);

}




