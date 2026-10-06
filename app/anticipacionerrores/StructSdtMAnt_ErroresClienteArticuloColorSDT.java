package app.anticipacionerrores ;
import com.genexus.*;

public final  class StructSdtMAnt_ErroresClienteArticuloColorSDT implements Cloneable, java.io.Serializable
{
   public StructSdtMAnt_ErroresClienteArticuloColorSDT( )
   {
      this( -1, new ModelContext( StructSdtMAnt_ErroresClienteArticuloColorSDT.class ));
   }

   public StructSdtMAnt_ErroresClienteArticuloColorSDT( int remoteHandle ,
                                                        ModelContext context )
   {
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantemprcod = "" ;
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantclinom = "" ;
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantartcod = "" ;
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantartdsc = "" ;
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantcolnom = "" ;
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

   public String getMantemprcod( )
   {
      return gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantemprcod ;
   }

   public void setMantemprcod( String value )
   {
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantemprcod = value ;
   }

   public int getMantclicod( )
   {
      return gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantclicod ;
   }

   public void setMantclicod( int value )
   {
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantclicod = value ;
   }

   public String getMantclinom( )
   {
      return gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantclinom ;
   }

   public void setMantclinom( String value )
   {
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantclinom = value ;
   }

   public String getMantartcod( )
   {
      return gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantartcod ;
   }

   public void setMantartcod( String value )
   {
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantartcod = value ;
   }

   public String getMantartdsc( )
   {
      return gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantartdsc ;
   }

   public void setMantartdsc( String value )
   {
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantartdsc = value ;
   }

   public int getMantcolnum( )
   {
      return gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantcolnum ;
   }

   public void setMantcolnum( int value )
   {
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantcolnum = value ;
   }

   public String getMantcolnom( )
   {
      return gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantcolnom ;
   }

   public void setMantcolnom( String value )
   {
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantcolnom = value ;
   }

   protected byte gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_N ;
   protected int gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantclicod ;
   protected int gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantcolnum ;
   protected String gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantemprcod ;
   protected String gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantartcod ;
   protected String gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantcolnom ;
   protected String gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantclinom ;
   protected String gxTv_SdtMAnt_ErroresClienteArticuloColorSDT_Mantartdsc ;
}

