package com.internshipTour.base;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;

import com.internshipTour.dto.base.ReturnBean;


@Controller
public class BaseController
{
    public int page=0;
    public int limit=10;
    public ReturnBean returnBean = new ReturnBean();
    protected Logger log=Logger.getRootLogger();
}
