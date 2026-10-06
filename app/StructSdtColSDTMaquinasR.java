package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTMaquinasR", namespace ="TexplusNET")
public final  class StructSdtColSDTMaquinasR implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTMaquinasR( )
   {
      this( -1, new ModelContext( StructSdtColSDTMaquinasR.class ));
   }

   public StructSdtColSDTMaquinasR( int remoteHandle ,
                                    ModelContext context )
   {
   }

   public  StructSdtColSDTMaquinasR( java.util.Vector<StructSdtSDTMaquinasR> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTMaquinasR",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTMaquinasR> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTMaquinasR> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTMaquinasR> item = new java.util.Vector<>();
}

