package app ;
import com.genexus.*;

public final  class StructSdtSdt_MergePDF_PDF implements Cloneable, java.io.Serializable
{
   public StructSdtSdt_MergePDF_PDF( )
   {
      this( -1, new ModelContext( StructSdtSdt_MergePDF_PDF.class ));
   }

   public StructSdtSdt_MergePDF_PDF( int remoteHandle ,
                                     ModelContext context )
   {
      gxTv_SdtSdt_MergePDF_PDF_Realpath = "" ;
      gxTv_SdtSdt_MergePDF_PDF_Textocopia = "" ;
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

   public String getRealpath( )
   {
      return gxTv_SdtSdt_MergePDF_PDF_Realpath ;
   }

   public void setRealpath( String value )
   {
      gxTv_SdtSdt_MergePDF_PDF_N = (byte)(0) ;
      gxTv_SdtSdt_MergePDF_PDF_Realpath = value ;
   }

   public String getTextocopia( )
   {
      return gxTv_SdtSdt_MergePDF_PDF_Textocopia ;
   }

   public void setTextocopia( String value )
   {
      gxTv_SdtSdt_MergePDF_PDF_N = (byte)(0) ;
      gxTv_SdtSdt_MergePDF_PDF_Textocopia = value ;
   }

   protected byte gxTv_SdtSdt_MergePDF_PDF_N ;
   protected String gxTv_SdtSdt_MergePDF_PDF_Realpath ;
   protected String gxTv_SdtSdt_MergePDF_PDF_Textocopia ;
}

