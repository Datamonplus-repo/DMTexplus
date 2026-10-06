package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTMaquina", namespace ="TexplusNET")
public final  class StructSdtColSDTMaquina implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTMaquina( )
   {
      this( -1, new ModelContext( StructSdtColSDTMaquina.class ));
   }

   public StructSdtColSDTMaquina( int remoteHandle ,
                                  ModelContext context )
   {
   }

   public  StructSdtColSDTMaquina( java.util.Vector<StructSdtSDTMaquina> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTMaquina",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTMaquina> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTMaquina> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTMaquina> item = new java.util.Vector<>();
}

