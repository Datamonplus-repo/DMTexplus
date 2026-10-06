package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTHistoricoReoperadosTipoDefecto.Clilente", namespace ="TexplusNET")
public final  class StructSdtColSDTHistoricoReoperadosTipoDefecto_Clilente implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTHistoricoReoperadosTipoDefecto_Clilente( )
   {
      this( -1, new ModelContext( StructSdtColSDTHistoricoReoperadosTipoDefecto_Clilente.class ));
   }

   public StructSdtColSDTHistoricoReoperadosTipoDefecto_Clilente( int remoteHandle ,
                                                                  ModelContext context )
   {
   }

   public  StructSdtColSDTHistoricoReoperadosTipoDefecto_Clilente( java.util.Vector<StructSdtSDTHistoricoReoperadosTipoDefecto_Clilente> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTHistoricoReoperadosTipoDefecto.Clilente",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTHistoricoReoperadosTipoDefecto_Clilente> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTHistoricoReoperadosTipoDefecto_Clilente> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTHistoricoReoperadosTipoDefecto_Clilente> item = new java.util.Vector<>();
}

