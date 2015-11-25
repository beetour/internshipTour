package com.internshipTour.base;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Transactional
@Service("baseService")
public class BaseServiceImpl<T> implements BaseService<T>{

}
