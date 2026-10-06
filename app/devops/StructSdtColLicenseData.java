package app.devops ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColLicenseData", namespace ="TexplusNET")
public final  class StructSdtColLicenseData implements Cloneable, java.io.Serializable
{
   public StructSdtColLicenseData( )
   {
      this( -1, new ModelContext( StructSdtColLicenseData.class ));
   }

   public StructSdtColLicenseData( int remoteHandle ,
                                   ModelContext context )
   {
   }

   public  StructSdtColLicenseData( java.util.Vector<StructSdtLicenseData> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="LicenseData",namespace="TexplusNET")
   public java.util.Vector<StructSdtLicenseData> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtLicenseData> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtLicenseData> item = new java.util.Vector<>();
}

