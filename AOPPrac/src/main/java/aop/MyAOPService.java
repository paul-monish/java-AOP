package aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAOPService {

    @Before("execution(* service.PaymentService.makePayment(..))")
    public void beginPayment(){
        System.out.println("Transaction Starting !!");
    }

    @After("execution(* service.PaymentService.makePayment(..))")
    public void endPayment(){
        System.out.println("Transaction end !!");
    }
}
