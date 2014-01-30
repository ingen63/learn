package org.speckhofer.git.Example1.util;

import org.speckhofer.git.Example1.IBean1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.fest.assertions.Assertions.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/META-INF/application-context-root.xml"})
public class ContextConfigurationTestRunner {

}
