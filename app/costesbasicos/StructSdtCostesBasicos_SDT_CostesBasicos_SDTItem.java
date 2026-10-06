package app.costesbasicos ;
import com.genexus.*;

public final  class StructSdtCostesBasicos_SDT_CostesBasicos_SDTItem implements Cloneable, java.io.Serializable
{
   public StructSdtCostesBasicos_SDT_CostesBasicos_SDTItem( )
   {
      this( -1, new ModelContext( StructSdtCostesBasicos_SDT_CostesBasicos_SDTItem.class ));
   }

   public StructSdtCostesBasicos_SDT_CostesBasicos_SDTItem( int remoteHandle ,
                                                            ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Clinom = "" ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcodpar = "" ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barnhdr = "" ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barser = "" ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barserdsc = "" ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcolnom = "" ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barkgm = new java.math.BigDecimal(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barmtr = new java.math.BigDecimal(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Coste_p = new java.math.BigDecimal(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costequimicoacumulado = new java.math.BigDecimal(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab = new java.math.BigDecimal(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab2 = new java.math.BigDecimal(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefabacumulado = new java.math.BigDecimal(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Valor = new java.math.BigDecimal(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Margen = new java.math.BigDecimal(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Txtalb = "" ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barprekgm = new java.math.BigDecimal(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecgen = cal.getTime() ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecsal = cal.getTime() ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmod = new java.math.BigDecimal(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmoi = new java.math.BigDecimal(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Menergia = new java.math.BigDecimal(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgas = new java.math.BigDecimal(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Magua = new java.math.BigDecimal(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgi = new java.math.BigDecimal(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mam = new java.math.BigDecimal(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Madc = new java.math.BigDecimal(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barunimed = "" ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costeteo = new java.math.BigDecimal(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecgen_N = (byte)(1) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecsal_N = (byte)(1) ;
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

   public int getClicod( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Clinom = value ;
   }

   public int getBarcod( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcod ;
   }

   public void setBarcod( int value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcod = value ;
   }

   public byte getBarcodreo( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcodreo ;
   }

   public void setBarcodreo( byte value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcodreo = value ;
   }

   public String getBarcodpar( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcodpar ;
   }

   public void setBarcodpar( String value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcodpar = value ;
   }

   public String getBarnhdr( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barnhdr ;
   }

   public void setBarnhdr( String value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barnhdr = value ;
   }

   public String getBarser( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barser ;
   }

   public void setBarser( String value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barser = value ;
   }

   public String getBarserdsc( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barserdsc ;
   }

   public void setBarserdsc( String value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barserdsc = value ;
   }

   public short getBartipart( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Bartipart ;
   }

   public void setBartipart( short value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Bartipart = value ;
   }

   public String getBarcolnom( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcolnom ;
   }

   public void setBarcolnom( String value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcolnom = value ;
   }

   public int getBarcolnum( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcolnum ;
   }

   public void setBarcolnum( int value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcolnum = value ;
   }

   public java.math.BigDecimal getBarkgm( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barkgm ;
   }

   public void setBarkgm( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barkgm = value ;
   }

   public java.math.BigDecimal getBarmtr( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barmtr ;
   }

   public void setBarmtr( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barmtr = value ;
   }

   public java.math.BigDecimal getCoste_p( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Coste_p ;
   }

   public void setCoste_p( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Coste_p = value ;
   }

   public java.math.BigDecimal getCostequimicoacumulado( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costequimicoacumulado ;
   }

   public void setCostequimicoacumulado( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costequimicoacumulado = value ;
   }

   public java.math.BigDecimal getCostefab( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab ;
   }

   public void setCostefab( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab = value ;
   }

   public java.math.BigDecimal getCostefab2( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab2 ;
   }

   public void setCostefab2( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab2 = value ;
   }

   public java.math.BigDecimal getCostefabacumulado( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefabacumulado ;
   }

   public void setCostefabacumulado( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefabacumulado = value ;
   }

   public java.math.BigDecimal getValor( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Valor ;
   }

   public void setValor( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Valor = value ;
   }

   public java.math.BigDecimal getMargen( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Margen ;
   }

   public void setMargen( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Margen = value ;
   }

   public String getTxtalb( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Txtalb ;
   }

   public void setTxtalb( String value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Txtalb = value ;
   }

   public java.math.BigDecimal getBarprekgm( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barprekgm ;
   }

   public void setBarprekgm( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barprekgm = value ;
   }

   public java.util.Date getBarfecgen( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecgen ;
   }

   public void setBarfecgen( java.util.Date value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecgen_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecgen = value ;
   }

   public java.util.Date getBarfecsal( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecsal ;
   }

   public void setBarfecsal( java.util.Date value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecsal_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecsal = value ;
   }

   public java.math.BigDecimal getMmod( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmod ;
   }

   public void setMmod( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmod = value ;
   }

   public java.math.BigDecimal getMmoi( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmoi ;
   }

   public void setMmoi( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmoi = value ;
   }

   public java.math.BigDecimal getMenergia( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Menergia ;
   }

   public void setMenergia( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Menergia = value ;
   }

   public java.math.BigDecimal getMgas( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgas ;
   }

   public void setMgas( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgas = value ;
   }

   public java.math.BigDecimal getMagua( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Magua ;
   }

   public void setMagua( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Magua = value ;
   }

   public java.math.BigDecimal getMgi( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgi ;
   }

   public void setMgi( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgi = value ;
   }

   public java.math.BigDecimal getMam( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mam ;
   }

   public void setMam( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mam = value ;
   }

   public java.math.BigDecimal getMadc( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Madc ;
   }

   public void setMadc( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Madc = value ;
   }

   public String getBarunimed( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barunimed ;
   }

   public void setBarunimed( String value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barunimed = value ;
   }

   public java.math.BigDecimal getCosteteo( )
   {
      return gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costeteo ;
   }

   public void setCosteteo( java.math.BigDecimal value )
   {
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N = (byte)(0) ;
      gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costeteo = value ;
   }

   protected byte gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcodreo ;
   protected byte gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecgen_N ;
   protected byte gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecsal_N ;
   protected byte gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_N ;
   protected short gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Bartipart ;
   protected int gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Clicod ;
   protected int gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcod ;
   protected int gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcolnum ;
   protected String gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Clinom ;
   protected String gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcodpar ;
   protected String gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barnhdr ;
   protected String gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barser ;
   protected String gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barserdsc ;
   protected String gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcolnom ;
   protected String gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barunimed ;
   protected String gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Txtalb ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barkgm ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barmtr ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Coste_p ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costequimicoacumulado ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab2 ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefabacumulado ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Valor ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Margen ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barprekgm ;
   protected java.util.Date gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecgen ;
   protected java.util.Date gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecsal ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmod ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mmoi ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Menergia ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgas ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Magua ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mgi ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Mam ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Madc ;
   protected java.math.BigDecimal gxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costeteo ;
}

