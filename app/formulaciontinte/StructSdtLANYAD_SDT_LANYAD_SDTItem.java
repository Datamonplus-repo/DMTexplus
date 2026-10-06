package app.formulaciontinte ;
import com.genexus.*;

public final  class StructSdtLANYAD_SDT_LANYAD_SDTItem implements Cloneable, java.io.Serializable
{
   public StructSdtLANYAD_SDT_LANYAD_SDTItem( )
   {
      this( -1, new ModelContext( StructSdtLANYAD_SDT_LANYAD_SDTItem.class ));
   }

   public StructSdtLANYAD_SDT_LANYAD_SDTItem( int remoteHandle ,
                                              ModelContext context )
   {
      gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdnum = "" ;
      gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdnom = "" ;
      gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdcfin = new java.math.BigDecimal(0) ;
      gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Lote = "" ;
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

   public String getPrdnum( )
   {
      return gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdnum ;
   }

   public void setPrdnum( String value )
   {
      gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_N = (byte)(0) ;
      gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdnum = value ;
   }

   public String getPrdnom( )
   {
      return gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdnom ;
   }

   public void setPrdnom( String value )
   {
      gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_N = (byte)(0) ;
      gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdnom = value ;
   }

   public java.math.BigDecimal getPrdcfin( )
   {
      return gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdcfin ;
   }

   public void setPrdcfin( java.math.BigDecimal value )
   {
      gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_N = (byte)(0) ;
      gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdcfin = value ;
   }

   public String getLote( )
   {
      return gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Lote ;
   }

   public void setLote( String value )
   {
      gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_N = (byte)(0) ;
      gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Lote = value ;
   }

   protected byte gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_N ;
   protected String gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdnum ;
   protected String gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdnom ;
   protected String gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Lote ;
   protected java.math.BigDecimal gxTv_SdtLANYAD_SDT_LANYAD_SDTItem_Prdcfin ;
}

