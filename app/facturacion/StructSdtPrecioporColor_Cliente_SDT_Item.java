package app.facturacion ;
import com.genexus.*;

public final  class StructSdtPrecioporColor_Cliente_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtPrecioporColor_Cliente_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtPrecioporColor_Cliente_SDT_Item.class ));
   }

   public StructSdtPrecioporColor_Cliente_SDT_Item( int remoteHandle ,
                                                    ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forser = "" ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnom = "" ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornomcli = "" ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_New_forprekgm = new java.math.BigDecimal(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprekgm = new java.math.BigDecimal(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec = cal.getTime() ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forpredef = "" ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Oldforpredef = "" ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcosform = new java.math.BigDecimal(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_general = new java.math.BigDecimal(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_total = new java.math.BigDecimal(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec_N = (byte)(1) ;
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

   public boolean getSeleccionar( )
   {
      return gxTv_SdtPrecioporColor_Cliente_SDT_Item_Seleccionar ;
   }

   public void setSeleccionar( boolean value )
   {
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Seleccionar = value ;
   }

   public String getForser( )
   {
      return gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forser ;
   }

   public void setForser( String value )
   {
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forser = value ;
   }

   public int getForcolnum( )
   {
      return gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnum ;
   }

   public void setForcolnum( int value )
   {
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnum = value ;
   }

   public String getForcolnom( )
   {
      return gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnom ;
   }

   public void setForcolnom( String value )
   {
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnom = value ;
   }

   public byte getTipcolcod( )
   {
      return gxTv_SdtPrecioporColor_Cliente_SDT_Item_Tipcolcod ;
   }

   public void setTipcolcod( byte value )
   {
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Tipcolcod = value ;
   }

   public String getFornomcli( )
   {
      return gxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornomcli ;
   }

   public void setFornomcli( String value )
   {
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornomcli = value ;
   }

   public int getFornumcli( )
   {
      return gxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornumcli ;
   }

   public void setFornumcli( int value )
   {
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornumcli = value ;
   }

   public java.math.BigDecimal getNew_forprekgm( )
   {
      return gxTv_SdtPrecioporColor_Cliente_SDT_Item_New_forprekgm ;
   }

   public void setNew_forprekgm( java.math.BigDecimal value )
   {
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_New_forprekgm = value ;
   }

   public java.math.BigDecimal getForprekgm( )
   {
      return gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprekgm ;
   }

   public void setForprekgm( java.math.BigDecimal value )
   {
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprekgm = value ;
   }

   public java.util.Date getForprefec( )
   {
      return gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec ;
   }

   public void setForprefec( java.util.Date value )
   {
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec = value ;
   }

   public String getForpredef( )
   {
      return gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forpredef ;
   }

   public void setForpredef( String value )
   {
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forpredef = value ;
   }

   public String getOldforpredef( )
   {
      return gxTv_SdtPrecioporColor_Cliente_SDT_Item_Oldforpredef ;
   }

   public void setOldforpredef( String value )
   {
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Oldforpredef = value ;
   }

   public java.math.BigDecimal getForcosform( )
   {
      return gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcosform ;
   }

   public void setForcosform( java.math.BigDecimal value )
   {
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcosform = value ;
   }

   public short getGrdtipart( )
   {
      return gxTv_SdtPrecioporColor_Cliente_SDT_Item_Grdtipart ;
   }

   public void setGrdtipart( short value )
   {
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Grdtipart = value ;
   }

   public java.math.BigDecimal getCoste_general( )
   {
      return gxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_general ;
   }

   public void setCoste_general( java.math.BigDecimal value )
   {
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_general = value ;
   }

   public java.math.BigDecimal getCoste_total( )
   {
      return gxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_total ;
   }

   public void setCoste_total( java.math.BigDecimal value )
   {
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_total = value ;
   }

   protected byte gxTv_SdtPrecioporColor_Cliente_SDT_Item_Tipcolcod ;
   protected byte gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec_N ;
   protected byte gxTv_SdtPrecioporColor_Cliente_SDT_Item_N ;
   protected short gxTv_SdtPrecioporColor_Cliente_SDT_Item_Grdtipart ;
   protected int gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnum ;
   protected int gxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornumcli ;
   protected String gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forser ;
   protected String gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcolnom ;
   protected String gxTv_SdtPrecioporColor_Cliente_SDT_Item_Fornomcli ;
   protected String gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forpredef ;
   protected String gxTv_SdtPrecioporColor_Cliente_SDT_Item_Oldforpredef ;
   protected boolean gxTv_SdtPrecioporColor_Cliente_SDT_Item_Seleccionar ;
   protected java.math.BigDecimal gxTv_SdtPrecioporColor_Cliente_SDT_Item_New_forprekgm ;
   protected java.math.BigDecimal gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprekgm ;
   protected java.util.Date gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forprefec ;
   protected java.math.BigDecimal gxTv_SdtPrecioporColor_Cliente_SDT_Item_Forcosform ;
   protected java.math.BigDecimal gxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_general ;
   protected java.math.BigDecimal gxTv_SdtPrecioporColor_Cliente_SDT_Item_Coste_total ;
}

