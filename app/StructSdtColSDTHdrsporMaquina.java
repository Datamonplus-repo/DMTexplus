package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTHdrsporMaquina", namespace ="TexplusNET")
public final  class StructSdtColSDTHdrsporMaquina implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTHdrsporMaquina( )
   {
      this( -1, new ModelContext( StructSdtColSDTHdrsporMaquina.class ));
   }

   public StructSdtColSDTHdrsporMaquina( int remoteHandle ,
                                         ModelContext context )
   {
   }

   public  StructSdtColSDTHdrsporMaquina( java.util.Vector<StructSdtSDTHdrsporMaquina> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTHdrsporMaquina",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTHdrsporMaquina> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTHdrsporMaquina> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTHdrsporMaquina> item = new java.util.Vector<>();
}

