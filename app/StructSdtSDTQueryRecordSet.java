package app ;
import com.genexus.*;

public final  class StructSdtSDTQueryRecordSet implements Cloneable, java.io.Serializable
{
   public StructSdtSDTQueryRecordSet( )
   {
      this( -1, new ModelContext( StructSdtSDTQueryRecordSet.class ));
   }

   public StructSdtSDTQueryRecordSet( int remoteHandle ,
                                      ModelContext context )
   {
      gxTv_SdtSDTQueryRecordSet_Atributo_N = (byte)(1) ;
      gxTv_SdtSDTQueryRecordSet_Registro_N = (byte)(1) ;
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

   public java.util.Vector<app.StructSdtSDTQueryRecordSet_AtributoItem> getAtributo( )
   {
      return gxTv_SdtSDTQueryRecordSet_Atributo ;
   }

   public void setAtributo( java.util.Vector<app.StructSdtSDTQueryRecordSet_AtributoItem> value )
   {
      gxTv_SdtSDTQueryRecordSet_Atributo_N = (byte)(0) ;
      gxTv_SdtSDTQueryRecordSet_N = (byte)(0) ;
      gxTv_SdtSDTQueryRecordSet_Atributo = value ;
   }

   public java.util.Vector<app.StructSdtSDTQueryRecordSet_RegistroItem> getRegistro( )
   {
      return gxTv_SdtSDTQueryRecordSet_Registro ;
   }

   public void setRegistro( java.util.Vector<app.StructSdtSDTQueryRecordSet_RegistroItem> value )
   {
      gxTv_SdtSDTQueryRecordSet_Registro_N = (byte)(0) ;
      gxTv_SdtSDTQueryRecordSet_N = (byte)(0) ;
      gxTv_SdtSDTQueryRecordSet_Registro = value ;
   }

   protected byte gxTv_SdtSDTQueryRecordSet_Atributo_N ;
   protected byte gxTv_SdtSDTQueryRecordSet_Registro_N ;
   protected byte gxTv_SdtSDTQueryRecordSet_N ;
   protected java.util.Vector<app.StructSdtSDTQueryRecordSet_AtributoItem> gxTv_SdtSDTQueryRecordSet_Atributo=null ;
   protected java.util.Vector<app.StructSdtSDTQueryRecordSet_RegistroItem> gxTv_SdtSDTQueryRecordSet_Registro=null ;
}

