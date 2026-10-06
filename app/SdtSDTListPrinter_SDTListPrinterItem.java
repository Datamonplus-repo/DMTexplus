package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTListPrinter_SDTListPrinterItem extends GxUserType
{
   public SdtSDTListPrinter_SDTListPrinterItem( )
   {
      this(  new ModelContext(SdtSDTListPrinter_SDTListPrinterItem.class));
   }

   public SdtSDTListPrinter_SDTListPrinterItem( ModelContext context )
   {
      super( context, "SdtSDTListPrinter_SDTListPrinterItem");
   }

   public SdtSDTListPrinter_SDTListPrinterItem( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTListPrinter_SDTListPrinterItem");
   }

   public SdtSDTListPrinter_SDTListPrinterItem( StructSdtSDTListPrinter_SDTListPrinterItem struct )
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
               gxTv_SdtSDTListPrinter_SDTListPrinterItem_Name = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "path") )
            {
               gxTv_SdtSDTListPrinter_SDTListPrinterItem_Path = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "status") )
            {
               gxTv_SdtSDTListPrinter_SDTListPrinterItem_Status = oReader.getValue() ;
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
         sName = "SDTListPrinter.SDTListPrinterItem" ;
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
      oWriter.writeElement("name", gxTv_SdtSDTListPrinter_SDTListPrinterItem_Name);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("path", gxTv_SdtSDTListPrinter_SDTListPrinterItem_Path);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("status", gxTv_SdtSDTListPrinter_SDTListPrinterItem_Status);
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
      AddObjectProperty("name", gxTv_SdtSDTListPrinter_SDTListPrinterItem_Name, false, false);
      AddObjectProperty("path", gxTv_SdtSDTListPrinter_SDTListPrinterItem_Path, false, false);
      AddObjectProperty("status", gxTv_SdtSDTListPrinter_SDTListPrinterItem_Status, false, false);
   }

   public String getgxTv_SdtSDTListPrinter_SDTListPrinterItem_Name( )
   {
      return gxTv_SdtSDTListPrinter_SDTListPrinterItem_Name ;
   }

   public void setgxTv_SdtSDTListPrinter_SDTListPrinterItem_Name( String value )
   {
      gxTv_SdtSDTListPrinter_SDTListPrinterItem_N = (byte)(0) ;
      gxTv_SdtSDTListPrinter_SDTListPrinterItem_Name = value ;
   }

   public String getgxTv_SdtSDTListPrinter_SDTListPrinterItem_Path( )
   {
      return gxTv_SdtSDTListPrinter_SDTListPrinterItem_Path ;
   }

   public void setgxTv_SdtSDTListPrinter_SDTListPrinterItem_Path( String value )
   {
      gxTv_SdtSDTListPrinter_SDTListPrinterItem_N = (byte)(0) ;
      gxTv_SdtSDTListPrinter_SDTListPrinterItem_Path = value ;
   }

   public String getgxTv_SdtSDTListPrinter_SDTListPrinterItem_Status( )
   {
      return gxTv_SdtSDTListPrinter_SDTListPrinterItem_Status ;
   }

   public void setgxTv_SdtSDTListPrinter_SDTListPrinterItem_Status( String value )
   {
      gxTv_SdtSDTListPrinter_SDTListPrinterItem_N = (byte)(0) ;
      gxTv_SdtSDTListPrinter_SDTListPrinterItem_Status = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTListPrinter_SDTListPrinterItem_Name = "" ;
      gxTv_SdtSDTListPrinter_SDTListPrinterItem_N = (byte)(1) ;
      gxTv_SdtSDTListPrinter_SDTListPrinterItem_Path = "" ;
      gxTv_SdtSDTListPrinter_SDTListPrinterItem_Status = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTListPrinter_SDTListPrinterItem_N ;
   }

   public app.SdtSDTListPrinter_SDTListPrinterItem Clone( )
   {
      return (app.SdtSDTListPrinter_SDTListPrinterItem)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTListPrinter_SDTListPrinterItem struct )
   {
      setgxTv_SdtSDTListPrinter_SDTListPrinterItem_Name(struct.getName());
      setgxTv_SdtSDTListPrinter_SDTListPrinterItem_Path(struct.getPath());
      setgxTv_SdtSDTListPrinter_SDTListPrinterItem_Status(struct.getStatus());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTListPrinter_SDTListPrinterItem getStruct( )
   {
      app.StructSdtSDTListPrinter_SDTListPrinterItem struct = new app.StructSdtSDTListPrinter_SDTListPrinterItem ();
      struct.setName(getgxTv_SdtSDTListPrinter_SDTListPrinterItem_Name());
      struct.setPath(getgxTv_SdtSDTListPrinter_SDTListPrinterItem_Path());
      struct.setStatus(getgxTv_SdtSDTListPrinter_SDTListPrinterItem_Status());
      return struct ;
   }

   protected byte gxTv_SdtSDTListPrinter_SDTListPrinterItem_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDTListPrinter_SDTListPrinterItem_Name ;
   protected String gxTv_SdtSDTListPrinter_SDTListPrinterItem_Path ;
   protected String gxTv_SdtSDTListPrinter_SDTListPrinterItem_Status ;
}

