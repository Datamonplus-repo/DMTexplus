package app.test ;
import com.genexus.*;

public final  class StructSdtAbaranesData implements Cloneable, java.io.Serializable
{
   public StructSdtAbaranesData( )
   {
      this( -1, new ModelContext( StructSdtAbaranesData.class ));
   }

   public StructSdtAbaranesData( int remoteHandle ,
                                 ModelContext context )
   {
      gxTv_SdtAbaranesData_Auxiliardata_N = (byte)(1) ;
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

   public java.util.Vector<app.wwpbaseobjects.StructSdtWizardAuxiliarData_WizardAuxiliarDataItem> getAuxiliardata( )
   {
      return gxTv_SdtAbaranesData_Auxiliardata ;
   }

   public void setAuxiliardata( java.util.Vector<app.wwpbaseobjects.StructSdtWizardAuxiliarData_WizardAuxiliarDataItem> value )
   {
      gxTv_SdtAbaranesData_Auxiliardata_N = (byte)(0) ;
      gxTv_SdtAbaranesData_N = (byte)(0) ;
      gxTv_SdtAbaranesData_Auxiliardata = value ;
   }

   protected byte gxTv_SdtAbaranesData_Auxiliardata_N ;
   protected byte gxTv_SdtAbaranesData_N ;
   protected java.util.Vector<app.wwpbaseobjects.StructSdtWizardAuxiliarData_WizardAuxiliarDataItem> gxTv_SdtAbaranesData_Auxiliardata=null ;
}

