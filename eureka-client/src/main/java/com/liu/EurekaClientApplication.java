package com.liu;

import com.liu.eurekaclient.MsgTemplate;
import com.liu.eurekaclient.Person;
import com.liu.eurekaclient.Student;
import com.liu.jar.jar.HttpResultModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@EnableEurekaClient
@RestController
@SpringBootApplication
public class EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

    @RequestMapping("/hi")
    public HttpResultModel home(@RequestBody Student student) throws Exception {
//        Student student1 = new Student();
//        student1.setName("Sam");
//        student1.setAge(12);
////        student1.setSex("男");
//        Student student2 = new Student();
//        student2.setName("Tom");
////        student2.setAge(13);
//        student2.setSex("男");
//        List<Student> students = new ArrayList<>();
//        students.add(student1);
//        students.add(student2);

        List<Student> students = new ArrayList<>();
        Person person = new Person();
        person.setName("Sam");
//        person.setAge(12);
        Student student1 = new Student();
        student1.setNumber(001);
//        student1.setSchool("qh");
        student1.setPerson(person);
        student1.setDate(new Date());
        System.out.println(new Date());
        Student student2 = new Student();
        student2.setNumber(002);
        student2.setSchool("qh");
        student2.setPerson(person);
        students.add(student1);
        students.add(student2);

//        List<Student> students = null;

//       return MsgTemplate.successMsg(null);
//        return MsgTemplate.failureMsg(MsgEnum.DATA_DELERROR);
//        return MsgTemplate.successMsg();
        return MsgTemplate.successMsg(students);
    }
}
