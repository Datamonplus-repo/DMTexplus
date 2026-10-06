package app.anticipacionerrores ;
import com.genexus.*;

public final  class StructSdtsdtParametros implements Cloneable, java.io.Serializable
{
   public StructSdtsdtParametros( )
   {
      this( -1, new ModelContext( StructSdtsdtParametros.class ));
   }

   public StructSdtsdtParametros( int remoteHandle ,
                                  ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtsdtParametros_Emprcod = "" ;
      gxTv_SdtsdtParametros_Artcod = "" ;
      gxTv_SdtsdtParametros_Tipmaqcod = "" ;
      gxTv_SdtsdtParametros_Maqcod = "" ;
      gxTv_SdtsdtParametros_Fechainicio = cal.getTime() ;
      gxTv_SdtsdtParametros_Fechafin = cal.getTime() ;
      gxTv_SdtsdtParametros_Mtknusu = "" ;
      gxTv_SdtsdtParametros_Mtkn = "" ;
      gxTv_SdtsdtParametros_Fechainicio_N = (byte)(1) ;
      gxTv_SdtsdtParametros_Fechafin_N = (byte)(1) ;
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

   public String getEmprcod( )
   {
      return gxTv_SdtsdtParametros_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtsdtParametros_N = (byte)(0) ;
      gxTv_SdtsdtParametros_Emprcod = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtsdtParametros_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtsdtParametros_N = (byte)(0) ;
      gxTv_SdtsdtParametros_Clicod = value ;
   }

   public String getArtcod( )
   {
      return gxTv_SdtsdtParametros_Artcod ;
   }

   public void setArtcod( String value )
   {
      gxTv_SdtsdtParametros_N = (byte)(0) ;
      gxTv_SdtsdtParametros_Artcod = value ;
   }

   public int getForcolnum( )
   {
      return gxTv_SdtsdtParametros_Forcolnum ;
   }

   public void setForcolnum( int value )
   {
      gxTv_SdtsdtParametros_N = (byte)(0) ;
      gxTv_SdtsdtParametros_Forcolnum = value ;
   }

   public String getTipmaqcod( )
   {
      return gxTv_SdtsdtParametros_Tipmaqcod ;
   }

   public void setTipmaqcod( String value )
   {
      gxTv_SdtsdtParametros_N = (byte)(0) ;
      gxTv_SdtsdtParametros_Tipmaqcod = value ;
   }

   public String getMaqcod( )
   {
      return gxTv_SdtsdtParametros_Maqcod ;
   }

   public void setMaqcod( String value )
   {
      gxTv_SdtsdtParametros_N = (byte)(0) ;
      gxTv_SdtsdtParametros_Maqcod = value ;
   }

   public java.util.Date getFechainicio( )
   {
      return gxTv_SdtsdtParametros_Fechainicio ;
   }

   public void setFechainicio( java.util.Date value )
   {
      gxTv_SdtsdtParametros_Fechainicio_N = (byte)(0) ;
      gxTv_SdtsdtParametros_N = (byte)(0) ;
      gxTv_SdtsdtParametros_Fechainicio = value ;
   }

   public java.util.Date getFechafin( )
   {
      return gxTv_SdtsdtParametros_Fechafin ;
   }

   public void setFechafin( java.util.Date value )
   {
      gxTv_SdtsdtParametros_Fechafin_N = (byte)(0) ;
      gxTv_SdtsdtParametros_N = (byte)(0) ;
      gxTv_SdtsdtParametros_Fechafin = value ;
   }

   public String getMtknusu( )
   {
      return gxTv_SdtsdtParametros_Mtknusu ;
   }

   public void setMtknusu( String value )
   {
      gxTv_SdtsdtParametros_N = (byte)(0) ;
      gxTv_SdtsdtParametros_Mtknusu = value ;
   }

   public String getMtkn( )
   {
      return gxTv_SdtsdtParametros_Mtkn ;
   }

   public void setMtkn( String value )
   {
      gxTv_SdtsdtParametros_N = (byte)(0) ;
      gxTv_SdtsdtParametros_Mtkn = value ;
   }

   public short getDefcod( )
   {
      return gxTv_SdtsdtParametros_Defcod ;
   }

   public void setDefcod( short value )
   {
      gxTv_SdtsdtParametros_N = (byte)(0) ;
      gxTv_SdtsdtParametros_Defcod = value ;
   }

   public short getCatcod( )
   {
      return gxTv_SdtsdtParametros_Catcod ;
   }

   public void setCatcod( short value )
   {
      gxTv_SdtsdtParametros_N = (byte)(0) ;
      gxTv_SdtsdtParametros_Catcod = value ;
   }

   protected byte gxTv_SdtsdtParametros_Fechainicio_N ;
   protected byte gxTv_SdtsdtParametros_Fechafin_N ;
   protected byte gxTv_SdtsdtParametros_N ;
   protected short gxTv_SdtsdtParametros_Defcod ;
   protected short gxTv_SdtsdtParametros_Catcod ;
   protected int gxTv_SdtsdtParametros_Clicod ;
   protected int gxTv_SdtsdtParametros_Forcolnum ;
   protected String gxTv_SdtsdtParametros_Emprcod ;
   protected String gxTv_SdtsdtParametros_Artcod ;
   protected String gxTv_SdtsdtParametros_Tipmaqcod ;
   protected String gxTv_SdtsdtParametros_Maqcod ;
   protected String gxTv_SdtsdtParametros_Mtknusu ;
   protected String gxTv_SdtsdtParametros_Mtkn ;
   protected java.util.Date gxTv_SdtsdtParametros_Fechainicio ;
   protected java.util.Date gxTv_SdtsdtParametros_Fechafin ;
}

