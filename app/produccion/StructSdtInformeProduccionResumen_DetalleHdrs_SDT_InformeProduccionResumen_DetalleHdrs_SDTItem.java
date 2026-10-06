package app.produccion ;
import com.genexus.*;

public final  class StructSdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem implements Cloneable, java.io.Serializable
{
   public StructSdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem( )
   {
      this( -1, new ModelContext( StructSdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem.class ));
   }

   public StructSdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem( int remoteHandle ,
                                                                                                          ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Barnhdr = "" ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprolot = "" ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Maqcod = "" ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Maqdsc = "" ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprofec = cal.getTime() ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprokgr = new java.math.BigDecimal(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hispromtr = new java.math.BigDecimal(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprof = "" ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprodti = cal.getTime() ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprodtf = cal.getTime() ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Clinom = "" ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Barser = "" ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Barserdsc = "" ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Barcolnom = "" ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Tipcoldsc = "" ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Matdsc = "" ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Openom = "" ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Fase = "" ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Fasdsc = "" ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Minutosdec = new java.math.BigDecimal(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Tipartdsc = "" ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Parcodnom = "" ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprofec_N = (byte)(1) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprodti_N = (byte)(1) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprodtf_N = (byte)(1) ;
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

   public String getBarnhdr( )
   {
      return gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Barnhdr ;
   }

   public void setBarnhdr( String value )
   {
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Barnhdr = value ;
   }

   public String getHisprolot( )
   {
      return gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprolot ;
   }

   public void setHisprolot( String value )
   {
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprolot = value ;
   }

   public String getMaqcod( )
   {
      return gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Maqcod ;
   }

   public void setMaqcod( String value )
   {
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Maqcod = value ;
   }

   public String getMaqdsc( )
   {
      return gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Maqdsc ;
   }

   public void setMaqdsc( String value )
   {
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Maqdsc = value ;
   }

   public java.util.Date getHisprofec( )
   {
      return gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprofec ;
   }

   public void setHisprofec( java.util.Date value )
   {
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprofec_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprofec = value ;
   }

   public int getHisprolin( )
   {
      return gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprolin ;
   }

   public void setHisprolin( int value )
   {
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprolin = value ;
   }

   public java.math.BigDecimal getHisprokgr( )
   {
      return gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprokgr ;
   }

   public void setHisprokgr( java.math.BigDecimal value )
   {
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprokgr = value ;
   }

   public java.math.BigDecimal getHispromtr( )
   {
      return gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hispromtr ;
   }

   public void setHispromtr( java.math.BigDecimal value )
   {
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hispromtr = value ;
   }

   public short getHispronpzs( )
   {
      return gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hispronpzs ;
   }

   public void setHispronpzs( short value )
   {
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hispronpzs = value ;
   }

   public byte getHisprotur( )
   {
      return gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprotur ;
   }

   public void setHisprotur( byte value )
   {
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprotur = value ;
   }

   public String getHisprof( )
   {
      return gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprof ;
   }

   public void setHisprof( String value )
   {
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprof = value ;
   }

   public java.util.Date getHisprodti( )
   {
      return gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprodti ;
   }

   public void setHisprodti( java.util.Date value )
   {
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprodti_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprodti = value ;
   }

   public java.util.Date getHisprodtf( )
   {
      return gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprodtf ;
   }

   public void setHisprodtf( java.util.Date value )
   {
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprodtf_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprodtf = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Clinom = value ;
   }

   public String getBarser( )
   {
      return gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Barser ;
   }

   public void setBarser( String value )
   {
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Barser = value ;
   }

   public String getBarserdsc( )
   {
      return gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Barserdsc ;
   }

   public void setBarserdsc( String value )
   {
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Barserdsc = value ;
   }

   public String getBarcolnom( )
   {
      return gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Barcolnom ;
   }

   public void setBarcolnom( String value )
   {
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Barcolnom = value ;
   }

   public int getBarcolnum( )
   {
      return gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Barcolnum ;
   }

   public void setBarcolnum( int value )
   {
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Barcolnum = value ;
   }

   public byte getBartipcol( )
   {
      return gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Bartipcol ;
   }

   public void setBartipcol( byte value )
   {
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Bartipcol = value ;
   }

   public String getTipcoldsc( )
   {
      return gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Tipcoldsc ;
   }

   public void setTipcoldsc( String value )
   {
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Tipcoldsc = value ;
   }

   public short getMatcod( )
   {
      return gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Matcod ;
   }

   public void setMatcod( short value )
   {
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Matcod = value ;
   }

   public String getMatdsc( )
   {
      return gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Matdsc ;
   }

   public void setMatdsc( String value )
   {
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Matdsc = value ;
   }

   public int getGruopecod( )
   {
      return gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Gruopecod ;
   }

   public void setGruopecod( int value )
   {
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Gruopecod = value ;
   }

   public String getOpenom( )
   {
      return gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Openom ;
   }

   public void setOpenom( String value )
   {
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Openom = value ;
   }

   public String getFase( )
   {
      return gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Fase ;
   }

   public void setFase( String value )
   {
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Fase = value ;
   }

   public String getFasdsc( )
   {
      return gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Fasdsc ;
   }

   public void setFasdsc( String value )
   {
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Fasdsc = value ;
   }

   public int getMinutos( )
   {
      return gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Minutos ;
   }

   public void setMinutos( int value )
   {
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Minutos = value ;
   }

   public java.math.BigDecimal getMinutosdec( )
   {
      return gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Minutosdec ;
   }

   public void setMinutosdec( java.math.BigDecimal value )
   {
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Minutosdec = value ;
   }

   public short getHisprotre2( )
   {
      return gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprotre2 ;
   }

   public void setHisprotre2( short value )
   {
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprotre2 = value ;
   }

   public short getFlagmarca( )
   {
      return gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Flagmarca ;
   }

   public void setFlagmarca( short value )
   {
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Flagmarca = value ;
   }

   public short getBartipart( )
   {
      return gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Bartipart ;
   }

   public void setBartipart( short value )
   {
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Bartipart = value ;
   }

   public String getTipartdsc( )
   {
      return gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Tipartdsc ;
   }

   public void setTipartdsc( String value )
   {
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Tipartdsc = value ;
   }

   public short getParcod( )
   {
      return gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Parcod ;
   }

   public void setParcod( short value )
   {
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Parcod = value ;
   }

   public String getParcodnom( )
   {
      return gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Parcodnom ;
   }

   public void setParcodnom( String value )
   {
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Parcodnom = value ;
   }

   protected byte gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprotur ;
   protected byte gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Bartipcol ;
   protected byte gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprofec_N ;
   protected byte gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprodti_N ;
   protected byte gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprodtf_N ;
   protected byte gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_N ;
   protected short gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hispronpzs ;
   protected short gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Matcod ;
   protected short gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprotre2 ;
   protected short gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Flagmarca ;
   protected short gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Bartipart ;
   protected short gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Parcod ;
   protected int gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprolin ;
   protected int gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Clicod ;
   protected int gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Barcolnum ;
   protected int gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Gruopecod ;
   protected int gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Minutos ;
   protected String gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Barnhdr ;
   protected String gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprolot ;
   protected String gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Maqcod ;
   protected String gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Maqdsc ;
   protected String gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprof ;
   protected String gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Clinom ;
   protected String gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Barser ;
   protected String gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Barserdsc ;
   protected String gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Barcolnom ;
   protected String gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Tipcoldsc ;
   protected String gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Matdsc ;
   protected String gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Openom ;
   protected String gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Fase ;
   protected String gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Fasdsc ;
   protected String gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Tipartdsc ;
   protected String gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Parcodnom ;
   protected java.util.Date gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprofec ;
   protected java.math.BigDecimal gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprokgr ;
   protected java.math.BigDecimal gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hispromtr ;
   protected java.util.Date gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprodti ;
   protected java.util.Date gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprodtf ;
   protected java.math.BigDecimal gxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Minutosdec ;
}

