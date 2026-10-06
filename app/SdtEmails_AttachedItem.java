package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtEmails_AttachedItem extends GxUserType
{
   public SdtEmails_AttachedItem( )
   {
      this(  new ModelContext(SdtEmails_AttachedItem.class));
   }

   public SdtEmails_AttachedItem( ModelContext context )
   {
      super( context, "SdtEmails_AttachedItem");
   }

   public SdtEmails_AttachedItem( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtEmails_AttachedItem");
   }

   public SdtEmails_AttachedItem( StructSdtEmails_AttachedItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Path") )
            {
               gxTv_SdtEmails_AttachedItem_Path = oReader.getValue() ;
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
         sName = "Emails.AttachedItem" ;
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
      oWriter.writeElement("Path", gxTv_SdtEmails_AttachedItem_Path);
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
      AddObjectProperty("Path", gxTv_SdtEmails_AttachedItem_Path, false, false);
   }

   public String getgxTv_SdtEmails_AttachedItem_Path( )
   {
      return gxTv_SdtEmails_AttachedItem_Path ;
   }

   public void setgxTv_SdtEmails_AttachedItem_Path( String value )
   {
      gxTv_SdtEmails_AttachedItem_N = (byte)(0) ;
      gxTv_SdtEmails_AttachedItem_Path = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtEmails_AttachedItem_Path = "" ;
      gxTv_SdtEmails_AttachedItem_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtEmails_AttachedItem_N ;
   }

   public app.SdtEmails_AttachedItem Clone( )
   {
      return (app.SdtEmails_AttachedItem)(clone()) ;
   }

   public void setStruct( app.StructSdtEmails_AttachedItem struct )
   {
      setgxTv_SdtEmails_AttachedItem_Path(struct.getPath());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtEmails_AttachedItem getStruct( )
   {
      app.StructSdtEmails_AttachedItem struct = new app.StructSdtEmails_AttachedItem ();
      struct.setPath(getgxTv_SdtEmails_AttachedItem_Path());
      return struct ;
   }

   protected byte gxTv_SdtEmails_AttachedItem_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtEmails_AttachedItem_Path ;
}

