package com.lc;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.util.StringUtils;

/**
 * @description:
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-11-19 20:29
 */
@SpringBootApplication
@Slf4j
@MapperScan("com.lc.mapper")
public class TestSpringBootApplication {

    public static void main(String[] args) {
        try {
            SpringApplication app = new SpringApplication(TestSpringBootApplication.class);
            //app.setBannerMode(Banner.Mode.OFF);
            ApplicationContext context = app.run(args);
            String[] activeProfiles = context.getEnvironment().getActiveProfiles();
            log.info(print());
            log.info("ActiveProfiles = " + StringUtils.arrayToCommaDelimitedString(activeProfiles));
        } catch (Exception e) { // 一定要加此try catch, 方便解决问题
            // 打印启动失败的错误信息
            log.error("启动失败：", e);
        }
    }

    public static String print() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("      ┌─┐       ┌─┐\n");
        sb.append("   ┌──┘ ┴───────┘ ┴──┐\n");
        sb.append("   │                 │\n");
        sb.append("   │       ───       │\n");
        sb.append("   │  ─┬┘       └┬─  │\n");
        sb.append("   │                 │\n");
        sb.append("   │       ─┴─       │\n");
        sb.append("   │                 │\n");
        sb.append("   └───┐         ┌───┘\n");
        sb.append("       │         │\n");
        sb.append("       │         │\n");
        sb.append("       │         │\n");
        sb.append("       │         └──────────────┐\n");
        sb.append("       │                        │\n");
        sb.append("       │                        ├─┐\n");
        sb.append("       │                        ┌─┘\n");
        sb.append("       │                        │\n");
        sb.append("       └─┐  ┐  ┌───────┬──┐  ┌──┘\n");
        sb.append("         │ ─┤ ─┤       │ ─┤ ─┤\n");
        sb.append("         └──┴──┘       └──┴──┘\n");
        sb.append("                神兽保佑\n");
        sb.append("               代码无BUG!\n");
        return sb.toString();
    }
}
