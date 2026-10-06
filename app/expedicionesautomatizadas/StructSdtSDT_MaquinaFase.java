package app.expedicionesautomatizadas ;
import com.genexus.*;

public final  class StructSdtSDT_MaquinaFase implements Cloneable, java.io.Serializable
{
   public StructSdtSDT_MaquinaFase( )
   {
      this( -1, new ModelContext( StructSdtSDT_MaquinaFase.class ));
   }

   public StructSdtSDT_MaquinaFase( int remoteHandle ,
                                    ModelContext context )
   {
      gxTv_SdtSDT_MaquinaFase_Emprcod = "" ;
      gxTv_SdtSDT_MaquinaFase_Maqcod = "" ;
      gxTv_SdtSDT_MaquinaFase_Maqdsc = "" ;
      gxTv_SdtSDT_MaquinaFase_Maqfasuni = "" ;
      gxTv_SdtSDT_MaquinaFase_Maqffind = "" ;
      gxTv_SdtSDT_MaquinaFase_Maqfdsc = "" ;
      gxTv_SdtSDT_MaquinaFase_Maqfcod = "" ;
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
      return gxTv_SdtSDT_MaquinaFase_Emprcod ;
   }

   public void setEmprcod( String value )
   {
      gxTv_SdtSDT_MaquinaFase_N = (byte)(0) ;
      gxTv_SdtSDT_MaquinaFase_Emprcod = value ;
   }

   public String getMaqcod( )
   {
      return gxTv_SdtSDT_MaquinaFase_Maqcod ;
   }

   public void setMaqcod( String value )
   {
      gxTv_SdtSDT_MaquinaFase_N = (byte)(0) ;
      gxTv_SdtSDT_MaquinaFase_Maqcod = value ;
   }

   public String getMaqdsc( )
   {
      return gxTv_SdtSDT_MaquinaFase_Maqdsc ;
   }

   public void setMaqdsc( String value )
   {
      gxTv_SdtSDT_MaquinaFase_N = (byte)(0) ;
      gxTv_SdtSDT_MaquinaFase_Maqdsc = value ;
   }

   public String getMaqfasuni( )
   {
      return gxTv_SdtSDT_MaquinaFase_Maqfasuni ;
   }

   public void setMaqfasuni( String value )
   {
      gxTv_SdtSDT_MaquinaFase_N = (byte)(0) ;
      gxTv_SdtSDT_MaquinaFase_Maqfasuni = value ;
   }

   public String getMaqffind( )
   {
      return gxTv_SdtSDT_MaquinaFase_Maqffind ;
   }

   public void setMaqffind( String value )
   {
      gxTv_SdtSDT_MaquinaFase_N = (byte)(0) ;
      gxTv_SdtSDT_MaquinaFase_Maqffind = value ;
   }

   public String getMaqfdsc( )
   {
      return gxTv_SdtSDT_MaquinaFase_Maqfdsc ;
   }

   public void setMaqfdsc( String value )
   {
      gxTv_SdtSDT_MaquinaFase_N = (byte)(0) ;
      gxTv_SdtSDT_MaquinaFase_Maqfdsc = value ;
   }

   public String getMaqfcod( )
   {
      return gxTv_SdtSDT_MaquinaFase_Maqfcod ;
   }

   public void setMaqfcod( String value )
   {
      gxTv_SdtSDT_MaquinaFase_N = (byte)(0) ;
      gxTv_SdtSDT_MaquinaFase_Maqfcod = value ;
   }

   protected byte gxTv_SdtSDT_MaquinaFase_N ;
   protected String gxTv_SdtSDT_MaquinaFase_Emprcod ;
   protected String gxTv_SdtSDT_MaquinaFase_Maqcod ;
   protected String gxTv_SdtSDT_MaquinaFase_Maqdsc ;
   protected String gxTv_SdtSDT_MaquinaFase_Maqfasuni ;
   protected String gxTv_SdtSDT_MaquinaFase_Maqffind ;
   protected String gxTv_SdtSDT_MaquinaFase_Maqfdsc ;
   protected String gxTv_SdtSDT_MaquinaFase_Maqfcod ;
}

