package app ;
import com.genexus.*;

public final  class StructSdtSDT_TRATAMIENTO_RECETAS_Receta implements Cloneable, java.io.Serializable
{
   public StructSdtSDT_TRATAMIENTO_RECETAS_Receta( )
   {
      this( -1, new ModelContext( StructSdtSDT_TRATAMIENTO_RECETAS_Receta.class ));
   }

   public StructSdtSDT_TRATAMIENTO_RECETAS_Receta( int remoteHandle ,
                                                   ModelContext context )
   {
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Emprcod = "" ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcod = "" ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcodpar = "" ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Emprnom = "" ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Clinom = "" ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotagr = new java.math.BigDecimal(0) ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotmtr = new java.math.BigDecimal(0) ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcolnom = "" ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barartcod = "" ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barartdsc = "" ;
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

   public String getEmprcod( )
   {
      return gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_N = (byte)(0) ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Emprcod = value ;
   }

   public String getBarcod( )
   {
      return gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcod ;
   }

   public void setBarcod( String value )
   {
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_N = (byte)(0) ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcod = value ;
   }

   public byte getBarcodreo( )
   {
      return gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcodreo ;
   }

   public void setBarcodreo( byte value )
   {
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_N = (byte)(0) ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcodreo = value ;
   }

   public String getBarcodpar( )
   {
      return gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcodpar ;
   }

   public void setBarcodpar( String value )
   {
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_N = (byte)(0) ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcodpar = value ;
   }

   public String getEmprnom( )
   {
      return gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Emprnom ;
   }

   public void setEmprnom( String value )
   {
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_N = (byte)(0) ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Emprnom = value ;
   }

   public int getClicod( )
   {
      return gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_N = (byte)(0) ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_N = (byte)(0) ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Clinom = value ;
   }

   public java.math.BigDecimal getBartotagr( )
   {
      return gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotagr ;
   }

   public void setBartotagr( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_N = (byte)(0) ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotagr = value ;
   }

   public int getBartotpie( )
   {
      return gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotpie ;
   }

   public void setBartotpie( int value )
   {
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_N = (byte)(0) ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotpie = value ;
   }

   public java.math.BigDecimal getBartotmtr( )
   {
      return gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotmtr ;
   }

   public void setBartotmtr( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_N = (byte)(0) ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotmtr = value ;
   }

   public int getBarcolnum( )
   {
      return gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcolnum ;
   }

   public void setBarcolnum( int value )
   {
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_N = (byte)(0) ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcolnum = value ;
   }

   public String getBarcolnom( )
   {
      return gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcolnom ;
   }

   public void setBarcolnom( String value )
   {
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_N = (byte)(0) ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcolnom = value ;
   }

   public String getBarartcod( )
   {
      return gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barartcod ;
   }

   public void setBarartcod( String value )
   {
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_N = (byte)(0) ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barartcod = value ;
   }

   public String getBarartdsc( )
   {
      return gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barartdsc ;
   }

   public void setBarartdsc( String value )
   {
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_N = (byte)(0) ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barartdsc = value ;
   }

   public short getBargraaca( )
   {
      return gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bargraaca ;
   }

   public void setBargraaca( short value )
   {
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_N = (byte)(0) ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bargraaca = value ;
   }

   public short getPrincipal( )
   {
      return gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Principal ;
   }

   public void setPrincipal( short value )
   {
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_N = (byte)(0) ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Principal = value ;
   }

   protected byte gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcodreo ;
   protected byte gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_N ;
   protected short gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bargraaca ;
   protected short gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Principal ;
   protected int gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Clicod ;
   protected int gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotpie ;
   protected int gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcolnum ;
   protected String gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Emprcod ;
   protected String gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcodpar ;
   protected String gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Emprnom ;
   protected String gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Clinom ;
   protected String gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcolnom ;
   protected String gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barartcod ;
   protected String gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barartdsc ;
   protected String gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcod ;
   protected java.math.BigDecimal gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotagr ;
   protected java.math.BigDecimal gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotmtr ;
}

