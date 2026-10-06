package app.facturacion ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "TraspasarPrecioFases_SDT", namespace ="TexplusNET")
public final  class StructSdtTraspasarPrecioFases_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtTraspasarPrecioFases_SDT( )
   {
      this( -1, new ModelContext( StructSdtTraspasarPrecioFases_SDT.class ));
   }

   public StructSdtTraspasarPrecioFases_SDT( int remoteHandle ,
                                             ModelContext context )
   {
   }

   public  StructSdtTraspasarPrecioFases_SDT( java.util.Vector<StructSdtTraspasarPrecioFases_SDT_Item> value )
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
   public java.util.Vector<StructSdtTraspasarPrecioFases_SDT_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtTraspasarPrecioFases_SDT_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtTraspasarPrecioFases_SDT_Item> item = new java.util.Vector<>();
}

