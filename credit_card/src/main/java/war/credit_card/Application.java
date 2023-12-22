package SBC.credit_card;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableSwagger2Doc
@SpringBootApplication
@MapperScan("SBC.credit_card.mapper")
public class Application {

	public static void main(String[] args)  {
		SpringApplication.run(Application.class, args);
	}

}
