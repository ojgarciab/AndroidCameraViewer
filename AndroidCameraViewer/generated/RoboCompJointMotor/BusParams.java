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
// Generated from file `jointmotor.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package RoboCompJointMotor;

public class BusParams implements java.lang.Cloneable, java.io.Serializable
{
    public String handler;

    public String device;

    public int numMotors;

    public int baudRate;

    public int basicPeriod;

    public BusParams()
    {
    }

    public BusParams(String handler, String device, int numMotors, int baudRate, int basicPeriod)
    {
        this.handler = handler;
        this.device = device;
        this.numMotors = numMotors;
        this.baudRate = baudRate;
        this.basicPeriod = basicPeriod;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        BusParams _r = null;
        if(rhs instanceof BusParams)
        {
            _r = (BusParams)rhs;
        }

        if(_r != null)
        {
            if(handler != _r.handler)
            {
                if(handler == null || _r.handler == null || !handler.equals(_r.handler))
                {
                    return false;
                }
            }
            if(device != _r.device)
            {
                if(device == null || _r.device == null || !device.equals(_r.device))
                {
                    return false;
                }
            }
            if(numMotors != _r.numMotors)
            {
                return false;
            }
            if(baudRate != _r.baudRate)
            {
                return false;
            }
            if(basicPeriod != _r.basicPeriod)
            {
                return false;
            }

            return true;
        }

        return false;
    }

    public int
    hashCode()
    {
        int __h = 5381;
        __h = IceInternal.HashUtil.hashAdd(__h, "::RoboCompJointMotor::BusParams");
        __h = IceInternal.HashUtil.hashAdd(__h, handler);
        __h = IceInternal.HashUtil.hashAdd(__h, device);
        __h = IceInternal.HashUtil.hashAdd(__h, numMotors);
        __h = IceInternal.HashUtil.hashAdd(__h, baudRate);
        __h = IceInternal.HashUtil.hashAdd(__h, basicPeriod);
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
        __os.writeString(handler);
        __os.writeString(device);
        __os.writeInt(numMotors);
        __os.writeInt(baudRate);
        __os.writeInt(basicPeriod);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        handler = __is.readString();
        device = __is.readString();
        numMotors = __is.readInt();
        baudRate = __is.readInt();
        basicPeriod = __is.readInt();
    }

    public static final long serialVersionUID = 8137472197762109769L;
}
