package app.facturacion ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ListadoPrecios_SDT", namespace ="TexplusNET")
public final  class StructSdtListadoPrecios_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtListadoPrecios_SDT( )
   {
      this( -1, new ModelContext( StructSdtListadoPrecios_SDT.class ));
   }

   public StructSdtListadoPrecios_SDT( int remoteHandle ,
                                       ModelContext context )
   {
   }

   public  StructSdtListadoPrecios_SDT( java.util.Vector<StructSdtListadoPrecios_SDT_ListadoPrecios_SDTItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="ListadoPrecios_SDTItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtListadoPrecios_SDT_ListadoPrecios_SDTItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtListadoPrecios_SDT_ListadoPrecios_SDTItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtListadoPrecios_SDT_ListadoPrecios_SDTItem> item = new java.util.Vector<>();
}

