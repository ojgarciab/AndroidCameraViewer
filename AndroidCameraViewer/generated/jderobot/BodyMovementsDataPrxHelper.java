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
// Generated from file `bodymovements.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

public final class BodyMovementsDataPrxHelper extends Ice.ObjectPrxHelperBase implements BodyMovementsDataPrx
{
    public static BodyMovementsDataPrx checkedCast(Ice.ObjectPrx __obj)
    {
        BodyMovementsDataPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof BodyMovementsDataPrx)
            {
                __d = (BodyMovementsDataPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId()))
                {
                    BodyMovementsDataPrxHelper __h = new BodyMovementsDataPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static BodyMovementsDataPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        BodyMovementsDataPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof BodyMovementsDataPrx)
            {
                __d = (BodyMovementsDataPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId(), __ctx))
                {
                    BodyMovementsDataPrxHelper __h = new BodyMovementsDataPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static BodyMovementsDataPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        BodyMovementsDataPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId()))
                {
                    BodyMovementsDataPrxHelper __h = new BodyMovementsDataPrxHelper();
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

    public static BodyMovementsDataPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        BodyMovementsDataPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId(), __ctx))
                {
                    BodyMovementsDataPrxHelper __h = new BodyMovementsDataPrxHelper();
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

    public static BodyMovementsDataPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        BodyMovementsDataPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof BodyMovementsDataPrx)
            {
                __d = (BodyMovementsDataPrx)__obj;
            }
            else
            {
                BodyMovementsDataPrxHelper __h = new BodyMovementsDataPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static BodyMovementsDataPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        BodyMovementsDataPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            BodyMovementsDataPrxHelper __h = new BodyMovementsDataPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::jderobot::BodyMovementsData"
    };

    public static String ice_staticId()
    {
        return __ids[1];
    }

    protected Ice._ObjectDelM __createDelegateM()
    {
        return new _BodyMovementsDataDelM();
    }

    protected Ice._ObjectDelD __createDelegateD()
    {
        return new _BodyMovementsDataDelD();
    }

    public static void __write(IceInternal.BasicStream __os, BodyMovementsDataPrx v)
    {
        __os.writeProxy(v);
    }

    public static BodyMovementsDataPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            BodyMovementsDataPrxHelper result = new BodyMovementsDataPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
