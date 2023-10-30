package KaanBilgenRemzi.u2s1d1;

import KaanBilgenRemzi.u2s1d1.entites.Menu;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootApplication
@Slf4j
public class U2s1d1Application {

	public static void main(String[] args) {
		SpringApplication.run(U2s1d1Application.class, args);
menu();
	}

	public static void menu() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U2s1d1Application.class);

		System.out.println(ctx.getBean("menu"));

	}

}
