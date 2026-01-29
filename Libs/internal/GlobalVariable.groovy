package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile Prod : The domain of the application under test
Profile default : The domain of the application under test</p>
     */
    public static Object application_domain
     
    /**
     * <p>Profile Prod : The default query parameters of the URL
Profile default : The default query parameters of the URL</p>
     */
    public static Object query_params
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
    
            application_domain = selectedVariables['application_domain']
            query_params = selectedVariables['query_params']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
