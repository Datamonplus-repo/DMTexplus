package app ;
import com.genexus.*;

public final  class StructSdtFileUploadFiles_File implements Cloneable, java.io.Serializable
{
   public StructSdtFileUploadFiles_File( )
   {
      this( -1, new ModelContext( StructSdtFileUploadFiles_File.class ));
   }

   public StructSdtFileUploadFiles_File( int remoteHandle ,
                                         ModelContext context )
   {
      gxTv_SdtFileUploadFiles_File_Fullname = "" ;
      gxTv_SdtFileUploadFiles_File_Name = "" ;
      gxTv_SdtFileUploadFiles_File_Extension = "" ;
      gxTv_SdtFileUploadFiles_File_File = "" ;
      gxTv_SdtFileUploadFiles_File_Path = "" ;
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

   public String getFullname( )
   {
      return gxTv_SdtFileUploadFiles_File_Fullname ;
   }

   public void setFullname( String value )
   {
      gxTv_SdtFileUploadFiles_File_N = (byte)(0) ;
      gxTv_SdtFileUploadFiles_File_Fullname = value ;
   }

   public String getName( )
   {
      return gxTv_SdtFileUploadFiles_File_Name ;
   }

   public void setName( String value )
   {
      gxTv_SdtFileUploadFiles_File_N = (byte)(0) ;
      gxTv_SdtFileUploadFiles_File_Name = value ;
   }

   public String getExtension( )
   {
      return gxTv_SdtFileUploadFiles_File_Extension ;
   }

   public void setExtension( String value )
   {
      gxTv_SdtFileUploadFiles_File_N = (byte)(0) ;
      gxTv_SdtFileUploadFiles_File_Extension = value ;
   }

   public long getSize( )
   {
      return gxTv_SdtFileUploadFiles_File_Size ;
   }

   public void setSize( long value )
   {
      gxTv_SdtFileUploadFiles_File_N = (byte)(0) ;
      gxTv_SdtFileUploadFiles_File_Size = value ;
   }

   public String getFile( )
   {
      return gxTv_SdtFileUploadFiles_File_File ;
   }

   public void setFile( String value )
   {
      gxTv_SdtFileUploadFiles_File_N = (byte)(0) ;
      gxTv_SdtFileUploadFiles_File_File = value ;
   }

   public String getPath( )
   {
      return gxTv_SdtFileUploadFiles_File_Path ;
   }

   public void setPath( String value )
   {
      gxTv_SdtFileUploadFiles_File_N = (byte)(0) ;
      gxTv_SdtFileUploadFiles_File_Path = value ;
   }

   protected byte gxTv_SdtFileUploadFiles_File_N ;
   protected long gxTv_SdtFileUploadFiles_File_Size ;
   protected String gxTv_SdtFileUploadFiles_File_Fullname ;
   protected String gxTv_SdtFileUploadFiles_File_Name ;
   protected String gxTv_SdtFileUploadFiles_File_Extension ;
   protected String gxTv_SdtFileUploadFiles_File_File ;
   protected String gxTv_SdtFileUploadFiles_File_Path ;
}

