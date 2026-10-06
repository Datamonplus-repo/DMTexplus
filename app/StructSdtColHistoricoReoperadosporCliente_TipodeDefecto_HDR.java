package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColHistoricoReoperadosporCliente.TipodeDefecto.HDR", namespace ="TexplusNET")
public final  class StructSdtColHistoricoReoperadosporCliente_TipodeDefecto_HDR implements Cloneable, java.io.Serializable
{
   public StructSdtColHistoricoReoperadosporCliente_TipodeDefecto_HDR( )
   {
      this( -1, new ModelContext( StructSdtColHistoricoReoperadosporCliente_TipodeDefecto_HDR.class ));
   }

   public StructSdtColHistoricoReoperadosporCliente_TipodeDefecto_HDR( int remoteHandle ,
                                                                       ModelContext context )
   {
   }

   public  StructSdtColHistoricoReoperadosporCliente_TipodeDefecto_HDR( java.util.Vector<StructSdtHistoricoReoperadosporCliente_TipodeDefecto_HDR> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="HistoricoReoperadosporCliente.TipodeDefecto.HDR",namespace="TexplusNET")
   public java.util.Vector<StructSdtHistoricoReoperadosporCliente_TipodeDefecto_HDR> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtHistoricoReoperadosporCliente_TipodeDefecto_HDR> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtHistoricoReoperadosporCliente_TipodeDefecto_HDR> item = new java.util.Vector<>();
}

