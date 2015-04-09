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
// Generated from file `remoteConfig.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

public final class remoteConfigPrxHelper extends Ice.ObjectPrxHelperBase implements remoteConfigPrx
{
    private static final String __initConfiguration_name = "initConfiguration";

    public int initConfiguration()
    {
        return initConfiguration(null, false);
    }

    public int initConfiguration(java.util.Map<String, String> __ctx)
    {
        return initConfiguration(__ctx, true);
    }

    private int initConfiguration(java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "initConfiguration", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __checkTwowayOnly("initConfiguration");
                    __delBase = __getDelegate(false);
                    _remoteConfigDel __del = (_remoteConfigDel)__delBase;
                    return __del.initConfiguration(__ctx, __observer);
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

    public Ice.AsyncResult begin_initConfiguration()
    {
        return begin_initConfiguration(null, false, null);
    }

    public Ice.AsyncResult begin_initConfiguration(java.util.Map<String, String> __ctx)
    {
        return begin_initConfiguration(__ctx, true, null);
    }

    public Ice.AsyncResult begin_initConfiguration(Ice.Callback __cb)
    {
        return begin_initConfiguration(null, false, __cb);
    }

    public Ice.AsyncResult begin_initConfiguration(java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_initConfiguration(__ctx, true, __cb);
    }

    public Ice.AsyncResult begin_initConfiguration(Callback_remoteConfig_initConfiguration __cb)
    {
        return begin_initConfiguration(null, false, __cb);
    }

    public Ice.AsyncResult begin_initConfiguration(java.util.Map<String, String> __ctx, Callback_remoteConfig_initConfiguration __cb)
    {
        return begin_initConfiguration(__ctx, true, __cb);
    }

    private Ice.AsyncResult begin_initConfiguration(java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__initConfiguration_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __initConfiguration_name, __cb);
        try
        {
            __result.__prepare(__initConfiguration_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            __result.__writeEmptyParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public int end_initConfiguration(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __initConfiguration_name);
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
            int __ret;
            __ret = __is.readInt();
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

    private static final String __read_name = "read";

    public String read(int id)
    {
        return read(id, null, false);
    }

    public String read(int id, java.util.Map<String, String> __ctx)
    {
        return read(id, __ctx, true);
    }

    private String read(int id, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "read", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __checkTwowayOnly("read");
                    __delBase = __getDelegate(false);
                    _remoteConfigDel __del = (_remoteConfigDel)__delBase;
                    return __del.read(id, __ctx, __observer);
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

    public Ice.AsyncResult begin_read(int id)
    {
        return begin_read(id, null, false, null);
    }

    public Ice.AsyncResult begin_read(int id, java.util.Map<String, String> __ctx)
    {
        return begin_read(id, __ctx, true, null);
    }

    public Ice.AsyncResult begin_read(int id, Ice.Callback __cb)
    {
        return begin_read(id, null, false, __cb);
    }

    public Ice.AsyncResult begin_read(int id, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_read(id, __ctx, true, __cb);
    }

    public Ice.AsyncResult begin_read(int id, Callback_remoteConfig_read __cb)
    {
        return begin_read(id, null, false, __cb);
    }

    public Ice.AsyncResult begin_read(int id, java.util.Map<String, String> __ctx, Callback_remoteConfig_read __cb)
    {
        return begin_read(id, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_read(int id, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__read_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __read_name, __cb);
        try
        {
            __result.__prepare(__read_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeInt(id);
            __result.__endWriteParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public String end_read(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __read_name);
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
            String __ret;
            __ret = __is.readString();
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

    private static final String __setConfiguration_name = "setConfiguration";

    public int setConfiguration(int id)
    {
        return setConfiguration(id, null, false);
    }

    public int setConfiguration(int id, java.util.Map<String, String> __ctx)
    {
        return setConfiguration(id, __ctx, true);
    }

    private int setConfiguration(int id, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "setConfiguration", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __checkTwowayOnly("setConfiguration");
                    __delBase = __getDelegate(false);
                    _remoteConfigDel __del = (_remoteConfigDel)__delBase;
                    return __del.setConfiguration(id, __ctx, __observer);
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

    public Ice.AsyncResult begin_setConfiguration(int id)
    {
        return begin_setConfiguration(id, null, false, null);
    }

    public Ice.AsyncResult begin_setConfiguration(int id, java.util.Map<String, String> __ctx)
    {
        return begin_setConfiguration(id, __ctx, true, null);
    }

    public Ice.AsyncResult begin_setConfiguration(int id, Ice.Callback __cb)
    {
        return begin_setConfiguration(id, null, false, __cb);
    }

    public Ice.AsyncResult begin_setConfiguration(int id, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_setConfiguration(id, __ctx, true, __cb);
    }

    public Ice.AsyncResult begin_setConfiguration(int id, Callback_remoteConfig_setConfiguration __cb)
    {
        return begin_setConfiguration(id, null, false, __cb);
    }

    public Ice.AsyncResult begin_setConfiguration(int id, java.util.Map<String, String> __ctx, Callback_remoteConfig_setConfiguration __cb)
    {
        return begin_setConfiguration(id, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_setConfiguration(int id, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__setConfiguration_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __setConfiguration_name, __cb);
        try
        {
            __result.__prepare(__setConfiguration_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeInt(id);
            __result.__endWriteParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public int end_setConfiguration(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __setConfiguration_name);
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
            int __ret;
            __ret = __is.readInt();
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

    private static final String __write_name = "write";

    public int write(String data, int id)
    {
        return write(data, id, null, false);
    }

    public int write(String data, int id, java.util.Map<String, String> __ctx)
    {
        return write(data, id, __ctx, true);
    }

    private int write(String data, int id, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "write", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __checkTwowayOnly("write");
                    __delBase = __getDelegate(false);
                    _remoteConfigDel __del = (_remoteConfigDel)__delBase;
                    return __del.write(data, id, __ctx, __observer);
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

    public Ice.AsyncResult begin_write(String data, int id)
    {
        return begin_write(data, id, null, false, null);
    }

    public Ice.AsyncResult begin_write(String data, int id, java.util.Map<String, String> __ctx)
    {
        return begin_write(data, id, __ctx, true, null);
    }

    public Ice.AsyncResult begin_write(String data, int id, Ice.Callback __cb)
    {
        return begin_write(data, id, null, false, __cb);
    }

    public Ice.AsyncResult begin_write(String data, int id, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_write(data, id, __ctx, true, __cb);
    }

    public Ice.AsyncResult begin_write(String data, int id, Callback_remoteConfig_write __cb)
    {
        return begin_write(data, id, null, false, __cb);
    }

    public Ice.AsyncResult begin_write(String data, int id, java.util.Map<String, String> __ctx, Callback_remoteConfig_write __cb)
    {
        return begin_write(data, id, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_write(String data, int id, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__write_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __write_name, __cb);
        try
        {
            __result.__prepare(__write_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(data);
            __os.writeInt(id);
            __result.__endWriteParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public int end_write(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __write_name);
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
            int __ret;
            __ret = __is.readInt();
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

    public static remoteConfigPrx checkedCast(Ice.ObjectPrx __obj)
    {
        remoteConfigPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof remoteConfigPrx)
            {
                __d = (remoteConfigPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId()))
                {
                    remoteConfigPrxHelper __h = new remoteConfigPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static remoteConfigPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        remoteConfigPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof remoteConfigPrx)
            {
                __d = (remoteConfigPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId(), __ctx))
                {
                    remoteConfigPrxHelper __h = new remoteConfigPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static remoteConfigPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        remoteConfigPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId()))
                {
                    remoteConfigPrxHelper __h = new remoteConfigPrxHelper();
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

    public static remoteConfigPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        remoteConfigPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId(), __ctx))
                {
                    remoteConfigPrxHelper __h = new remoteConfigPrxHelper();
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

    public static remoteConfigPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        remoteConfigPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof remoteConfigPrx)
            {
                __d = (remoteConfigPrx)__obj;
            }
            else
            {
                remoteConfigPrxHelper __h = new remoteConfigPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static remoteConfigPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        remoteConfigPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            remoteConfigPrxHelper __h = new remoteConfigPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::jderobot::remoteConfig"
    };

    public static String ice_staticId()
    {
        return __ids[1];
    }

    protected Ice._ObjectDelM __createDelegateM()
    {
        return new _remoteConfigDelM();
    }

    protected Ice._ObjectDelD __createDelegateD()
    {
        return new _remoteConfigDelD();
    }

    public static void __write(IceInternal.BasicStream __os, remoteConfigPrx v)
    {
        __os.writeProxy(v);
    }

    public static remoteConfigPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            remoteConfigPrxHelper result = new remoteConfigPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
