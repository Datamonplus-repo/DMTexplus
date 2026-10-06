package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTConsultaMaquina", namespace ="TexplusNET")
public final  class StructSdtColSDTConsultaMaquina implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTConsultaMaquina( )
   {
      this( -1, new ModelContext( StructSdtColSDTConsultaMaquina.class ));
   }

   public StructSdtColSDTConsultaMaquina( int remoteHandle ,
                                          ModelContext context )
   {
   }

   public  StructSdtColSDTConsultaMaquina( java.util.Vector<StructSdtSDTConsultaMaquina> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTConsultaMaquina",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTConsultaMaquina> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTConsultaMaquina> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTConsultaMaquina> item = new java.util.Vector<>();
}

