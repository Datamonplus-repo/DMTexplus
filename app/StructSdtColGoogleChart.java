package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColGoogleChart", namespace ="TexplusNET")
public final  class StructSdtColGoogleChart implements Cloneable, java.io.Serializable
{
   public StructSdtColGoogleChart( )
   {
      this( -1, new ModelContext( StructSdtColGoogleChart.class ));
   }

   public StructSdtColGoogleChart( int remoteHandle ,
                                   ModelContext context )
   {
   }

   public  StructSdtColGoogleChart( java.util.Vector<StructSdtGoogleChart> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="GoogleChart",namespace="TexplusNET")
   public java.util.Vector<StructSdtGoogleChart> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtGoogleChart> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtGoogleChart> item = new java.util.Vector<>();
}

