package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "SDTSelectionHDR", namespace ="TexplusNET")
public final  class StructSdtSDTSelectionHDR implements Cloneable, java.io.Serializable
{
   public StructSdtSDTSelectionHDR( )
   {
      this( -1, new ModelContext( StructSdtSDTSelectionHDR.class ));
   }

   public StructSdtSDTSelectionHDR( int remoteHandle ,
                                    ModelContext context )
   {
   }

   public  StructSdtSDTSelectionHDR( java.util.Vector<StructSdtSDTSelectionHDR_Item> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="Item",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTSelectionHDR_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTSelectionHDR_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTSelectionHDR_Item> item = new java.util.Vector<>();
}

