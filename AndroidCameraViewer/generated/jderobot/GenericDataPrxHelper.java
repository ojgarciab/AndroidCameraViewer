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
// Generated from file `genericData.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

/**
 * Static description of the image source.
 **/
public final class GenericDataPrxHelper extends Ice.ObjectPrxHelperBase implements GenericDataPrx
{
    public static GenericDataPrx checkedCast(Ice.ObjectPrx __obj)
    {
        GenericDataPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof GenericDataPrx)
            {
                __d = (GenericDataPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId()))
                {
                    GenericDataPrxHelper __h = new GenericDataPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static GenericDataPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        GenericDataPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof GenericDataPrx)
            {
                __d = (GenericDataPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId(), __ctx))
                {
                    GenericDataPrxHelper __h = new GenericDataPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static GenericDataPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        GenericDataPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId()))
                {
                    GenericDataPrxHelper __h = new GenericDataPrxHelper();
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

    public static GenericDataPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        GenericDataPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId(), __ctx))
                {
                    GenericDataPrxHelper __h = new GenericDataPrxHelper();
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

    public static GenericDataPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        GenericDataPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof GenericDataPrx)
            {
                __d = (GenericDataPrx)__obj;
            }
            else
            {
                GenericDataPrxHelper __h = new GenericDataPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static GenericDataPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        GenericDataPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            GenericDataPrxHelper __h = new GenericDataPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::jderobot::GenericData"
    };

    public static String ice_staticId()
    {
        return __ids[1];
    }

    protected Ice._ObjectDelM __createDelegateM()
    {
        return new _GenericDataDelM();
    }

    protected Ice._ObjectDelD __createDelegateD()
    {
        return new _GenericDataDelD();
    }

    public static void __write(IceInternal.BasicStream __os, GenericDataPrx v)
    {
        __os.writeProxy(v);
    }

    public static GenericDataPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            GenericDataPrxHelper result = new GenericDataPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
