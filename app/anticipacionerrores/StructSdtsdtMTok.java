package app.anticipacionerrores ;
import com.genexus.*;

public final  class StructSdtsdtMTok implements Cloneable, java.io.Serializable
{
   public StructSdtsdtMTok( )
   {
      this( -1, new ModelContext( StructSdtsdtMTok.class ));
   }

   public StructSdtsdtMTok( int remoteHandle ,
                            ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtsdtMTok_Mtknusu = "" ;
      gxTv_SdtsdtMTok_Mtknip = "" ;
      gxTv_SdtsdtMTok_Mtkn = "" ;
      gxTv_SdtsdtMTok_Mtknfec = cal.getTime() ;
      gxTv_SdtsdtMTok_Mtknven = cal.getTime() ;
      gxTv_SdtsdtMTok_Mtkndat = "" ;
      gxTv_SdtsdtMTok_Mtknfec_N = (byte)(1) ;
      gxTv_SdtsdtMTok_Mtknven_N = (byte)(1) ;
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

   public long getMtknid( )
   {
      return gxTv_SdtsdtMTok_Mtknid ;
   }

   public void setMtknid( long value )
   {
      gxTv_SdtsdtMTok_N = (byte)(0) ;
      gxTv_SdtsdtMTok_Mtknid = value ;
   }

   public String getMtknusu( )
   {
      return gxTv_SdtsdtMTok_Mtknusu ;
   }

   public void setMtknusu( String value )
   {
      gxTv_SdtsdtMTok_N = (byte)(0) ;
      gxTv_SdtsdtMTok_Mtknusu = value ;
   }

   public String getMtknip( )
   {
      return gxTv_SdtsdtMTok_Mtknip ;
   }

   public void setMtknip( String value )
   {
      gxTv_SdtsdtMTok_N = (byte)(0) ;
      gxTv_SdtsdtMTok_Mtknip = value ;
   }

   public String getMtkn( )
   {
      return gxTv_SdtsdtMTok_Mtkn ;
   }

   public void setMtkn( String value )
   {
      gxTv_SdtsdtMTok_N = (byte)(0) ;
      gxTv_SdtsdtMTok_Mtkn = value ;
   }

   public java.util.Date getMtknfec( )
   {
      return gxTv_SdtsdtMTok_Mtknfec ;
   }

   public void setMtknfec( java.util.Date value )
   {
      gxTv_SdtsdtMTok_Mtknfec_N = (byte)(0) ;
      gxTv_SdtsdtMTok_N = (byte)(0) ;
      gxTv_SdtsdtMTok_Mtknfec = value ;
   }

   public java.util.Date getMtknven( )
   {
      return gxTv_SdtsdtMTok_Mtknven ;
   }

   public void setMtknven( java.util.Date value )
   {
      gxTv_SdtsdtMTok_Mtknven_N = (byte)(0) ;
      gxTv_SdtsdtMTok_N = (byte)(0) ;
      gxTv_SdtsdtMTok_Mtknven = value ;
   }

   public String getMtkndat( )
   {
      return gxTv_SdtsdtMTok_Mtkndat ;
   }

   public void setMtkndat( String value )
   {
      gxTv_SdtsdtMTok_N = (byte)(0) ;
      gxTv_SdtsdtMTok_Mtkndat = value ;
   }

   protected byte gxTv_SdtsdtMTok_Mtknfec_N ;
   protected byte gxTv_SdtsdtMTok_Mtknven_N ;
   protected byte gxTv_SdtsdtMTok_N ;
   protected long gxTv_SdtsdtMTok_Mtknid ;
   protected String gxTv_SdtsdtMTok_Mtknusu ;
   protected String gxTv_SdtsdtMTok_Mtknip ;
   protected String gxTv_SdtsdtMTok_Mtkn ;
   protected String gxTv_SdtsdtMTok_Mtkndat ;
   protected java.util.Date gxTv_SdtsdtMTok_Mtknfec ;
   protected java.util.Date gxTv_SdtsdtMTok_Mtknven ;
}

