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
// Generated from file `bodyencoders.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

public abstract class Callback_BodyEncoders_getLegEncodersData extends Ice.TwowayCallback
{
    public abstract void response(LegEncodersData __ret);

    public final void __completed(Ice.AsyncResult __result)
    {
        BodyEncodersPrx __proxy = (BodyEncodersPrx)__result.getProxy();
        LegEncodersData __ret = null;
        try
        {
            __ret = __proxy.end_getLegEncodersData(__result);
        }
        catch(Ice.LocalException __ex)
        {
            exception(__ex);
            return;
        }
        response(__ret);
    }
}
