package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtEmails extends GxUserType
{
   public SdtEmails( )
   {
      this(  new ModelContext(SdtEmails.class));
   }

   public SdtEmails( ModelContext context )
   {
      super( context, "SdtEmails");
   }

   public SdtEmails( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle, context, "SdtEmails");
   }

   public SdtEmails( StructSdtEmails struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Title") )
            {
               gxTv_SdtEmails_Title = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Subject") )
            {
               gxTv_SdtEmails_Subject = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HTMLText") )
            {
               gxTv_SdtEmails_Htmltext = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TO") )
            {
               if ( gxTv_SdtEmails_To == null )
               {
                  gxTv_SdtEmails_To = new GXBaseCollection<app.SdtEmails_TOItem>(app.SdtEmails_TOItem.class, "Emails.TOItem", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtEmails_To.readxmlcollection(oReader, "TO", "TOItem") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "TO") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CC") )
            {
               if ( gxTv_SdtEmails_Cc == null )
               {
                  gxTv_SdtEmails_Cc = new GXBaseCollection<app.SdtEmails_CCitem>(app.SdtEmails_CCitem.class, "Emails.CCitem", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtEmails_Cc.readxmlcollection(oReader, "CC", "CCitem") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "CC") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCO") )
            {
               if ( gxTv_SdtEmails_Cco == null )
               {
                  gxTv_SdtEmails_Cco = new GXBaseCollection<app.SdtEmails_CCOItem>(app.SdtEmails_CCOItem.class, "Emails.CCOItem", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtEmails_Cco.readxmlcollection(oReader, "CCO", "CCOItem") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "CCO") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Attached") )
            {
               if ( gxTv_SdtEmails_Attached == null )
               {
                  gxTv_SdtEmails_Attached = new GXBaseCollection<app.SdtEmails_AttachedItem>(app.SdtEmails_AttachedItem.class, "Emails.AttachedItem", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtEmails_Attached.readxmlcollection(oReader, "Attached", "AttachedItem") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Attached") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Config") )
            {
               if ( gxTv_SdtEmails_Config == null )
               {
                  gxTv_SdtEmails_Config = new app.SdtEmails_Config(remoteHandle, context);
               }
               GXSoapError = gxTv_SdtEmails_Config.readxml(oReader, "Config") ;
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
         sName = "Emails" ;
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
      oWriter.writeElement("Title", gxTv_SdtEmails_Title);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Subject", gxTv_SdtEmails_Subject);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HTMLText", gxTv_SdtEmails_Htmltext);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtEmails_To != null )
      {
         String sNameSpace1;
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "TexplusNET" ;
         }
         else
         {
            sNameSpace1 = "TexplusNET" ;
         }
         gxTv_SdtEmails_To.writexmlcollection(oWriter, "TO", sNameSpace1, "TOItem", sNameSpace1);
      }
      if ( gxTv_SdtEmails_Cc != null )
      {
         String sNameSpace1;
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "TexplusNET" ;
         }
         else
         {
            sNameSpace1 = "TexplusNET" ;
         }
         gxTv_SdtEmails_Cc.writexmlcollection(oWriter, "CC", sNameSpace1, "CCitem", sNameSpace1);
      }
      if ( gxTv_SdtEmails_Cco != null )
      {
         String sNameSpace1;
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "TexplusNET" ;
         }
         else
         {
            sNameSpace1 = "TexplusNET" ;
         }
         gxTv_SdtEmails_Cco.writexmlcollection(oWriter, "CCO", sNameSpace1, "CCOItem", sNameSpace1);
      }
      if ( gxTv_SdtEmails_Attached != null )
      {
         String sNameSpace1;
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "TexplusNET" ;
         }
         else
         {
            sNameSpace1 = "TexplusNET" ;
         }
         gxTv_SdtEmails_Attached.writexmlcollection(oWriter, "Attached", sNameSpace1, "AttachedItem", sNameSpace1);
      }
      if ( gxTv_SdtEmails_Config != null )
      {
         String sNameSpace1;
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "TexplusNET" ;
         }
         else
         {
            sNameSpace1 = "TexplusNET" ;
         }
         gxTv_SdtEmails_Config.writexml(oWriter, "Config", sNameSpace1);
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
      AddObjectProperty("Title", gxTv_SdtEmails_Title, false, false);
      AddObjectProperty("Subject", gxTv_SdtEmails_Subject, false, false);
      AddObjectProperty("HTMLText", gxTv_SdtEmails_Htmltext, false, false);
      if ( gxTv_SdtEmails_To != null )
      {
         AddObjectProperty("TO", gxTv_SdtEmails_To, false, false);
      }
      if ( gxTv_SdtEmails_Cc != null )
      {
         AddObjectProperty("CC", gxTv_SdtEmails_Cc, false, false);
      }
      if ( gxTv_SdtEmails_Cco != null )
      {
         AddObjectProperty("CCO", gxTv_SdtEmails_Cco, false, false);
      }
      if ( gxTv_SdtEmails_Attached != null )
      {
         AddObjectProperty("Attached", gxTv_SdtEmails_Attached, false, false);
      }
      if ( gxTv_SdtEmails_Config != null )
      {
         AddObjectProperty("Config", gxTv_SdtEmails_Config, false, false);
      }
   }

   public String getgxTv_SdtEmails_Title( )
   {
      return gxTv_SdtEmails_Title ;
   }

   public void setgxTv_SdtEmails_Title( String value )
   {
      gxTv_SdtEmails_N = (byte)(0) ;
      gxTv_SdtEmails_Title = value ;
   }

   public String getgxTv_SdtEmails_Subject( )
   {
      return gxTv_SdtEmails_Subject ;
   }

   public void setgxTv_SdtEmails_Subject( String value )
   {
      gxTv_SdtEmails_N = (byte)(0) ;
      gxTv_SdtEmails_Subject = value ;
   }

   public String getgxTv_SdtEmails_Htmltext( )
   {
      return gxTv_SdtEmails_Htmltext ;
   }

   public void setgxTv_SdtEmails_Htmltext( String value )
   {
      gxTv_SdtEmails_N = (byte)(0) ;
      gxTv_SdtEmails_Htmltext = value ;
   }

   public GXBaseCollection<app.SdtEmails_TOItem> getgxTv_SdtEmails_To( )
   {
      if ( gxTv_SdtEmails_To == null )
      {
         gxTv_SdtEmails_To = new GXBaseCollection<app.SdtEmails_TOItem>(app.SdtEmails_TOItem.class, "Emails.TOItem", "TexplusNET", remoteHandle);
      }
      gxTv_SdtEmails_To_N = (byte)(0) ;
      gxTv_SdtEmails_N = (byte)(0) ;
      return gxTv_SdtEmails_To ;
   }

   public void setgxTv_SdtEmails_To( GXBaseCollection<app.SdtEmails_TOItem> value )
   {
      gxTv_SdtEmails_To_N = (byte)(0) ;
      gxTv_SdtEmails_N = (byte)(0) ;
      gxTv_SdtEmails_To = value ;
   }

   public void setgxTv_SdtEmails_To_SetNull( )
   {
      gxTv_SdtEmails_To_N = (byte)(1) ;
      gxTv_SdtEmails_To = null ;
   }

   public boolean getgxTv_SdtEmails_To_IsNull( )
   {
      if ( gxTv_SdtEmails_To == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtEmails_To_N( )
   {
      return gxTv_SdtEmails_To_N ;
   }

   public GXBaseCollection<app.SdtEmails_CCitem> getgxTv_SdtEmails_Cc( )
   {
      if ( gxTv_SdtEmails_Cc == null )
      {
         gxTv_SdtEmails_Cc = new GXBaseCollection<app.SdtEmails_CCitem>(app.SdtEmails_CCitem.class, "Emails.CCitem", "TexplusNET", remoteHandle);
      }
      gxTv_SdtEmails_Cc_N = (byte)(0) ;
      gxTv_SdtEmails_N = (byte)(0) ;
      return gxTv_SdtEmails_Cc ;
   }

   public void setgxTv_SdtEmails_Cc( GXBaseCollection<app.SdtEmails_CCitem> value )
   {
      gxTv_SdtEmails_Cc_N = (byte)(0) ;
      gxTv_SdtEmails_N = (byte)(0) ;
      gxTv_SdtEmails_Cc = value ;
   }

   public void setgxTv_SdtEmails_Cc_SetNull( )
   {
      gxTv_SdtEmails_Cc_N = (byte)(1) ;
      gxTv_SdtEmails_Cc = null ;
   }

   public boolean getgxTv_SdtEmails_Cc_IsNull( )
   {
      if ( gxTv_SdtEmails_Cc == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtEmails_Cc_N( )
   {
      return gxTv_SdtEmails_Cc_N ;
   }

   public GXBaseCollection<app.SdtEmails_CCOItem> getgxTv_SdtEmails_Cco( )
   {
      if ( gxTv_SdtEmails_Cco == null )
      {
         gxTv_SdtEmails_Cco = new GXBaseCollection<app.SdtEmails_CCOItem>(app.SdtEmails_CCOItem.class, "Emails.CCOItem", "TexplusNET", remoteHandle);
      }
      gxTv_SdtEmails_Cco_N = (byte)(0) ;
      gxTv_SdtEmails_N = (byte)(0) ;
      return gxTv_SdtEmails_Cco ;
   }

   public void setgxTv_SdtEmails_Cco( GXBaseCollection<app.SdtEmails_CCOItem> value )
   {
      gxTv_SdtEmails_Cco_N = (byte)(0) ;
      gxTv_SdtEmails_N = (byte)(0) ;
      gxTv_SdtEmails_Cco = value ;
   }

   public void setgxTv_SdtEmails_Cco_SetNull( )
   {
      gxTv_SdtEmails_Cco_N = (byte)(1) ;
      gxTv_SdtEmails_Cco = null ;
   }

   public boolean getgxTv_SdtEmails_Cco_IsNull( )
   {
      if ( gxTv_SdtEmails_Cco == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtEmails_Cco_N( )
   {
      return gxTv_SdtEmails_Cco_N ;
   }

   public GXBaseCollection<app.SdtEmails_AttachedItem> getgxTv_SdtEmails_Attached( )
   {
      if ( gxTv_SdtEmails_Attached == null )
      {
         gxTv_SdtEmails_Attached = new GXBaseCollection<app.SdtEmails_AttachedItem>(app.SdtEmails_AttachedItem.class, "Emails.AttachedItem", "TexplusNET", remoteHandle);
      }
      gxTv_SdtEmails_Attached_N = (byte)(0) ;
      gxTv_SdtEmails_N = (byte)(0) ;
      return gxTv_SdtEmails_Attached ;
   }

   public void setgxTv_SdtEmails_Attached( GXBaseCollection<app.SdtEmails_AttachedItem> value )
   {
      gxTv_SdtEmails_Attached_N = (byte)(0) ;
      gxTv_SdtEmails_N = (byte)(0) ;
      gxTv_SdtEmails_Attached = value ;
   }

   public void setgxTv_SdtEmails_Attached_SetNull( )
   {
      gxTv_SdtEmails_Attached_N = (byte)(1) ;
      gxTv_SdtEmails_Attached = null ;
   }

   public boolean getgxTv_SdtEmails_Attached_IsNull( )
   {
      if ( gxTv_SdtEmails_Attached == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtEmails_Attached_N( )
   {
      return gxTv_SdtEmails_Attached_N ;
   }

   public app.SdtEmails_Config getgxTv_SdtEmails_Config( )
   {
      if ( gxTv_SdtEmails_Config == null )
      {
         gxTv_SdtEmails_Config = new app.SdtEmails_Config(remoteHandle, context);
      }
      gxTv_SdtEmails_Config_N = (byte)(0) ;
      gxTv_SdtEmails_N = (byte)(0) ;
      return gxTv_SdtEmails_Config ;
   }

   public void setgxTv_SdtEmails_Config( app.SdtEmails_Config value )
   {
      gxTv_SdtEmails_Config_N = (byte)(0) ;
      gxTv_SdtEmails_N = (byte)(0) ;
      gxTv_SdtEmails_Config = value;
   }

   public void setgxTv_SdtEmails_Config_SetNull( )
   {
      gxTv_SdtEmails_Config_N = (byte)(1) ;
      gxTv_SdtEmails_Config = (app.SdtEmails_Config)null;
   }

   public boolean getgxTv_SdtEmails_Config_IsNull( )
   {
      if ( gxTv_SdtEmails_Config == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtEmails_Config_N( )
   {
      return gxTv_SdtEmails_Config_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtEmails_Title = "" ;
      gxTv_SdtEmails_N = (byte)(1) ;
      gxTv_SdtEmails_Subject = "" ;
      gxTv_SdtEmails_Htmltext = "" ;
      gxTv_SdtEmails_To_N = (byte)(1) ;
      gxTv_SdtEmails_Cc_N = (byte)(1) ;
      gxTv_SdtEmails_Cco_N = (byte)(1) ;
      gxTv_SdtEmails_Attached_N = (byte)(1) ;
      gxTv_SdtEmails_Config_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtEmails_N ;
   }

   public app.SdtEmails Clone( )
   {
      return (app.SdtEmails)(clone()) ;
   }

   public void setStruct( app.StructSdtEmails struct )
   {
      setgxTv_SdtEmails_Title(struct.getTitle());
      setgxTv_SdtEmails_Subject(struct.getSubject());
      setgxTv_SdtEmails_Htmltext(struct.getHtmltext());
      GXBaseCollection<app.SdtEmails_TOItem> gxTv_SdtEmails_To_aux = new GXBaseCollection<app.SdtEmails_TOItem>(app.SdtEmails_TOItem.class, "Emails.TOItem", "TexplusNET", remoteHandle);
      Vector<app.StructSdtEmails_TOItem> gxTv_SdtEmails_To_aux1 = struct.getTo();
      if (gxTv_SdtEmails_To_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtEmails_To_aux1.size(); i++)
         {
            gxTv_SdtEmails_To_aux.add(new app.SdtEmails_TOItem(gxTv_SdtEmails_To_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtEmails_To(gxTv_SdtEmails_To_aux);
      GXBaseCollection<app.SdtEmails_CCitem> gxTv_SdtEmails_Cc_aux = new GXBaseCollection<app.SdtEmails_CCitem>(app.SdtEmails_CCitem.class, "Emails.CCitem", "TexplusNET", remoteHandle);
      Vector<app.StructSdtEmails_CCitem> gxTv_SdtEmails_Cc_aux1 = struct.getCc();
      if (gxTv_SdtEmails_Cc_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtEmails_Cc_aux1.size(); i++)
         {
            gxTv_SdtEmails_Cc_aux.add(new app.SdtEmails_CCitem(gxTv_SdtEmails_Cc_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtEmails_Cc(gxTv_SdtEmails_Cc_aux);
      GXBaseCollection<app.SdtEmails_CCOItem> gxTv_SdtEmails_Cco_aux = new GXBaseCollection<app.SdtEmails_CCOItem>(app.SdtEmails_CCOItem.class, "Emails.CCOItem", "TexplusNET", remoteHandle);
      Vector<app.StructSdtEmails_CCOItem> gxTv_SdtEmails_Cco_aux1 = struct.getCco();
      if (gxTv_SdtEmails_Cco_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtEmails_Cco_aux1.size(); i++)
         {
            gxTv_SdtEmails_Cco_aux.add(new app.SdtEmails_CCOItem(gxTv_SdtEmails_Cco_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtEmails_Cco(gxTv_SdtEmails_Cco_aux);
      GXBaseCollection<app.SdtEmails_AttachedItem> gxTv_SdtEmails_Attached_aux = new GXBaseCollection<app.SdtEmails_AttachedItem>(app.SdtEmails_AttachedItem.class, "Emails.AttachedItem", "TexplusNET", remoteHandle);
      Vector<app.StructSdtEmails_AttachedItem> gxTv_SdtEmails_Attached_aux1 = struct.getAttached();
      if (gxTv_SdtEmails_Attached_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtEmails_Attached_aux1.size(); i++)
         {
            gxTv_SdtEmails_Attached_aux.add(new app.SdtEmails_AttachedItem(gxTv_SdtEmails_Attached_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtEmails_Attached(gxTv_SdtEmails_Attached_aux);
      setgxTv_SdtEmails_Config(new app.SdtEmails_Config(struct.getConfig()));
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtEmails getStruct( )
   {
      app.StructSdtEmails struct = new app.StructSdtEmails ();
      struct.setTitle(getgxTv_SdtEmails_Title());
      struct.setSubject(getgxTv_SdtEmails_Subject());
      struct.setHtmltext(getgxTv_SdtEmails_Htmltext());
      struct.setTo(getgxTv_SdtEmails_To().getStruct());
      struct.setCc(getgxTv_SdtEmails_Cc().getStruct());
      struct.setCco(getgxTv_SdtEmails_Cco().getStruct());
      struct.setAttached(getgxTv_SdtEmails_Attached().getStruct());
      struct.setConfig(getgxTv_SdtEmails_Config().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtEmails_N ;
   protected byte gxTv_SdtEmails_To_N ;
   protected byte gxTv_SdtEmails_Cc_N ;
   protected byte gxTv_SdtEmails_Cco_N ;
   protected byte gxTv_SdtEmails_Attached_N ;
   protected byte gxTv_SdtEmails_Config_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtEmails_Htmltext ;
   protected String gxTv_SdtEmails_Title ;
   protected String gxTv_SdtEmails_Subject ;
   protected GXBaseCollection<app.SdtEmails_TOItem> gxTv_SdtEmails_To_aux ;
   protected GXBaseCollection<app.SdtEmails_CCitem> gxTv_SdtEmails_Cc_aux ;
   protected GXBaseCollection<app.SdtEmails_CCOItem> gxTv_SdtEmails_Cco_aux ;
   protected GXBaseCollection<app.SdtEmails_AttachedItem> gxTv_SdtEmails_Attached_aux ;
   protected GXBaseCollection<app.SdtEmails_TOItem> gxTv_SdtEmails_To=null ;
   protected GXBaseCollection<app.SdtEmails_CCitem> gxTv_SdtEmails_Cc=null ;
   protected GXBaseCollection<app.SdtEmails_CCOItem> gxTv_SdtEmails_Cco=null ;
   protected GXBaseCollection<app.SdtEmails_AttachedItem> gxTv_SdtEmails_Attached=null ;
   protected app.SdtEmails_Config gxTv_SdtEmails_Config=null ;
}

