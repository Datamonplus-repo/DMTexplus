package app ;
import com.genexus.*;

public final  class StructSdtSDTProduccionLector implements Cloneable, java.io.Serializable
{
   public StructSdtSDTProduccionLector( )
   {
      this( -1, new ModelContext( StructSdtSDTProduccionLector.class ));
   }

   public StructSdtSDTProduccionLector( int remoteHandle ,
                                        ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtSDTProduccionLector_Maqcod = "" ;
      gxTv_SdtSDTProduccionLector_Maqdsc = "" ;
      gxTv_SdtSDTProduccionLector_Barenccli = "" ;
      gxTv_SdtSDTProduccionLector_Barnhdr = "" ;
      gxTv_SdtSDTProduccionLector_Clinom = "" ;
      gxTv_SdtSDTProduccionLector_Barfecgen = cal.getTime() ;
      gxTv_SdtSDTProduccionLector_Barser = "" ;
      gxTv_SdtSDTProduccionLector_Barserdsc = "" ;
      gxTv_SdtSDTProduccionLector_Tipartdsc = "" ;
      gxTv_SdtSDTProduccionLector_Barcolnom = "" ;
      gxTv_SdtSDTProduccionLector_Tipcoldsc = "" ;
      gxTv_SdtSDTProduccionLector_Intdsc = "" ;
      gxTv_SdtSDTProduccionLector_Barnomcli = "" ;
      gxTv_SdtSDTProduccionLector_Bardibcli = "" ;
      gxTv_SdtSDTProduccionLector_Parcodnom = "" ;
      gxTv_SdtSDTProduccionLector_Openom = "" ;
      gxTv_SdtSDTProduccionLector_Fasdsc = "" ;
      gxTv_SdtSDTProduccionLector_Tinte = "" ;
      gxTv_SdtSDTProduccionLector_Hisprodti = cal.getTime() ;
      gxTv_SdtSDTProduccionLector_Hisprodtf = cal.getTime() ;
      gxTv_SdtSDTProduccionLector_Hisprof = "" ;
      gxTv_SdtSDTProduccionLector_Hisprokgr = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTProduccionLector_Hispromtr = new java.math.BigDecimal(0) ;
      gxTv_SdtSDTProduccionLector_Barfecgen_N = (byte)(1) ;
      gxTv_SdtSDTProduccionLector_Hisprodti_N = (byte)(1) ;
      gxTv_SdtSDTProduccionLector_Hisprodtf_N = (byte)(1) ;
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
      return gxTv_SdtSDTProduccionLector_Maqcod ;
   }

   public void setMaqcod( String value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Maqcod = value ;
   }

   public String getMaqdsc( )
   {
      return gxTv_SdtSDTProduccionLector_Maqdsc ;
   }

   public void setMaqdsc( String value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Maqdsc = value ;
   }

   public String getBarenccli( )
   {
      return gxTv_SdtSDTProduccionLector_Barenccli ;
   }

   public void setBarenccli( String value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Barenccli = value ;
   }

   public String getBarnhdr( )
   {
      return gxTv_SdtSDTProduccionLector_Barnhdr ;
   }

   public void setBarnhdr( String value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Barnhdr = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtSDTProduccionLector_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtSDTProduccionLector_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Clinom = value ;
   }

   public java.util.Date getBarfecgen( )
   {
      return gxTv_SdtSDTProduccionLector_Barfecgen ;
   }

   public void setBarfecgen( java.util.Date value )
   {
      gxTv_SdtSDTProduccionLector_Barfecgen_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Barfecgen = value ;
   }

   public String getBarser( )
   {
      return gxTv_SdtSDTProduccionLector_Barser ;
   }

   public void setBarser( String value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Barser = value ;
   }

   public String getBarserdsc( )
   {
      return gxTv_SdtSDTProduccionLector_Barserdsc ;
   }

   public void setBarserdsc( String value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Barserdsc = value ;
   }

   public String getTipartdsc( )
   {
      return gxTv_SdtSDTProduccionLector_Tipartdsc ;
   }

   public void setTipartdsc( String value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Tipartdsc = value ;
   }

   public String getBarcolnom( )
   {
      return gxTv_SdtSDTProduccionLector_Barcolnom ;
   }

   public void setBarcolnom( String value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Barcolnom = value ;
   }

   public int getBarcolnum( )
   {
      return gxTv_SdtSDTProduccionLector_Barcolnum ;
   }

   public void setBarcolnum( int value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Barcolnum = value ;
   }

   public String getTipcoldsc( )
   {
      return gxTv_SdtSDTProduccionLector_Tipcoldsc ;
   }

   public void setTipcoldsc( String value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Tipcoldsc = value ;
   }

   public String getIntdsc( )
   {
      return gxTv_SdtSDTProduccionLector_Intdsc ;
   }

   public void setIntdsc( String value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Intdsc = value ;
   }

   public String getBarnomcli( )
   {
      return gxTv_SdtSDTProduccionLector_Barnomcli ;
   }

   public void setBarnomcli( String value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Barnomcli = value ;
   }

   public int getBarnumcli( )
   {
      return gxTv_SdtSDTProduccionLector_Barnumcli ;
   }

   public void setBarnumcli( int value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Barnumcli = value ;
   }

   public String getBardibcli( )
   {
      return gxTv_SdtSDTProduccionLector_Bardibcli ;
   }

   public void setBardibcli( String value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Bardibcli = value ;
   }

