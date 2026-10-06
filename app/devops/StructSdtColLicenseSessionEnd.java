package app.devops ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColLicenseSessionEnd", namespace ="TexplusNET")
public final  class StructSdtColLicenseSessionEnd implements Cloneable, java.io.Serializable
{
   public StructSdtColLicenseSessionEnd( )
   {
      this( -1, new ModelContext( StructSdtColLicenseSessionEnd.class ));
   }

   public StructSdtColLicenseSessionEnd( int remoteHandle ,
                                         ModelContext context )
   {
   }

   public  StructSdtColLicenseSessionEnd( java.util.Vector<StructSdtLicenseSessionEnd> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="LicenseSessionEnd",namespace="TexplusNET")
   public java.util.Vector<StructSdtLicenseSessionEnd> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtLicenseSessionEnd> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtLicenseSessionEnd> item = new java.util.Vector<>();
}

