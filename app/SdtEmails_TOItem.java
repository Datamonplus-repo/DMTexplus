package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtEmails_TOItem extends GxUserType
{
   public SdtEmails_TOItem( )
   {
      this(  new ModelContext(SdtEmails_TOItem.class));
   }

   public SdtEmails_TOItem( ModelContext context )
   {
      super( context, "SdtEmails_TOItem");
   }

   public SdtEmails_TOItem( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle, context, "SdtEmails_TOItem");
   }

   public SdtEmails_TOItem( StructSdtEmails_TOItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Email") )
            {
               gxTv_SdtEmails_TOItem_Email = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Name") )
            {
               gxTv_SdtEmails_TOItem_Name = oReader.getValue() ;
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
         sName = "Emails.TOItem" ;
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
      oWriter.writeElement("Email", gxTv_SdtEmails_TOItem_Email);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Name", gxTv_SdtEmails_TOItem_Name);
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
      AddObjectProperty("Email", gxTv_SdtEmails_TOItem_Email, false, false);
      AddObjectProperty("Name", gxTv_SdtEmails_TOItem_Name, false, false);
   }

   public String getgxTv_SdtEmails_TOItem_Email( )
   {
      return gxTv_SdtEmails_TOItem_Email ;
   }

   public void setgxTv_SdtEmails_TOItem_Email( String value )
   {
      gxTv_SdtEmails_TOItem_N = (byte)(0) ;
      gxTv_SdtEmails_TOItem_Email = value ;
   }

   public String getgxTv_SdtEmails_TOItem_Name( )
   {
      return gxTv_SdtEmails_TOItem_Name ;
   }

   public void setgxTv_SdtEmails_TOItem_Name( String value )
   {
      gxTv_SdtEmails_TOItem_N = (byte)(0) ;
      gxTv_SdtEmails_TOItem_Name = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtEmails_TOItem_Email = "" ;
      gxTv_SdtEmails_TOItem_N = (byte)(1) ;
      gxTv_SdtEmails_TOItem_Name = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtEmails_TOItem_N ;
   }

   public app.SdtEmails_TOItem Clone( )
   {
      return (app.SdtEmails_TOItem)(clone()) ;
   }

   public void setStruct( app.StructSdtEmails_TOItem struct )
   {
      setgxTv_SdtEmails_TOItem_Email(struct.getEmail());
      setgxTv_SdtEmails_TOItem_Name(struct.getName());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtEmails_TOItem getStruct( )
   {
      app.StructSdtEmails_TOItem struct = new app.StructSdtEmails_TOItem ();
      struct.setEmail(getgxTv_SdtEmails_TOItem_Email());
      struct.setName(getgxTv_SdtEmails_TOItem_Name());
      return struct ;
   }

   protected byte gxTv_SdtEmails_TOItem_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtEmails_TOItem_Email ;
   protected String gxTv_SdtEmails_TOItem_Name ;
}

