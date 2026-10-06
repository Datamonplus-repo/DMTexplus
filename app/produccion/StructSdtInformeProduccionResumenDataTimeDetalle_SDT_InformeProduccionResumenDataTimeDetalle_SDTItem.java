package app.produccion ;
import com.genexus.*;

public final  class StructSdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem implements Cloneable, java.io.Serializable
{
   public StructSdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem( )
   {
      this( -1, new ModelContext( StructSdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem.class ));
   }

   public StructSdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem( int remoteHandle ,
                                                                                                                ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barnhdr = "" ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprolot = "" ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Maqcod = "" ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Maqdsc = "" ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprofec = cal.getTime() ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprokgr = new java.math.BigDecimal(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hispromtr = new java.math.BigDecimal(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fase = "" ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fasdsc = "" ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fasacttin = "" ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodti = cal.getTime() ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodtf = cal.getTime() ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotre3 = new java.math.BigDecimal(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprof = "" ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Clinom = "" ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barser = "" ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barserdsc = "" ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Openom = "" ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Parcodnom = "" ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barcolnom = "" ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Tipartdsc = "" ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Matdsc = "" ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprofec_N = (byte)(1) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodti_N = (byte)(1) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodtf_N = (byte)(1) ;
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
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barnhdr ;
   }

   public void setBarnhdr( String value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barnhdr = value ;
   }

   public String getHisprolot( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprolot ;
   }

   public void setHisprolot( String value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprolot = value ;
   }

   public String getMaqcod( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Maqcod ;
   }

   public void setMaqcod( String value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Maqcod = value ;
   }

   public String getMaqdsc( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Maqdsc ;
   }

   public void setMaqdsc( String value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Maqdsc = value ;
   }

   public java.util.Date getHisprofec( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprofec ;
   }

   public void setHisprofec( java.util.Date value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprofec_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprofec = value ;
   }

   public int getHisprolin( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprolin ;
   }

   public void setHisprolin( int value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprolin = value ;
   }

   public java.math.BigDecimal getHisprokgr( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprokgr ;
   }

   public void setHisprokgr( java.math.BigDecimal value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprokgr = value ;
   }

   public java.math.BigDecimal getHispromtr( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hispromtr ;
   }

   public void setHispromtr( java.math.BigDecimal value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hispromtr = value ;
   }

   public short getHispronpzs( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hispronpzs ;
   }

   public void setHispronpzs( short value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hispronpzs = value ;
   }

   public String getFase( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fase ;
   }

   public void setFase( String value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fase = value ;
   }

   public String getFasdsc( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fasdsc ;
   }

   public void setFasdsc( String value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fasdsc = value ;
   }

   public String getFasacttin( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fasacttin ;
   }

   public void setFasacttin( String value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fasacttin = value ;
   }

   public short getBarordlin( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barordlin ;
   }

   public void setBarordlin( short value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barordlin = value ;
   }

   public java.util.Date getHisprodti( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodti ;
   }

   public void setHisprodti( java.util.Date value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodti_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodti = value ;
   }

   public java.util.Date getHisprodtf( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodtf ;
   }

   public void setHisprodtf( java.util.Date value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodtf_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodtf = value ;
   }

   public short getHisprotre2( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotre2 ;
   }

   public void setHisprotre2( short value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotre2 = value ;
   }

   public java.math.BigDecimal getHisprotre3( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotre3 ;
   }

   public void setHisprotre3( java.math.BigDecimal value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotre3 = value ;
   }

   public byte getHisproest( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisproest ;
   }

   public void setHisproest( byte value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisproest = value ;
   }

   public byte getFlagmarca( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Flagmarca ;
   }

   public void setFlagmarca( byte value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Flagmarca = value ;
   }

   public int getMinutos( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Minutos ;
   }

   public void setMinutos( int value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Minutos = value ;
   }

   public byte getHisprotur( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotur ;
   }

   public void setHisprotur( byte value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotur = value ;
   }

   public String getHisprof( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprof ;
   }

   public void setHisprof( String value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprof = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Clinom = value ;
   }

   public String getBarser( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barser ;
   }

   public void setBarser( String value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barser = value ;
   }

   public String getBarserdsc( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barserdsc ;
   }

   public void setBarserdsc( String value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barserdsc = value ;
   }

   public int getOpecod( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Opecod ;
   }

   public void setOpecod( int value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Opecod = value ;
   }

   public String getOpenom( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Openom ;
   }

   public void setOpenom( String value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Openom = value ;
   }

   public short getParcod( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Parcod ;
   }

   public void setParcod( short value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Parcod = value ;
   }

   public String getParcodnom( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Parcodnom ;
   }

   public void setParcodnom( String value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Parcodnom = value ;
   }

   public String getBarcolnom( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barcolnom ;
   }

   public void setBarcolnom( String value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barcolnom = value ;
   }

   public int getBarcolnum( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barcolnum ;
   }

   public void setBarcolnum( int value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barcolnum = value ;
   }

   public byte getBartipcol( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Bartipcol ;
   }

   public void setBartipcol( byte value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Bartipcol = value ;
   }

   public short getBartipart( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Bartipart ;
   }

   public void setBartipart( short value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Bartipart = value ;
   }

   public String getTipartdsc( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Tipartdsc ;
   }

   public void setTipartdsc( String value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Tipartdsc = value ;
   }

   public short getMatcod( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Matcod ;
   }

   public void setMatcod( short value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Matcod = value ;
   }

   public String getMatdsc( )
   {
      return gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Matdsc ;
   }

   public void setMatdsc( String value )
   {
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Matdsc = value ;
   }

   protected byte gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisproest ;
   protected byte gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Flagmarca ;
   protected byte gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotur ;
   protected byte gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Bartipcol ;
   protected byte gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprofec_N ;
   protected byte gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodti_N ;
   protected byte gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodtf_N ;
   protected byte gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_N ;
   protected short gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hispronpzs ;
   protected short gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barordlin ;
   protected short gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotre2 ;
   protected short gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Parcod ;
   protected short gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Bartipart ;
   protected short gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Matcod ;
   protected int gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprolin ;
   protected int gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Minutos ;
   protected int gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Clicod ;
   protected int gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Opecod ;
   protected int gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barcolnum ;
   protected String gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barnhdr ;
   protected String gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprolot ;
   protected String gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Maqcod ;
   protected String gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Maqdsc ;
   protected String gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fase ;
   protected String gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fasdsc ;
   protected String gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Fasacttin ;
   protected String gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprof ;
   protected String gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Clinom ;
   protected String gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barser ;
   protected String gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barserdsc ;
   protected String gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Openom ;
   protected String gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Parcodnom ;
   protected String gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Barcolnom ;
   protected String gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Tipartdsc ;
   protected String gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Matdsc ;
   protected java.util.Date gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprofec ;
   protected java.math.BigDecimal gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprokgr ;
   protected java.math.BigDecimal gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hispromtr ;
   protected java.util.Date gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodti ;
   protected java.util.Date gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprodtf ;
   protected java.math.BigDecimal gxTv_SdtInformeProduccionResumenDataTimeDetalle_SDT_InformeProduccionResumenDataTimeDetalle_SDTItem_Hisprotre3 ;
}

