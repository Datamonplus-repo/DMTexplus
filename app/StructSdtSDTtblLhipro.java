package app ;
import com.genexus.*;

public final  class StructSdtSDTtblLhipro implements Cloneable, java.io.Serializable
{
   public StructSdtSDTtblLhipro( )
   {
      this( -1, new ModelContext( StructSdtSDTtblLhipro.class ));
   }

   public StructSdtSDTtblLhipro( int remoteHandle ,
                                 ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTtblLhipro_Maqcod = "" ;
      gxTv_SdtSDTtblLhipro_Maqdsc = "" ;
      gxTv_SdtSDTtblLhipro_Hisprodti = cal.getTime() ;
      gxTv_SdtSDTtblLhipro_Hisprodtf = cal.getTime() ;
      gxTv_SdtSDTtblLhipro_Hisprof = "" ;
      gxTv_SdtSDTtblLhipro_Hisprokgr = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTtblLhipro_Hispromtr = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTtblLhipro_Barnhdr = "" ;
      gxTv_SdtSDTtblLhipro_Hisprolot = "" ;
      gxTv_SdtSDTtblLhipro_Fase = "" ;
      gxTv_SdtSDTtblLhipro_Fasdsc = "" ;
      gxTv_SdtSDTtblLhipro_Parcodnom = "" ;
      gxTv_SdtSDTtblLhipro_Barser = "" ;
      gxTv_SdtSDTtblLhipro_Barserdsc = "" ;
      gxTv_SdtSDTtblLhipro_Tipartdsc = "" ;
      gxTv_SdtSDTtblLhipro_Barcolnom = "" ;
      gxTv_SdtSDTtblLhipro_Barnomcli = "" ;
      gxTv_SdtSDTtblLhipro_Hisprodti_N = (byte)(1) ;
      gxTv_SdtSDTtblLhipro_Hisprodtf_N = (byte)(1) ;
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

   public String getMaqcod( )
   {
      return gxTv_SdtSDTtblLhipro_Maqcod ;
   }

   public void setMaqcod( String value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Maqcod = value ;
   }

   public String getMaqdsc( )
   {
      return gxTv_SdtSDTtblLhipro_Maqdsc ;
   }

   public void setMaqdsc( String value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Maqdsc = value ;
   }

   public java.util.Date getHisprodti( )
   {
      return gxTv_SdtSDTtblLhipro_Hisprodti ;
   }

   public void setHisprodti( java.util.Date value )
   {
      gxTv_SdtSDTtblLhipro_Hisprodti_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Hisprodti = value ;
   }

   public java.util.Date getHisprodtf( )
   {
      return gxTv_SdtSDTtblLhipro_Hisprodtf ;
   }

   public void setHisprodtf( java.util.Date value )
   {
      gxTv_SdtSDTtblLhipro_Hisprodtf_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Hisprodtf = value ;
   }

   public String getHisprof( )
   {
      return gxTv_SdtSDTtblLhipro_Hisprof ;
   }

   public void setHisprof( String value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Hisprof = value ;
   }

   public java.math.BigDecimal getHisprokgr( )
   {
      return gxTv_SdtSDTtblLhipro_Hisprokgr ;
   }

   public void setHisprokgr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Hisprokgr = value ;
   }

   public java.math.BigDecimal getHispromtr( )
   {
      return gxTv_SdtSDTtblLhipro_Hispromtr ;
   }

