package app.facturacion ;
import com.genexus.*;

public final  class StructSdtPrecios_cliente_mail_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtPrecios_cliente_mail_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtPrecios_cliente_mail_SDT_Item.class ));
   }

   public StructSdtPrecios_cliente_mail_SDT_Item( int remoteHandle ,
                                                  ModelContext context )
   {
      gxTv_SdtPrecios_cliente_mail_SDT_Item_Fortonal = "" ;
      gxTv_SdtPrecios_cliente_mail_SDT_Item_Artdsc = "" ;
      gxTv_SdtPrecios_cliente_mail_SDT_Item_Tipartdsc = "" ;
      gxTv_SdtPrecios_cliente_mail_SDT_Item_Fornomcli = "" ;
      gxTv_SdtPrecios_cliente_mail_SDT_Item_Forcolnom = "" ;
      gxTv_SdtPrecios_cliente_mail_SDT_Item_Forprekgm = new java.math.BigDecimal(0) ;
      gxTv_SdtPrecios_cliente_mail_SDT_Item_Obs = "" ;
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

   public String getFortonal( )
   {
      return gxTv_SdtPrecios_cliente_mail_SDT_Item_Fortonal ;
   }

   public void setFortonal( String value )
   {
      gxTv_SdtPrecios_cliente_mail_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_mail_SDT_Item_Fortonal = value ;
   }

   public String getArtdsc( )
   {
      return gxTv_SdtPrecios_cliente_mail_SDT_Item_Artdsc ;
   }

   public void setArtdsc( String value )
   {
      gxTv_SdtPrecios_cliente_mail_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_mail_SDT_Item_Artdsc = value ;
   }

   public String getTipartdsc( )
   {
      return gxTv_SdtPrecios_cliente_mail_SDT_Item_Tipartdsc ;
   }

   public void setTipartdsc( String value )
   {
      gxTv_SdtPrecios_cliente_mail_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_mail_SDT_Item_Tipartdsc = value ;
   }

   public String getFornomcli( )
   {
      return gxTv_SdtPrecios_cliente_mail_SDT_Item_Fornomcli ;
   }

   public void setFornomcli( String value )
   {
      gxTv_SdtPrecios_cliente_mail_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_mail_SDT_Item_Fornomcli = value ;
   }

   public String getForcolnom( )
   {
      return gxTv_SdtPrecios_cliente_mail_SDT_Item_Forcolnom ;
   }

   public void setForcolnom( String value )
   {
      gxTv_SdtPrecios_cliente_mail_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_mail_SDT_Item_Forcolnom = value ;
   }

   public int getForcolnum( )
   {
      return gxTv_SdtPrecios_cliente_mail_SDT_Item_Forcolnum ;
   }

   public void setForcolnum( int value )
   {
      gxTv_SdtPrecios_cliente_mail_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_mail_SDT_Item_Forcolnum = value ;
   }

   public java.math.BigDecimal getForprekgm( )
   {
      return gxTv_SdtPrecios_cliente_mail_SDT_Item_Forprekgm ;
   }

   public void setForprekgm( java.math.BigDecimal value )
   {
      gxTv_SdtPrecios_cliente_mail_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_mail_SDT_Item_Forprekgm = value ;
   }

   public String getObs( )
   {
      return gxTv_SdtPrecios_cliente_mail_SDT_Item_Obs ;
   }

   public void setObs( String value )
   {
      gxTv_SdtPrecios_cliente_mail_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_mail_SDT_Item_Obs = value ;
   }

   public boolean getSeleccionar( )
   {
      return gxTv_SdtPrecios_cliente_mail_SDT_Item_Seleccionar ;
   }

   public void setSeleccionar( boolean value )
   {
      gxTv_SdtPrecios_cliente_mail_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPrecios_cliente_mail_SDT_Item_Seleccionar = value ;
   }

   protected byte gxTv_SdtPrecios_cliente_mail_SDT_Item_N ;
   protected int gxTv_SdtPrecios_cliente_mail_SDT_Item_Forcolnum ;
   protected String gxTv_SdtPrecios_cliente_mail_SDT_Item_Fortonal ;
   protected String gxTv_SdtPrecios_cliente_mail_SDT_Item_Artdsc ;
   protected String gxTv_SdtPrecios_cliente_mail_SDT_Item_Tipartdsc ;
   protected String gxTv_SdtPrecios_cliente_mail_SDT_Item_Fornomcli ;
   protected String gxTv_SdtPrecios_cliente_mail_SDT_Item_Forcolnom ;
   protected String gxTv_SdtPrecios_cliente_mail_SDT_Item_Obs ;
   protected boolean gxTv_SdtPrecios_cliente_mail_SDT_Item_Seleccionar ;
   protected java.math.BigDecimal gxTv_SdtPrecios_cliente_mail_SDT_Item_Forprekgm ;
}

