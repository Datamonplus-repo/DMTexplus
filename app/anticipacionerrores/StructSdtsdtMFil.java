package app.anticipacionerrores ;
import com.genexus.*;

public final  class StructSdtsdtMFil implements Cloneable, java.io.Serializable
{
   public StructSdtsdtMFil( )
   {
      this( -1, new ModelContext( StructSdtsdtMFil.class ));
   }

   public StructSdtsdtMFil( int remoteHandle ,
                            ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtsdtMFil_Mfiltxt = "" ;
      gxTv_SdtsdtMFil_Mfilobj = "" ;
      gxTv_SdtsdtMFil_Mfilfec01 = cal.getTime() ;
      gxTv_SdtsdtMFil_Mfilfec02 = cal.getTime() ;
      gxTv_SdtsdtMFil_Mfilfec01_N = (byte)(1) ;
      gxTv_SdtsdtMFil_Mfilfec02_N = (byte)(1) ;
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

   public long getMfilid( )
   {
      return gxTv_SdtsdtMFil_Mfilid ;
   }

   public void setMfilid( long value )
   {
      gxTv_SdtsdtMFil_N = (byte)(0) ;
      gxTv_SdtsdtMFil_Mfilid = value ;
   }

   public String getMfiltxt( )
   {
      return gxTv_SdtsdtMFil_Mfiltxt ;
   }

   public void setMfiltxt( String value )
   {
      gxTv_SdtsdtMFil_N = (byte)(0) ;
      gxTv_SdtsdtMFil_Mfiltxt = value ;
   }

   public String getMfilobj( )
   {
      return gxTv_SdtsdtMFil_Mfilobj ;
   }

   public void setMfilobj( String value )
   {
      gxTv_SdtsdtMFil_N = (byte)(0) ;
      gxTv_SdtsdtMFil_Mfilobj = value ;
   }

   public java.util.Date getMfilfec01( )
   {
      return gxTv_SdtsdtMFil_Mfilfec01 ;
   }

   public void setMfilfec01( java.util.Date value )
   {
      gxTv_SdtsdtMFil_Mfilfec01_N = (byte)(0) ;
      gxTv_SdtsdtMFil_N = (byte)(0) ;
      gxTv_SdtsdtMFil_Mfilfec01 = value ;
   }

   public java.util.Date getMfilfec02( )
   {
      return gxTv_SdtsdtMFil_Mfilfec02 ;
   }

   public void setMfilfec02( java.util.Date value )
   {
      gxTv_SdtsdtMFil_Mfilfec02_N = (byte)(0) ;
      gxTv_SdtsdtMFil_N = (byte)(0) ;
      gxTv_SdtsdtMFil_Mfilfec02 = value ;
   }

   public long getMfilnum01( )
   {
      return gxTv_SdtsdtMFil_Mfilnum01 ;
   }

   public void setMfilnum01( long value )
   {
      gxTv_SdtsdtMFil_N = (byte)(0) ;
      gxTv_SdtsdtMFil_Mfilnum01 = value ;
   }

   public long getMfilnum02( )
   {
      return gxTv_SdtsdtMFil_Mfilnum02 ;
   }

   public void setMfilnum02( long value )
   {
      gxTv_SdtsdtMFil_N = (byte)(0) ;
      gxTv_SdtsdtMFil_Mfilnum02 = value ;
   }

   protected byte gxTv_SdtsdtMFil_Mfilfec01_N ;
   protected byte gxTv_SdtsdtMFil_Mfilfec02_N ;
   protected byte gxTv_SdtsdtMFil_N ;
   protected long gxTv_SdtsdtMFil_Mfilid ;
   protected long gxTv_SdtsdtMFil_Mfilnum01 ;
   protected long gxTv_SdtsdtMFil_Mfilnum02 ;
   protected String gxTv_SdtsdtMFil_Mfiltxt ;
   protected String gxTv_SdtsdtMFil_Mfilobj ;
   protected java.util.Date gxTv_SdtsdtMFil_Mfilfec01 ;
   protected java.util.Date gxTv_SdtsdtMFil_Mfilfec02 ;
}

