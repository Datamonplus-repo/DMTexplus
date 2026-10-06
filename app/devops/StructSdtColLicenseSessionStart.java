package app.devops ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColLicenseSessionStart", namespace ="TexplusNET")
public final  class StructSdtColLicenseSessionStart implements Cloneable, java.io.Serializable
{
   public StructSdtColLicenseSessionStart( )
   {
      this( -1, new ModelContext( StructSdtColLicenseSessionStart.class ));
   }

   public StructSdtColLicenseSessionStart( int remoteHandle ,
                                           ModelContext context )
   {
   }

   public  StructSdtColLicenseSessionStart( java.util.Vector<StructSdtLicenseSessionStart> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="LicenseSessionStart",namespace="TexplusNET")
   public java.util.Vector<StructSdtLicenseSessionStart> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtLicenseSessionStart> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtLicenseSessionStart> item = new java.util.Vector<>();
}

