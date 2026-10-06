package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTHistoricoReoperadosResumenCliente.Total", namespace ="TexplusNET")
public final  class StructSdtColSDTHistoricoReoperadosResumenCliente_Total implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTHistoricoReoperadosResumenCliente_Total( )
   {
      this( -1, new ModelContext( StructSdtColSDTHistoricoReoperadosResumenCliente_Total.class ));
   }

   public StructSdtColSDTHistoricoReoperadosResumenCliente_Total( int remoteHandle ,
                                                                  ModelContext context )
   {
   }

   public  StructSdtColSDTHistoricoReoperadosResumenCliente_Total( java.util.Vector<StructSdtSDTHistoricoReoperadosResumenCliente_Total> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTHistoricoReoperadosResumenCliente.Total",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTHistoricoReoperadosResumenCliente_Total> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTHistoricoReoperadosResumenCliente_Total> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTHistoricoReoperadosResumenCliente_Total> item = new java.util.Vector<>();
}

