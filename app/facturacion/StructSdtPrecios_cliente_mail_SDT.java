package app.facturacion ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "Precios_cliente_mail_SDT", namespace ="TexplusNET")
public final  class StructSdtPrecios_cliente_mail_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtPrecios_cliente_mail_SDT( )
   {
      this( -1, new ModelContext( StructSdtPrecios_cliente_mail_SDT.class ));
   }

   public StructSdtPrecios_cliente_mail_SDT( int remoteHandle ,
                                             ModelContext context )
   {
   }

   public  StructSdtPrecios_cliente_mail_SDT( java.util.Vector<StructSdtPrecios_cliente_mail_SDT_Item> value )
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
   public java.util.Vector<StructSdtPrecios_cliente_mail_SDT_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtPrecios_cliente_mail_SDT_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtPrecios_cliente_mail_SDT_Item> item = new java.util.Vector<>();
}

