package app.ponteway.v1.openapicommon ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "ColApiResponse", namespace ="TexplusNET")
public final  class StructSdtColApiResponse implements Cloneable, java.io.Serializable
{
   public StructSdtColApiResponse( )
   {
      this( -1, new ModelContext( StructSdtColApiResponse.class ));
   }

   public StructSdtColApiResponse( int remoteHandle ,
                                   ModelContext context )
   {
   }

   public  StructSdtColApiResponse( java.util.Vector<StructSdtApiResponse> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="ApiResponse",namespace="TexplusNET")
   public java.util.Vector<StructSdtApiResponse> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtApiResponse> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtApiResponse> item = new java.util.Vector<>();
}

