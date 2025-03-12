package config;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import com.aventstack.extentreports.Status;


        public class Hooks {

            private static String currentFeatureName = "";

            @Before
            public void setUp(Scenario scenario) {

                String featureName = scenario.getUri().toString().split("/")[scenario.getUri().toString().split("/").length - 1]
                        .replace(".feature", "");

                if (!featureName.equals(currentFeatureName)) {
                    currentFeatureName = featureName;
                    ExtentManager.createTest(featureName);
                }

                ExtentManager.createTest(scenario.getName());
                ExtentManager.getTest().log(Status.INFO, "Starting scenario: " + scenario.getName());
            }

            @After
            public void tearDown(Scenario scenario) {
                if (scenario.isFailed()) {
                    ExtentManager.getTest().log(Status.FAIL, "Scenario failed: "
                            + scenario.getName() + "Status : " + scenario.getStatus());


                } else {
                    ExtentManager.getTest().log(Status.PASS, "Scenario passed: " + scenario.getName());
                }
                ExtentManager.flushReports();
            }

        }


