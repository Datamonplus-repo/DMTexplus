package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "SDTInputMask", namespace ="TexplusNET")
public final  class StructSdtSDTInputMask implements Cloneable, java.io.Serializable
{
   public StructSdtSDTInputMask( )
   {
      this( -1, new ModelContext( StructSdtSDTInputMask.class ));
   }

   public StructSdtSDTInputMask( int remoteHandle ,
                                 ModelContext context )
   {
   }

   public  StructSdtSDTInputMask( java.util.Vector<StructSdtSDTInputMask_Item> value )
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
   public java.util.Vector<StructSdtSDTInputMask_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTInputMask_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTInputMask_Item> item = new java.util.Vector<>();
}

