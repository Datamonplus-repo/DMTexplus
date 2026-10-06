package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTHistoricoReoperadosResumenCliente", namespace ="TexplusNET")
public final  class StructSdtColSDTHistoricoReoperadosResumenCliente implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTHistoricoReoperadosResumenCliente( )
   {
      this( -1, new ModelContext( StructSdtColSDTHistoricoReoperadosResumenCliente.class ));
   }

   public StructSdtColSDTHistoricoReoperadosResumenCliente( int remoteHandle ,
                                                            ModelContext context )
   {
   }

   public  StructSdtColSDTHistoricoReoperadosResumenCliente( java.util.Vector<StructSdtSDTHistoricoReoperadosResumenCliente> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTHistoricoReoperadosResumenCliente",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTHistoricoReoperadosResumenCliente> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTHistoricoReoperadosResumenCliente> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTHistoricoReoperadosResumenCliente> item = new java.util.Vector<>();
}

