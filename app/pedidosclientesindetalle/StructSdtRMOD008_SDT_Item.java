package app.pedidosclientesindetalle ;
import com.genexus.*;

public final  class StructSdtRMOD008_SDT_Item implements Cloneable, java.io.Serializable
{
   public StructSdtRMOD008_SDT_Item( )
   {
      this( -1, new ModelContext( StructSdtRMOD008_SDT_Item.class ));
   }

   public StructSdtRMOD008_SDT_Item( int remoteHandle ,
                                     ModelContext context )
   {
      gxTv_SdtRMOD008_SDT_Item_Clinom = "" ;
      gxTv_SdtRMOD008_SDT_Item_Saldo_k = new java.math.BigDecimal(0) ;
      gxTv_SdtRMOD008_SDT_Item_Saldo_m = new java.math.BigDecimal(0) ;
      gxTv_SdtRMOD008_SDT_Item_Tot_p = new java.math.BigDecimal(0) ;
      gxTv_SdtRMOD008_SDT_Item_Tot_t = new java.math.BigDecimal(0) ;
      gxTv_SdtRMOD008_SDT_Item_Tot_a = new java.math.BigDecimal(0) ;
      gxTv_SdtRMOD008_SDT_Item_Tot_l = new java.math.BigDecimal(0) ;
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
      return gxTv_SdtRMOD008_SDT_Item_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtRMOD008_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRMOD008_SDT_Item_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtRMOD008_SDT_Item_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtRMOD008_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRMOD008_SDT_Item_Clinom = value ;
   }

   public java.math.BigDecimal getSaldo_k( )
   {
      return gxTv_SdtRMOD008_SDT_Item_Saldo_k ;
   }

   public void setSaldo_k( java.math.BigDecimal value )
   {
      gxTv_SdtRMOD008_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRMOD008_SDT_Item_Saldo_k = value ;
   }

   public java.math.BigDecimal getSaldo_m( )
   {
      return gxTv_SdtRMOD008_SDT_Item_Saldo_m ;
   }

   public void setSaldo_m( java.math.BigDecimal value )
   {
      gxTv_SdtRMOD008_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRMOD008_SDT_Item_Saldo_m = value ;
   }

   public java.math.BigDecimal getTot_p( )
   {
      return gxTv_SdtRMOD008_SDT_Item_Tot_p ;
   }

   public void setTot_p( java.math.BigDecimal value )
   {
      gxTv_SdtRMOD008_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRMOD008_SDT_Item_Tot_p = value ;
   }

   public java.math.BigDecimal getTot_t( )
   {
      return gxTv_SdtRMOD008_SDT_Item_Tot_t ;
   }

   public void setTot_t( java.math.BigDecimal value )
   {
      gxTv_SdtRMOD008_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRMOD008_SDT_Item_Tot_t = value ;
   }

   public java.math.BigDecimal getTot_a( )
   {
      return gxTv_SdtRMOD008_SDT_Item_Tot_a ;
   }

   public void setTot_a( java.math.BigDecimal value )
   {
      gxTv_SdtRMOD008_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRMOD008_SDT_Item_Tot_a = value ;
   }

   public java.math.BigDecimal getTot_l( )
   {
      return gxTv_SdtRMOD008_SDT_Item_Tot_l ;
   }

   public void setTot_l( java.math.BigDecimal value )
   {
      gxTv_SdtRMOD008_SDT_Item_N = (byte)(0) ;
      gxTv_SdtRMOD008_SDT_Item_Tot_l = value ;
   }

   protected byte gxTv_SdtRMOD008_SDT_Item_N ;
   protected int gxTv_SdtRMOD008_SDT_Item_Clicod ;
   protected String gxTv_SdtRMOD008_SDT_Item_Clinom ;
   protected java.math.BigDecimal gxTv_SdtRMOD008_SDT_Item_Saldo_k ;
   protected java.math.BigDecimal gxTv_SdtRMOD008_SDT_Item_Saldo_m ;
   protected java.math.BigDecimal gxTv_SdtRMOD008_SDT_Item_Tot_p ;
   protected java.math.BigDecimal gxTv_SdtRMOD008_SDT_Item_Tot_t ;
   protected java.math.BigDecimal gxTv_SdtRMOD008_SDT_Item_Tot_a ;
   protected java.math.BigDecimal gxTv_SdtRMOD008_SDT_Item_Tot_l ;
}

