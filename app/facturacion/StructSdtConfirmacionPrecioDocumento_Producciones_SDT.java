package app.facturacion ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ConfirmacionPrecioDocumento_Producciones_SDT", namespace ="TexplusNET")
public final  class StructSdtConfirmacionPrecioDocumento_Producciones_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtConfirmacionPrecioDocumento_Producciones_SDT( )
   {
      this( -1, new ModelContext( StructSdtConfirmacionPrecioDocumento_Producciones_SDT.class ));
   }

   public StructSdtConfirmacionPrecioDocumento_Producciones_SDT( int remoteHandle ,
                                                                 ModelContext context )
   {
   }

   public  StructSdtConfirmacionPrecioDocumento_Producciones_SDT( java.util.Vector<StructSdtConfirmacionPrecioDocumento_Producciones_SDT_Item> value )
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
   public java.util.Vector<StructSdtConfirmacionPrecioDocumento_Producciones_SDT_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtConfirmacionPrecioDocumento_Producciones_SDT_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtConfirmacionPrecioDocumento_Producciones_SDT_Item> item = new java.util.Vector<>();
}

