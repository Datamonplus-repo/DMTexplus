package app ;
import com.genexus.*;

public final  class StructSdtSDTtablahdrs implements Cloneable, java.io.Serializable
{
   public StructSdtSDTtablahdrs( )
   {
      this( -1, new ModelContext( StructSdtSDTtablahdrs.class ));
   }

   public StructSdtSDTtablahdrs( int remoteHandle ,
                                 ModelContext context )
   {
      gxTv_SdtSDTtablahdrs_Barnhdr = "" ;
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

   public String getBarnhdr( )
   {
      return gxTv_SdtSDTtablahdrs_Barnhdr ;
   }

   public void setBarnhdr( String value )
   {
      gxTv_SdtSDTtablahdrs_N = (byte)(0) ;
      gxTv_SdtSDTtablahdrs_Barnhdr = value ;
   }

   protected byte gxTv_SdtSDTtablahdrs_N ;
   protected String gxTv_SdtSDTtablahdrs_Barnhdr ;
}

