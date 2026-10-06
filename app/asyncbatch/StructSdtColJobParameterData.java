package app.asyncbatch ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColJobParameterData", namespace ="TexplusNET")
public final  class StructSdtColJobParameterData implements Cloneable, java.io.Serializable
{
   public StructSdtColJobParameterData( )
   {
      this( -1, new ModelContext( StructSdtColJobParameterData.class ));
   }

   public StructSdtColJobParameterData( int remoteHandle ,
                                        ModelContext context )
   {
   }

   public  StructSdtColJobParameterData( java.util.Vector<StructSdtJobParameterData> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="JobParameterData",namespace="TexplusNET")
   public java.util.Vector<StructSdtJobParameterData> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtJobParameterData> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtJobParameterData> item = new java.util.Vector<>();
}

