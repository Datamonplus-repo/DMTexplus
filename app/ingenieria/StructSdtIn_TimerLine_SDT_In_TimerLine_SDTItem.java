package app.ingenieria ;
import com.genexus.*;

public final  class StructSdtIn_TimerLine_SDT_In_TimerLine_SDTItem implements Cloneable, java.io.Serializable
{
   public StructSdtIn_TimerLine_SDT_In_TimerLine_SDTItem( )
   {
      this( -1, new ModelContext( StructSdtIn_TimerLine_SDT_In_TimerLine_SDTItem.class ));
   }

   public StructSdtIn_TimerLine_SDT_In_TimerLine_SDTItem( int remoteHandle ,
                                                          ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Xvalue = cal.getTime() ;
      gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Title = "" ;
      gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Xvalue_N = (byte)(1) ;
   }

   public Object clone()
   {
      Object cloned = null;
      try
      {
         cloned = super.clone();
      }catch (CloneNotSupportedException e){ ; }
      return cloned;
   }

   public java.util.Date getXvalue( )
   {
      return gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Xvalue ;
   }

   public void setXvalue( java.util.Date value )
   {
      gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Xvalue_N = (byte)(0) ;
      gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Xvalue = value ;
   }

   public short getYvalue( )
   {
      return gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Yvalue ;
   }

   public void setYvalue( short value )
   {
      gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Yvalue = value ;
   }

   public String getTitle( )
   {
      return gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Title ;
   }

   public void setTitle( String value )
   {
      gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_N = (byte)(0) ;
      gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Title = value ;
   }

   protected byte gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Xvalue_N ;
   protected byte gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_N ;
   protected short gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Yvalue ;
   protected String gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Title ;
   protected java.util.Date gxTv_SdtIn_TimerLine_SDT_In_TimerLine_SDTItem_Xvalue ;
}

