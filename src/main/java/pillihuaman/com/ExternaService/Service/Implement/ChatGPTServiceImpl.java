package pillihuaman.com.ExternaService.Service.Implement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pillihuaman.com.ExternaService.Service.ChatGPTService;
import pillihuaman.com.base.request.ReqBase;
import pillihuaman.com.base.request.ReqControl;
import pillihuaman.com.base.response.RespBase;
import pillihuaman.com.base.response.RespControl;
import pillihuaman.com.basebd.control.domain.dao.ControlDAO;

@Component
public class ChatGPTServiceImpl implements ChatGPTService {

    @Autowired
    private ControlDAO ControlDAO;

    protected final Log log = LogFactory.getLog(getClass());


    @Override
    public RespBase<RespControl> conexion(ReqBase<ReqControl> request) {
        return null;
    }
}
