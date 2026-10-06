package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtFileUploadFiles_File extends GxUserType
{
   public SdtFileUploadFiles_File( )
   {
      this(  new ModelContext(SdtFileUploadFiles_File.class));
   }

   public SdtFileUploadFiles_File( ModelContext context )
   {
      super( context, "SdtFileUploadFiles_File");
   }

   public SdtFileUploadFiles_File( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle, context, "SdtFileUploadFiles_File");
   }

   public SdtFileUploadFiles_File( StructSdtFileUploadFiles_File struct )
   {
      this();
      setStruct(struct);
   }

   private static java.util.HashMap mapper = new java.util.HashMap();
   static
   {
   }

   public String getJsonMap( String value )
   {
      return (String) mapper.get(value);
   }

   public short readxml( com.genexus.xml.XMLReader oReader ,
                         String sName )
   {
      short GXSoapError = 1;
      formatError = false ;
      sTagName = oReader.getName() ;
      if ( oReader.getIsSimple() == 0 )
      {
         GXSoapError = oReader.read() ;
         nOutParmCount = (short)(0) ;
         while ( ( ( GXutil.strcmp(oReader.getName(), sTagName) != 0 ) || ( oReader.getNodeType() == 1 ) ) && ( GXSoapError > 0 ) )
         {
            readOk = (short)(0) ;
            readElement = false ;
            if ( GXutil.strcmp2( oReader.getLocalName(), "FullName") )
            {
               gxTv_SdtFileUploadFiles_File_Fullname = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Name") )
            {
               gxTv_SdtFileUploadFiles_File_Name = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Extension") )
            {
               gxTv_SdtFileUploadFiles_File_Extension = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Size") )
            {
               gxTv_SdtFileUploadFiles_File_Size = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "File") )
            {
               gxTv_SdtFileUploadFiles_File_File=GXutil.blobFromBase64( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Path") )
            {
               gxTv_SdtFileUploadFiles_File_Path = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( ! readElement )
            {
               readOk = (short)(1) ;
               GXSoapError = oReader.read() ;
            }
            nOutParmCount = (short)(nOutParmCount+1) ;
            if ( ( readOk == 0 ) || formatError )
            {
               context.globals.sSOAPErrMsg += "Error reading " + sTagName + GXutil.newLine( ) ;
               context.globals.sSOAPErrMsg += "Message: " + oReader.readRawXML() ;
               GXSoapError = (short)(nOutParmCount*-1) ;
            }
         }
      }
      return GXSoapError ;
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace )
   {
      writexml(oWriter, sName, sNameSpace, true);
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace ,
                         boolean sIncludeState )
   {
      if ( (GXutil.strcmp("", sName)==0) )
      {
         sName = "FileUploadFiles.File" ;
      }
      oWriter.writeStartElement(sName);
      if ( GXutil.strcmp(GXutil.left( sNameSpace, 10), "[*:nosend]") != 0 )
      {
         oWriter.writeAttribute("xmlns", sNameSpace);
      }
      else
      {
         sNameSpace = GXutil.right( sNameSpace, GXutil.len( sNameSpace)-10) ;
      }
      oWriter.writeElement("FullName", gxTv_SdtFileUploadFiles_File_Fullname);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Name", gxTv_SdtFileUploadFiles_File_Name);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Extension", gxTv_SdtFileUploadFiles_File_Extension);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Size", GXutil.trim( GXutil.str( gxTv_SdtFileUploadFiles_File_Size, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("File", GXutil.blobToBase64( gxTv_SdtFileUploadFiles_File_File));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Path", gxTv_SdtFileUploadFiles_File_Path);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeEndElement();
   }

   public long getnumericvalue( String value )
   {
      if ( GXutil.notNumeric( value) )
      {
         formatError = true ;
      }
      return GXutil.lval( value) ;
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      tojson( includeState, true) ;
   }

   public void tojson( boolean includeState ,
                       boolean includeNonInitialized )
   {
      AddObjectProperty("FullName", gxTv_SdtFileUploadFiles_File_Fullname, false, false);
      AddObjectProperty("Name", gxTv_SdtFileUploadFiles_File_Name, false, false);
      AddObjectProperty("Extension", gxTv_SdtFileUploadFiles_File_Extension, false, false);
      AddObjectProperty("Size", gxTv_SdtFileUploadFiles_File_Size, false, false);
      AddObjectProperty("File", gxTv_SdtFileUploadFiles_File_File, false, false);
      AddObjectProperty("Path", gxTv_SdtFileUploadFiles_File_Path, false, false);
   }

   public String getgxTv_SdtFileUploadFiles_File_Fullname( )
   {
      return gxTv_SdtFileUploadFiles_File_Fullname ;
   }

   public void setgxTv_SdtFileUploadFiles_File_Fullname( String value )
   {
      gxTv_SdtFileUploadFiles_File_N = (byte)(0) ;
      gxTv_SdtFileUploadFiles_File_Fullname = value ;
   }

   public String getgxTv_SdtFileUploadFiles_File_Name( )
   {
      return gxTv_SdtFileUploadFiles_File_Name ;
   }

   public void setgxTv_SdtFileUploadFiles_File_Name( String value )
   {
      gxTv_SdtFileUploadFiles_File_N = (byte)(0) ;
      gxTv_SdtFileUploadFiles_File_Name = value ;
   }

   public String getgxTv_SdtFileUploadFiles_File_Extension( )
   {
      return gxTv_SdtFileUploadFiles_File_Extension ;
   }

   public void setgxTv_SdtFileUploadFiles_File_Extension( String value )
   {
      gxTv_SdtFileUploadFiles_File_N = (byte)(0) ;
      gxTv_SdtFileUploadFiles_File_Extension = value ;
   }

   public long getgxTv_SdtFileUploadFiles_File_Size( )
   {
      return gxTv_SdtFileUploadFiles_File_Size ;
   }

   public void setgxTv_SdtFileUploadFiles_File_Size( long value )
   {
      gxTv_SdtFileUploadFiles_File_N = (byte)(0) ;
      gxTv_SdtFileUploadFiles_File_Size = value ;
   }

   @GxUpload
   public String getgxTv_SdtFileUploadFiles_File_File( )
   {
      return gxTv_SdtFileUploadFiles_File_File ;
   }

   public void setgxTv_SdtFileUploadFiles_File_File( String value )
   {
      gxTv_SdtFileUploadFiles_File_N = (byte)(0) ;
      gxTv_SdtFileUploadFiles_File_File = value ;
   }

   public String getgxTv_SdtFileUploadFiles_File_Path( )
   {
      return gxTv_SdtFileUploadFiles_File_Path ;
   }

   public void setgxTv_SdtFileUploadFiles_File_Path( String value )
   {
      gxTv_SdtFileUploadFiles_File_N = (byte)(0) ;
      gxTv_SdtFileUploadFiles_File_Path = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtFileUploadFiles_File_Fullname = "" ;
      gxTv_SdtFileUploadFiles_File_N = (byte)(1) ;
      gxTv_SdtFileUploadFiles_File_Name = "" ;
      gxTv_SdtFileUploadFiles_File_Extension = "" ;
      gxTv_SdtFileUploadFiles_File_File = "" ;
      gxTv_SdtFileUploadFiles_File_Path = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtFileUploadFiles_File_N ;
   }

   public app.SdtFileUploadFiles_File Clone( )
   {
      return (app.SdtFileUploadFiles_File)(clone()) ;
   }

   public void setStruct( app.StructSdtFileUploadFiles_File struct )
   {
      setgxTv_SdtFileUploadFiles_File_Fullname(struct.getFullname());
      setgxTv_SdtFileUploadFiles_File_Name(struct.getName());
      setgxTv_SdtFileUploadFiles_File_Extension(struct.getExtension());
      setgxTv_SdtFileUploadFiles_File_Size(struct.getSize());
      setgxTv_SdtFileUploadFiles_File_File(struct.getFile());
      setgxTv_SdtFileUploadFiles_File_Path(struct.getPath());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtFileUploadFiles_File getStruct( )
   {
      app.StructSdtFileUploadFiles_File struct = new app.StructSdtFileUploadFiles_File ();
      struct.setFullname(getgxTv_SdtFileUploadFiles_File_Fullname());
      struct.setName(getgxTv_SdtFileUploadFiles_File_Name());
      struct.setExtension(getgxTv_SdtFileUploadFiles_File_Extension());
      struct.setSize(getgxTv_SdtFileUploadFiles_File_Size());
      struct.setFile(getgxTv_SdtFileUploadFiles_File_File());
      struct.setPath(getgxTv_SdtFileUploadFiles_File_Path());
      return struct ;
   }

   protected byte gxTv_SdtFileUploadFiles_File_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtFileUploadFiles_File_Size ;
   protected String gxTv_SdtFileUploadFiles_File_Fullname ;
   protected String gxTv_SdtFileUploadFiles_File_Name ;
   protected String gxTv_SdtFileUploadFiles_File_Extension ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtFileUploadFiles_File_File ;
   protected String gxTv_SdtFileUploadFiles_File_Path ;
}

