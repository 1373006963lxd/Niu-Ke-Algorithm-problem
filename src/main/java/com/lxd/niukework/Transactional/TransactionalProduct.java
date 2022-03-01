package com.lxd.niukework.Transactional;

public class TransactionalProduct {
    /*
    * 一、@Transactional 注解使用
             1. @Transactional  注解只能用在public 方法上，如果用在protected或者private的方法上，不会报错，但是该注解不会生效。

             2. @Transactional注解只能回滚非检查型异常，具体为RuntimeException及其子类。

            3. 使用rollbackFor 属性来定义回滚的异常类型，使用 propagation 属性定义事务的传播行为。如:

              回滚Exception类的异常，事务的传播行为支持当前事务，如果没有事务，那么会创建一个事务。

            4. @Transactional注解不能回滚被try{}catch() 捕获的异常。

            5. @Transactional注解只能对在被Spring 容器扫描到的类下的方法生效。

 @Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRED)

 *
 * 二、 Spring事务的传播行为
PROPAGATION_REQUIRED   	支持当前事务，如果当前没有事务，则创建一个事务，这是最常见的选择。
PROPAGATION_SUPPORTS 	支持当前事务，如果当前没有事务，就以非事务来执行
PROPAGATION_MANDATORY 	支持当前事务，如果没有当前事务，就抛出异常。
PROPAGATION_REQUIRES_NEW	新建事务，如果当前存在事务，就把当前事务挂起。
PROPAGATION_NOT_SUPPORTED	以非事务执行操作，如果当前存在事务，则当前事务挂起。
PROPAGATION_NEVER	 以非事务方式执行，如果当前存在事务，则抛出异常。
PROPAGATION_NESTED	如果当前存在事务，则在嵌套事务内执行。如果当前没有事务，则进行与PROPAGATION_REQUIRED 类似的操作。

    *
    * */
}
