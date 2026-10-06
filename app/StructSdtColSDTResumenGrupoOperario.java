package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTResumenGrupoOperario", namespace ="TexplusNET")
public final  class StructSdtColSDTResumenGrupoOperario implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTResumenGrupoOperario( )
   {
      this( -1, new ModelContext( StructSdtColSDTResumenGrupoOperario.class ));
   }

   public StructSdtColSDTResumenGrupoOperario( int remoteHandle ,
                                               ModelContext context )
   {
   }

   public  StructSdtColSDTResumenGrupoOperario( java.util.Vector<StructSdtSDTResumenGrupoOperario> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTResumenGrupoOperario",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTResumenGrupoOperario> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTResumenGrupoOperario> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTResumenGrupoOperario> item = new java.util.Vector<>();
}

