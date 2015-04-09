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
// Generated from file `exceptions.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

public class JderobotException extends Ice.UserException
{
    public JderobotException()
    {
    }

    public JderobotException(Throwable __cause)
    {
        super(__cause);
    }

    public JderobotException(String what)
    {
        this.what = what;
    }

    public JderobotException(String what, Throwable __cause)
    {
        super(__cause);
        this.what = what;
    }

    public String
    ice_name()
    {
        return "jderobot::JderobotException";
    }

    public String what;

    protected void
    __writeImpl(IceInternal.BasicStream __os)
    {
        __os.startWriteSlice("::jderobot::JderobotException", -1, true);
        __os.writeString(what);
        __os.endWriteSlice();
    }

    protected void
    __readImpl(IceInternal.BasicStream __is)
    {
        __is.startReadSlice();
        what = __is.readString();
        __is.endReadSlice();
    }

    public static final long serialVersionUID = 787444452469578545L;
}
