package app ;
import com.genexus.*;

public final  class StructSdtImpresionHdrCv_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtImpresionHdrCv_SDT( )
   {
      this( -1, new ModelContext( StructSdtImpresionHdrCv_SDT.class ));
   }

   public StructSdtImpresionHdrCv_SDT( int remoteHandle ,
                                       ModelContext context )
   {
      gxTv_SdtImpresionHdrCv_SDT_Clinom = "" ;
      gxTv_SdtImpresionHdrCv_SDT_Barenccli = "" ;
      gxTv_SdtImpresionHdrCv_SDT_Numero_N = (byte)(1) ;
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
      return gxTv_SdtImpresionHdrCv_SDT_Clicod ;
   }

   public void setClicod( int value )
   {
      gxTv_SdtImpresionHdrCv_SDT_N = (byte)(0) ;
      gxTv_SdtImpresionHdrCv_SDT_Clicod = value ;
   }

   public String getClinom( )
   {
      return gxTv_SdtImpresionHdrCv_SDT_Clinom ;
   }

   public void setClinom( String value )
   {
      gxTv_SdtImpresionHdrCv_SDT_N = (byte)(0) ;
      gxTv_SdtImpresionHdrCv_SDT_Clinom = value ;
   }

   public String getBarenccli( )
   {
      return gxTv_SdtImpresionHdrCv_SDT_Barenccli ;
   }

   public void setBarenccli( String value )
   {
      gxTv_SdtImpresionHdrCv_SDT_N = (byte)(0) ;
      gxTv_SdtImpresionHdrCv_SDT_Barenccli = value ;
   }

   public app.StructSdtImpresionHdrCv_SDT_Numero getNumero( )
   {
      return gxTv_SdtImpresionHdrCv_SDT_Numero ;
   }

   public void setNumero( app.StructSdtImpresionHdrCv_SDT_Numero value )
   {
      gxTv_SdtImpresionHdrCv_SDT_Numero_N = (byte)(0) ;
      gxTv_SdtImpresionHdrCv_SDT_N = (byte)(0) ;
      gxTv_SdtImpresionHdrCv_SDT_Numero = value;
   }

   protected byte gxTv_SdtImpresionHdrCv_SDT_Numero_N ;
   protected byte gxTv_SdtImpresionHdrCv_SDT_N ;
   protected int gxTv_SdtImpresionHdrCv_SDT_Clicod ;
   protected String gxTv_SdtImpresionHdrCv_SDT_Clinom ;
   protected String gxTv_SdtImpresionHdrCv_SDT_Barenccli ;
   protected app.StructSdtImpresionHdrCv_SDT_Numero gxTv_SdtImpresionHdrCv_SDT_Numero=null ;
}

