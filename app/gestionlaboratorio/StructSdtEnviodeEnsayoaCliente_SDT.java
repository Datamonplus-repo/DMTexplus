package app.gestionlaboratorio ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "EnviodeEnsayoaCliente_SDT", namespace ="TexplusNET")
public final  class StructSdtEnviodeEnsayoaCliente_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtEnviodeEnsayoaCliente_SDT( )
   {
      this( -1, new ModelContext( StructSdtEnviodeEnsayoaCliente_SDT.class ));
   }

   public StructSdtEnviodeEnsayoaCliente_SDT( int remoteHandle ,
                                              ModelContext context )
   {
   }

   public  StructSdtEnviodeEnsayoaCliente_SDT( java.util.Vector<StructSdtEnviodeEnsayoaCliente_SDT_Item> value )
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
   public java.util.Vector<StructSdtEnviodeEnsayoaCliente_SDT_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtEnviodeEnsayoaCliente_SDT_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtEnviodeEnsayoaCliente_SDT_Item> item = new java.util.Vector<>();
}

