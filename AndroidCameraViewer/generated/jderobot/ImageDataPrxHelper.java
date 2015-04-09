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
// Generated from file `image.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

/**
 * A single image served as a sequence of bytes
 **/
public final class ImageDataPrxHelper extends Ice.ObjectPrxHelperBase implements ImageDataPrx
{
    public static ImageDataPrx checkedCast(Ice.ObjectPrx __obj)
    {
        ImageDataPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof ImageDataPrx)
            {
                __d = (ImageDataPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId()))
                {
                    ImageDataPrxHelper __h = new ImageDataPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static ImageDataPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        ImageDataPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof ImageDataPrx)
            {
                __d = (ImageDataPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId(), __ctx))
                {
                    ImageDataPrxHelper __h = new ImageDataPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static ImageDataPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        ImageDataPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId()))
                {
                    ImageDataPrxHelper __h = new ImageDataPrxHelper();
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

    public static ImageDataPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        ImageDataPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId(), __ctx))
                {
                    ImageDataPrxHelper __h = new ImageDataPrxHelper();
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

    public static ImageDataPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        ImageDataPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof ImageDataPrx)
            {
                __d = (ImageDataPrx)__obj;
            }
            else
            {
                ImageDataPrxHelper __h = new ImageDataPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static ImageDataPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        ImageDataPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            ImageDataPrxHelper __h = new ImageDataPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::jderobot::ImageData"
    };

    public static String ice_staticId()
    {
        return __ids[1];
    }

    protected Ice._ObjectDelM __createDelegateM()
    {
        return new _ImageDataDelM();
    }

    protected Ice._ObjectDelD __createDelegateD()
    {
        return new _ImageDataDelD();
    }

    public static void __write(IceInternal.BasicStream __os, ImageDataPrx v)
    {
        __os.writeProxy(v);
    }

    public static ImageDataPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            ImageDataPrxHelper result = new ImageDataPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
