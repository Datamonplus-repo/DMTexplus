package app.license ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColLicenseValidate", namespace ="TexplusNET")
public final  class StructSdtColLicenseValidate implements Cloneable, java.io.Serializable
{
   public StructSdtColLicenseValidate( )
   {
      this( -1, new ModelContext( StructSdtColLicenseValidate.class ));
   }

   public StructSdtColLicenseValidate( int remoteHandle ,
                                       ModelContext context )
   {
   }

   public  StructSdtColLicenseValidate( java.util.Vector<StructSdtLicenseValidate> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="LicenseValidate",namespace="TexplusNET")
   public java.util.Vector<StructSdtLicenseValidate> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtLicenseValidate> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtLicenseValidate> item = new java.util.Vector<>();
}

