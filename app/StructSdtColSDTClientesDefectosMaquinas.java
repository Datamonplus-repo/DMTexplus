package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTClientesDefectosMaquinas", namespace ="TexplusNET")
public final  class StructSdtColSDTClientesDefectosMaquinas implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTClientesDefectosMaquinas( )
   {
      this( -1, new ModelContext( StructSdtColSDTClientesDefectosMaquinas.class ));
   }

   public StructSdtColSDTClientesDefectosMaquinas( int remoteHandle ,
                                                   ModelContext context )
   {
   }

   public  StructSdtColSDTClientesDefectosMaquinas( java.util.Vector<StructSdtSDTClientesDefectosMaquinas> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTClientesDefectosMaquinas",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTClientesDefectosMaquinas> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTClientesDefectosMaquinas> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTClientesDefectosMaquinas> item = new java.util.Vector<>();
}

