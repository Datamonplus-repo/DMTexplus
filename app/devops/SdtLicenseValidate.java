package app.devops ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtLicenseValidate extends GxUserType
{
   public SdtLicenseValidate( )
   {
      this(  new ModelContext(SdtLicenseValidate.class));
   }

   public SdtLicenseValidate( ModelContext context )
   {
      super( context, "SdtLicenseValidate");
   }

   public SdtLicenseValidate( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle, context, "SdtLicenseValidate");
   }

   public SdtLicenseValidate( StructSdtLicenseValidate struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "authorized") )
            {
               gxTv_SdtLicenseValidate_Authorized = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "company") )
            {
               gxTv_SdtLicenseValidate_Company = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "product") )
            {
               gxTv_SdtLicenseValidate_Product = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "plan") )
            {
               gxTv_SdtLicenseValidate_Plan = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "environment") )
            {
               gxTv_SdtLicenseValidate_Environment = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "version") )
            {
               gxTv_SdtLicenseValidate_Version = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "contractStatus") )
            {
               gxTv_SdtLicenseValidate_Contractstatus = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "licenseStatus") )
            {
               gxTv_SdtLicenseValidate_Licensestatus = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "expiresAt") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtLicenseValidate_Expiresat = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtLicenseValidate_Expiresat_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtLicenseValidate_Expiresat_N = (byte)(0) ;
                  gxTv_SdtLicenseValidate_Expiresat = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "manualOverrideUsed") )
            {
               gxTv_SdtLicenseValidate_Manualoverrideused = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "latestVersion") )
            {
               gxTv_SdtLicenseValidate_Latestversion = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "needsUpdate") )
            {
               gxTv_SdtLicenseValidate_Needsupdate = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
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
         sName = "LicenseValidate" ;
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
      oWriter.writeElement("authorized", GXutil.booltostr( gxTv_SdtLicenseValidate_Authorized));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("company", gxTv_SdtLicenseValidate_Company);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("product", gxTv_SdtLicenseValidate_Product);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("plan", gxTv_SdtLicenseValidate_Plan);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("environment", gxTv_SdtLicenseValidate_Environment);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("version", gxTv_SdtLicenseValidate_Version);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("contractStatus", gxTv_SdtLicenseValidate_Contractstatus);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("licenseStatus", gxTv_SdtLicenseValidate_Licensestatus);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtLicenseValidate_Expiresat) && ( gxTv_SdtLicenseValidate_Expiresat_N == 1 ) )
      {
         oWriter.writeElement("expiresAt", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtLicenseValidate_Expiresat), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtLicenseValidate_Expiresat), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtLicenseValidate_Expiresat), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtLicenseValidate_Expiresat), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtLicenseValidate_Expiresat), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtLicenseValidate_Expiresat), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("expiresAt", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("manualOverrideUsed", GXutil.booltostr( gxTv_SdtLicenseValidate_Manualoverrideused));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("latestVersion", gxTv_SdtLicenseValidate_Latestversion);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("needsUpdate", GXutil.booltostr( gxTv_SdtLicenseValidate_Needsupdate));
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
      AddObjectProperty("authorized", gxTv_SdtLicenseValidate_Authorized, false, false);
      AddObjectProperty("company", gxTv_SdtLicenseValidate_Company, false, false);
      AddObjectProperty("product", gxTv_SdtLicenseValidate_Product, false, false);
      AddObjectProperty("plan", gxTv_SdtLicenseValidate_Plan, false, false);
      AddObjectProperty("environment", gxTv_SdtLicenseValidate_Environment, false, false);
      AddObjectProperty("version", gxTv_SdtLicenseValidate_Version, false, false);
      AddObjectProperty("contractStatus", gxTv_SdtLicenseValidate_Contractstatus, false, false);
      AddObjectProperty("licenseStatus", gxTv_SdtLicenseValidate_Licensestatus, false, false);
      datetime_STZ = gxTv_SdtLicenseValidate_Expiresat ;
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( datetime_STZ), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("expiresAt", sDateCnv, false, false);
      AddObjectProperty("manualOverrideUsed", gxTv_SdtLicenseValidate_Manualoverrideused, false, false);
      AddObjectProperty("latestVersion", gxTv_SdtLicenseValidate_Latestversion, false, false);
      AddObjectProperty("needsUpdate", gxTv_SdtLicenseValidate_Needsupdate, false, false);
   }

   public boolean getgxTv_SdtLicenseValidate_Authorized( )
   {
      return gxTv_SdtLicenseValidate_Authorized ;
   }

   public void setgxTv_SdtLicenseValidate_Authorized( boolean value )
   {
      gxTv_SdtLicenseValidate_N = (byte)(0) ;
      gxTv_SdtLicenseValidate_Authorized = value ;
   }

   public String getgxTv_SdtLicenseValidate_Company( )
   {
      return gxTv_SdtLicenseValidate_Company ;
   }

   public void setgxTv_SdtLicenseValidate_Company( String value )
   {
      gxTv_SdtLicenseValidate_N = (byte)(0) ;
      gxTv_SdtLicenseValidate_Company = value ;
   }

   public String getgxTv_SdtLicenseValidate_Product( )
   {
      return gxTv_SdtLicenseValidate_Product ;
   }

   public void setgxTv_SdtLicenseValidate_Product( String value )
   {
      gxTv_SdtLicenseValidate_N = (byte)(0) ;
      gxTv_SdtLicenseValidate_Product = value ;
   }

   public String getgxTv_SdtLicenseValidate_Plan( )
   {
      return gxTv_SdtLicenseValidate_Plan ;
   }

   public void setgxTv_SdtLicenseValidate_Plan( String value )
   {
      gxTv_SdtLicenseValidate_N = (byte)(0) ;
      gxTv_SdtLicenseValidate_Plan = value ;
   }

   public String getgxTv_SdtLicenseValidate_Environment( )
   {
      return gxTv_SdtLicenseValidate_Environment ;
   }

   public void setgxTv_SdtLicenseValidate_Environment( String value )
   {
      gxTv_SdtLicenseValidate_N = (byte)(0) ;
      gxTv_SdtLicenseValidate_Environment = value ;
   }

   public String getgxTv_SdtLicenseValidate_Version( )
   {
      return gxTv_SdtLicenseValidate_Version ;
   }

   public void setgxTv_SdtLicenseValidate_Version( String value )
   {
      gxTv_SdtLicenseValidate_N = (byte)(0) ;
      gxTv_SdtLicenseValidate_Version = value ;
   }

   public String getgxTv_SdtLicenseValidate_Contractstatus( )
   {
      return gxTv_SdtLicenseValidate_Contractstatus ;
   }

   public void setgxTv_SdtLicenseValidate_Contractstatus( String value )
   {
      gxTv_SdtLicenseValidate_N = (byte)(0) ;
      gxTv_SdtLicenseValidate_Contractstatus = value ;
   }

   public String getgxTv_SdtLicenseValidate_Licensestatus( )
   {
      return gxTv_SdtLicenseValidate_Licensestatus ;
   }

   public void setgxTv_SdtLicenseValidate_Licensestatus( String value )
   {
      gxTv_SdtLicenseValidate_N = (byte)(0) ;
      gxTv_SdtLicenseValidate_Licensestatus = value ;
   }

   public java.util.Date getgxTv_SdtLicenseValidate_Expiresat( )
   {
      return gxTv_SdtLicenseValidate_Expiresat ;
   }

   public void setgxTv_SdtLicenseValidate_Expiresat( java.util.Date value )
   {
      gxTv_SdtLicenseValidate_Expiresat_N = (byte)(0) ;
      gxTv_SdtLicenseValidate_N = (byte)(0) ;
      gxTv_SdtLicenseValidate_Expiresat = value ;
   }

   public boolean getgxTv_SdtLicenseValidate_Manualoverrideused( )
   {
      return gxTv_SdtLicenseValidate_Manualoverrideused ;
   }

   public void setgxTv_SdtLicenseValidate_Manualoverrideused( boolean value )
   {
      gxTv_SdtLicenseValidate_N = (byte)(0) ;
      gxTv_SdtLicenseValidate_Manualoverrideused = value ;
   }

   public String getgxTv_SdtLicenseValidate_Latestversion( )
   {
      return gxTv_SdtLicenseValidate_Latestversion ;
   }

   public void setgxTv_SdtLicenseValidate_Latestversion( String value )
   {
      gxTv_SdtLicenseValidate_N = (byte)(0) ;
      gxTv_SdtLicenseValidate_Latestversion = value ;
   }

   public boolean getgxTv_SdtLicenseValidate_Needsupdate( )
   {
      return gxTv_SdtLicenseValidate_Needsupdate ;
   }

   public void setgxTv_SdtLicenseValidate_Needsupdate( boolean value )
   {
      gxTv_SdtLicenseValidate_N = (byte)(0) ;
      gxTv_SdtLicenseValidate_Needsupdate = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtLicenseValidate_N = (byte)(1) ;
      gxTv_SdtLicenseValidate_Company = "" ;
      gxTv_SdtLicenseValidate_Product = "" ;
      gxTv_SdtLicenseValidate_Plan = "" ;
      gxTv_SdtLicenseValidate_Environment = "" ;
      gxTv_SdtLicenseValidate_Version = "" ;
      gxTv_SdtLicenseValidate_Contractstatus = "" ;
      gxTv_SdtLicenseValidate_Licensestatus = "" ;
      gxTv_SdtLicenseValidate_Expiresat = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtLicenseValidate_Expiresat_N = (byte)(1) ;
      gxTv_SdtLicenseValidate_Latestversion = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtLicenseValidate_N ;
   }

   public app.devops.SdtLicenseValidate Clone( )
   {
      return (app.devops.SdtLicenseValidate)(clone()) ;
   }

   public void setStruct( app.devops.StructSdtLicenseValidate struct )
   {
      setgxTv_SdtLicenseValidate_Authorized(struct.getAuthorized());
      setgxTv_SdtLicenseValidate_Company(struct.getCompany());
      setgxTv_SdtLicenseValidate_Product(struct.getProduct());
      setgxTv_SdtLicenseValidate_Plan(struct.getPlan());
      setgxTv_SdtLicenseValidate_Environment(struct.getEnvironment());
      setgxTv_SdtLicenseValidate_Version(struct.getVersion());
      setgxTv_SdtLicenseValidate_Contractstatus(struct.getContractstatus());
      setgxTv_SdtLicenseValidate_Licensestatus(struct.getLicensestatus());
      if ( struct.gxTv_SdtLicenseValidate_Expiresat_N == 0 )
      {
         setgxTv_SdtLicenseValidate_Expiresat(struct.getExpiresat());
      }
      setgxTv_SdtLicenseValidate_Manualoverrideused(struct.getManualoverrideused());
      setgxTv_SdtLicenseValidate_Latestversion(struct.getLatestversion());
      setgxTv_SdtLicenseValidate_Needsupdate(struct.getNeedsupdate());
   }

   @SuppressWarnings("unchecked")
   public app.devops.StructSdtLicenseValidate getStruct( )
   {
      app.devops.StructSdtLicenseValidate struct = new app.devops.StructSdtLicenseValidate ();
      struct.setAuthorized(getgxTv_SdtLicenseValidate_Authorized());
      struct.setCompany(getgxTv_SdtLicenseValidate_Company());
      struct.setProduct(getgxTv_SdtLicenseValidate_Product());
      struct.setPlan(getgxTv_SdtLicenseValidate_Plan());
      struct.setEnvironment(getgxTv_SdtLicenseValidate_Environment());
      struct.setVersion(getgxTv_SdtLicenseValidate_Version());
      struct.setContractstatus(getgxTv_SdtLicenseValidate_Contractstatus());
      struct.setLicensestatus(getgxTv_SdtLicenseValidate_Licensestatus());
      if ( gxTv_SdtLicenseValidate_Expiresat_N == 0 )
      {
         struct.setExpiresat(getgxTv_SdtLicenseValidate_Expiresat());
      }
      struct.setManualoverrideused(getgxTv_SdtLicenseValidate_Manualoverrideused());
      struct.setLatestversion(getgxTv_SdtLicenseValidate_Latestversion());
      struct.setNeedsupdate(getgxTv_SdtLicenseValidate_Needsupdate());
      return struct ;
   }

   protected byte gxTv_SdtLicenseValidate_N ;
   protected byte gxTv_SdtLicenseValidate_Expiresat_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtLicenseValidate_Expiresat ;
   protected java.util.Date datetime_STZ ;
   protected boolean gxTv_SdtLicenseValidate_Authorized ;
   protected boolean gxTv_SdtLicenseValidate_Manualoverrideused ;
   protected boolean gxTv_SdtLicenseValidate_Needsupdate ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtLicenseValidate_Company ;
   protected String gxTv_SdtLicenseValidate_Product ;
   protected String gxTv_SdtLicenseValidate_Plan ;
   protected String gxTv_SdtLicenseValidate_Environment ;
   protected String gxTv_SdtLicenseValidate_Version ;
   protected String gxTv_SdtLicenseValidate_Contractstatus ;
   protected String gxTv_SdtLicenseValidate_Licensestatus ;
   protected String gxTv_SdtLicenseValidate_Latestversion ;
}

