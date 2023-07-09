package prosky.skyprospringcalculator2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import prosky.skyprospringcalculator2.services.Calculator2Service;

@RestController
@RequestMapping("/calculator")
public class Calculator2Controller {
        private final Calculator2Service calculator2Service;

        public Calculator2Controller(Calculator2Service calculator2Service) {

            this.calculator2Service = calculator2Service;
        }

        @GetMapping
        public String hello() {
            return calculator2Service.hello();
        }

        @GetMapping(path = "/plus")
        public String plus(@RequestParam("num1") String num1, @RequestParam("num2") String num2){
            return calculator2Service.plus(num1, num2);
        }

        @GetMapping(path = "/minus")
        public String minus(@RequestParam("num1") String num1, @RequestParam("num2") String num2){
            return calculator2Service.minus(num1, num2);

        }
        @GetMapping(path = "/multiply")
        public String multiply(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
            return calculator2Service.multiply(num1, num2);
        }
        @GetMapping(path = "/divide")
        public String divide(@RequestParam("num1") String num1, @RequestParam("num2") String num2) {
            return calculator2Service.divide(num1, num2);
        }
    }
