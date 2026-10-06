package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTPrinterSelected extends GxUserType
{
   public SdtSDTPrinterSelected( )
   {
      this(  new ModelContext(SdtSDTPrinterSelected.class));
   }

   public SdtSDTPrinterSelected( ModelContext context )
   {
      super( context, "SdtSDTPrinterSelected");
   }

   public SdtSDTPrinterSelected( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTPrinterSelected");
   }

   public SdtSDTPrinterSelected( StructSdtSDTPrinterSelected struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "name") )
            {
               gxTv_SdtSDTPrinterSelected_Name = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "path") )
            {
               gxTv_SdtSDTPrinterSelected_Path = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "status") )
            {
               gxTv_SdtSDTPrinterSelected_Status = oReader.getValue() ;
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
         sName = "SDTPrinterSelected" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "TexplusNET" ;
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
      oWriter.writeElement("name", gxTv_SdtSDTPrinterSelected_Name);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("path", gxTv_SdtSDTPrinterSelected_Path);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("status", gxTv_SdtSDTPrinterSelected_Status);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeEndElement();
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
      AddObjectProperty("name", gxTv_SdtSDTPrinterSelected_Name, false, false);
      AddObjectProperty("path", gxTv_SdtSDTPrinterSelected_Path, false, false);
      AddObjectProperty("status", gxTv_SdtSDTPrinterSelected_Status, false, false);
   }

   public String getgxTv_SdtSDTPrinterSelected_Name( )
   {
      return gxTv_SdtSDTPrinterSelected_Name ;
   }

   public void setgxTv_SdtSDTPrinterSelected_Name( String value )
   {
      gxTv_SdtSDTPrinterSelected_N = (byte)(0) ;
      gxTv_SdtSDTPrinterSelected_Name = value ;
   }

   public String getgxTv_SdtSDTPrinterSelected_Path( )
   {
      return gxTv_SdtSDTPrinterSelected_Path ;
   }

   public void setgxTv_SdtSDTPrinterSelected_Path( String value )
   {
      gxTv_SdtSDTPrinterSelected_N = (byte)(0) ;
      gxTv_SdtSDTPrinterSelected_Path = value ;
   }

   public String getgxTv_SdtSDTPrinterSelected_Status( )
   {
      return gxTv_SdtSDTPrinterSelected_Status ;
   }

   public void setgxTv_SdtSDTPrinterSelected_Status( String value )
   {
      gxTv_SdtSDTPrinterSelected_N = (byte)(0) ;
      gxTv_SdtSDTPrinterSelected_Status = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTPrinterSelected_Name = "" ;
      gxTv_SdtSDTPrinterSelected_N = (byte)(1) ;
      gxTv_SdtSDTPrinterSelected_Path = "" ;
      gxTv_SdtSDTPrinterSelected_Status = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTPrinterSelected_N ;
   }

   public app.SdtSDTPrinterSelected Clone( )
   {
      return (app.SdtSDTPrinterSelected)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTPrinterSelected struct )
   {
      setgxTv_SdtSDTPrinterSelected_Name(struct.getName());
      setgxTv_SdtSDTPrinterSelected_Path(struct.getPath());
      setgxTv_SdtSDTPrinterSelected_Status(struct.getStatus());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTPrinterSelected getStruct( )
   {
      app.StructSdtSDTPrinterSelected struct = new app.StructSdtSDTPrinterSelected ();
      struct.setName(getgxTv_SdtSDTPrinterSelected_Name());
      struct.setPath(getgxTv_SdtSDTPrinterSelected_Path());
      struct.setStatus(getgxTv_SdtSDTPrinterSelected_Status());
      return struct ;
   }

   protected byte gxTv_SdtSDTPrinterSelected_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDTPrinterSelected_Name ;
   protected String gxTv_SdtSDTPrinterSelected_Path ;
   protected String gxTv_SdtSDTPrinterSelected_Status ;
}

