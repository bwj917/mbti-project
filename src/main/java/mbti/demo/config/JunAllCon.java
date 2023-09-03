package mbti.demo.config;

import lombok.RequiredArgsConstructor;
import mbti.demo.mybatis.*;
import mbti.demo.repository.*;
import mbti.demo.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class JunAllCon {
    private final CafeMapper cafeMapper;
    private final CinemaMapper cinemaMapper;
    private final FestivalMapper festivalMapper;
    private final FoodMapper foodMapper;

    @Bean
    public CafeRepository cafeRepository(){
        return new MyBatisCafeRepository(cafeMapper);
    }

    @Bean
    public CafeService cafeService(){
        return new CafeService(cafeRepository());
    }
    @Bean
    public CinemaRepository cinemaRepository() {
        return new MyBatisCinemaRepository(cinemaMapper);
    }
    @Bean
    public CinemaService cinemaService() {
        return new CinemaService(cinemaRepository());
    }
    @Bean
    public FestivalRepository festivalRepository() {
        return new MyBatisFestivalRepository(festivalMapper);
    }
    @Bean
    public FestivalService festivalService() {
        return new FestivalService(festivalRepository());
    }
    @Bean
    public FoodRepository foodRepository() {
        return new MyBatisFoodRepository(foodMapper);
    }
    @Bean
    public FoodService foodService() {
        return new FoodService(foodRepository());
    }

}
