package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColTUSUARI.Level1Item", namespace ="TexplusNET")
public final  class StructSdtColTUSUARI_Level1Item implements Cloneable, java.io.Serializable
{
   public StructSdtColTUSUARI_Level1Item( )
   {
      this( -1, new ModelContext( StructSdtColTUSUARI_Level1Item.class ));
   }

   public StructSdtColTUSUARI_Level1Item( int remoteHandle ,
                                          ModelContext context )
   {
   }

   public  StructSdtColTUSUARI_Level1Item( java.util.Vector<StructSdtTUSUARI_Level1Item> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="TUSUARI.Level1Item",namespace="TexplusNET")
   public java.util.Vector<StructSdtTUSUARI_Level1Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtTUSUARI_Level1Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtTUSUARI_Level1Item> item = new java.util.Vector<>();
}

