// **********************************************************************
//
// Copyright (c) 2003-2013 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.5.1
//
// <auto-generated>
//
// Generated from file `jcm.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

public class FQTopicName implements java.lang.Cloneable, java.io.Serializable
{
    public String platform;

    public String component;

    public String iface;

    public String topic;

    public FQTopicName()
    {
    }

    public FQTopicName(String platform, String component, String iface, String topic)
    {
        this.platform = platform;
        this.component = component;
        this.iface = iface;
        this.topic = topic;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        FQTopicName _r = null;
        if(rhs instanceof FQTopicName)
        {
            _r = (FQTopicName)rhs;
        }

        if(_r != null)
        {
            if(platform != _r.platform)
            {
                if(platform == null || _r.platform == null || !platform.equals(_r.platform))
                {
                    return false;
                }
            }
            if(component != _r.component)
            {
                if(component == null || _r.component == null || !component.equals(_r.component))
                {
                    return false;
                }
            }
            if(iface != _r.iface)
            {
                if(iface == null || _r.iface == null || !iface.equals(_r.iface))
                {
                    return false;
                }
            }
            if(topic != _r.topic)
            {
                if(topic == null || _r.topic == null || !topic.equals(_r.topic))
                {
                    return false;
                }
            }

            return true;
        }

        return false;
    }

    public int
    hashCode()
    {
        int __h = 5381;
        __h = IceInternal.HashUtil.hashAdd(__h, "::jderobot::FQTopicName");
        __h = IceInternal.HashUtil.hashAdd(__h, platform);
        __h = IceInternal.HashUtil.hashAdd(__h, component);
        __h = IceInternal.HashUtil.hashAdd(__h, iface);
        __h = IceInternal.HashUtil.hashAdd(__h, topic);
        return __h;
    }

    public java.lang.Object
    clone()
    {
        java.lang.Object o = null;
        try
        {
            o = super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return o;
    }

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeString(platform);
        __os.writeString(component);
        __os.writeString(iface);
        __os.writeString(topic);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        platform = __is.readString();
        component = __is.readString();
        iface = __is.readString();
        topic = __is.readString();
    }

    public static final long serialVersionUID = 9080651845689147532L;
}