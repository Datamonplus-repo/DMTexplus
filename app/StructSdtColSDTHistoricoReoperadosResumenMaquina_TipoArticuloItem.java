package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTHistoricoReoperadosResumenMaquina.TipoArticuloItem", namespace ="TexplusNET")
public final  class StructSdtColSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem( )
   {
      this( -1, new ModelContext( StructSdtColSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem.class ));
   }

   public StructSdtColSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem( int remoteHandle ,
                                                                             ModelContext context )
   {
   }

   public  StructSdtColSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem( java.util.Vector<StructSdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTHistoricoReoperadosResumenMaquina.TipoArticuloItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem> item = new java.util.Vector<>();
}

