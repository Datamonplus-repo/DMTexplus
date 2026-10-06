package app ;
import com.genexus.*;

@jakarta.xml.bind.annotation.XmlType(name = "FileUploadFiles", namespace ="TexplusNET")
public final  class StructSdtFileUploadFiles implements Cloneable, java.io.Serializable
{
   public StructSdtFileUploadFiles( )
   {
      this( -1, new ModelContext( StructSdtFileUploadFiles.class ));
   }

   public StructSdtFileUploadFiles( int remoteHandle ,
                                    ModelContext context )
   {
   }

   public  StructSdtFileUploadFiles( java.util.Vector<StructSdtFileUploadFiles_File> value )
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

   @jakarta.xml.bind.annotation.XmlElement(name="File",namespace="TexplusNET")
   public java.util.Vector<StructSdtFileUploadFiles_File> getItem( )
   {
      return item;
   }

   public void setItem( java.util.Vector<StructSdtFileUploadFiles_File> value )
   {
      item = value;
   }

   protected  java.util.Vector<StructSdtFileUploadFiles_File> item = new java.util.Vector<>();
}

