package app ;
import com.genexus.*;

public final  class StructSdtFilterMtoFormulasTinteWW implements Cloneable, java.io.Serializable
{
   public StructSdtFilterMtoFormulasTinteWW( )
   {
      this( -1, new ModelContext( StructSdtFilterMtoFormulasTinteWW.class ));
   }

   public StructSdtFilterMtoFormulasTinteWW( int remoteHandle ,
                                             ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtFilterMtoFormulasTinteWW_Forfec = cal.getTime() ;
      gxTv_SdtFilterMtoFormulasTinteWW_Forfec_to = cal.getTime() ;
      gxTv_SdtFilterMtoFormulasTinteWW_Forcolnom = "" ;
      gxTv_SdtFilterMtoFormulasTinteWW_Forfec_N = (byte)(1) ;
      gxTv_SdtFilterMtoFormulasTinteWW_Forfec_to_N = (byte)(1) ;
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

   public int getClicodto( )
   {
      return gxTv_SdtFilterMtoFormulasTinteWW_Clicodto ;
   }

   public void setClicodto( int value )
   {
      gxTv_SdtFilterMtoFormulasTinteWW_N = (byte)(0) ;
      gxTv_SdtFilterMtoFormulasTinteWW_Clicodto = value ;
   }

   public int getClicodform( )
   {
      return gxTv_SdtFilterMtoFormulasTinteWW_Clicodform ;
   }

   public void setClicodform( int value )
   {
      gxTv_SdtFilterMtoFormulasTinteWW_N = (byte)(0) ;
      gxTv_SdtFilterMtoFormulasTinteWW_Clicodform = value ;
   }

   public java.util.Date getForfec( )
   {
      return gxTv_SdtFilterMtoFormulasTinteWW_Forfec ;
   }

   public void setForfec( java.util.Date value )
   {
      gxTv_SdtFilterMtoFormulasTinteWW_Forfec_N = (byte)(0) ;
      gxTv_SdtFilterMtoFormulasTinteWW_N = (byte)(0) ;
      gxTv_SdtFilterMtoFormulasTinteWW_Forfec = value ;
   }

   public java.util.Date getForfec_to( )
   {
      return gxTv_SdtFilterMtoFormulasTinteWW_Forfec_to ;
   }

   public void setForfec_to( java.util.Date value )
   {
      gxTv_SdtFilterMtoFormulasTinteWW_Forfec_to_N = (byte)(0) ;
      gxTv_SdtFilterMtoFormulasTinteWW_N = (byte)(0) ;
      gxTv_SdtFilterMtoFormulasTinteWW_Forfec_to = value ;
   }

   public int getForcolnum( )
   {
      return gxTv_SdtFilterMtoFormulasTinteWW_Forcolnum ;
   }

   public void setForcolnum( int value )
   {
      gxTv_SdtFilterMtoFormulasTinteWW_N = (byte)(0) ;
      gxTv_SdtFilterMtoFormulasTinteWW_Forcolnum = value ;
   }

   public String getForcolnom( )
   {
      return gxTv_SdtFilterMtoFormulasTinteWW_Forcolnom ;
   }

   public void setForcolnom( String value )
   {
      gxTv_SdtFilterMtoFormulasTinteWW_N = (byte)(0) ;
      gxTv_SdtFilterMtoFormulasTinteWW_Forcolnom = value ;
   }

   protected byte gxTv_SdtFilterMtoFormulasTinteWW_Forfec_N ;
   protected byte gxTv_SdtFilterMtoFormulasTinteWW_Forfec_to_N ;
   protected byte gxTv_SdtFilterMtoFormulasTinteWW_N ;
   protected int gxTv_SdtFilterMtoFormulasTinteWW_Clicodto ;
   protected int gxTv_SdtFilterMtoFormulasTinteWW_Clicodform ;
   protected int gxTv_SdtFilterMtoFormulasTinteWW_Forcolnum ;
   protected String gxTv_SdtFilterMtoFormulasTinteWW_Forcolnom ;
   protected java.util.Date gxTv_SdtFilterMtoFormulasTinteWW_Forfec ;
   protected java.util.Date gxTv_SdtFilterMtoFormulasTinteWW_Forfec_to ;
}

