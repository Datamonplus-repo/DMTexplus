package app.facturacion ;
import com.genexus.*;

public final  class StructSdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem implements Cloneable, java.io.Serializable
{
   public StructSdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem( )
   {
      this( -1, new ModelContext( StructSdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem.class ));
   }

   public StructSdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem( int remoteHandle ,
                                                                                                ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprofch = cal.getTime() ;
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprokgs = new java.math.BigDecimal(0) ;
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpromet = new java.math.BigDecimal(0) ;
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albimporte = new java.math.BigDecimal(0) ;
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprofch_N = (byte)(1) ;
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
      return gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Seleccionar ;
   }

   public void setSeleccionar( boolean value )
   {
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_N = (byte)(0) ;
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Seleccionar = value ;
   }

   public long getAlbprocod( )
   {
      return gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprocod ;
   }

   public void setAlbprocod( long value )
   {
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_N = (byte)(0) ;
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprocod = value ;
   }

   public java.util.Date getAlbprofch( )
   {
      return gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprofch ;
   }

   public void setAlbprofch( java.util.Date value )
   {
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprofch_N = (byte)(0) ;
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_N = (byte)(0) ;
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprofch = value ;
   }

   public byte getAlbproest( )
   {
      return gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albproest ;
   }

   public void setAlbproest( byte value )
   {
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_N = (byte)(0) ;
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albproest = value ;
   }

   public short getAlbpropie( )
   {
      return gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpropie ;
   }

   public void setAlbpropie( short value )
   {
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_N = (byte)(0) ;
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpropie = value ;
   }

   public java.math.BigDecimal getAlbprokgs( )
   {
      return gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprokgs ;
   }

   public void setAlbprokgs( java.math.BigDecimal value )
   {
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_N = (byte)(0) ;
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprokgs = value ;
   }

   public java.math.BigDecimal getAlbpromet( )
   {
      return gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpromet ;
   }

   public void setAlbpromet( java.math.BigDecimal value )
   {
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_N = (byte)(0) ;
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpromet = value ;
   }

   public java.math.BigDecimal getAlbimporte( )
   {
      return gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albimporte ;
   }

   public void setAlbimporte( java.math.BigDecimal value )
   {
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_N = (byte)(0) ;
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albimporte = value ;
   }

   protected byte gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albproest ;
   protected byte gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprofch_N ;
   protected byte gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_N ;
   protected short gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpropie ;
   protected long gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprocod ;
   protected boolean gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Seleccionar ;
   protected java.util.Date gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprofch ;
   protected java.math.BigDecimal gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprokgs ;
   protected java.math.BigDecimal gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpromet ;
   protected java.math.BigDecimal gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albimporte ;
}

