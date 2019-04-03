package com.example.widget.dto;

import com.example.widget.dto.GadgetResponse;
import com.example.widget.dto.WidgetResponse;
import com.example.widget.service.WidgetService;
import com.example.widget.service.GadgetService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = {"api/v1/associated"})
public class AssociatedController {
    public List<WidgetResponse> findAll() {
        
        List<WidgetResponse> associatedResponse = new ArrayList<>();

        List<GadgetResponse> gadgets = this.gadgetResponse.findAll();

        for (GadgetResponse gadget : gadgets) {
            associatedResponse.add(new WidgetResponse(gadget.getName()));
        }

        return associatedResponse;
    }
}