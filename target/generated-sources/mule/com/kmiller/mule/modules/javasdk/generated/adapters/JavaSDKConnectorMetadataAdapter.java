
package com.kmiller.mule.modules.javasdk.generated.adapters;

import com.kmiller.mule.modules.javasdk.JavaSDKConnector;
import javax.annotation.Generated;
import org.mule.api.MetadataAware;


/**
 * A <code>JavaSDKConnectorMetadataAdapter</code> is a wrapper around {@link JavaSDKConnector } that adds support for querying metadata about the extension.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2018-02-16T10:20:49-05:00", comments = "Build UNNAMED.2793.f49b6c7")
public class JavaSDKConnectorMetadataAdapter
    extends JavaSDKConnectorCapabilitiesAdapter
    implements MetadataAware
{

    private final static String MODULE_NAME = "JavaSDK";
    private final static String MODULE_VERSION = "1.0.0-SNAPSHOT";
    private final static String DEVKIT_VERSION = "3.9.0";
    private final static String DEVKIT_BUILD = "UNNAMED.2793.f49b6c7";
    private final static String MIN_MULE_VERSION = "3.5.0";

    public String getModuleName() {
        return MODULE_NAME;
    }

    public String getModuleVersion() {
        return MODULE_VERSION;
    }

    public String getDevkitVersion() {
        return DEVKIT_VERSION;
    }

    public String getDevkitBuild() {
        return DEVKIT_BUILD;
    }

    public String getMinMuleVersion() {
        return MIN_MULE_VERSION;
    }

}
