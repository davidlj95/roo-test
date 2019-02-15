package com.davidlj95.rootest.web;
import com.davidlj95.rootest.Timer;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = TimersItemJsonController
 *
 * TODO Auto-generated class documentation
 *
 */
@RooController(entity = Timer.class, type = ControllerType.ITEM)
@RooJSON
public class TimersItemJsonController {
}
