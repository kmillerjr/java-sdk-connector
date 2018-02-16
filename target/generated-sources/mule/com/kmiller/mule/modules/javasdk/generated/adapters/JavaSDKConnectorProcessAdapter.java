
package com.kmiller.mule.modules.javasdk.generated.adapters;

import com.kmiller.mule.modules.javasdk.JavaSDKConnector;
import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>JavaSDKConnectorProcessAdapter</code> is a wrapper around {@link JavaSDKConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2018-02-16T10:20:49-05:00", comments = "Build UNNAMED.2793.f49b6c7")
public class JavaSDKConnectorProcessAdapter
    extends JavaSDKConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<JavaSDKConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, JavaSDKConnectorCapabilitiesAdapter> getProcessTemplate() {
        final JavaSDKConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,JavaSDKConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, JavaSDKConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, JavaSDKConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
