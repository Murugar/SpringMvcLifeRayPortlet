package com.iqmsoft.boot.liferay.web;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.iqmsoft.boot.liferay.model.Record;
import com.iqmsoft.boot.liferay.service.RecordService;

import javax.portlet.ActionResponse;


@Controller
@RequestMapping("VIEW")
@SessionAttributes(types = Record.class)
@RequiredArgsConstructor(onConstructor = @__({@Autowired}))
public class AddRecordController {

    private final RecordService recordService;

    @RenderMapping(params = "act=addRecordForm")
    public String showAddRecordForm() {
        return "portlet-demo/addForm";
    }

    @ActionMapping(params = "act=addRecord")
    public void addRecord(@ModelAttribute("record") Record record, ActionResponse response, SessionStatus sessionStatus) {
        recordService.addRecord(record);
        response.setRenderParameter("act", "records");
      
        sessionStatus.setComplete();
    }

    @ModelAttribute("record")
    public Record populateRecord() {
        return new Record();
    }

}
