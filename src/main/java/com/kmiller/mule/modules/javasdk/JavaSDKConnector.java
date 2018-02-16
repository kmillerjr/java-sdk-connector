package com.kmiller.mule.modules.javasdk;

import java.util.Map;
import java.util.ArrayList;
import java.util.List;

import org.mule.api.annotations.Query;
import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.param.MetaDataKeyParam;
import org.mule.api.annotations.MetaDataScope;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.lifecycle.OnException;
import org.mule.api.annotations.param.Default;

import com.kmiller.mule.modules.javasdk.config.ConnectorConfig;
import com.kmiller.mule.modules.javasdk.error.ErrorHandler;

@Connector(name="java-sdk", friendlyName="JavaSDK")
@MetaDataScope( DataSenseResolver.class )
@OnException(handler=ErrorHandler.class)
public class JavaSDKConnector {

    @Config
    ConnectorConfig config;

    /**
     * Custom processor
     *
     * @param friend Name to be used to generate a greeting message.
     * @return A greeting message
     */
    @Processor
    public String greet(String friend) {
        /*
         * MESSAGE PROCESSOR CODE GOES HERE
         */
        return config.getGreeting() + " " + friend + ". " + config.getReply();
    }

    /**
     * Description for query
     *
     *  @param query The dsql query
     *  @return List of elements that match the criteria
     */
    @Processor
    public List<Object> queryProcessor(@Query String query) {
        //TODO
        /*
         * MESSAGE PROCESSOR CODE GOES HERE
         */
        return new ArrayList<Object>();
    }

    /**
     * DataSense processor

     * @param key Key to be used to populate the entity
     * @param entity Map that represents the entity
     * @return Some string
     */
    @Processor
    public Map<String,Object> addEntity( @MetaDataKeyParam String key, @Default("#[payload]") Map<String,Object> entity) {
        /*
         * USE THE KEY AND THE MAP TO DO SOMETHING
         */
        return entity;
    }

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}