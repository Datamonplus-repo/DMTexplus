package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColHistoricoReoperadosporCliente.TipodeDefecto", namespace ="TexplusNET")
public final  class StructSdtColHistoricoReoperadosporCliente_TipodeDefecto implements Cloneable, java.io.Serializable
{
   public StructSdtColHistoricoReoperadosporCliente_TipodeDefecto( )
   {
      this( -1, new ModelContext( StructSdtColHistoricoReoperadosporCliente_TipodeDefecto.class ));
   }

   public StructSdtColHistoricoReoperadosporCliente_TipodeDefecto( int remoteHandle ,
                                                                   ModelContext context )
   {
   }

   public  StructSdtColHistoricoReoperadosporCliente_TipodeDefecto( java.util.Vector<StructSdtHistoricoReoperadosporCliente_TipodeDefecto> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="HistoricoReoperadosporCliente.TipodeDefecto",namespace="TexplusNET")
   public java.util.Vector<StructSdtHistoricoReoperadosporCliente_TipodeDefecto> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtHistoricoReoperadosporCliente_TipodeDefecto> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtHistoricoReoperadosporCliente_TipodeDefecto> item = new java.util.Vector<>();
}

