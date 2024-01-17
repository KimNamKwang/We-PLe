package WePLe.WePLe.controllers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/main")

public class MainController {

    @Autowired

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public ModelAndView main(@RequestParam Map<String, Object> params,
            ModelAndView modelAndView) {
        Object resultMap = params;
        return modelAndView;
    }
}
