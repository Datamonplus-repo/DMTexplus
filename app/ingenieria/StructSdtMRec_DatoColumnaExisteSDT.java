package app.ingenieria ;
import com.genexus.*;

public final  class StructSdtMRec_DatoColumnaExisteSDT implements Cloneable, java.io.Serializable
{
   public StructSdtMRec_DatoColumnaExisteSDT( )
   {
      this( -1, new ModelContext( StructSdtMRec_DatoColumnaExisteSDT.class ));
   }

   public StructSdtMRec_DatoColumnaExisteSDT( int remoteHandle ,
                                              ModelContext context )
   {
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

   public boolean getColumnaexiste( )
   {
      return gxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste ;
   }

   public void setColumnaexiste( boolean value )
   {
      gxTv_SdtMRec_DatoColumnaExisteSDT_N = (byte)(0) ;
      gxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste = value ;
   }

   protected byte gxTv_SdtMRec_DatoColumnaExisteSDT_N ;
   protected boolean gxTv_SdtMRec_DatoColumnaExisteSDT_Columnaexiste ;
}

