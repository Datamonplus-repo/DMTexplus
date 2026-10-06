package app.produccion ;
import com.genexus.*;

public final  class StructSdtConsultadeProduccion_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtConsultadeProduccion_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtConsultadeProduccion_SDT_Item.class ));
   }

   public StructSdtConsultadeProduccion_SDT_Item( int remoteHandle ,
                                                  ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtConsultadeProduccion_SDT_Item_Clinom = "" ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barnhdr = "" ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Baragrest = "" ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Pedidocliente = "" ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barser = "" ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barserdsc = "" ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Bartipartdsc = "" ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barcolnom = "" ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barnomcli = "" ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barkgm = new java.math.BigDecimal(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barmtr = new java.math.BigDecimal(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfecgen = cal.getTime() ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfeccli = cal.getTime() ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfecsal = cal.getTime() ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfecfpr = cal.getTime() ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfascod = "" ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfassig = "" ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Baralbmts = new java.math.BigDecimal(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Baralbkgs = new java.math.BigDecimal(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Bargirar = "" ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barcuaderno = "" ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barproper = "" ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barproperidtx = "" ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barnormas = "" ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Disusrcod = "" ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barcodpar = "" ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfecgen_N = (byte)(1) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfeccli_N = (byte)(1) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfecsal_N = (byte)(1) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfecfpr_N = (byte)(1) ;
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
      return gxTv_SdtConsultadeProduccion_SDT_Item_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Clinom = value ;
   }

   public String getBarnhdr( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barnhdr ;
   }

   public void setBarnhdr( String value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barnhdr = value ;
   }

   public String getBaragrest( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Baragrest ;
   }

   public void setBaragrest( String value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Baragrest = value ;
   }

   public String getPedidocliente( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Pedidocliente ;
   }

   public void setPedidocliente( String value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Pedidocliente = value ;
   }

   public String getBarser( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barser ;
   }

   public void setBarser( String value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barser = value ;
   }

   public String getBarserdsc( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barserdsc ;
   }

   public void setBarserdsc( String value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barserdsc = value ;
   }

   public short getBartipart( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Bartipart ;
   }

   public void setBartipart( short value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Bartipart = value ;
   }

   public String getBartipartdsc( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Bartipartdsc ;
   }

   public void setBartipartdsc( String value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Bartipartdsc = value ;
   }

   public String getBarcolnom( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barcolnom ;
   }

   public void setBarcolnom( String value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barcolnom = value ;
   }

   public int getBarcolnum( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barcolnum ;
   }

   public void setBarcolnum( int value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barcolnum = value ;
   }

   public String getBarnomcli( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barnomcli ;
   }

   public void setBarnomcli( String value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barnomcli = value ;
   }

   public java.math.BigDecimal getBarkgm( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barkgm ;
   }

   public void setBarkgm( java.math.BigDecimal value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barkgm = value ;
   }

   public java.math.BigDecimal getBarmtr( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barmtr ;
   }

   public void setBarmtr( java.math.BigDecimal value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barmtr = value ;
   }

   public int getBarpie( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barpie ;
   }

   public void setBarpie( int value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barpie = value ;
   }

   public byte getBarsit( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barsit ;
   }

   public void setBarsit( byte value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barsit = value ;
   }

   public java.util.Date getBarfecgen( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barfecgen ;
   }

   public void setBarfecgen( java.util.Date value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfecgen_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfecgen = value ;
   }

   public java.util.Date getBarfeccli( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barfeccli ;
   }

   public void setBarfeccli( java.util.Date value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfeccli_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfeccli = value ;
   }

   public java.util.Date getBarfecsal( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barfecsal ;
   }

   public void setBarfecsal( java.util.Date value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfecsal_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfecsal = value ;
   }

   public java.util.Date getBarfecfpr( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barfecfpr ;
   }

   public void setBarfecfpr( java.util.Date value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfecfpr_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfecfpr = value ;
   }

   public String getBarfascod( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barfascod ;
   }

   public void setBarfascod( String value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfascod = value ;
   }

   public String getBarfassig( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barfassig ;
   }

   public void setBarfassig( String value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barfassig = value ;
   }

   public long getBaralbultimo( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Baralbultimo ;
   }

   public void setBaralbultimo( long value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Baralbultimo = value ;
   }

   public int getBaralbfact( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Baralbfact ;
   }

   public void setBaralbfact( int value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Baralbfact = value ;
   }

   public java.math.BigDecimal getBaralbmts( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Baralbmts ;
   }

   public void setBaralbmts( java.math.BigDecimal value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Baralbmts = value ;
   }

   public java.math.BigDecimal getBaralbkgs( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Baralbkgs ;
   }

   public void setBaralbkgs( java.math.BigDecimal value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Baralbkgs = value ;
   }

   public String getBargirar( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Bargirar ;
   }

   public void setBargirar( String value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Bargirar = value ;
   }

   public short getBaracaanh( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Baracaanh ;
   }

   public void setBaracaanh( short value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Baracaanh = value ;
   }

   public String getBarcuaderno( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barcuaderno ;
   }

   public void setBarcuaderno( String value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barcuaderno = value ;
   }

   public String getBarproper( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barproper ;
   }

   public void setBarproper( String value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barproper = value ;
   }

   public String getBarproperidtx( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barproperidtx ;
   }

   public void setBarproperidtx( String value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barproperidtx = value ;
   }

   public String getBarnormas( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barnormas ;
   }

   public void setBarnormas( String value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barnormas = value ;
   }

   public String getDisusrcod( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Disusrcod ;
   }

   public void setDisusrcod( String value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Disusrcod = value ;
   }

   public int getBarcod( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barcod ;
   }

   public void setBarcod( int value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barcod = value ;
   }

   public byte getBarcodreo( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barcodreo ;
   }

   public void setBarcodreo( byte value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barcodreo = value ;
   }

   public String getBarcodpar( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barcodpar ;
   }

   public void setBarcodpar( String value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barcodpar = value ;
   }

   public byte getBarext( )
   {
      return gxTv_SdtConsultadeProduccion_SDT_Item_Barext ;
   }

   public void setBarext( byte value )
   {
      gxTv_SdtConsultadeProduccion_SDT_Item_N = (byte)(0) ;
      gxTv_SdtConsultadeProduccion_SDT_Item_Barext = value ;
   }

   protected byte gxTv_SdtConsultadeProduccion_SDT_Item_Barsit ;
   protected byte gxTv_SdtConsultadeProduccion_SDT_Item_Barcodreo ;
   protected byte gxTv_SdtConsultadeProduccion_SDT_Item_Barext ;
   protected byte gxTv_SdtConsultadeProduccion_SDT_Item_Barfecgen_N ;
   protected byte gxTv_SdtConsultadeProduccion_SDT_Item_Barfeccli_N ;
   protected byte gxTv_SdtConsultadeProduccion_SDT_Item_Barfecsal_N ;
   protected byte gxTv_SdtConsultadeProduccion_SDT_Item_Barfecfpr_N ;
   protected byte gxTv_SdtConsultadeProduccion_SDT_Item_N ;
   protected short gxTv_SdtConsultadeProduccion_SDT_Item_Bartipart ;
   protected short gxTv_SdtConsultadeProduccion_SDT_Item_Baracaanh ;
   protected int gxTv_SdtConsultadeProduccion_SDT_Item_Clicod ;
   protected int gxTv_SdtConsultadeProduccion_SDT_Item_Barcolnum ;
   protected int gxTv_SdtConsultadeProduccion_SDT_Item_Barpie ;
   protected int gxTv_SdtConsultadeProduccion_SDT_Item_Baralbfact ;
   protected int gxTv_SdtConsultadeProduccion_SDT_Item_Barcod ;
   protected long gxTv_SdtConsultadeProduccion_SDT_Item_Baralbultimo ;
   protected String gxTv_SdtConsultadeProduccion_SDT_Item_Clinom ;
   protected String gxTv_SdtConsultadeProduccion_SDT_Item_Barnhdr ;
   protected String gxTv_SdtConsultadeProduccion_SDT_Item_Baragrest ;
   protected String gxTv_SdtConsultadeProduccion_SDT_Item_Pedidocliente ;
   protected String gxTv_SdtConsultadeProduccion_SDT_Item_Barser ;
   protected String gxTv_SdtConsultadeProduccion_SDT_Item_Barserdsc ;
   protected String gxTv_SdtConsultadeProduccion_SDT_Item_Bartipartdsc ;
   protected String gxTv_SdtConsultadeProduccion_SDT_Item_Barcolnom ;
   protected String gxTv_SdtConsultadeProduccion_SDT_Item_Barnomcli ;
   protected String gxTv_SdtConsultadeProduccion_SDT_Item_Barfascod ;
   protected String gxTv_SdtConsultadeProduccion_SDT_Item_Barfassig ;
   protected String gxTv_SdtConsultadeProduccion_SDT_Item_Bargirar ;
   protected String gxTv_SdtConsultadeProduccion_SDT_Item_Barcuaderno ;
   protected String gxTv_SdtConsultadeProduccion_SDT_Item_Barproper ;
   protected String gxTv_SdtConsultadeProduccion_SDT_Item_Barproperidtx ;
   protected String gxTv_SdtConsultadeProduccion_SDT_Item_Disusrcod ;
   protected String gxTv_SdtConsultadeProduccion_SDT_Item_Barcodpar ;
   protected String gxTv_SdtConsultadeProduccion_SDT_Item_Barnormas ;
   protected java.math.BigDecimal gxTv_SdtConsultadeProduccion_SDT_Item_Barkgm ;
   protected java.math.BigDecimal gxTv_SdtConsultadeProduccion_SDT_Item_Barmtr ;
   protected java.util.Date gxTv_SdtConsultadeProduccion_SDT_Item_Barfecgen ;
   protected java.util.Date gxTv_SdtConsultadeProduccion_SDT_Item_Barfeccli ;
   protected java.util.Date gxTv_SdtConsultadeProduccion_SDT_Item_Barfecsal ;
   protected java.util.Date gxTv_SdtConsultadeProduccion_SDT_Item_Barfecfpr ;
   protected java.math.BigDecimal gxTv_SdtConsultadeProduccion_SDT_Item_Baralbmts ;
   protected java.math.BigDecimal gxTv_SdtConsultadeProduccion_SDT_Item_Baralbkgs ;
}

