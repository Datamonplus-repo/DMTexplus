package app.datamon ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSdtSystem_System extends GxUserType
{
   public SdtSdtSystem_System( )
   {
      this(  new ModelContext(SdtSdtSystem_System.class));
   }

   public SdtSdtSystem_System( ModelContext context )
   {
      super( context, "SdtSdtSystem_System");
   }

   public SdtSdtSystem_System( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle, context, "SdtSdtSystem_System");
   }

   public SdtSdtSystem_System( StructSdtSdtSystem_System struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "SystemID") )
            {
               gxTv_SdtSdtSystem_System_Systemid = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SystemName") )
            {
               gxTv_SdtSdtSystem_System_Systemname = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SystemDescription") )
            {
               gxTv_SdtSdtSystem_System_Systemdescription = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SystemImage") )
            {
               gxTv_SdtSdtSystem_System_Systemimage = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SystemImage_GXI") )
            {
               gxTv_SdtSdtSystem_System_Systemimage_gxi = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SystemURL") )
            {
               gxTv_SdtSdtSystem_System_Systemurl = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SystemStartUrl") )
            {
               gxTv_SdtSdtSystem_System_Systemstarturl = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SystemToken") )
            {
               gxTv_SdtSdtSystem_System_Systemtoken = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SystemColor") )
            {
               gxTv_SdtSdtSystem_System_Systemcolor = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SystemIsStep") )
            {
               gxTv_SdtSdtSystem_System_Systemisstep = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
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
         sName = "SdtSystem.System" ;
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
      oWriter.writeElement("SystemID", gxTv_SdtSdtSystem_System_Systemid);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("SystemName", gxTv_SdtSdtSystem_System_Systemname);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("SystemDescription", gxTv_SdtSdtSystem_System_Systemdescription);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("SystemImage", gxTv_SdtSdtSystem_System_Systemimage);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("SystemImage_GXI", gxTv_SdtSdtSystem_System_Systemimage_gxi);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("SystemURL", gxTv_SdtSdtSystem_System_Systemurl);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("SystemStartUrl", gxTv_SdtSdtSystem_System_Systemstarturl);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("SystemToken", gxTv_SdtSdtSystem_System_Systemtoken);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("SystemColor", gxTv_SdtSdtSystem_System_Systemcolor);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("SystemIsStep", GXutil.booltostr( gxTv_SdtSdtSystem_System_Systemisstep));
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
      AddObjectProperty("SystemID", gxTv_SdtSdtSystem_System_Systemid, false, false);
      AddObjectProperty("SystemName", gxTv_SdtSdtSystem_System_Systemname, false, false);
      AddObjectProperty("SystemDescription", gxTv_SdtSdtSystem_System_Systemdescription, false, false);
      AddObjectProperty("SystemImage", gxTv_SdtSdtSystem_System_Systemimage, false, false);
      AddObjectProperty("SystemImage_GXI", gxTv_SdtSdtSystem_System_Systemimage_gxi, false, false);
      AddObjectProperty("SystemURL", gxTv_SdtSdtSystem_System_Systemurl, false, false);
      AddObjectProperty("SystemStartUrl", gxTv_SdtSdtSystem_System_Systemstarturl, false, false);
      AddObjectProperty("SystemToken", gxTv_SdtSdtSystem_System_Systemtoken, false, false);
      AddObjectProperty("SystemColor", gxTv_SdtSdtSystem_System_Systemcolor, false, false);
      AddObjectProperty("SystemIsStep", gxTv_SdtSdtSystem_System_Systemisstep, false, false);
   }

   public String getgxTv_SdtSdtSystem_System_Systemid( )
   {
      return gxTv_SdtSdtSystem_System_Systemid ;
   }

   public void setgxTv_SdtSdtSystem_System_Systemid( String value )
   {
      gxTv_SdtSdtSystem_System_N = (byte)(0) ;
      gxTv_SdtSdtSystem_System_Systemid = value ;
   }

   public String getgxTv_SdtSdtSystem_System_Systemname( )
   {
      return gxTv_SdtSdtSystem_System_Systemname ;
   }

   public void setgxTv_SdtSdtSystem_System_Systemname( String value )
   {
      gxTv_SdtSdtSystem_System_N = (byte)(0) ;
      gxTv_SdtSdtSystem_System_Systemname = value ;
   }

   public String getgxTv_SdtSdtSystem_System_Systemdescription( )
   {
      return gxTv_SdtSdtSystem_System_Systemdescription ;
   }

   public void setgxTv_SdtSdtSystem_System_Systemdescription( String value )
   {
      gxTv_SdtSdtSystem_System_N = (byte)(0) ;
      gxTv_SdtSdtSystem_System_Systemdescription = value ;
   }

   @GxUpload
   public String getgxTv_SdtSdtSystem_System_Systemimage( )
   {
      return gxTv_SdtSdtSystem_System_Systemimage ;
   }

   public void setgxTv_SdtSdtSystem_System_Systemimage( String value )
   {
      gxTv_SdtSdtSystem_System_N = (byte)(0) ;
      gxTv_SdtSdtSystem_System_Systemimage = value ;
   }

   public String getgxTv_SdtSdtSystem_System_Systemimage_gxi( )
   {
      return gxTv_SdtSdtSystem_System_Systemimage_gxi ;
   }

   public void setgxTv_SdtSdtSystem_System_Systemimage_gxi( String value )
   {
      gxTv_SdtSdtSystem_System_N = (byte)(0) ;
      gxTv_SdtSdtSystem_System_Systemimage_gxi = value ;
   }

   public String getgxTv_SdtSdtSystem_System_Systemurl( )
   {
      return gxTv_SdtSdtSystem_System_Systemurl ;
   }

   public void setgxTv_SdtSdtSystem_System_Systemurl( String value )
   {
      gxTv_SdtSdtSystem_System_N = (byte)(0) ;
      gxTv_SdtSdtSystem_System_Systemurl = value ;
   }

   public String getgxTv_SdtSdtSystem_System_Systemstarturl( )
   {
      return gxTv_SdtSdtSystem_System_Systemstarturl ;
   }

   public void setgxTv_SdtSdtSystem_System_Systemstarturl( String value )
   {
      gxTv_SdtSdtSystem_System_N = (byte)(0) ;
      gxTv_SdtSdtSystem_System_Systemstarturl = value ;
   }

   public String getgxTv_SdtSdtSystem_System_Systemtoken( )
   {
      return gxTv_SdtSdtSystem_System_Systemtoken ;
   }

   public void setgxTv_SdtSdtSystem_System_Systemtoken( String value )
   {
      gxTv_SdtSdtSystem_System_N = (byte)(0) ;
      gxTv_SdtSdtSystem_System_Systemtoken = value ;
   }

   public String getgxTv_SdtSdtSystem_System_Systemcolor( )
   {
      return gxTv_SdtSdtSystem_System_Systemcolor ;
   }

   public void setgxTv_SdtSdtSystem_System_Systemcolor( String value )
   {
      gxTv_SdtSdtSystem_System_N = (byte)(0) ;
      gxTv_SdtSdtSystem_System_Systemcolor = value ;
   }

   public boolean getgxTv_SdtSdtSystem_System_Systemisstep( )
   {
      return gxTv_SdtSdtSystem_System_Systemisstep ;
   }

   public void setgxTv_SdtSdtSystem_System_Systemisstep( boolean value )
   {
      gxTv_SdtSdtSystem_System_N = (byte)(0) ;
      gxTv_SdtSdtSystem_System_Systemisstep = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSdtSystem_System_Systemid = "" ;
      gxTv_SdtSdtSystem_System_N = (byte)(1) ;
      gxTv_SdtSdtSystem_System_Systemname = "" ;
      gxTv_SdtSdtSystem_System_Systemdescription = "" ;
      gxTv_SdtSdtSystem_System_Systemimage = "" ;
      gxTv_SdtSdtSystem_System_Systemimage_gxi = "" ;
      gxTv_SdtSdtSystem_System_Systemurl = "" ;
      gxTv_SdtSdtSystem_System_Systemstarturl = "" ;
      gxTv_SdtSdtSystem_System_Systemtoken = "" ;
      gxTv_SdtSdtSystem_System_Systemcolor = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSdtSystem_System_N ;
   }

   public app.datamon.SdtSdtSystem_System Clone( )
   {
      return (app.datamon.SdtSdtSystem_System)(clone()) ;
   }

   public void setStruct( app.datamon.StructSdtSdtSystem_System struct )
   {
      setgxTv_SdtSdtSystem_System_Systemid(struct.getSystemid());
      setgxTv_SdtSdtSystem_System_Systemname(struct.getSystemname());
      setgxTv_SdtSdtSystem_System_Systemdescription(struct.getSystemdescription());
      setgxTv_SdtSdtSystem_System_Systemimage(struct.getSystemimage());
      setgxTv_SdtSdtSystem_System_Systemimage_gxi(struct.getSystemimage_gxi());
      setgxTv_SdtSdtSystem_System_Systemurl(struct.getSystemurl());
      setgxTv_SdtSdtSystem_System_Systemstarturl(struct.getSystemstarturl());
      setgxTv_SdtSdtSystem_System_Systemtoken(struct.getSystemtoken());
      setgxTv_SdtSdtSystem_System_Systemcolor(struct.getSystemcolor());
      setgxTv_SdtSdtSystem_System_Systemisstep(struct.getSystemisstep());
   }

   @SuppressWarnings("unchecked")
   public app.datamon.StructSdtSdtSystem_System getStruct( )
   {
      app.datamon.StructSdtSdtSystem_System struct = new app.datamon.StructSdtSdtSystem_System ();
      struct.setSystemid(getgxTv_SdtSdtSystem_System_Systemid());
      struct.setSystemname(getgxTv_SdtSdtSystem_System_Systemname());
      struct.setSystemdescription(getgxTv_SdtSdtSystem_System_Systemdescription());
      struct.setSystemimage(getgxTv_SdtSdtSystem_System_Systemimage());
      struct.setSystemimage_gxi(getgxTv_SdtSdtSystem_System_Systemimage_gxi());
      struct.setSystemurl(getgxTv_SdtSdtSystem_System_Systemurl());
      struct.setSystemstarturl(getgxTv_SdtSdtSystem_System_Systemstarturl());
      struct.setSystemtoken(getgxTv_SdtSdtSystem_System_Systemtoken());
      struct.setSystemcolor(getgxTv_SdtSdtSystem_System_Systemcolor());
      struct.setSystemisstep(getgxTv_SdtSdtSystem_System_Systemisstep());
      return struct ;
   }

   protected byte gxTv_SdtSdtSystem_System_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtSdtSystem_System_Systemid ;
   protected String sTagName ;
   protected boolean gxTv_SdtSdtSystem_System_Systemisstep ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSdtSystem_System_Systemname ;
   protected String gxTv_SdtSdtSystem_System_Systemdescription ;
   protected String gxTv_SdtSdtSystem_System_Systemimage_gxi ;
   protected String gxTv_SdtSdtSystem_System_Systemurl ;
   protected String gxTv_SdtSdtSystem_System_Systemstarturl ;
   protected String gxTv_SdtSdtSystem_System_Systemtoken ;
   protected String gxTv_SdtSdtSystem_System_Systemcolor ;
   protected String gxTv_SdtSdtSystem_System_Systemimage ;
}

