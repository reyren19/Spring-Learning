package org.example.aopPractice;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("org.example.aopPractice")
@EnableAspectJAutoProxy
public class UserConfig {
}
