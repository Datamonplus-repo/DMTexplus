package app ;
import com.genexus.*;

public final  class StructSdtEntradaRecuentos_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtEntradaRecuentos_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtEntradaRecuentos_SDT_Item.class ));
   }

   public StructSdtEntradaRecuentos_SDT_Item( int remoteHandle ,
                                              ModelContext context )
   {
      gxTv_SdtEntradaRecuentos_SDT_Item_Prdnum = "" ;
      gxTv_SdtEntradaRecuentos_SDT_Item_Prdnom = "" ;
      gxTv_SdtEntradaRecuentos_SDT_Item_Recexiteo = new java.math.BigDecimal(0) ;
      gxTv_SdtEntradaRecuentos_SDT_Item_Recexirea = new java.math.BigDecimal(0) ;
      gxTv_SdtEntradaRecuentos_SDT_Item_Difer = new java.math.BigDecimal(0) ;
      gxTv_SdtEntradaRecuentos_SDT_Item_Reclot = "" ;
      gxTv_SdtEntradaRecuentos_SDT_Item_Prdrec = "" ;
      gxTv_SdtEntradaRecuentos_SDT_Item_Prdpremed = new java.math.BigDecimal(0) ;
      gxTv_SdtEntradaRecuentos_SDT_Item_Prdpreact = new java.math.BigDecimal(0) ;
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
      return gxTv_SdtEntradaRecuentos_SDT_Item_Prdnum ;
   }

   public void setPrdnum( String value )
   {
      gxTv_SdtEntradaRecuentos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEntradaRecuentos_SDT_Item_Prdnum = value ;
   }

   public String getPrdnom( )
   {
      return gxTv_SdtEntradaRecuentos_SDT_Item_Prdnom ;
   }

   public void setPrdnom( String value )
   {
      gxTv_SdtEntradaRecuentos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEntradaRecuentos_SDT_Item_Prdnom = value ;
   }

   public java.math.BigDecimal getRecexiteo( )
   {
      return gxTv_SdtEntradaRecuentos_SDT_Item_Recexiteo ;
   }

   public void setRecexiteo( java.math.BigDecimal value )
   {
      gxTv_SdtEntradaRecuentos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEntradaRecuentos_SDT_Item_Recexiteo = value ;
   }

   public java.math.BigDecimal getRecexirea( )
   {
      return gxTv_SdtEntradaRecuentos_SDT_Item_Recexirea ;
   }

   public void setRecexirea( java.math.BigDecimal value )
   {
      gxTv_SdtEntradaRecuentos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEntradaRecuentos_SDT_Item_Recexirea = value ;
   }

   public java.math.BigDecimal getDifer( )
   {
      return gxTv_SdtEntradaRecuentos_SDT_Item_Difer ;
   }

   public void setDifer( java.math.BigDecimal value )
   {
      gxTv_SdtEntradaRecuentos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEntradaRecuentos_SDT_Item_Difer = value ;
   }

   public String getReclot( )
   {
      return gxTv_SdtEntradaRecuentos_SDT_Item_Reclot ;
   }

   public void setReclot( String value )
   {
      gxTv_SdtEntradaRecuentos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEntradaRecuentos_SDT_Item_Reclot = value ;
   }

   public String getPrdrec( )
   {
      return gxTv_SdtEntradaRecuentos_SDT_Item_Prdrec ;
   }

   public void setPrdrec( String value )
   {
      gxTv_SdtEntradaRecuentos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEntradaRecuentos_SDT_Item_Prdrec = value ;
   }

   public byte getRecestinv( )
   {
      return gxTv_SdtEntradaRecuentos_SDT_Item_Recestinv ;
   }

   public void setRecestinv( byte value )
   {
      gxTv_SdtEntradaRecuentos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEntradaRecuentos_SDT_Item_Recestinv = value ;
   }

   public java.math.BigDecimal getPrdpremed( )
   {
      return gxTv_SdtEntradaRecuentos_SDT_Item_Prdpremed ;
   }

   public void setPrdpremed( java.math.BigDecimal value )
   {
      gxTv_SdtEntradaRecuentos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEntradaRecuentos_SDT_Item_Prdpremed = value ;
   }

   public java.math.BigDecimal getPrdpreact( )
   {
      return gxTv_SdtEntradaRecuentos_SDT_Item_Prdpreact ;
   }

   public void setPrdpreact( java.math.BigDecimal value )
   {
      gxTv_SdtEntradaRecuentos_SDT_Item_N = (byte)(0) ;
      gxTv_SdtEntradaRecuentos_SDT_Item_Prdpreact = value ;
   }

   protected byte gxTv_SdtEntradaRecuentos_SDT_Item_Recestinv ;
   protected byte gxTv_SdtEntradaRecuentos_SDT_Item_N ;
   protected String gxTv_SdtEntradaRecuentos_SDT_Item_Prdnum ;
   protected String gxTv_SdtEntradaRecuentos_SDT_Item_Prdnom ;
   protected String gxTv_SdtEntradaRecuentos_SDT_Item_Reclot ;
   protected String gxTv_SdtEntradaRecuentos_SDT_Item_Prdrec ;
   protected java.math.BigDecimal gxTv_SdtEntradaRecuentos_SDT_Item_Recexiteo ;
   protected java.math.BigDecimal gxTv_SdtEntradaRecuentos_SDT_Item_Recexirea ;
   protected java.math.BigDecimal gxTv_SdtEntradaRecuentos_SDT_Item_Difer ;
   protected java.math.BigDecimal gxTv_SdtEntradaRecuentos_SDT_Item_Prdpremed ;
   protected java.math.BigDecimal gxTv_SdtEntradaRecuentos_SDT_Item_Prdpreact ;
}

