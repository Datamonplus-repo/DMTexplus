package app.controlcalidadhtd ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "Wccaud_SDT", namespace ="TexplusNET")
public final  class StructSdtWccaud_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtWccaud_SDT( )
   {
      this( -1, new ModelContext( StructSdtWccaud_SDT.class ));
   }

   public StructSdtWccaud_SDT( int remoteHandle ,
                               ModelContext context )
   {
   }

   public  StructSdtWccaud_SDT( java.util.Vector<StructSdtWccaud_SDT_Item> value )
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
   public java.util.Vector<StructSdtWccaud_SDT_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtWccaud_SDT_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtWccaud_SDT_Item> item = new java.util.Vector<>();
}

