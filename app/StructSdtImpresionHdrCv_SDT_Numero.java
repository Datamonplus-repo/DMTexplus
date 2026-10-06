package app ;
import com.genexus.*;

public final  class StructSdtImpresionHdrCv_SDT_Numero implements Cloneable, java.io.Serializable
{
   public StructSdtImpresionHdrCv_SDT_Numero( )
   {
      this( -1, new ModelContext( StructSdtImpresionHdrCv_SDT_Numero.class ));
   }

   public StructSdtImpresionHdrCv_SDT_Numero( int remoteHandle ,
                                              ModelContext context )
   {
      gxTv_SdtImpresionHdrCv_SDT_Numero_Relacionhdrs = "" ;
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

   public short getNumerohdrs( )
   {
      return gxTv_SdtImpresionHdrCv_SDT_Numero_Numerohdrs ;
   }

   public void setNumerohdrs( short value )
   {
      gxTv_SdtImpresionHdrCv_SDT_Numero_N = (byte)(0) ;
      gxTv_SdtImpresionHdrCv_SDT_Numero_Numerohdrs = value ;
   }

   public String getRelacionhdrs( )
   {
      return gxTv_SdtImpresionHdrCv_SDT_Numero_Relacionhdrs ;
   }

   public void setRelacionhdrs( String value )
   {
      gxTv_SdtImpresionHdrCv_SDT_Numero_N = (byte)(0) ;
      gxTv_SdtImpresionHdrCv_SDT_Numero_Relacionhdrs = value ;
   }

   protected byte gxTv_SdtImpresionHdrCv_SDT_Numero_N ;
   protected short gxTv_SdtImpresionHdrCv_SDT_Numero_Numerohdrs ;
   protected String gxTv_SdtImpresionHdrCv_SDT_Numero_Relacionhdrs ;
}

