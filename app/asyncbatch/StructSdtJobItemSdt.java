package app.asyncbatch ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "JobItemSdt", namespace ="TexplusNET")
public final  class StructSdtJobItemSdt implements Cloneable, java.io.Serializable
{
   public StructSdtJobItemSdt( )
   {
      this( -1, new ModelContext( StructSdtJobItemSdt.class ));
   }

   public StructSdtJobItemSdt( int remoteHandle ,
                               ModelContext context )
   {
   }

   public  StructSdtJobItemSdt( java.util.Vector<StructSdtJobItemSdt_Item> value )
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
   public java.util.Vector<StructSdtJobItemSdt_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtJobItemSdt_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtJobItemSdt_Item> item = new java.util.Vector<>();
}

