package app.datamon ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSdtUser extends GxUserType
{
   public SdtSdtUser( )
   {
      this(  new ModelContext(SdtSdtUser.class));
   }

   public SdtSdtUser( ModelContext context )
   {
      super( context, "SdtSdtUser");
   }

   public SdtSdtUser( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle, context, "SdtSdtUser");
   }

   public SdtSdtUser( StructSdtSdtUser struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "User_Image") )
            {
               gxTv_SdtSdtUser_User_image = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "User_Image_GXI") )
            {
               gxTv_SdtSdtUser_User_image_gxi = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "User_Name") )
            {
               gxTv_SdtSdtUser_User_name = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "User_Profile") )
            {
               gxTv_SdtSdtUser_User_profile = oReader.getValue() ;
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
         sName = "SdtUser" ;
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
      oWriter.writeElement("User_Image", gxTv_SdtSdtUser_User_image);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("User_Image_GXI", gxTv_SdtSdtUser_User_image_gxi);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("User_Name", gxTv_SdtSdtUser_User_name);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("User_Profile", gxTv_SdtSdtUser_User_profile);
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
      AddObjectProperty("User_Image", gxTv_SdtSdtUser_User_image, false, false);
      AddObjectProperty("User_Image_GXI", gxTv_SdtSdtUser_User_image_gxi, false, false);
      AddObjectProperty("User_Name", gxTv_SdtSdtUser_User_name, false, false);
      AddObjectProperty("User_Profile", gxTv_SdtSdtUser_User_profile, false, false);
   }

   @GxUpload
   public String getgxTv_SdtSdtUser_User_image( )
   {
      return gxTv_SdtSdtUser_User_image ;
   }

   public void setgxTv_SdtSdtUser_User_image( String value )
   {
      gxTv_SdtSdtUser_N = (byte)(0) ;
      gxTv_SdtSdtUser_User_image = value ;
   }

   public String getgxTv_SdtSdtUser_User_image_gxi( )
   {
      return gxTv_SdtSdtUser_User_image_gxi ;
   }

   public void setgxTv_SdtSdtUser_User_image_gxi( String value )
   {
      gxTv_SdtSdtUser_N = (byte)(0) ;
      gxTv_SdtSdtUser_User_image_gxi = value ;
   }

   public String getgxTv_SdtSdtUser_User_name( )
   {
      return gxTv_SdtSdtUser_User_name ;
   }

   public void setgxTv_SdtSdtUser_User_name( String value )
   {
      gxTv_SdtSdtUser_N = (byte)(0) ;
      gxTv_SdtSdtUser_User_name = value ;
   }

   public String getgxTv_SdtSdtUser_User_profile( )
   {
      return gxTv_SdtSdtUser_User_profile ;
   }

   public void setgxTv_SdtSdtUser_User_profile( String value )
   {
      gxTv_SdtSdtUser_N = (byte)(0) ;
      gxTv_SdtSdtUser_User_profile = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSdtUser_User_image = "" ;
      gxTv_SdtSdtUser_N = (byte)(1) ;
      gxTv_SdtSdtUser_User_image_gxi = "" ;
      gxTv_SdtSdtUser_User_name = "" ;
      gxTv_SdtSdtUser_User_profile = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSdtUser_N ;
   }

   public app.datamon.SdtSdtUser Clone( )
   {
      return (app.datamon.SdtSdtUser)(clone()) ;
   }

   public void setStruct( app.datamon.StructSdtSdtUser struct )
   {
      setgxTv_SdtSdtUser_User_image(struct.getUser_image());
      setgxTv_SdtSdtUser_User_image_gxi(struct.getUser_image_gxi());
      setgxTv_SdtSdtUser_User_name(struct.getUser_name());
      setgxTv_SdtSdtUser_User_profile(struct.getUser_profile());
   }

   @SuppressWarnings("unchecked")
   public app.datamon.StructSdtSdtUser getStruct( )
   {
      app.datamon.StructSdtSdtUser struct = new app.datamon.StructSdtSdtUser ();
      struct.setUser_image(getgxTv_SdtSdtUser_User_image());
      struct.setUser_image_gxi(getgxTv_SdtSdtUser_User_image_gxi());
      struct.setUser_name(getgxTv_SdtSdtUser_User_name());
      struct.setUser_profile(getgxTv_SdtSdtUser_User_profile());
      return struct ;
   }

   protected byte gxTv_SdtSdtUser_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSdtUser_User_image_gxi ;
   protected String gxTv_SdtSdtUser_User_name ;
   protected String gxTv_SdtSdtUser_User_profile ;
   protected String gxTv_SdtSdtUser_User_image ;
}

