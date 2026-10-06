package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTQueryRecordSet.RegistroItem", namespace ="TexplusNET")
public final  class StructSdtColSDTQueryRecordSet_RegistroItem implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTQueryRecordSet_RegistroItem( )
   {
      this( -1, new ModelContext( StructSdtColSDTQueryRecordSet_RegistroItem.class ));
   }

   public StructSdtColSDTQueryRecordSet_RegistroItem( int remoteHandle ,
                                                      ModelContext context )
   {
   }

   public  StructSdtColSDTQueryRecordSet_RegistroItem( java.util.Vector<StructSdtSDTQueryRecordSet_RegistroItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTQueryRecordSet.RegistroItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTQueryRecordSet_RegistroItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTQueryRecordSet_RegistroItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTQueryRecordSet_RegistroItem> item = new java.util.Vector<>();
}

