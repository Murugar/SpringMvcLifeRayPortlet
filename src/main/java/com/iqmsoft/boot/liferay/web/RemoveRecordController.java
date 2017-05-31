package com.iqmsoft.boot.liferay.web;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.bind.annotation.ActionMapping;

import com.iqmsoft.boot.liferay.service.RecordService;


@Controller
@RequestMapping("VIEW")
@RequiredArgsConstructor(onConstructor = @__({@Autowired}))
public class RemoveRecordController {

    private final RecordService recordService;

    @ActionMapping(params="act=removeRecord")
    public void removeRecord(@RequestParam Long id) {
        recordService.removeRecord(id);
    }
}
