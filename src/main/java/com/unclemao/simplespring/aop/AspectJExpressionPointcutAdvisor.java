package com.unclemao.simplespring.aop;

import org.aopalliance.aop.Advice;

/**
 * @author chenzy2
 * @version V1.0
 * @since 2020-01-29 16:33
 */
public class AspectJExpressionPointcutAdvisor implements PointcutAdvisor {

    private AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();

    private Advice advice;

    public void setExpression(String expression) {
        pointcut.setExpression(expression);
    }

    public void setAdvice(Advice advice) {
        this.advice = advice;
    }

    @Override
    public Pointcut getPointcut() {
        return pointcut;
    }

    @Override
    public Advice getAdvice() {
        return advice;
    }
}
