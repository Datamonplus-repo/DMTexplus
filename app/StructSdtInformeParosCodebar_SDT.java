package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "InformeParosCodebar_SDT", namespace ="TexplusNET")
public final  class StructSdtInformeParosCodebar_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtInformeParosCodebar_SDT( )
   {
      this( -1, new ModelContext( StructSdtInformeParosCodebar_SDT.class ));
   }

   public StructSdtInformeParosCodebar_SDT( int remoteHandle ,
                                            ModelContext context )
   {
   }

   public  StructSdtInformeParosCodebar_SDT( java.util.Vector<StructSdtInformeParosCodebar_SDT_Item> value )
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
   public java.util.Vector<StructSdtInformeParosCodebar_SDT_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtInformeParosCodebar_SDT_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtInformeParosCodebar_SDT_Item> item = new java.util.Vector<>();
}

