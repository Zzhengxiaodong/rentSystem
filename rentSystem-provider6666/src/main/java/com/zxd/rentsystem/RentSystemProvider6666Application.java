package com.zxd.rentsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@SpringBootApplication
@RestController
public class RentSystemProvider6666Application {

    public static void main(String[] args) {
        SpringApplication.run(RentSystemProvider6666Application.class, args);
    }

    @RequestMapping("/*")
    public String hello(@RequestHeader Map<String, String> headers,
                        @RequestParam(required = false) Map<String, String> params, @RequestBody(required = false) String body) {
        // 注意：JAVA 为编译型语言，直接修改代码不能直接生效！请在控制台右上角“导出代码”，然后根据 HELP.md 中的说明编译代码并重新上传。
        // 注意：JAVA 为编译型语言，直接修改代码不能直接生效！请在控制台右上角“导出代码”，然后根据 HELP.md 中的说明编译代码并重新上传。
        // 注意：JAVA 为编译型语言，直接修改代码不能直接生效！请在控制台右上角“导出代码”，然后根据 HELP.md 中的说明编译代码并重新上传。
        // Notice: You need to complie the code first otherwise the code change will not
        // take effect.
        String requestId = headers.get("x-fc-request-id");
        System.out.printf("FC Invoke Start RequestId: %s%n", requestId);
        System.out.println(headers.toString());
        System.out.println(params.toString());
        System.out.println(body);
        System.out.printf("FC Invoke End RequestId: %s%n", requestId);
        return String.format("Hello World");
    }

}
