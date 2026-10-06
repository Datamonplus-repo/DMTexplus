package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTHdrsporMaquina.Agr", namespace ="TexplusNET")
public final  class StructSdtColSDTHdrsporMaquina_Agr implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTHdrsporMaquina_Agr( )
   {
      this( -1, new ModelContext( StructSdtColSDTHdrsporMaquina_Agr.class ));
   }

   public StructSdtColSDTHdrsporMaquina_Agr( int remoteHandle ,
                                             ModelContext context )
   {
   }

   public  StructSdtColSDTHdrsporMaquina_Agr( java.util.Vector<StructSdtSDTHdrsporMaquina_Agr> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTHdrsporMaquina.Agr",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTHdrsporMaquina_Agr> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTHdrsporMaquina_Agr> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTHdrsporMaquina_Agr> item = new java.util.Vector<>();
}

