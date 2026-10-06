package app.facturacion ;
import com.genexus.*;

public final  class StructSdtFacturasEmitidas_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtFacturasEmitidas_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtFacturasEmitidas_SDT_Item.class ));
   }

   public StructSdtFacturasEmitidas_SDT_Item( int remoteHandle ,
                                              ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtFacturasEmitidas_SDT_Item_Facfch = cal.getTime() ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Clinom = "" ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Clinif = "" ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Factot = new java.math.BigDecimal(0) ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Facbasimp = new java.math.BigDecimal(0) ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Facivaimp = new java.math.BigDecimal(0) ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Fac_kgs = new java.math.BigDecimal(0) ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Fac_mts = new java.math.BigDecimal(0) ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Facfch_N = (byte)(1) ;
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

   public int getFaccod( )
   {
      return gxTv_SdtFacturasEmitidas_SDT_Item_Faccod ;
   }

   public void setFaccod( int value )
   {
      gxTv_SdtFacturasEmitidas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Faccod = value ;
   }

   public java.util.Date getFacfch( )
   {
      return gxTv_SdtFacturasEmitidas_SDT_Item_Facfch ;
   }

   public void setFacfch( java.util.Date value )
   {
      gxTv_SdtFacturasEmitidas_SDT_Item_Facfch_N = (byte)(0) ;
      gxTv_SdtFacturasEmitidas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Facfch = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtFacturasEmitidas_SDT_Item_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtFacturasEmitidas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtFacturasEmitidas_SDT_Item_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtFacturasEmitidas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Clinom = value ;
   }

   public String getClinif( )
   {
      return gxTv_SdtFacturasEmitidas_SDT_Item_Clinif ;
   }

   public void setClinif( String value )
   {
      gxTv_SdtFacturasEmitidas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Clinif = value ;
   }

   public java.math.BigDecimal getFactot( )
   {
      return gxTv_SdtFacturasEmitidas_SDT_Item_Factot ;
   }

   public void setFactot( java.math.BigDecimal value )
   {
      gxTv_SdtFacturasEmitidas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Factot = value ;
   }

   public java.math.BigDecimal getFacbasimp( )
   {
      return gxTv_SdtFacturasEmitidas_SDT_Item_Facbasimp ;
   }

   public void setFacbasimp( java.math.BigDecimal value )
   {
      gxTv_SdtFacturasEmitidas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Facbasimp = value ;
   }

   public byte getFacivapor( )
   {
      return gxTv_SdtFacturasEmitidas_SDT_Item_Facivapor ;
   }

   public void setFacivapor( byte value )
   {
      gxTv_SdtFacturasEmitidas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Facivapor = value ;
   }

   public java.math.BigDecimal getFacivaimp( )
   {
      return gxTv_SdtFacturasEmitidas_SDT_Item_Facivaimp ;
   }

   public void setFacivaimp( java.math.BigDecimal value )
   {
      gxTv_SdtFacturasEmitidas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Facivaimp = value ;
   }

   public java.math.BigDecimal getFac_kgs( )
   {
      return gxTv_SdtFacturasEmitidas_SDT_Item_Fac_kgs ;
   }

   public void setFac_kgs( java.math.BigDecimal value )
   {
      gxTv_SdtFacturasEmitidas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Fac_kgs = value ;
   }

   public java.math.BigDecimal getFac_mts( )
   {
      return gxTv_SdtFacturasEmitidas_SDT_Item_Fac_mts ;
   }

   public void setFac_mts( java.math.BigDecimal value )
   {
      gxTv_SdtFacturasEmitidas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Fac_mts = value ;
   }

   public byte getFactipo( )
   {
      return gxTv_SdtFacturasEmitidas_SDT_Item_Factipo ;
   }

   public void setFactipo( byte value )
   {
      gxTv_SdtFacturasEmitidas_SDT_Item_N = (byte)(0) ;
      gxTv_SdtFacturasEmitidas_SDT_Item_Factipo = value ;
   }

   protected byte gxTv_SdtFacturasEmitidas_SDT_Item_Facivapor ;
   protected byte gxTv_SdtFacturasEmitidas_SDT_Item_Factipo ;
   protected byte gxTv_SdtFacturasEmitidas_SDT_Item_Facfch_N ;
   protected byte gxTv_SdtFacturasEmitidas_SDT_Item_N ;
   protected int gxTv_SdtFacturasEmitidas_SDT_Item_Faccod ;
   protected int gxTv_SdtFacturasEmitidas_SDT_Item_Clicod ;
   protected String gxTv_SdtFacturasEmitidas_SDT_Item_Clinom ;
   protected String gxTv_SdtFacturasEmitidas_SDT_Item_Clinif ;
   protected java.util.Date gxTv_SdtFacturasEmitidas_SDT_Item_Facfch ;
   protected java.math.BigDecimal gxTv_SdtFacturasEmitidas_SDT_Item_Factot ;
   protected java.math.BigDecimal gxTv_SdtFacturasEmitidas_SDT_Item_Facbasimp ;
   protected java.math.BigDecimal gxTv_SdtFacturasEmitidas_SDT_Item_Facivaimp ;
   protected java.math.BigDecimal gxTv_SdtFacturasEmitidas_SDT_Item_Fac_kgs ;
   protected java.math.BigDecimal gxTv_SdtFacturasEmitidas_SDT_Item_Fac_mts ;
}

