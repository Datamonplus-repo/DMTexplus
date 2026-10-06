package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColHistoricoReoperadosporCliente", namespace ="TexplusNET")
public final  class StructSdtColHistoricoReoperadosporCliente implements Cloneable, java.io.Serializable
{
   public StructSdtColHistoricoReoperadosporCliente( )
   {
      this( -1, new ModelContext( StructSdtColHistoricoReoperadosporCliente.class ));
   }

   public StructSdtColHistoricoReoperadosporCliente( int remoteHandle ,
                                                     ModelContext context )
   {
   }

   public  StructSdtColHistoricoReoperadosporCliente( java.util.Vector<StructSdtHistoricoReoperadosporCliente> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="HistoricoReoperadosporCliente",namespace="TexplusNET")
   public java.util.Vector<StructSdtHistoricoReoperadosporCliente> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtHistoricoReoperadosporCliente> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtHistoricoReoperadosporCliente> item = new java.util.Vector<>();
}

