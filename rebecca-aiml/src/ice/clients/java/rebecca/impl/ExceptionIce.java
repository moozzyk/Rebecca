// **********************************************************************
//
// Copyright (c) 2003-2007 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

// Ice version 3.2.1

package rebecca.impl;

public class ExceptionIce extends Ice.UserException
{
    public ExceptionIce()
    {
    }

    public ExceptionIce(String what)
    {
        this.what = what;
    }

    public String
    ice_name()
    {
        return "rebecca::impl::ExceptionIce";
    }

    public String what;

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeString("::rebecca::impl::ExceptionIce");
        __os.startWriteSlice();
        __os.writeString(what);
        __os.endWriteSlice();
    }

    public void
    __read(IceInternal.BasicStream __is, boolean __rid)
    {
        if(__rid)
        {
            __is.readString();
        }
        __is.startReadSlice();
        what = __is.readString();
        __is.endReadSlice();
    }

    public void
    __write(Ice.OutputStream __outS)
    {
        Ice.MarshalException ex = new Ice.MarshalException();
        ex.reason = "exception rebecca::impl::ExceptionIce was not generated with stream support";
        throw ex;
    }

    public void
    __read(Ice.InputStream __inS, boolean __rid)
    {
        Ice.MarshalException ex = new Ice.MarshalException();
        ex.reason = "exception rebecca::impl::ExceptionIce was not generated with stream support";
        throw ex;
    }
}
