package app.ponteway ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ListValues", namespace ="TexplusNET")
public final  class StructSdtListValues implements Cloneable, java.io.Serializable
{
   public StructSdtListValues( )
   {
      this( -1, new ModelContext( StructSdtListValues.class ));
   }

   public StructSdtListValues( int remoteHandle ,
                               ModelContext context )
   {
   }

   public  StructSdtListValues( java.util.Vector<StructSdtListValues_Item> value )
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
   public java.util.Vector<StructSdtListValues_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtListValues_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtListValues_Item> item = new java.util.Vector<>();
}

