package com.zero.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Author: Zero <br>
 * Date: 2020-06-06
 * COMPANY: Zero有限公司
 * DESCRIPTION: The copyright belongs to Zero,if you have any problems,please contact him.
 */
@Configurable
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan("com.zero")
public class AppConfig {
}
