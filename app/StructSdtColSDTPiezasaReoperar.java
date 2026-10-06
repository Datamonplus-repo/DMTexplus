package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColSDTPiezasaReoperar", namespace ="TexplusNET")
public final  class StructSdtColSDTPiezasaReoperar implements Cloneable, java.io.Serializable
{
   public StructSdtColSDTPiezasaReoperar( )
   {
      this( -1, new ModelContext( StructSdtColSDTPiezasaReoperar.class ));
   }

   public StructSdtColSDTPiezasaReoperar( int remoteHandle ,
                                          ModelContext context )
   {
   }

   public  StructSdtColSDTPiezasaReoperar( java.util.Vector<StructSdtSDTPiezasaReoperar> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="SDTPiezasaReoperar",namespace="TexplusNET")
   public java.util.Vector<StructSdtSDTPiezasaReoperar> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtSDTPiezasaReoperar> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtSDTPiezasaReoperar> item = new java.util.Vector<>();
}

