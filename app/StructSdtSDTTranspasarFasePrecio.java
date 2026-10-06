package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "SDTTranspasarFasePrecio", namespace ="TexplusNET")
public final  class StructSdtSDTTranspasarFasePrecio implements Cloneable, java.io.Serializable
{
   public StructSdtSDTTranspasarFasePrecio( )
   {
      this( -1, new ModelContext( StructSdtSDTTranspasarFasePrecio.class ));
   }

   public StructSdtSDTTranspasarFasePrecio( int remoteHandle ,
                                            ModelContext context )
   {
   }

   public  StructSdtSDTTranspasarFasePrecio( java.util.Vector<StructSdtSDTTranspasarFasePrecio_Item> value )
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
   public java.util.Vector<StructSdtSDTTranspasarFasePrecio_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTTranspasarFasePrecio_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTTranspasarFasePrecio_Item> item = new java.util.Vector<>();
}

