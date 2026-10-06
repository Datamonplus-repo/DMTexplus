package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColTTERPES.Level1Item", namespace ="TexplusNET")
public final  class StructSdtColTTERPES_Level1Item implements Cloneable, java.io.Serializable
{
   public StructSdtColTTERPES_Level1Item( )
   {
      this( -1, new ModelContext( StructSdtColTTERPES_Level1Item.class ));
   }

   public StructSdtColTTERPES_Level1Item( int remoteHandle ,
                                          ModelContext context )
   {
   }

   public  StructSdtColTTERPES_Level1Item( java.util.Vector<StructSdtTTERPES_Level1Item> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="TTERPES.Level1Item",namespace="TexplusNET")
   public java.util.Vector<StructSdtTTERPES_Level1Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtTTERPES_Level1Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtTTERPES_Level1Item> item = new java.util.Vector<>();
}

