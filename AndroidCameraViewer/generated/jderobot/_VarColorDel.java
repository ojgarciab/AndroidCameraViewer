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
// Generated from file `varcolor.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

public interface _VarColorDel extends Ice._ObjectDel
{
    ImageDescription getDescription(java.util.Map<String, String> __ctx, Ice.Instrumentation.InvocationObserver __obsv)
        throws IceInternal.LocalExceptionWrapper;

    ImageData getData(java.util.Map<String, String> __ctx, Ice.Instrumentation.InvocationObserver __obsv)
        throws IceInternal.LocalExceptionWrapper,
               DataNotExistException,
               HardwareFailedException;
}