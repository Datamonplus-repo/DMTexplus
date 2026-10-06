package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTHistoricoReoperadosResumenMaquina", namespace ="TexplusNET")
public final  class StructSdtColSDTHistoricoReoperadosResumenMaquina implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTHistoricoReoperadosResumenMaquina( )
   {
      this( -1, new ModelContext( StructSdtColSDTHistoricoReoperadosResumenMaquina.class ));
   }

   public StructSdtColSDTHistoricoReoperadosResumenMaquina( int remoteHandle ,
                                                            ModelContext context )
   {
   }

   public  StructSdtColSDTHistoricoReoperadosResumenMaquina( java.util.Vector<StructSdtSDTHistoricoReoperadosResumenMaquina> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTHistoricoReoperadosResumenMaquina",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTHistoricoReoperadosResumenMaquina> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTHistoricoReoperadosResumenMaquina> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTHistoricoReoperadosResumenMaquina> item = new java.util.Vector<>();
}

