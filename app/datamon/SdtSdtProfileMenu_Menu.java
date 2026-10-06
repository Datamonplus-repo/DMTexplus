package app.datamon ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSdtProfileMenu_Menu extends GxUserType
{
   public SdtSdtProfileMenu_Menu( )
   {
      this(  new ModelContext(SdtSdtProfileMenu_Menu.class));
   }

   public SdtSdtProfileMenu_Menu( ModelContext context )
   {
      super( context, "SdtSdtProfileMenu_Menu");
   }

   public SdtSdtProfileMenu_Menu( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtSdtProfileMenu_Menu");
   }

   public SdtSdtProfileMenu_Menu( StructSdtSdtProfileMenu_Menu struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "ProfileMenuTitle") )
            {
               gxTv_SdtSdtProfileMenu_Menu_Profilemenutitle = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ProfileMenuIcon") )
            {
               gxTv_SdtSdtProfileMenu_Menu_Profilemenuicon = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ProfileMenuURL") )
            {
               gxTv_SdtSdtProfileMenu_Menu_Profilemenuurl = oReader.getValue() ;
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
         sName = "SdtProfileMenu.Menu" ;
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
      oWriter.writeElement("ProfileMenuTitle", gxTv_SdtSdtProfileMenu_Menu_Profilemenutitle);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ProfileMenuIcon", gxTv_SdtSdtProfileMenu_Menu_Profilemenuicon);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ProfileMenuURL", gxTv_SdtSdtProfileMenu_Menu_Profilemenuurl);
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
      AddObjectProperty("ProfileMenuTitle", gxTv_SdtSdtProfileMenu_Menu_Profilemenutitle, false, false);
      AddObjectProperty("ProfileMenuIcon", gxTv_SdtSdtProfileMenu_Menu_Profilemenuicon, false, false);
      AddObjectProperty("ProfileMenuURL", gxTv_SdtSdtProfileMenu_Menu_Profilemenuurl, false, false);
   }

   public String getgxTv_SdtSdtProfileMenu_Menu_Profilemenutitle( )
   {
      return gxTv_SdtSdtProfileMenu_Menu_Profilemenutitle ;
   }

   public void setgxTv_SdtSdtProfileMenu_Menu_Profilemenutitle( String value )
   {
      gxTv_SdtSdtProfileMenu_Menu_N = (byte)(0) ;
      gxTv_SdtSdtProfileMenu_Menu_Profilemenutitle = value ;
   }

   public String getgxTv_SdtSdtProfileMenu_Menu_Profilemenuicon( )
   {
      return gxTv_SdtSdtProfileMenu_Menu_Profilemenuicon ;
   }

   public void setgxTv_SdtSdtProfileMenu_Menu_Profilemenuicon( String value )
   {
      gxTv_SdtSdtProfileMenu_Menu_N = (byte)(0) ;
      gxTv_SdtSdtProfileMenu_Menu_Profilemenuicon = value ;
   }

   public String getgxTv_SdtSdtProfileMenu_Menu_Profilemenuurl( )
   {
      return gxTv_SdtSdtProfileMenu_Menu_Profilemenuurl ;
   }

   public void setgxTv_SdtSdtProfileMenu_Menu_Profilemenuurl( String value )
   {
      gxTv_SdtSdtProfileMenu_Menu_N = (byte)(0) ;
      gxTv_SdtSdtProfileMenu_Menu_Profilemenuurl = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSdtProfileMenu_Menu_Profilemenutitle = "" ;
      gxTv_SdtSdtProfileMenu_Menu_N = (byte)(1) ;
      gxTv_SdtSdtProfileMenu_Menu_Profilemenuicon = "" ;
      gxTv_SdtSdtProfileMenu_Menu_Profilemenuurl = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSdtProfileMenu_Menu_N ;
   }

   public app.datamon.SdtSdtProfileMenu_Menu Clone( )
   {
      return (app.datamon.SdtSdtProfileMenu_Menu)(clone()) ;
   }

   public void setStruct( app.datamon.StructSdtSdtProfileMenu_Menu struct )
   {
      setgxTv_SdtSdtProfileMenu_Menu_Profilemenutitle(struct.getProfilemenutitle());
      setgxTv_SdtSdtProfileMenu_Menu_Profilemenuicon(struct.getProfilemenuicon());
      setgxTv_SdtSdtProfileMenu_Menu_Profilemenuurl(struct.getProfilemenuurl());
   }

   @SuppressWarnings("unchecked")
   public app.datamon.StructSdtSdtProfileMenu_Menu getStruct( )
   {
      app.datamon.StructSdtSdtProfileMenu_Menu struct = new app.datamon.StructSdtSdtProfileMenu_Menu ();
      struct.setProfilemenutitle(getgxTv_SdtSdtProfileMenu_Menu_Profilemenutitle());
      struct.setProfilemenuicon(getgxTv_SdtSdtProfileMenu_Menu_Profilemenuicon());
      struct.setProfilemenuurl(getgxTv_SdtSdtProfileMenu_Menu_Profilemenuurl());
      return struct ;
   }

   protected byte gxTv_SdtSdtProfileMenu_Menu_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSdtProfileMenu_Menu_Profilemenutitle ;
   protected String gxTv_SdtSdtProfileMenu_Menu_Profilemenuicon ;
   protected String gxTv_SdtSdtProfileMenu_Menu_Profilemenuurl ;
}

