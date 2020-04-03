package com.imooc.beanannotation.multibean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(-116161616)//order只针对list有效，对map无效。
@Component
public class BeanImplTwo implements BeanInterface {

}
