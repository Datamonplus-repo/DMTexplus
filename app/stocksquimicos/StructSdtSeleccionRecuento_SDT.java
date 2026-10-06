package app.stocksquimicos ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "SeleccionRecuento_SDT", namespace ="TexplusNET")
public final  class StructSdtSeleccionRecuento_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtSeleccionRecuento_SDT( )
   {
      this( -1, new ModelContext( StructSdtSeleccionRecuento_SDT.class ));
   }

   public StructSdtSeleccionRecuento_SDT( int remoteHandle ,
                                          ModelContext context )
   {
   }

   public  StructSdtSeleccionRecuento_SDT( java.util.Vector<StructSdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SeleccionRecuento_SDTItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem> item = new java.util.Vector<>();
}

