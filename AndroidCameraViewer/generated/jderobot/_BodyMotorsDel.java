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
// Generated from file `bodymotors.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

public interface _BodyMotorsDel extends Ice._ObjectDel
{
    BodyMotorsParam getBodyMotorsParam(MotorsName name, BodySide side, java.util.Map<String, String> __ctx, Ice.Instrumentation.InvocationObserver __obsv)
        throws IceInternal.LocalExceptionWrapper;

    int setBodyMotorsData(MotorsName name, BodySide side, float angle, float speed, java.util.Map<String, String> __ctx, Ice.Instrumentation.InvocationObserver __obsv)
        throws IceInternal.LocalExceptionWrapper;
}
