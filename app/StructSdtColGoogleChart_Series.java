package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColGoogleChart.Series", namespace ="TexplusNET")
public final  class StructSdtColGoogleChart_Series implements Cloneable, java.io.Serializable
{
   public StructSdtColGoogleChart_Series( )
   {
      this( -1, new ModelContext( StructSdtColGoogleChart_Series.class ));
   }

   public StructSdtColGoogleChart_Series( int remoteHandle ,
                                          ModelContext context )
   {
   }

   public  StructSdtColGoogleChart_Series( java.util.Vector<StructSdtGoogleChart_Series> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="GoogleChart.Series",namespace="TexplusNET")
   public java.util.Vector<StructSdtGoogleChart_Series> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtGoogleChart_Series> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtGoogleChart_Series> item = new java.util.Vector<>();
}

