
package com.kmiller.mule.modules.javasdk.generated.adapters;

import com.kmiller.mule.modules.javasdk.JavaSDKConnector;
import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;


/**
 * A <code>JavaSDKConnectorCapabilitiesAdapter</code> is a wrapper around {@link JavaSDKConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2018-02-16T10:20:49-05:00", comments = "Build UNNAMED.2793.f49b6c7")
public class JavaSDKConnectorCapabilitiesAdapter
    extends JavaSDKConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
