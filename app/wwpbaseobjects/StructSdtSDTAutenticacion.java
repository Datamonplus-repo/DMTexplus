package app.wwpbaseobjects ;
import com.genexus.*;

public final  class StructSdtSDTAutenticacion implements Cloneable, java.io.Serializable
{
   public StructSdtSDTAutenticacion( )
   {
      this( -1, new ModelContext( StructSdtSDTAutenticacion.class ));
   }

   public StructSdtSDTAutenticacion( int remoteHandle ,
                                     ModelContext context )
   {
      gxTv_SdtSDTAutenticacion_Cadena01 = "" ;
      gxTv_SdtSDTAutenticacion_Cadena02 = "" ;
      gxTv_SdtSDTAutenticacion_Cadena03 = "" ;
      gxTv_SdtSDTAutenticacion_Cadena04 = "" ;
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

   public String getCadena01( )
   {
      return gxTv_SdtSDTAutenticacion_Cadena01 ;
   }

   public void setCadena01( String value )
   {
      gxTv_SdtSDTAutenticacion_N = (byte)(0) ;
      gxTv_SdtSDTAutenticacion_Cadena01 = value ;
   }

   public String getCadena02( )
   {
      return gxTv_SdtSDTAutenticacion_Cadena02 ;
   }

   public void setCadena02( String value )
   {
      gxTv_SdtSDTAutenticacion_N = (byte)(0) ;
      gxTv_SdtSDTAutenticacion_Cadena02 = value ;
   }

   public String getCadena03( )
   {
      return gxTv_SdtSDTAutenticacion_Cadena03 ;
   }

   public void setCadena03( String value )
   {
      gxTv_SdtSDTAutenticacion_N = (byte)(0) ;
      gxTv_SdtSDTAutenticacion_Cadena03 = value ;
   }

   public String getCadena04( )
   {
      return gxTv_SdtSDTAutenticacion_Cadena04 ;
   }

   public void setCadena04( String value )
   {
      gxTv_SdtSDTAutenticacion_N = (byte)(0) ;
      gxTv_SdtSDTAutenticacion_Cadena04 = value ;
   }

   protected byte gxTv_SdtSDTAutenticacion_N ;
   protected String gxTv_SdtSDTAutenticacion_Cadena01 ;
   protected String gxTv_SdtSDTAutenticacion_Cadena02 ;
   protected String gxTv_SdtSDTAutenticacion_Cadena03 ;
   protected String gxTv_SdtSDTAutenticacion_Cadena04 ;
}