   public int getBardibint( )
   {
      return gxTv_SdtSDTProduccionLector_Bardibint ;
   }

   public void setBardibint( int value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Bardibint = value ;
   }

   public short getParcod( )
   {
      return gxTv_SdtSDTProduccionLector_Parcod ;
   }

   public void setParcod( short value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Parcod = value ;
   }

   public String getParcodnom( )
   {
      return gxTv_SdtSDTProduccionLector_Parcodnom ;
   }

   public void setParcodnom( String value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Parcodnom = value ;
   }

   public String getOpenom( )
   {
      return gxTv_SdtSDTProduccionLector_Openom ;
   }

   public void setOpenom( String value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Openom = value ;
   }

   public String getFasdsc( )
   {
      return gxTv_SdtSDTProduccionLector_Fasdsc ;
   }

   public void setFasdsc( String value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Fasdsc = value ;
   }

   public String getTinte( )
   {
      return gxTv_SdtSDTProduccionLector_Tinte ;
   }

   public void setTinte( String value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Tinte = value ;
   }

   public java.util.Date getHisprodti( )
   {
      return gxTv_SdtSDTProduccionLector_Hisprodti ;
   }

   public void setHisprodti( java.util.Date value )
   {
      gxTv_SdtSDTProduccionLector_Hisprodti_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Hisprodti = value ;
   }

   public java.util.Date getHisprodtf( )
   {
      return gxTv_SdtSDTProduccionLector_Hisprodtf ;
   }

   public void setHisprodtf( java.util.Date value )
   {
      gxTv_SdtSDTProduccionLector_Hisprodtf_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Hisprodtf = value ;
   }

   public String getHisprof( )
   {
      return gxTv_SdtSDTProduccionLector_Hisprof ;
   }

   public void setHisprof( String value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Hisprof = value ;
   }

   public byte getHisprotur( )
   {
      return gxTv_SdtSDTProduccionLector_Hisprotur ;
   }

   public void setHisprotur( byte value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Hisprotur = value ;
   }

   public java.math.BigDecimal getHisprokgr( )
   {
      return gxTv_SdtSDTProduccionLector_Hisprokgr ;
   }

   public void setHisprokgr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Hisprokgr = value ;
   }

   public java.math.BigDecimal getHispromtr( )
   {
      return gxTv_SdtSDTProduccionLector_Hispromtr ;
   }

   public void setHispromtr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Hispromtr = value ;
   }

   public short getTiempom( )
   {
      return gxTv_SdtSDTProduccionLector_Tiempom ;
   }

   public void setTiempom( short value )
   {
      gxTv_SdtSDTProduccionLector_N = (byte)(0) ;
      gxTv_SdtSDTProduccionLector_Tiempom = value ;
   }

   protected byte gxTv_SdtSDTProduccionLector_Hisprotur ;
   protected byte gxTv_SdtSDTProduccionLector_Barfecgen_N ;
   protected byte gxTv_SdtSDTProduccionLector_Hisprodti_N ;
   protected byte gxTv_SdtSDTProduccionLector_Hisprodtf_N ;
   protected byte gxTv_SdtSDTProduccionLector_N ;
   protected short gxTv_SdtSDTProduccionLector_Parcod ;
   protected short gxTv_SdtSDTProduccionLector_Tiempom ;
   protected int gxTv_SdtSDTProduccionLector_Clicod ;
   protected int gxTv_SdtSDTProduccionLector_Barcolnum ;
   protected int gxTv_SdtSDTProduccionLector_Barnumcli ;
   protected int gxTv_SdtSDTProduccionLector_Bardibint ;
   protected String gxTv_SdtSDTProduccionLector_Maqcod ;
   protected String gxTv_SdtSDTProduccionLector_Maqdsc ;
   protected String gxTv_SdtSDTProduccionLector_Barenccli ;
   protected String gxTv_SdtSDTProduccionLector_Barnhdr ;
   protected String gxTv_SdtSDTProduccionLector_Clinom ;
   protected String gxTv_SdtSDTProduccionLector_Barser ;
   protected String gxTv_SdtSDTProduccionLector_Barserdsc ;
   protected String gxTv_SdtSDTProduccionLector_Tipartdsc ;
   protected String gxTv_SdtSDTProduccionLector_Barcolnom ;
   protected String gxTv_SdtSDTProduccionLector_Tipcoldsc ;
   protected String gxTv_SdtSDTProduccionLector_Intdsc ;
   protected String gxTv_SdtSDTProduccionLector_Barnomcli ;
   protected String gxTv_SdtSDTProduccionLector_Bardibcli ;
   protected String gxTv_SdtSDTProduccionLector_Parcodnom ;
   protected String gxTv_SdtSDTProduccionLector_Openom ;
   protected String gxTv_SdtSDTProduccionLector_Fasdsc ;
   protected String gxTv_SdtSDTProduccionLector_Tinte ;
   protected String gxTv_SdtSDTProduccionLector_Hisprof ;
   protected java.util.Date gxTv_SdtSDTProduccionLector_Barfecgen ;
   protected java.util.Date gxTv_SdtSDTProduccionLector_Hisprodti ;
   protected java.util.Date gxTv_SdtSDTProduccionLector_Hisprodtf ;
   protected java.math.BigDecimal gxTv_SdtSDTProduccionLector_Hisprokgr ;
   protected java.math.BigDecimal gxTv_SdtSDTProduccionLector_Hispromtr ;
}

