package org.apache.bval.bench;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * title: <br/>
 * description:描述<br/>
 * Copyright: Copyright (c)2011<br/>
 * Company: 易宝支付(YeePay)<br/>
 *
 * @author dreambt
 * @version 1.0.0
 * @since 2016/9/28 下午12:18
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        ApacheTest.class,
        HibernateTest.class
})

public final class TestSuite {
    // do nothing
}
