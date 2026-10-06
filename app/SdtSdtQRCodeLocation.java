package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSdtQRCodeLocation extends GxUserType
{
   public SdtSdtQRCodeLocation( )
   {
      this(  new ModelContext(SdtSdtQRCodeLocation.class));
   }

   public SdtSdtQRCodeLocation( ModelContext context )
   {
      super( context, "SdtSdtQRCodeLocation");
   }

   public SdtSdtQRCodeLocation( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle, context, "SdtSdtQRCodeLocation");
   }

   public SdtSdtQRCodeLocation( StructSdtSdtQRCodeLocation struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "address") )
            {
               gxTv_SdtSdtQRCodeLocation_Address = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "lng") )
            {
               gxTv_SdtSdtQRCodeLocation_Lng = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "lat") )
            {
               gxTv_SdtSdtQRCodeLocation_Lat = oReader.getValue() ;
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
         sName = "SdtQRCodeLocation" ;
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
      oWriter.writeElement("address", gxTv_SdtSdtQRCodeLocation_Address);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("lng", gxTv_SdtSdtQRCodeLocation_Lng);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("lat", gxTv_SdtSdtQRCodeLocation_Lat);
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
      AddObjectProperty("address", gxTv_SdtSdtQRCodeLocation_Address, false, false);
      AddObjectProperty("lng", gxTv_SdtSdtQRCodeLocation_Lng, false, false);
      AddObjectProperty("lat", gxTv_SdtSdtQRCodeLocation_Lat, false, false);
   }

   public String getgxTv_SdtSdtQRCodeLocation_Address( )
   {
      return gxTv_SdtSdtQRCodeLocation_Address ;
   }

   public void setgxTv_SdtSdtQRCodeLocation_Address( String value )
   {
      gxTv_SdtSdtQRCodeLocation_N = (byte)(0) ;
      gxTv_SdtSdtQRCodeLocation_Address = value ;
   }

   public String getgxTv_SdtSdtQRCodeLocation_Lng( )
   {
      return gxTv_SdtSdtQRCodeLocation_Lng ;
   }

   public void setgxTv_SdtSdtQRCodeLocation_Lng( String value )
   {
      gxTv_SdtSdtQRCodeLocation_N = (byte)(0) ;
      gxTv_SdtSdtQRCodeLocation_Lng = value ;
   }

   public String getgxTv_SdtSdtQRCodeLocation_Lat( )
   {
      return gxTv_SdtSdtQRCodeLocation_Lat ;
   }

   public void setgxTv_SdtSdtQRCodeLocation_Lat( String value )
   {
      gxTv_SdtSdtQRCodeLocation_N = (byte)(0) ;
      gxTv_SdtSdtQRCodeLocation_Lat = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSdtQRCodeLocation_Address = "" ;
      gxTv_SdtSdtQRCodeLocation_N = (byte)(1) ;
      gxTv_SdtSdtQRCodeLocation_Lng = "" ;
      gxTv_SdtSdtQRCodeLocation_Lat = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSdtQRCodeLocation_N ;
   }

   public app.SdtSdtQRCodeLocation Clone( )
   {
      return (app.SdtSdtQRCodeLocation)(clone()) ;
   }

   public void setStruct( app.StructSdtSdtQRCodeLocation struct )
   {
      setgxTv_SdtSdtQRCodeLocation_Address(struct.getAddress());
      setgxTv_SdtSdtQRCodeLocation_Lng(struct.getLng());
      setgxTv_SdtSdtQRCodeLocation_Lat(struct.getLat());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSdtQRCodeLocation getStruct( )
   {
      app.StructSdtSdtQRCodeLocation struct = new app.StructSdtSdtQRCodeLocation ();
      struct.setAddress(getgxTv_SdtSdtQRCodeLocation_Address());
      struct.setLng(getgxTv_SdtSdtQRCodeLocation_Lng());
      struct.setLat(getgxTv_SdtSdtQRCodeLocation_Lat());
      return struct ;
   }

   protected byte gxTv_SdtSdtQRCodeLocation_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSdtQRCodeLocation_Address ;
   protected String gxTv_SdtSdtQRCodeLocation_Lng ;
   protected String gxTv_SdtSdtQRCodeLocation_Lat ;
}

