package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTConsultaMaquina.OrdenesItem", namespace ="TexplusNET")
public final  class StructSdtColSDTConsultaMaquina_OrdenesItem implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTConsultaMaquina_OrdenesItem( )
   {
      this( -1, new ModelContext( StructSdtColSDTConsultaMaquina_OrdenesItem.class ));
   }

   public StructSdtColSDTConsultaMaquina_OrdenesItem( int remoteHandle ,
                                                      ModelContext context )
   {
   }

   public  StructSdtColSDTConsultaMaquina_OrdenesItem( java.util.Vector<StructSdtSDTConsultaMaquina_OrdenesItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTConsultaMaquina.OrdenesItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTConsultaMaquina_OrdenesItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTConsultaMaquina_OrdenesItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTConsultaMaquina_OrdenesItem> item = new java.util.Vector<>();
}

