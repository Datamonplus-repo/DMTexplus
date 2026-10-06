package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "SDTGridMaquina", namespace ="TexplusNET")
public final  class StructSdtSDTGridMaquina implements Cloneable, java.io.Serializable
{
   public StructSdtSDTGridMaquina( )
   {
      this( -1, new ModelContext( StructSdtSDTGridMaquina.class ));
   }

   public StructSdtSDTGridMaquina( int remoteHandle ,
                                   ModelContext context )
   {
   }

   public  StructSdtSDTGridMaquina( java.util.Vector<StructSdtSDTGridMaquina_SDTGridMaquinaItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTGridMaquinaItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTGridMaquina_SDTGridMaquinaItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTGridMaquina_SDTGridMaquinaItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTGridMaquina_SDTGridMaquinaItem> item = new java.util.Vector<>();
}

