package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSdtQRCode extends GxUserType
{
   public SdtSdtQRCode( )
   {
      this(  new ModelContext(SdtSdtQRCode.class));
   }

   public SdtSdtQRCode( ModelContext context )
   {
      super( context, "SdtSdtQRCode");
   }

   public SdtSdtQRCode( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle, context, "SdtSdtQRCode");
   }

   public SdtSdtQRCode( StructSdtSdtQRCode struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "shorturl") )
            {
               gxTv_SdtSdtQRCode_Shorturl = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "qr") )
            {
               gxTv_SdtSdtQRCode_Qr = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "url") )
            {
               gxTv_SdtSdtQRCode_Url = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "title") )
            {
               gxTv_SdtSdtQRCode_Title = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "description") )
            {
               gxTv_SdtSdtQRCode_Description = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "creationdate") )
            {
               gxTv_SdtSdtQRCode_Creationdate = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "image") )
            {
               gxTv_SdtSdtQRCode_Image = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "gps") )
            {
               gxTv_SdtSdtQRCode_Gps = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "sms") )
            {
               gxTv_SdtSdtQRCode_Sms = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "notify") )
            {
               gxTv_SdtSdtQRCode_Notify = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "medium") )
            {
               gxTv_SdtSdtQRCode_Medium = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "folder") )
            {
               gxTv_SdtSdtQRCode_Folder = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "color") )
            {
               gxTv_SdtSdtQRCode_Color = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "bgcolor") )
            {
               gxTv_SdtSdtQRCode_Bgcolor = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "location") )
            {
               if ( gxTv_SdtSdtQRCode_Location == null )
               {
                  gxTv_SdtSdtQRCode_Location = new app.SdtSdtQRCodeLocation(remoteHandle, context);
               }
               GXSoapError = gxTv_SdtSdtQRCode_Location.readxml(oReader, "location") ;
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
         sName = "SdtQRCode" ;
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
      oWriter.writeElement("shorturl", gxTv_SdtSdtQRCode_Shorturl);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("qr", gxTv_SdtSdtQRCode_Qr);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("url", gxTv_SdtSdtQRCode_Url);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("title", gxTv_SdtSdtQRCode_Title);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("description", gxTv_SdtSdtQRCode_Description);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("creationdate", gxTv_SdtSdtQRCode_Creationdate);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("image", gxTv_SdtSdtQRCode_Image);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("gps", gxTv_SdtSdtQRCode_Gps);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("sms", gxTv_SdtSdtQRCode_Sms);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("notify", gxTv_SdtSdtQRCode_Notify);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("medium", gxTv_SdtSdtQRCode_Medium);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("folder", gxTv_SdtSdtQRCode_Folder);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("color", gxTv_SdtSdtQRCode_Color);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("bgcolor", gxTv_SdtSdtQRCode_Bgcolor);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtSdtQRCode_Location != null )
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
         gxTv_SdtSdtQRCode_Location.writexml(oWriter, "location", sNameSpace1);
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
      AddObjectProperty("shorturl", gxTv_SdtSdtQRCode_Shorturl, false, false);
      AddObjectProperty("qr", gxTv_SdtSdtQRCode_Qr, false, false);
      AddObjectProperty("url", gxTv_SdtSdtQRCode_Url, false, false);
      AddObjectProperty("title", gxTv_SdtSdtQRCode_Title, false, false);
      AddObjectProperty("description", gxTv_SdtSdtQRCode_Description, false, false);
      AddObjectProperty("creationdate", gxTv_SdtSdtQRCode_Creationdate, false, false);
      AddObjectProperty("image", gxTv_SdtSdtQRCode_Image, false, false);
      AddObjectProperty("gps", gxTv_SdtSdtQRCode_Gps, false, false);
      AddObjectProperty("sms", gxTv_SdtSdtQRCode_Sms, false, false);
      AddObjectProperty("notify", gxTv_SdtSdtQRCode_Notify, false, false);
      AddObjectProperty("medium", gxTv_SdtSdtQRCode_Medium, false, false);
      AddObjectProperty("folder", gxTv_SdtSdtQRCode_Folder, false, false);
      AddObjectProperty("color", gxTv_SdtSdtQRCode_Color, false, false);
      AddObjectProperty("bgcolor", gxTv_SdtSdtQRCode_Bgcolor, false, false);
      if ( gxTv_SdtSdtQRCode_Location != null )
      {
         AddObjectProperty("location", gxTv_SdtSdtQRCode_Location, false, false);
      }
   }

   public String getgxTv_SdtSdtQRCode_Shorturl( )
   {
      return gxTv_SdtSdtQRCode_Shorturl ;
   }

   public void setgxTv_SdtSdtQRCode_Shorturl( String value )
   {
      gxTv_SdtSdtQRCode_N = (byte)(0) ;
      gxTv_SdtSdtQRCode_Shorturl = value ;
   }

   public String getgxTv_SdtSdtQRCode_Qr( )
   {
      return gxTv_SdtSdtQRCode_Qr ;
   }

   public void setgxTv_SdtSdtQRCode_Qr( String value )
   {
      gxTv_SdtSdtQRCode_N = (byte)(0) ;
      gxTv_SdtSdtQRCode_Qr = value ;
   }

   public String getgxTv_SdtSdtQRCode_Url( )
   {
      return gxTv_SdtSdtQRCode_Url ;
   }

   public void setgxTv_SdtSdtQRCode_Url( String value )
   {
      gxTv_SdtSdtQRCode_N = (byte)(0) ;
      gxTv_SdtSdtQRCode_Url = value ;
   }

   public String getgxTv_SdtSdtQRCode_Title( )
   {
      return gxTv_SdtSdtQRCode_Title ;
   }

   public void setgxTv_SdtSdtQRCode_Title( String value )
   {
      gxTv_SdtSdtQRCode_N = (byte)(0) ;
      gxTv_SdtSdtQRCode_Title = value ;
   }

   public String getgxTv_SdtSdtQRCode_Description( )
   {
      return gxTv_SdtSdtQRCode_Description ;
   }

   public void setgxTv_SdtSdtQRCode_Description( String value )
   {
      gxTv_SdtSdtQRCode_N = (byte)(0) ;
      gxTv_SdtSdtQRCode_Description = value ;
   }

   public String getgxTv_SdtSdtQRCode_Creationdate( )
   {
      return gxTv_SdtSdtQRCode_Creationdate ;
   }

   public void setgxTv_SdtSdtQRCode_Creationdate( String value )
   {
      gxTv_SdtSdtQRCode_N = (byte)(0) ;
      gxTv_SdtSdtQRCode_Creationdate = value ;
   }

   public String getgxTv_SdtSdtQRCode_Image( )
   {
      return gxTv_SdtSdtQRCode_Image ;
   }

   public void setgxTv_SdtSdtQRCode_Image( String value )
   {
      gxTv_SdtSdtQRCode_N = (byte)(0) ;
      gxTv_SdtSdtQRCode_Image = value ;
   }

   public String getgxTv_SdtSdtQRCode_Gps( )
   {
      return gxTv_SdtSdtQRCode_Gps ;
   }

   public void setgxTv_SdtSdtQRCode_Gps( String value )
   {
      gxTv_SdtSdtQRCode_N = (byte)(0) ;
      gxTv_SdtSdtQRCode_Gps = value ;
   }

   public String getgxTv_SdtSdtQRCode_Sms( )
   {
      return gxTv_SdtSdtQRCode_Sms ;
   }

   public void setgxTv_SdtSdtQRCode_Sms( String value )
   {
      gxTv_SdtSdtQRCode_N = (byte)(0) ;
      gxTv_SdtSdtQRCode_Sms = value ;
   }

   public String getgxTv_SdtSdtQRCode_Notify( )
   {
      return gxTv_SdtSdtQRCode_Notify ;
   }

   public void setgxTv_SdtSdtQRCode_Notify( String value )
   {
      gxTv_SdtSdtQRCode_N = (byte)(0) ;
      gxTv_SdtSdtQRCode_Notify = value ;
   }

   public String getgxTv_SdtSdtQRCode_Medium( )
   {
      return gxTv_SdtSdtQRCode_Medium ;
   }

   public void setgxTv_SdtSdtQRCode_Medium( String value )
   {
      gxTv_SdtSdtQRCode_N = (byte)(0) ;
      gxTv_SdtSdtQRCode_Medium = value ;
   }

   public String getgxTv_SdtSdtQRCode_Folder( )
   {
      return gxTv_SdtSdtQRCode_Folder ;
   }

   public void setgxTv_SdtSdtQRCode_Folder( String value )
   {
      gxTv_SdtSdtQRCode_N = (byte)(0) ;
      gxTv_SdtSdtQRCode_Folder = value ;
   }

   public String getgxTv_SdtSdtQRCode_Color( )
   {
      return gxTv_SdtSdtQRCode_Color ;
   }

   public void setgxTv_SdtSdtQRCode_Color( String value )
   {
      gxTv_SdtSdtQRCode_N = (byte)(0) ;
      gxTv_SdtSdtQRCode_Color = value ;
   }

   public String getgxTv_SdtSdtQRCode_Bgcolor( )
   {
      return gxTv_SdtSdtQRCode_Bgcolor ;
   }

   public void setgxTv_SdtSdtQRCode_Bgcolor( String value )
   {
      gxTv_SdtSdtQRCode_N = (byte)(0) ;
      gxTv_SdtSdtQRCode_Bgcolor = value ;
   }

   public app.SdtSdtQRCodeLocation getgxTv_SdtSdtQRCode_Location( )
   {
      if ( gxTv_SdtSdtQRCode_Location == null )
      {
         gxTv_SdtSdtQRCode_Location = new app.SdtSdtQRCodeLocation(remoteHandle, context);
      }
      gxTv_SdtSdtQRCode_Location_N = (byte)(0) ;
      gxTv_SdtSdtQRCode_N = (byte)(0) ;
      return gxTv_SdtSdtQRCode_Location ;
   }

   public void setgxTv_SdtSdtQRCode_Location( app.SdtSdtQRCodeLocation value )
   {
      gxTv_SdtSdtQRCode_Location_N = (byte)(0) ;
      gxTv_SdtSdtQRCode_N = (byte)(0) ;
      gxTv_SdtSdtQRCode_Location = value;
   }

   public void setgxTv_SdtSdtQRCode_Location_SetNull( )
   {
      gxTv_SdtSdtQRCode_Location_N = (byte)(1) ;
      gxTv_SdtSdtQRCode_Location = (app.SdtSdtQRCodeLocation)null;
   }

   public boolean getgxTv_SdtSdtQRCode_Location_IsNull( )
   {
      if ( gxTv_SdtSdtQRCode_Location == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSdtQRCode_Location_N( )
   {
      return gxTv_SdtSdtQRCode_Location_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSdtQRCode_Shorturl = "" ;
      gxTv_SdtSdtQRCode_N = (byte)(1) ;
      gxTv_SdtSdtQRCode_Qr = "" ;
      gxTv_SdtSdtQRCode_Url = "" ;
      gxTv_SdtSdtQRCode_Title = "" ;
      gxTv_SdtSdtQRCode_Description = "" ;
      gxTv_SdtSdtQRCode_Creationdate = "" ;
      gxTv_SdtSdtQRCode_Image = "" ;
      gxTv_SdtSdtQRCode_Gps = "" ;
      gxTv_SdtSdtQRCode_Sms = "" ;
      gxTv_SdtSdtQRCode_Notify = "" ;
      gxTv_SdtSdtQRCode_Medium = "" ;
      gxTv_SdtSdtQRCode_Folder = "" ;
      gxTv_SdtSdtQRCode_Color = "" ;
      gxTv_SdtSdtQRCode_Bgcolor = "" ;
      gxTv_SdtSdtQRCode_Location_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSdtQRCode_N ;
   }

   public app.SdtSdtQRCode Clone( )
   {
      return (app.SdtSdtQRCode)(clone()) ;
   }

   public void setStruct( app.StructSdtSdtQRCode struct )
   {
      setgxTv_SdtSdtQRCode_Shorturl(struct.getShorturl());
      setgxTv_SdtSdtQRCode_Qr(struct.getQr());
      setgxTv_SdtSdtQRCode_Url(struct.getUrl());
      setgxTv_SdtSdtQRCode_Title(struct.getTitle());
      setgxTv_SdtSdtQRCode_Description(struct.getDescription());
      setgxTv_SdtSdtQRCode_Creationdate(struct.getCreationdate());
      setgxTv_SdtSdtQRCode_Image(struct.getImage());
      setgxTv_SdtSdtQRCode_Gps(struct.getGps());
      setgxTv_SdtSdtQRCode_Sms(struct.getSms());
      setgxTv_SdtSdtQRCode_Notify(struct.getNotify());
      setgxTv_SdtSdtQRCode_Medium(struct.getMedium());
      setgxTv_SdtSdtQRCode_Folder(struct.getFolder());
      setgxTv_SdtSdtQRCode_Color(struct.getColor());
      setgxTv_SdtSdtQRCode_Bgcolor(struct.getBgcolor());
      setgxTv_SdtSdtQRCode_Location(new app.SdtSdtQRCodeLocation(struct.getLocation()));
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSdtQRCode getStruct( )
   {
      app.StructSdtSdtQRCode struct = new app.StructSdtSdtQRCode ();
      struct.setShorturl(getgxTv_SdtSdtQRCode_Shorturl());
      struct.setQr(getgxTv_SdtSdtQRCode_Qr());
      struct.setUrl(getgxTv_SdtSdtQRCode_Url());
      struct.setTitle(getgxTv_SdtSdtQRCode_Title());
      struct.setDescription(getgxTv_SdtSdtQRCode_Description());
      struct.setCreationdate(getgxTv_SdtSdtQRCode_Creationdate());
      struct.setImage(getgxTv_SdtSdtQRCode_Image());
      struct.setGps(getgxTv_SdtSdtQRCode_Gps());
      struct.setSms(getgxTv_SdtSdtQRCode_Sms());
      struct.setNotify(getgxTv_SdtSdtQRCode_Notify());
      struct.setMedium(getgxTv_SdtSdtQRCode_Medium());
      struct.setFolder(getgxTv_SdtSdtQRCode_Folder());
      struct.setColor(getgxTv_SdtSdtQRCode_Color());
      struct.setBgcolor(getgxTv_SdtSdtQRCode_Bgcolor());
      struct.setLocation(getgxTv_SdtSdtQRCode_Location().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSdtQRCode_N ;
   protected byte gxTv_SdtSdtQRCode_Location_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSdtQRCode_Shorturl ;
   protected String gxTv_SdtSdtQRCode_Qr ;
   protected String gxTv_SdtSdtQRCode_Url ;
   protected String gxTv_SdtSdtQRCode_Title ;
   protected String gxTv_SdtSdtQRCode_Description ;
   protected String gxTv_SdtSdtQRCode_Creationdate ;
   protected String gxTv_SdtSdtQRCode_Image ;
   protected String gxTv_SdtSdtQRCode_Gps ;
   protected String gxTv_SdtSdtQRCode_Sms ;
   protected String gxTv_SdtSdtQRCode_Notify ;
   protected String gxTv_SdtSdtQRCode_Medium ;
   protected String gxTv_SdtSdtQRCode_Folder ;
   protected String gxTv_SdtSdtQRCode_Color ;
   protected String gxTv_SdtSdtQRCode_Bgcolor ;
   protected app.SdtSdtQRCodeLocation gxTv_SdtSdtQRCode_Location=null ;
}

