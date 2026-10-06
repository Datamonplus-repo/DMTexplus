package app.anticipacionerrores ;
import com.genexus.*;

public final  class StructSdtMAnt_ErroresSDT implements Cloneable, java.io.Serializable
{
   public StructSdtMAnt_ErroresSDT( )
   {
      this( -1, new ModelContext( StructSdtMAnt_ErroresSDT.class ));
   }

   public StructSdtMAnt_ErroresSDT( int remoteHandle ,
                                    ModelContext context )
   {
      gxTv_SdtMAnt_ErroresSDT_Mantemprcod = "" ;
      gxTv_SdtMAnt_ErroresSDT_Mantclinom = "" ;
      gxTv_SdtMAnt_ErroresSDT_Mantartcod = "" ;
      gxTv_SdtMAnt_ErroresSDT_Mantartdsc = "" ;
      gxTv_SdtMAnt_ErroresSDT_Manttipmcod = "" ;
      gxTv_SdtMAnt_ErroresSDT_Manttipmdsc = "" ;
      gxTv_SdtMAnt_ErroresSDT_Mantmaqcod = "" ;
      gxTv_SdtMAnt_ErroresSDT_Mantmaqdsc = "" ;
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
      return gxTv_SdtMAnt_ErroresSDT_Mantemprcod ;
   }

   public void setMantemprcod( String value )
   {
      gxTv_SdtMAnt_ErroresSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresSDT_Mantemprcod = value ;
   }

   public int getMantclicod( )
   {
      return gxTv_SdtMAnt_ErroresSDT_Mantclicod ;
   }

   public void setMantclicod( int value )
   {
      gxTv_SdtMAnt_ErroresSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresSDT_Mantclicod = value ;
   }

   public String getMantclinom( )
   {
      return gxTv_SdtMAnt_ErroresSDT_Mantclinom ;
   }

   public void setMantclinom( String value )
   {
      gxTv_SdtMAnt_ErroresSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresSDT_Mantclinom = value ;
   }

   public String getMantartcod( )
   {
      return gxTv_SdtMAnt_ErroresSDT_Mantartcod ;
   }

   public void setMantartcod( String value )
   {
      gxTv_SdtMAnt_ErroresSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresSDT_Mantartcod = value ;
   }

   public String getMantartdsc( )
   {
      return gxTv_SdtMAnt_ErroresSDT_Mantartdsc ;
   }

   public void setMantartdsc( String value )
   {
      gxTv_SdtMAnt_ErroresSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresSDT_Mantartdsc = value ;
   }

   public int getMantcolnum( )
   {
      return gxTv_SdtMAnt_ErroresSDT_Mantcolnum ;
   }

   public void setMantcolnum( int value )
   {
      gxTv_SdtMAnt_ErroresSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresSDT_Mantcolnum = value ;
   }

   public String getManttipmcod( )
   {
      return gxTv_SdtMAnt_ErroresSDT_Manttipmcod ;
   }

   public void setManttipmcod( String value )
   {
      gxTv_SdtMAnt_ErroresSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresSDT_Manttipmcod = value ;
   }

   public String getManttipmdsc( )
   {
      return gxTv_SdtMAnt_ErroresSDT_Manttipmdsc ;
   }

   public void setManttipmdsc( String value )
   {
      gxTv_SdtMAnt_ErroresSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresSDT_Manttipmdsc = value ;
   }

   public String getMantmaqcod( )
   {
      return gxTv_SdtMAnt_ErroresSDT_Mantmaqcod ;
   }

   public void setMantmaqcod( String value )
   {
      gxTv_SdtMAnt_ErroresSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresSDT_Mantmaqcod = value ;
   }

   public String getMantmaqdsc( )
   {
      return gxTv_SdtMAnt_ErroresSDT_Mantmaqdsc ;
   }

   public void setMantmaqdsc( String value )
   {
      gxTv_SdtMAnt_ErroresSDT_N = (byte)(0) ;
      gxTv_SdtMAnt_ErroresSDT_Mantmaqdsc = value ;
   }

   protected byte gxTv_SdtMAnt_ErroresSDT_N ;
   protected int gxTv_SdtMAnt_ErroresSDT_Mantclicod ;
   protected int gxTv_SdtMAnt_ErroresSDT_Mantcolnum ;
   protected String gxTv_SdtMAnt_ErroresSDT_Mantemprcod ;
   protected String gxTv_SdtMAnt_ErroresSDT_Mantartcod ;
   protected String gxTv_SdtMAnt_ErroresSDT_Manttipmcod ;
   protected String gxTv_SdtMAnt_ErroresSDT_Mantmaqcod ;
   protected String gxTv_SdtMAnt_ErroresSDT_Mantclinom ;
   protected String gxTv_SdtMAnt_ErroresSDT_Mantartdsc ;
   protected String gxTv_SdtMAnt_ErroresSDT_Manttipmdsc ;
   protected String gxTv_SdtMAnt_ErroresSDT_Mantmaqdsc ;
}

