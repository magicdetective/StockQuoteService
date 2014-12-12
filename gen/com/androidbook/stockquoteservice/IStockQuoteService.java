/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: E:\\adt-bundle-windows-x86-20131030\\eclipse\\workspace\\StockQuoteService\\src\\com\\androidbook\\stockquoteservice\\IStockQuoteService.aidl
 */
package com.androidbook.stockquoteservice;
public interface IStockQuoteService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.androidbook.stockquoteservice.IStockQuoteService
{
private static final java.lang.String DESCRIPTOR = "com.androidbook.stockquoteservice.IStockQuoteService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.androidbook.stockquoteservice.IStockQuoteService interface,
 * generating a proxy if needed.
 */
public static com.androidbook.stockquoteservice.IStockQuoteService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.androidbook.stockquoteservice.IStockQuoteService))) {
return ((com.androidbook.stockquoteservice.IStockQuoteService)iin);
}
return new com.androidbook.stockquoteservice.IStockQuoteService.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_getQuote:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
double _result = this.getQuote(_arg0);
reply.writeNoException();
reply.writeDouble(_result);
return true;
}
case TRANSACTION_getPersonQuote:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
com.androidbook.stockquoteservice.stock2.Person _arg1;
if ((0!=data.readInt())) {
_arg1 = com.androidbook.stockquoteservice.stock2.Person.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
java.lang.String _result = this.getPersonQuote(_arg0, _arg1);
reply.writeNoException();
reply.writeString(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.androidbook.stockquoteservice.IStockQuoteService
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public double getQuote(java.lang.String ticker) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
double _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(ticker);
mRemote.transact(Stub.TRANSACTION_getQuote, _data, _reply, 0);
_reply.readException();
_result = _reply.readDouble();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getPersonQuote(java.lang.String ticker, com.androidbook.stockquoteservice.stock2.Person requester) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(ticker);
if ((requester!=null)) {
_data.writeInt(1);
requester.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getPersonQuote, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_getQuote = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getPersonQuote = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public double getQuote(java.lang.String ticker) throws android.os.RemoteException;
public java.lang.String getPersonQuote(java.lang.String ticker, com.androidbook.stockquoteservice.stock2.Person requester) throws android.os.RemoteException;
}
