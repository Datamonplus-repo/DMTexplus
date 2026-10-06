package app.wwpbaseobjects ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "HomeSampleNameValueData", namespace ="TexplusNET")
public final  class StructSdtHomeSampleNameValueData implements Cloneable, java.io.Serializable
{
   public StructSdtHomeSampleNameValueData( )
   {
      this( -1, new ModelContext( StructSdtHomeSampleNameValueData.class ));
   }

   public StructSdtHomeSampleNameValueData( int remoteHandle ,
                                            ModelContext context )
   {
   }

   public  StructSdtHomeSampleNameValueData( java.util.Vector<StructSdtHomeSampleNameValueData_HomeSampleNameValueDataItem> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="HomeSampleNameValueDataItem",namespace="TexplusNET")
   public java.util.Vector<StructSdtHomeSampleNameValueData_HomeSampleNameValueDataItem> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtHomeSampleNameValueData_HomeSampleNameValueDataItem> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtHomeSampleNameValueData_HomeSampleNameValueDataItem> item = new java.util.Vector<>();
}

