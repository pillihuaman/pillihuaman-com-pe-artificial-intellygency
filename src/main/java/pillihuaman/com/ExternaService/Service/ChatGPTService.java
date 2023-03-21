package pillihuaman.com.ExternaService.Service;

import pillihuaman.com.base.request.ReqBase;
import pillihuaman.com.base.request.ReqControl;
import pillihuaman.com.base.response.RespBase;
import pillihuaman.com.base.response.RespControl;

public interface ChatGPTService {
	RespBase<RespControl> conexion( ReqBase<ReqControl>  request);

}




