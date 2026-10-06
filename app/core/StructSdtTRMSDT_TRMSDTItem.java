package app.core ;
import com.genexus.*;

public final  class StructSdtTRMSDT_TRMSDTItem implements Cloneable, java.io.Serializable
{
   public StructSdtTRMSDT_TRMSDTItem( )
   {
      this( -1, new ModelContext( StructSdtTRMSDT_TRMSDTItem.class ));
   }

   public StructSdtTRMSDT_TRMSDTItem( int remoteHandle ,
                                      ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtTRMSDT_TRMSDTItem_Valor = "" ;
      gxTv_SdtTRMSDT_TRMSDTItem_Unidad = "" ;
      gxTv_SdtTRMSDT_TRMSDTItem_Vigenciadesde = cal.getTime() ;
      gxTv_SdtTRMSDT_TRMSDTItem_Vigenciahasta = cal.getTime() ;
      gxTv_SdtTRMSDT_TRMSDTItem_Vigenciadesde_N = (byte)(1) ;
      gxTv_SdtTRMSDT_TRMSDTItem_Vigenciahasta_N = (byte)(1) ;
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

   public String getValor( )
   {
      return gxTv_SdtTRMSDT_TRMSDTItem_Valor ;
   }

   public void setValor( String value )
   {
      gxTv_SdtTRMSDT_TRMSDTItem_N = (byte)(0) ;
      gxTv_SdtTRMSDT_TRMSDTItem_Valor = value ;
   }

   public String getUnidad( )
   {
      return gxTv_SdtTRMSDT_TRMSDTItem_Unidad ;
   }

   public void setUnidad( String value )
   {
      gxTv_SdtTRMSDT_TRMSDTItem_N = (byte)(0) ;
      gxTv_SdtTRMSDT_TRMSDTItem_Unidad = value ;
   }

   public java.util.Date getVigenciadesde( )
   {
      return gxTv_SdtTRMSDT_TRMSDTItem_Vigenciadesde ;
   }

   public void setVigenciadesde( java.util.Date value )
   {
      gxTv_SdtTRMSDT_TRMSDTItem_Vigenciadesde_N = (byte)(0) ;
      gxTv_SdtTRMSDT_TRMSDTItem_N = (byte)(0) ;
      gxTv_SdtTRMSDT_TRMSDTItem_Vigenciadesde = value ;
   }

   public java.util.Date getVigenciahasta( )
   {
      return gxTv_SdtTRMSDT_TRMSDTItem_Vigenciahasta ;
   }

   public void setVigenciahasta( java.util.Date value )
   {
      gxTv_SdtTRMSDT_TRMSDTItem_Vigenciahasta_N = (byte)(0) ;
      gxTv_SdtTRMSDT_TRMSDTItem_N = (byte)(0) ;
      gxTv_SdtTRMSDT_TRMSDTItem_Vigenciahasta = value ;
   }

   protected byte gxTv_SdtTRMSDT_TRMSDTItem_Vigenciadesde_N ;
   protected byte gxTv_SdtTRMSDT_TRMSDTItem_Vigenciahasta_N ;
   protected byte gxTv_SdtTRMSDT_TRMSDTItem_N ;
   protected String gxTv_SdtTRMSDT_TRMSDTItem_Valor ;
   protected String gxTv_SdtTRMSDT_TRMSDTItem_Unidad ;
   protected java.util.Date gxTv_SdtTRMSDT_TRMSDTItem_Vigenciadesde ;
   protected java.util.Date gxTv_SdtTRMSDT_TRMSDTItem_Vigenciahasta ;
}

