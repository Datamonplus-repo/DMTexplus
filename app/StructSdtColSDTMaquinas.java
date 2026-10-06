package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTMaquinas", namespace ="TexplusNET")
public final  class StructSdtColSDTMaquinas implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTMaquinas( )
   {
      this( -1, new ModelContext( StructSdtColSDTMaquinas.class ));
   }

   public StructSdtColSDTMaquinas( int remoteHandle ,
                                   ModelContext context )
   {
   }

   public  StructSdtColSDTMaquinas( java.util.Vector<StructSdtSDTMaquinas> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTMaquinas",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTMaquinas> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTMaquinas> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTMaquinas> item = new java.util.Vector<>();
}

