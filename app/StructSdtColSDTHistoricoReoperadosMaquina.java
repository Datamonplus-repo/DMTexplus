package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTHistoricoReoperadosMaquina", namespace ="TexplusNET")
public final  class StructSdtColSDTHistoricoReoperadosMaquina implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTHistoricoReoperadosMaquina( )
   {
      this( -1, new ModelContext( StructSdtColSDTHistoricoReoperadosMaquina.class ));
   }

   public StructSdtColSDTHistoricoReoperadosMaquina( int remoteHandle ,
                                                     ModelContext context )
   {
   }

   public  StructSdtColSDTHistoricoReoperadosMaquina( java.util.Vector<StructSdtSDTHistoricoReoperadosMaquina> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTHistoricoReoperadosMaquina",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTHistoricoReoperadosMaquina> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTHistoricoReoperadosMaquina> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTHistoricoReoperadosMaquina> item = new java.util.Vector<>();
}

