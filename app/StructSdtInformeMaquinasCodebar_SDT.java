package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "InformeMaquinasCodebar_SDT", namespace ="TexplusNET")
public final  class StructSdtInformeMaquinasCodebar_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtInformeMaquinasCodebar_SDT( )
   {
      this( -1, new ModelContext( StructSdtInformeMaquinasCodebar_SDT.class ));
   }

   public StructSdtInformeMaquinasCodebar_SDT( int remoteHandle ,
                                               ModelContext context )
   {
   }

   public  StructSdtInformeMaquinasCodebar_SDT( java.util.Vector<StructSdtInformeMaquinasCodebar_SDT_Item> value )
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
   public java.util.Vector<StructSdtInformeMaquinasCodebar_SDT_Item> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtInformeMaquinasCodebar_SDT_Item> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtInformeMaquinasCodebar_SDT_Item> item = new java.util.Vector<>();
}

