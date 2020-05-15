package myrole;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: springcloud2020
 * @description:
 * @author: xuquan
 * @create: 2020-05-14 20:39
 */
@Configuration
public class MySelfRole {

    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
