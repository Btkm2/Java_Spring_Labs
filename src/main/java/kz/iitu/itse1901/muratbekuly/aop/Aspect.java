//package kz.iitu.itse1901.muratbekuly.aop;
//
//import org.apache.logging.log4j.Logger;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.*;
//import org.springframework.context.annotation.EnableAspectJAutoProxy;
//import org.springframework.stereotype.Component;
//
//@org.aspectj.lang.annotation.Aspect
//@EnableAspectJAutoProxy
//@Component
//public class Aspect {
//    @Pointcut("execution(public * kz.iitu.itse1901.muratbekuly.service.CarServices.CarService.get*(..))")
//    public void allCars(){}
//
//    @Before("allCars()")
//    public void BeforeCallMyMethod(JoinPoint jp){
//        System.out.println("Message before " + jp.getSignature().getName());
//    }
//
//    @After("allCars()")
//    public void AfterCallMyMethod(JoinPoint jp){
//        System.out.println("Message after " + jp.getSignature().getName());
//    }
//
//    @Around("allCars()")
//    public Object AroundCallMyMethods(ProceedingJoinPoint pjp) throws Throwable{
////        System.out.println("Message around " + jp.getSignature().getName());
////        try {
////            return pjp.proceed(pjp.getArgs());
//////        } catch (Throwable) {
//////            Logger log = null;
//////            log.error(e.getMessage(), e);
//////            log.info("Retrying operation");
//////            return pjp.proceed(pjp.getArgs());
////        } catch (Throwable throwable) {
////            throwable.printStackTrace();
////        }
////        return "Messsage around ";
//        System.out.println("Message before working around method");
//        Object object = pjp.proceed();
//        System.out.println("Message after working around method");
//        return object;
//    }
//
//    @AfterReturning("allCars()")
//    public void AfterReturningCallMyMethod(JoinPoint jp){
//        System.out.println("Message after returning " + jp.getSignature().getName());
//    }
//
//    @AfterThrowing("allCars()")
//    public void AfterThrowingCallMyMethods(JoinPoint jp){
//        System.out.println("Message after throwing " + jp.getSignature().getName());
//    }
//}
