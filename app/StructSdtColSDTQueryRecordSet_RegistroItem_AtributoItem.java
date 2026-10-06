package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTQueryRecordSet.RegistroItem.AtributoItem", namespace ="TexplusNET")
public final  class StructSdtColSDTQueryRecordSet_RegistroItem_AtributoItem implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTQueryRecordSet_RegistroItem_AtributoItem( )
   {
      this( -1, new ModelContext( StructSdtColSDTQueryRecordSet_RegistroItem_AtributoItem.class ));
   }

   public StructSdtColSDTQueryRecordSet_RegistroItem_AtributoItem( int remoteHandle ,
                                                                   ModelContext context )
   {
   }

   public  StructSdtColSDTQueryRecordSet_RegistroItem_AtributoItem( java.util.Vector<StructSdtSDTQueryRecordSet_RegistroItem_AtributoItem> value )
   {
      item = value;
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTQueryRecordSet.RegistroItem.AtributoItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTQueryRecordSet_RegistroItem_AtributoItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTQueryRecordSet_RegistroItem_AtributoItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTQueryRecordSet_RegistroItem_AtributoItem> item = new java.util.Vector<>();
}

