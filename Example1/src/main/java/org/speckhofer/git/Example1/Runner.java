package org.speckhofer.git.Example1;

import org.speckhofer.git.Example1.logger.Logger;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by IntelliJ IDEA.
 * User: xaoc
 * Date: 30.11.11
 * Time: 17:23
 */
public class Runner implements IRunner {


    private IBean1 bean1;

    @Logger private Log log;

    @Override
    public void run() {
        log.info(bean1.hello("Günter"));
    }

    @Autowired
    @Override
    public void setBean1(IBean1 bean1) {
        this.bean1 = bean1;
    }
}
