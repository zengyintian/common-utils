package com.ginda.common.validation.checker;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by Ginda.Tseng on 2016/7/22.
 */
public class DemoCheckerTest {

    @Test
    public void testValidate() throws Exception {
        DemoBean demoBean = new DemoBean();
        Assert.assertEquals(DemoChecker.validate(demoBean), "用户名不能为空");
    }
}