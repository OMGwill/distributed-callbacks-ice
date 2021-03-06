// **********************************************************************
//
// Copyright (c) 2003-2016 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.2
//
// <auto-generated>
//
// Generated from file `Multiples.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package Multiples;

/**
 * Provides type-specific helper functions.
 **/
public final class MultipleServerPrxHelper extends Ice.ObjectPrxHelperBase implements MultipleServerPrx
{
    private static final String __getRandomMultiple_name = "getRandomMultiple";

    public int getRandomMultiple(int factor)
    {
        return getRandomMultiple(factor, null, false);
    }

    public int getRandomMultiple(int factor, java.util.Map<String, String> __ctx)
    {
        return getRandomMultiple(factor, __ctx, true);
    }

    private int getRandomMultiple(int factor, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        __checkTwowayOnly(__getRandomMultiple_name);
        return end_getRandomMultiple(begin_getRandomMultiple(factor, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_getRandomMultiple(int factor)
    {
        return begin_getRandomMultiple(factor, null, false, false, null);
    }

    public Ice.AsyncResult begin_getRandomMultiple(int factor, java.util.Map<String, String> __ctx)
    {
        return begin_getRandomMultiple(factor, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_getRandomMultiple(int factor, Ice.Callback __cb)
    {
        return begin_getRandomMultiple(factor, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_getRandomMultiple(int factor, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_getRandomMultiple(factor, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_getRandomMultiple(int factor, Callback_MultipleServer_getRandomMultiple __cb)
    {
        return begin_getRandomMultiple(factor, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_getRandomMultiple(int factor, java.util.Map<String, String> __ctx, Callback_MultipleServer_getRandomMultiple __cb)
    {
        return begin_getRandomMultiple(factor, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_getRandomMultiple(int factor, 
                                                   IceInternal.Functional_IntCallback __responseCb, 
                                                   IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_getRandomMultiple(factor, null, false, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_getRandomMultiple(int factor, 
                                                   IceInternal.Functional_IntCallback __responseCb, 
                                                   IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                   IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getRandomMultiple(factor, null, false, false, __responseCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_getRandomMultiple(int factor, 
                                                   java.util.Map<String, String> __ctx, 
                                                   IceInternal.Functional_IntCallback __responseCb, 
                                                   IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_getRandomMultiple(factor, __ctx, true, false, __responseCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_getRandomMultiple(int factor, 
                                                   java.util.Map<String, String> __ctx, 
                                                   IceInternal.Functional_IntCallback __responseCb, 
                                                   IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                   IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getRandomMultiple(factor, __ctx, true, false, __responseCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_getRandomMultiple(int factor, 
                                                    java.util.Map<String, String> __ctx, 
                                                    boolean __explicitCtx, 
                                                    boolean __synchronous, 
                                                    IceInternal.Functional_IntCallback __responseCb, 
                                                    IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                    IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getRandomMultiple(factor, __ctx, __explicitCtx, __synchronous, 
                                       new IceInternal.Functional_TwowayCallbackInt(__responseCb, __exceptionCb, __sentCb)
                                           {
                                               public final void __completed(Ice.AsyncResult __result)
                                               {
                                                   MultipleServerPrxHelper.__getRandomMultiple_completed(this, __result);
                                               }
                                           });
    }

    private Ice.AsyncResult begin_getRandomMultiple(int factor, 
                                                    java.util.Map<String, String> __ctx, 
                                                    boolean __explicitCtx, 
                                                    boolean __synchronous, 
                                                    IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__getRandomMultiple_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__getRandomMultiple_name, __cb);
        try
        {
            __result.prepare(__getRandomMultiple_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeInt(factor);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public int end_getRandomMultiple(Ice.AsyncResult __iresult)
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __getRandomMultiple_name);
        try
        {
            if(!__result.__wait())
            {
                try
                {
                    __result.throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.startReadParams();
            int __ret;
            __ret = __is.readInt();
            __result.endReadParams();
            return __ret;
        }
        finally
        {
            if(__result != null)
            {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __getRandomMultiple_completed(Ice.TwowayCallbackInt __cb, Ice.AsyncResult __result)
    {
        Multiples.MultipleServerPrx __proxy = (Multiples.MultipleServerPrx)__result.getProxy();
        int __ret = 0;
        try
        {
            __ret = __proxy.end_getRandomMultiple(__result);
        }
        catch(Ice.LocalException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        catch(Ice.SystemException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        __cb.response(__ret);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static MultipleServerPrx checkedCast(Ice.ObjectPrx __obj)
    {
        return checkedCastImpl(__obj, ice_staticId(), MultipleServerPrx.class, MultipleServerPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static MultipleServerPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __ctx, ice_staticId(), MultipleServerPrx.class, MultipleServerPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static MultipleServerPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return checkedCastImpl(__obj, __facet, ice_staticId(), MultipleServerPrx.class, MultipleServerPrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static MultipleServerPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __facet, __ctx, ice_staticId(), MultipleServerPrx.class, MultipleServerPrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @return A proxy for this type.
     **/
    public static MultipleServerPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        return uncheckedCastImpl(__obj, MultipleServerPrx.class, MultipleServerPrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    public static MultipleServerPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return uncheckedCastImpl(__obj, __facet, MultipleServerPrx.class, MultipleServerPrxHelper.class);
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::Multiples::MultipleServer"
    };

    /**
     * Provides the Slice type ID of this type.
     * @return The Slice type ID.
     **/
    public static String ice_staticId()
    {
        return __ids[1];
    }

    public static void __write(IceInternal.BasicStream __os, MultipleServerPrx v)
    {
        __os.writeProxy(v);
    }

    public static MultipleServerPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            MultipleServerPrxHelper result = new MultipleServerPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