   public void setHispromtr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Hispromtr = value ;
   }

   public String getBarnhdr( )
   {
      return gxTv_SdtSDTtblLhipro_Barnhdr ;
   }

   public void setBarnhdr( String value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Barnhdr = value ;
   }

   public String getHisprolot( )
   {
      return gxTv_SdtSDTtblLhipro_Hisprolot ;
   }

   public void setHisprolot( String value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Hisprolot = value ;
   }

   public byte getHisprotur( )
   {
      return gxTv_SdtSDTtblLhipro_Hisprotur ;
   }

   public void setHisprotur( byte value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Hisprotur = value ;
   }

   public String getFase( )
   {
      return gxTv_SdtSDTtblLhipro_Fase ;
   }

   public void setFase( String value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Fase = value ;
   }

   public String getFasdsc( )
   {
      return gxTv_SdtSDTtblLhipro_Fasdsc ;
   }

   public void setFasdsc( String value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Fasdsc = value ;
   }

   public short getHisprotr2( )
   {
      return gxTv_SdtSDTtblLhipro_Hisprotr2 ;
   }

   public void setHisprotr2( short value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Hisprotr2 = value ;
   }

   public short getParcod( )
   {
      return gxTv_SdtSDTtblLhipro_Parcod ;
   }

   public void setParcod( short value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Parcod = value ;
   }

   public String getParcodnom( )
   {
      return gxTv_SdtSDTtblLhipro_Parcodnom ;
   }

   public void setParcodnom( String value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Parcodnom = value ;
   }

   public String getBarser( )
   {
      return gxTv_SdtSDTtblLhipro_Barser ;
   }

   public void setBarser( String value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Barser = value ;
   }

   public String getBarserdsc( )
   {
      return gxTv_SdtSDTtblLhipro_Barserdsc ;
   }

   public void setBarserdsc( String value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Barserdsc = value ;
   }

   public short getHisprotip( )
   {
      return gxTv_SdtSDTtblLhipro_Hisprotip ;
   }

   public void setHisprotip( short value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Hisprotip = value ;
   }

   public String getTipartdsc( )
   {
      return gxTv_SdtSDTtblLhipro_Tipartdsc ;
   }

   public void setTipartdsc( String value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Tipartdsc = value ;
   }

   public String getBarcolnom( )
   {
      return gxTv_SdtSDTtblLhipro_Barcolnom ;
   }

   public void setBarcolnom( String value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Barcolnom = value ;
   }

   public String getBarnomcli( )
   {
      return gxTv_SdtSDTtblLhipro_Barnomcli ;
   }

   public void setBarnomcli( String value )
   {
      gxTv_SdtSDTtblLhipro_N = (byte)(0) ;
      gxTv_SdtSDTtblLhipro_Barnomcli = value ;
   }

   protected byte gxTv_SdtSDTtblLhipro_Hisprotur ;
   protected byte gxTv_SdtSDTtblLhipro_Hisprodti_N ;
   protected byte gxTv_SdtSDTtblLhipro_Hisprodtf_N ;
   protected byte gxTv_SdtSDTtblLhipro_N ;
   protected short gxTv_SdtSDTtblLhipro_Hisprotr2 ;
   protected short gxTv_SdtSDTtblLhipro_Parcod ;
   protected short gxTv_SdtSDTtblLhipro_Hisprotip ;
   protected String gxTv_SdtSDTtblLhipro_Maqcod ;
   protected String gxTv_SdtSDTtblLhipro_Maqdsc ;
   protected String gxTv_SdtSDTtblLhipro_Hisprof ;
   protected String gxTv_SdtSDTtblLhipro_Barnhdr ;
   protected String gxTv_SdtSDTtblLhipro_Hisprolot ;
   protected String gxTv_SdtSDTtblLhipro_Fase ;
   protected String gxTv_SdtSDTtblLhipro_Fasdsc ;
   protected String gxTv_SdtSDTtblLhipro_Parcodnom ;
   protected String gxTv_SdtSDTtblLhipro_Barser ;
   protected String gxTv_SdtSDTtblLhipro_Barserdsc ;
   protected String gxTv_SdtSDTtblLhipro_Tipartdsc ;
   protected String gxTv_SdtSDTtblLhipro_Barcolnom ;
   protected String gxTv_SdtSDTtblLhipro_Barnomcli ;
   protected java.util.Date gxTv_SdtSDTtblLhipro_Hisprodti ;
   protected java.util.Date gxTv_SdtSDTtblLhipro_Hisprodtf ;
   protected java.math.BigDecimal gxTv_SdtSDTtblLhipro_Hisprokgr ;
   protected java.math.BigDecimal gxTv_SdtSDTtblLhipro_Hispromtr ;
}

