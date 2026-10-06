package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "InformeOperariosCodebar_SDT", namespace ="TexplusNET")
public final  class StructSdtInformeOperariosCodebar_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtInformeOperariosCodebar_SDT( )
   {
      this( -1, new ModelContext( StructSdtInformeOperariosCodebar_SDT.class ));
   }

   public StructSdtInformeOperariosCodebar_SDT( int remoteHandle ,
                                                ModelContext context )
   {
   }

   public  StructSdtInformeOperariosCodebar_SDT( java.util.Vector<StructSdtInformeOperariosCodebar_SDT_Item> value )
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
   public java.util.Vector<StructSdtInformeOperariosCodebar_SDT_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtInformeOperariosCodebar_SDT_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtInformeOperariosCodebar_SDT_Item> item = new java.util.Vector<>();
}

