package app.facturacion ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "Documentos_Produccion_Comercial_SDT", namespace ="TexplusNET")
public final  class StructSdtDocumentos_Produccion_Comercial_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtDocumentos_Produccion_Comercial_SDT( )
   {
      this( -1, new ModelContext( StructSdtDocumentos_Produccion_Comercial_SDT.class ));
   }

   public StructSdtDocumentos_Produccion_Comercial_SDT( int remoteHandle ,
                                                        ModelContext context )
   {
   }

   public  StructSdtDocumentos_Produccion_Comercial_SDT( java.util.Vector<StructSdtDocumentos_Produccion_Comercial_SDT_Item> value )
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
   public java.util.Vector<StructSdtDocumentos_Produccion_Comercial_SDT_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtDocumentos_Produccion_Comercial_SDT_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtDocumentos_Produccion_Comercial_SDT_Item> item = new java.util.Vector<>();
}

