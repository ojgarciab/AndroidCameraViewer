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
// Generated from file `recorder.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

public final class recorderPrxHelper extends Ice.ObjectPrxHelperBase implements recorderPrx
{
    private static final String __saveLog_name = "saveLog";

    public boolean saveLog(String name, int seconds)
    {
        return saveLog(name, seconds, null, false);
    }

    public boolean saveLog(String name, int seconds, java.util.Map<String, String> __ctx)
    {
        return saveLog(name, seconds, __ctx, true);
    }

    private boolean saveLog(String name, int seconds, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "saveLog", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __checkTwowayOnly("saveLog");
                    __delBase = __getDelegate(false);
                    _recorderDel __del = (_recorderDel)__delBase;
                    return __del.saveLog(name, seconds, __ctx, __observer);
                }
                catch(IceInternal.LocalExceptionWrapper __ex)
                {
                    __handleExceptionWrapper(__delBase, __ex, __observer);
                }
                catch(Ice.LocalException __ex)
                {
                    __cnt = __handleException(__delBase, __ex, null, __cnt, __observer);
                }
            }
        }
        finally
        {
            if(__observer != null)
            {
                __observer.detach();
            }
        }
    }

    public Ice.AsyncResult begin_saveLog(String name, int seconds)
    {
        return begin_saveLog(name, seconds, null, false, null);
    }

    public Ice.AsyncResult begin_saveLog(String name, int seconds, java.util.Map<String, String> __ctx)
    {
        return begin_saveLog(name, seconds, __ctx, true, null);
    }

    public Ice.AsyncResult begin_saveLog(String name, int seconds, Ice.Callback __cb)
    {
        return begin_saveLog(name, seconds, null, false, __cb);
    }

    public Ice.AsyncResult begin_saveLog(String name, int seconds, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_saveLog(name, seconds, __ctx, true, __cb);
    }

    public Ice.AsyncResult begin_saveLog(String name, int seconds, Callback_recorder_saveLog __cb)
    {
        return begin_saveLog(name, seconds, null, false, __cb);
    }

    public Ice.AsyncResult begin_saveLog(String name, int seconds, java.util.Map<String, String> __ctx, Callback_recorder_saveLog __cb)
    {
        return begin_saveLog(name, seconds, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_saveLog(String name, int seconds, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__saveLog_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __saveLog_name, __cb);
        try
        {
            __result.__prepare(__saveLog_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(name);
            __os.writeInt(seconds);
            __result.__endWriteParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public boolean end_saveLog(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __saveLog_name);
        boolean __ok = __result.__wait();
        try
        {
            if(!__ok)
            {
                try
                {
                    __result.__throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.__startReadParams();
            boolean __ret;
            __ret = __is.readBool();
            __result.__endReadParams();
            return __ret;
        }
        catch(Ice.LocalException ex)
        {
            Ice.Instrumentation.InvocationObserver __obsv = __result.__getObserver();
            if(__obsv != null)
            {
                __obsv.failed(ex.ice_name());
            }
            throw ex;
        }
    }

    private static final String __saveVideo_name = "saveVideo";

    public boolean saveVideo(String path, String name, int seconds)
    {
        return saveVideo(path, name, seconds, null, false);
    }

    public boolean saveVideo(String path, String name, int seconds, java.util.Map<String, String> __ctx)
    {
        return saveVideo(path, name, seconds, __ctx, true);
    }

    private boolean saveVideo(String path, String name, int seconds, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "saveVideo", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __checkTwowayOnly("saveVideo");
                    __delBase = __getDelegate(false);
                    _recorderDel __del = (_recorderDel)__delBase;
                    return __del.saveVideo(path, name, seconds, __ctx, __observer);
                }
                catch(IceInternal.LocalExceptionWrapper __ex)
                {
                    __handleExceptionWrapper(__delBase, __ex, __observer);
                }
                catch(Ice.LocalException __ex)
                {
                    __cnt = __handleException(__delBase, __ex, null, __cnt, __observer);
                }
            }
        }
        finally
        {
            if(__observer != null)
            {
                __observer.detach();
            }
        }
    }

    public Ice.AsyncResult begin_saveVideo(String path, String name, int seconds)
    {
        return begin_saveVideo(path, name, seconds, null, false, null);
    }

    public Ice.AsyncResult begin_saveVideo(String path, String name, int seconds, java.util.Map<String, String> __ctx)
    {
        return begin_saveVideo(path, name, seconds, __ctx, true, null);
    }

    public Ice.AsyncResult begin_saveVideo(String path, String name, int seconds, Ice.Callback __cb)
    {
        return begin_saveVideo(path, name, seconds, null, false, __cb);
    }

    public Ice.AsyncResult begin_saveVideo(String path, String name, int seconds, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_saveVideo(path, name, seconds, __ctx, true, __cb);
    }

    public Ice.AsyncResult begin_saveVideo(String path, String name, int seconds, Callback_recorder_saveVideo __cb)
    {
        return begin_saveVideo(path, name, seconds, null, false, __cb);
    }

    public Ice.AsyncResult begin_saveVideo(String path, String name, int seconds, java.util.Map<String, String> __ctx, Callback_recorder_saveVideo __cb)
    {
        return begin_saveVideo(path, name, seconds, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_saveVideo(String path, String name, int seconds, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__saveVideo_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __saveVideo_name, __cb);
        try
        {
            __result.__prepare(__saveVideo_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(path);
            __os.writeString(name);
            __os.writeInt(seconds);
            __result.__endWriteParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public boolean end_saveVideo(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __saveVideo_name);
        boolean __ok = __result.__wait();
        try
        {
            if(!__ok)
            {
                try
                {
                    __result.__throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.__startReadParams();
            boolean __ret;
            __ret = __is.readBool();
            __result.__endReadParams();
            return __ret;
        }
        catch(Ice.LocalException ex)
        {
            Ice.Instrumentation.InvocationObserver __obsv = __result.__getObserver();
            if(__obsv != null)
            {
                __obsv.failed(ex.ice_name());
            }
            throw ex;
        }
    }

    public static recorderPrx checkedCast(Ice.ObjectPrx __obj)
    {
        recorderPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof recorderPrx)
            {
                __d = (recorderPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId()))
                {
                    recorderPrxHelper __h = new recorderPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static recorderPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        recorderPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof recorderPrx)
            {
                __d = (recorderPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId(), __ctx))
                {
                    recorderPrxHelper __h = new recorderPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static recorderPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        recorderPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId()))
                {
                    recorderPrxHelper __h = new recorderPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static recorderPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        recorderPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId(), __ctx))
                {
                    recorderPrxHelper __h = new recorderPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static recorderPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        recorderPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof recorderPrx)
            {
                __d = (recorderPrx)__obj;
            }
            else
            {
                recorderPrxHelper __h = new recorderPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static recorderPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        recorderPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            recorderPrxHelper __h = new recorderPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::jderobot::recorder"
    };

    public static String ice_staticId()
    {
        return __ids[1];
    }

    protected Ice._ObjectDelM __createDelegateM()
    {
        return new _recorderDelM();
    }

    protected Ice._ObjectDelD __createDelegateD()
    {
        return new _recorderDelD();
    }

    public static void __write(IceInternal.BasicStream __os, recorderPrx v)
    {
        __os.writeProxy(v);
    }

    public static recorderPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            recorderPrxHelper result = new recorderPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
