package app.facturacion ;
import com.genexus.*;

public final  class StructSdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem implements Cloneable, java.io.Serializable
{
   public StructSdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem( )
   {
      this( -1, new ModelContext( StructSdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem.class ));
   }

   public StructSdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem( int remoteHandle ,
                                                                                              ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomfch = cal.getTime() ;
      gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomimp = new java.math.BigDecimal(0) ;
      gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomfch_N = (byte)(1) ;
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
      return gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Seleccionar ;
   }

   public void setSeleccionar( boolean value )
   {
      gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_N = (byte)(0) ;
      gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Seleccionar = value ;
   }

   public int getAlbcomcod( )
   {
      return gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomcod ;
   }

   public void setAlbcomcod( int value )
   {
      gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_N = (byte)(0) ;
      gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomcod = value ;
   }

   public java.util.Date getAlbcomfch( )
   {
      return gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomfch ;
   }

   public void setAlbcomfch( java.util.Date value )
   {
      gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomfch_N = (byte)(0) ;
      gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_N = (byte)(0) ;
      gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomfch = value ;
   }

   public java.math.BigDecimal getAlbcomimp( )
   {
      return gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomimp ;
   }

   public void setAlbcomimp( java.math.BigDecimal value )
   {
      gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_N = (byte)(0) ;
      gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomimp = value ;
   }

   protected byte gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomfch_N ;
   protected byte gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_N ;
   protected int gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomcod ;
   protected boolean gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Seleccionar ;
   protected java.util.Date gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomfch ;
   protected java.math.BigDecimal gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomimp ;
}

