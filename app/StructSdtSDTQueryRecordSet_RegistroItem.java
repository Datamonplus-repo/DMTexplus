package app ;
import com.genexus.*;

public final  class StructSdtSDTQueryRecordSet_RegistroItem implements Cloneable, java.io.Serializable
{
   public StructSdtSDTQueryRecordSet_RegistroItem( )
   {
      this( -1, new ModelContext( StructSdtSDTQueryRecordSet_RegistroItem.class ));
   }

   public StructSdtSDTQueryRecordSet_RegistroItem( int remoteHandle ,
                                                   ModelContext context )
   {
      gxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo_N = (byte)(1) ;
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

   public java.util.Vector<app.StructSdtSDTQueryRecordSet_RegistroItem_AtributoItem> getAtributo( )
   {
      return gxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo ;
   }

   public void setAtributo( java.util.Vector<app.StructSdtSDTQueryRecordSet_RegistroItem_AtributoItem> value )
   {
      gxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo_N = (byte)(0) ;
      gxTv_SdtSDTQueryRecordSet_RegistroItem_N = (byte)(0) ;
      gxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo = value ;
   }

   protected byte gxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo_N ;
   protected byte gxTv_SdtSDTQueryRecordSet_RegistroItem_N ;
   protected java.util.Vector<app.StructSdtSDTQueryRecordSet_RegistroItem_AtributoItem> gxTv_SdtSDTQueryRecordSet_RegistroItem_Atributo=null ;
}

