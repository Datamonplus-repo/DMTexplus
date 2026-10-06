package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTTRM extends GxSilentTrnSdt
{
   public SdtTTRM( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTTRM.class));
   }

   public SdtTTRM( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle, context, "SdtTTRM");
      initialize( remoteHandle) ;
   }

   public SdtTTRM( int remoteHandle ,
                   StructSdtTTRM struct )
   {
      this(remoteHandle);
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

   public void Load( String AV396EmprCod ,
                     byte AV14105TRMDivID ,
                     java.util.Date AV14106TRMFecha )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {AV396EmprCod,Byte.valueOf(AV14105TRMDivID),AV14106TRMFecha});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"EmprCod", String.class}, new Object[]{"TRMDivID", byte.class}, new Object[]{"TRMFecha", java.util.Date.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "FicherosBasicos\\TTRM");
      metadata.set("BT", "TXPTRM");
      metadata.set("PK", "[ \"TRMDivID\",\"TRMFecha\" ]");
      metadata.set("PKAssigned", "[ \"TRMDivID\",\"TRMFecha\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"DivCod\" ],\"FKMap\":[ \"TRMDivID-DivCod\" ] },{ \"FK\":[ \"EmprCod\" ],\"FKMap\":[  ] } ]");
      metadata.set("AllowInsert", "True");
      metadata.set("AllowUpdate", "True");
      metadata.set("AllowDelete", "True");
      return metadata ;
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod") )
            {
               gxTv_SdtTTRM_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom") )
            {
               gxTv_SdtTTRM_Emprnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TRMDivID") )
            {
               gxTv_SdtTTRM_Trmdivid = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TRMDivNom") )
            {
               gxTv_SdtTTRM_Trmdivnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TRMFecha") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTTRM_Trmfecha = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTTRM_Trmfecha = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TRMCompra") )
            {
               gxTv_SdtTTRM_Trmcompra = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TRMVenta") )
            {
               gxTv_SdtTTRM_Trmventa = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TRMAutMan") )
            {
               gxTv_SdtTTRM_Trmautman = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTTRM_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTTRM_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod_Z") )
            {
               gxTv_SdtTTRM_Emprcod_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom_Z") )
            {
               gxTv_SdtTTRM_Emprnom_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TRMDivID_Z") )
            {
               gxTv_SdtTTRM_Trmdivid_Z = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TRMDivNom_Z") )
            {
               gxTv_SdtTTRM_Trmdivnom_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TRMFecha_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTTRM_Trmfecha_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTTRM_Trmfecha_Z = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TRMCompra_Z") )
            {
               gxTv_SdtTTRM_Trmcompra_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TRMVenta_Z") )
            {
               gxTv_SdtTTRM_Trmventa_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TRMAutMan_Z") )
            {
               gxTv_SdtTTRM_Trmautman_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom_N") )
            {
               gxTv_SdtTTRM_Emprnom_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TRMDivNom_N") )
            {
               gxTv_SdtTTRM_Trmdivnom_N = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "TTRM" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtTTRM_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EmprNom", gxTv_SdtTTRM_Emprnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TRMDivID", GXutil.trim( GXutil.str( gxTv_SdtTTRM_Trmdivid, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TRMDivNom", gxTv_SdtTTRM_Trmdivnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTTRM_Trmfecha), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTTRM_Trmfecha), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTTRM_Trmfecha), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTTRM_Trmfecha), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTTRM_Trmfecha), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTTRM_Trmfecha), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("TRMFecha", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TRMCompra", GXutil.trim( GXutil.strNoRound( gxTv_SdtTTRM_Trmcompra, 11, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TRMVenta", GXutil.trim( GXutil.strNoRound( gxTv_SdtTTRM_Trmventa, 11, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TRMAutMan", gxTv_SdtTTRM_Trmautman);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtTTRM_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTTRM_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprCod_Z", gxTv_SdtTTRM_Emprcod_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprNom_Z", gxTv_SdtTTRM_Emprnom_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TRMDivID_Z", GXutil.trim( GXutil.str( gxTv_SdtTTRM_Trmdivid_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TRMDivNom_Z", gxTv_SdtTTRM_Trmdivnom_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTTRM_Trmfecha_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTTRM_Trmfecha_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTTRM_Trmfecha_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTTRM_Trmfecha_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTTRM_Trmfecha_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTTRM_Trmfecha_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TRMFecha_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TRMCompra_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTTRM_Trmcompra_Z, 11, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TRMVenta_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTTRM_Trmventa_Z, 11, 2)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TRMAutMan_Z", gxTv_SdtTTRM_Trmautman_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprNom_N", GXutil.trim( GXutil.str( gxTv_SdtTTRM_Emprnom_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("TRMDivNom_N", GXutil.trim( GXutil.str( gxTv_SdtTTRM_Trmdivnom_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeEndElement();
   }

   public long getnumericvalue( String value )
   {
      if ( GXutil.notNumeric( value) )
      {
         formatError = true ;
      }
      return GXutil.lval( value) ;
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
      AddObjectProperty("EmprCod", gxTv_SdtTTRM_Emprcod, false, includeNonInitialized);
      AddObjectProperty("EmprNom", gxTv_SdtTTRM_Emprnom, false, includeNonInitialized);
      AddObjectProperty("EmprNom_N", gxTv_SdtTTRM_Emprnom_N, false, includeNonInitialized);
      AddObjectProperty("TRMDivID", gxTv_SdtTTRM_Trmdivid, false, includeNonInitialized);
      AddObjectProperty("TRMDivNom", gxTv_SdtTTRM_Trmdivnom, false, includeNonInitialized);
      AddObjectProperty("TRMDivNom_N", gxTv_SdtTTRM_Trmdivnom_N, false, includeNonInitialized);
      datetime_STZ = gxTv_SdtTTRM_Trmfecha ;
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
      AddObjectProperty("TRMFecha", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("TRMCompra", gxTv_SdtTTRM_Trmcompra, false, includeNonInitialized);
      AddObjectProperty("TRMVenta", gxTv_SdtTTRM_Trmventa, false, includeNonInitialized);
      AddObjectProperty("TRMAutMan", gxTv_SdtTTRM_Trmautman, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtTTRM_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtTTRM_Initialized, false, includeNonInitialized);
         AddObjectProperty("EmprCod_Z", gxTv_SdtTTRM_Emprcod_Z, false, includeNonInitialized);
         AddObjectProperty("EmprNom_Z", gxTv_SdtTTRM_Emprnom_Z, false, includeNonInitialized);
         AddObjectProperty("TRMDivID_Z", gxTv_SdtTTRM_Trmdivid_Z, false, includeNonInitialized);
         AddObjectProperty("TRMDivNom_Z", gxTv_SdtTTRM_Trmdivnom_Z, false, includeNonInitialized);
         datetime_STZ = gxTv_SdtTTRM_Trmfecha_Z ;
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
         AddObjectProperty("TRMFecha_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("TRMCompra_Z", gxTv_SdtTTRM_Trmcompra_Z, false, includeNonInitialized);
         AddObjectProperty("TRMVenta_Z", gxTv_SdtTTRM_Trmventa_Z, false, includeNonInitialized);
         AddObjectProperty("TRMAutMan_Z", gxTv_SdtTTRM_Trmautman_Z, false, includeNonInitialized);
         AddObjectProperty("EmprNom_N", gxTv_SdtTTRM_Emprnom_N, false, includeNonInitialized);
         AddObjectProperty("TRMDivNom_N", gxTv_SdtTTRM_Trmdivnom_N, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.ficherosbasicos.SdtTTRM sdt )
   {
      if ( sdt.IsDirty("EmprCod") )
      {
         gxTv_SdtTTRM_N = (byte)(0) ;
         gxTv_SdtTTRM_Emprcod = sdt.getgxTv_SdtTTRM_Emprcod() ;
      }
      if ( sdt.IsDirty("EmprNom") )
      {
         gxTv_SdtTTRM_Emprnom_N = sdt.getgxTv_SdtTTRM_Emprnom_N() ;
         gxTv_SdtTTRM_N = (byte)(0) ;
         gxTv_SdtTTRM_Emprnom = sdt.getgxTv_SdtTTRM_Emprnom() ;
      }
      if ( sdt.IsDirty("TRMDivID") )
      {
         gxTv_SdtTTRM_N = (byte)(0) ;
         gxTv_SdtTTRM_Trmdivid = sdt.getgxTv_SdtTTRM_Trmdivid() ;
      }
      if ( sdt.IsDirty("TRMDivNom") )
      {
         gxTv_SdtTTRM_Trmdivnom_N = sdt.getgxTv_SdtTTRM_Trmdivnom_N() ;
         gxTv_SdtTTRM_N = (byte)(0) ;
         gxTv_SdtTTRM_Trmdivnom = sdt.getgxTv_SdtTTRM_Trmdivnom() ;
      }
      if ( sdt.IsDirty("TRMFecha") )
      {
         gxTv_SdtTTRM_N = (byte)(0) ;
         gxTv_SdtTTRM_Trmfecha = sdt.getgxTv_SdtTTRM_Trmfecha() ;
      }
      if ( sdt.IsDirty("TRMCompra") )
      {
         gxTv_SdtTTRM_N = (byte)(0) ;
         gxTv_SdtTTRM_Trmcompra = sdt.getgxTv_SdtTTRM_Trmcompra() ;
      }
      if ( sdt.IsDirty("TRMVenta") )
      {
         gxTv_SdtTTRM_N = (byte)(0) ;
         gxTv_SdtTTRM_Trmventa = sdt.getgxTv_SdtTTRM_Trmventa() ;
      }
      if ( sdt.IsDirty("TRMAutMan") )
      {
         gxTv_SdtTTRM_N = (byte)(0) ;
         gxTv_SdtTTRM_Trmautman = sdt.getgxTv_SdtTTRM_Trmautman() ;
      }
   }

   public String getgxTv_SdtTTRM_Emprcod( )
   {
      return gxTv_SdtTTRM_Emprcod ;
   }

   public void setgxTv_SdtTTRM_Emprcod( String value )
   {
      gxTv_SdtTTRM_N = (byte)(0) ;
      if ( GXutil.strcmp(gxTv_SdtTTRM_Emprcod, value) != 0 )
      {
         gxTv_SdtTTRM_Mode = "INS" ;
         this.setgxTv_SdtTTRM_Emprcod_Z_SetNull( );
         this.setgxTv_SdtTTRM_Emprnom_Z_SetNull( );
         this.setgxTv_SdtTTRM_Trmdivid_Z_SetNull( );
         this.setgxTv_SdtTTRM_Trmdivnom_Z_SetNull( );
         this.setgxTv_SdtTTRM_Trmfecha_Z_SetNull( );
         this.setgxTv_SdtTTRM_Trmcompra_Z_SetNull( );
         this.setgxTv_SdtTTRM_Trmventa_Z_SetNull( );
         this.setgxTv_SdtTTRM_Trmautman_Z_SetNull( );
      }
      SetDirty("Emprcod");
      gxTv_SdtTTRM_Emprcod = value ;
   }

   public String getgxTv_SdtTTRM_Emprnom( )
   {
      return gxTv_SdtTTRM_Emprnom ;
   }

   public void setgxTv_SdtTTRM_Emprnom( String value )
   {
      gxTv_SdtTTRM_Emprnom_N = (byte)(0) ;
      gxTv_SdtTTRM_N = (byte)(0) ;
      SetDirty("Emprnom");
      gxTv_SdtTTRM_Emprnom = value ;
   }

   public void setgxTv_SdtTTRM_Emprnom_SetNull( )
   {
      gxTv_SdtTTRM_Emprnom_N = (byte)(1) ;
      gxTv_SdtTTRM_Emprnom = "" ;
      SetDirty("Emprnom");
   }

   public boolean getgxTv_SdtTTRM_Emprnom_IsNull( )
   {
      return (gxTv_SdtTTRM_Emprnom_N==1) ;
   }

   public byte getgxTv_SdtTTRM_Trmdivid( )
   {
      return gxTv_SdtTTRM_Trmdivid ;
   }

   public void setgxTv_SdtTTRM_Trmdivid( byte value )
   {
      gxTv_SdtTTRM_N = (byte)(0) ;
      if ( gxTv_SdtTTRM_Trmdivid != value )
      {
         gxTv_SdtTTRM_Mode = "INS" ;
         this.setgxTv_SdtTTRM_Emprcod_Z_SetNull( );
         this.setgxTv_SdtTTRM_Emprnom_Z_SetNull( );
         this.setgxTv_SdtTTRM_Trmdivid_Z_SetNull( );
         this.setgxTv_SdtTTRM_Trmdivnom_Z_SetNull( );
         this.setgxTv_SdtTTRM_Trmfecha_Z_SetNull( );
         this.setgxTv_SdtTTRM_Trmcompra_Z_SetNull( );
         this.setgxTv_SdtTTRM_Trmventa_Z_SetNull( );
         this.setgxTv_SdtTTRM_Trmautman_Z_SetNull( );
      }
      SetDirty("Trmdivid");
      gxTv_SdtTTRM_Trmdivid = value ;
   }

   public String getgxTv_SdtTTRM_Trmdivnom( )
   {
      return gxTv_SdtTTRM_Trmdivnom ;
   }

   public void setgxTv_SdtTTRM_Trmdivnom( String value )
   {
      gxTv_SdtTTRM_Trmdivnom_N = (byte)(0) ;
      gxTv_SdtTTRM_N = (byte)(0) ;
      SetDirty("Trmdivnom");
      gxTv_SdtTTRM_Trmdivnom = value ;
   }

   public void setgxTv_SdtTTRM_Trmdivnom_SetNull( )
   {
      gxTv_SdtTTRM_Trmdivnom_N = (byte)(1) ;
      gxTv_SdtTTRM_Trmdivnom = "" ;
      SetDirty("Trmdivnom");
   }

   public boolean getgxTv_SdtTTRM_Trmdivnom_IsNull( )
   {
      return (gxTv_SdtTTRM_Trmdivnom_N==1) ;
   }

   public java.util.Date getgxTv_SdtTTRM_Trmfecha( )
   {
      return gxTv_SdtTTRM_Trmfecha ;
   }

   public void setgxTv_SdtTTRM_Trmfecha( java.util.Date value )
   {
      gxTv_SdtTTRM_N = (byte)(0) ;
      if ( !( GXutil.dateCompare(gxTv_SdtTTRM_Trmfecha, value) ) )
      {
         gxTv_SdtTTRM_Mode = "INS" ;
         this.setgxTv_SdtTTRM_Emprcod_Z_SetNull( );
         this.setgxTv_SdtTTRM_Emprnom_Z_SetNull( );
         this.setgxTv_SdtTTRM_Trmdivid_Z_SetNull( );
         this.setgxTv_SdtTTRM_Trmdivnom_Z_SetNull( );
         this.setgxTv_SdtTTRM_Trmfecha_Z_SetNull( );
         this.setgxTv_SdtTTRM_Trmcompra_Z_SetNull( );
         this.setgxTv_SdtTTRM_Trmventa_Z_SetNull( );
         this.setgxTv_SdtTTRM_Trmautman_Z_SetNull( );
      }
      SetDirty("Trmfecha");
      gxTv_SdtTTRM_Trmfecha = value ;
   }

   public java.math.BigDecimal getgxTv_SdtTTRM_Trmcompra( )
   {
      return gxTv_SdtTTRM_Trmcompra ;
   }

   public void setgxTv_SdtTTRM_Trmcompra( java.math.BigDecimal value )
   {
      gxTv_SdtTTRM_N = (byte)(0) ;
      SetDirty("Trmcompra");
      gxTv_SdtTTRM_Trmcompra = value ;
   }

   public java.math.BigDecimal getgxTv_SdtTTRM_Trmventa( )
   {
      return gxTv_SdtTTRM_Trmventa ;
   }

   public void setgxTv_SdtTTRM_Trmventa( java.math.BigDecimal value )
   {
      gxTv_SdtTTRM_N = (byte)(0) ;
      SetDirty("Trmventa");
      gxTv_SdtTTRM_Trmventa = value ;
   }

   public String getgxTv_SdtTTRM_Trmautman( )
   {
      return gxTv_SdtTTRM_Trmautman ;
   }

   public void setgxTv_SdtTTRM_Trmautman( String value )
   {
      gxTv_SdtTTRM_N = (byte)(0) ;
      SetDirty("Trmautman");
      gxTv_SdtTTRM_Trmautman = value ;
   }

   public String getgxTv_SdtTTRM_Mode( )
   {
      return gxTv_SdtTTRM_Mode ;
   }

   public void setgxTv_SdtTTRM_Mode( String value )
   {
      gxTv_SdtTTRM_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtTTRM_Mode = value ;
   }

   public void setgxTv_SdtTTRM_Mode_SetNull( )
   {
      gxTv_SdtTTRM_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtTTRM_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTTRM_Initialized( )
   {
      return gxTv_SdtTTRM_Initialized ;
   }

   public void setgxTv_SdtTTRM_Initialized( short value )
   {
      gxTv_SdtTTRM_N = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_SdtTTRM_Initialized = value ;
   }

   public void setgxTv_SdtTTRM_Initialized_SetNull( )
   {
      gxTv_SdtTTRM_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtTTRM_Initialized_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTRM_Emprcod_Z( )
   {
      return gxTv_SdtTTRM_Emprcod_Z ;
   }

   public void setgxTv_SdtTTRM_Emprcod_Z( String value )
   {
      gxTv_SdtTTRM_N = (byte)(0) ;
      SetDirty("Emprcod_Z");
      gxTv_SdtTTRM_Emprcod_Z = value ;
   }

   public void setgxTv_SdtTTRM_Emprcod_Z_SetNull( )
   {
      gxTv_SdtTTRM_Emprcod_Z = "" ;
      SetDirty("Emprcod_Z");
   }

   public boolean getgxTv_SdtTTRM_Emprcod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTRM_Emprnom_Z( )
   {
      return gxTv_SdtTTRM_Emprnom_Z ;
   }

   public void setgxTv_SdtTTRM_Emprnom_Z( String value )
   {
      gxTv_SdtTTRM_N = (byte)(0) ;
      SetDirty("Emprnom_Z");
      gxTv_SdtTTRM_Emprnom_Z = value ;
   }

   public void setgxTv_SdtTTRM_Emprnom_Z_SetNull( )
   {
      gxTv_SdtTTRM_Emprnom_Z = "" ;
      SetDirty("Emprnom_Z");
   }

   public boolean getgxTv_SdtTTRM_Emprnom_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTRM_Trmdivid_Z( )
   {
      return gxTv_SdtTTRM_Trmdivid_Z ;
   }

   public void setgxTv_SdtTTRM_Trmdivid_Z( byte value )
   {
      gxTv_SdtTTRM_N = (byte)(0) ;
      SetDirty("Trmdivid_Z");
      gxTv_SdtTTRM_Trmdivid_Z = value ;
   }

   public void setgxTv_SdtTTRM_Trmdivid_Z_SetNull( )
   {
      gxTv_SdtTTRM_Trmdivid_Z = (byte)(0) ;
      SetDirty("Trmdivid_Z");
   }

   public boolean getgxTv_SdtTTRM_Trmdivid_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTRM_Trmdivnom_Z( )
   {
      return gxTv_SdtTTRM_Trmdivnom_Z ;
   }

   public void setgxTv_SdtTTRM_Trmdivnom_Z( String value )
   {
      gxTv_SdtTTRM_N = (byte)(0) ;
      SetDirty("Trmdivnom_Z");
      gxTv_SdtTTRM_Trmdivnom_Z = value ;
   }

   public void setgxTv_SdtTTRM_Trmdivnom_Z_SetNull( )
   {
      gxTv_SdtTTRM_Trmdivnom_Z = "" ;
      SetDirty("Trmdivnom_Z");
   }

   public boolean getgxTv_SdtTTRM_Trmdivnom_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTTRM_Trmfecha_Z( )
   {
      return gxTv_SdtTTRM_Trmfecha_Z ;
   }

   public void setgxTv_SdtTTRM_Trmfecha_Z( java.util.Date value )
   {
      gxTv_SdtTTRM_N = (byte)(0) ;
      SetDirty("Trmfecha_Z");
      gxTv_SdtTTRM_Trmfecha_Z = value ;
   }

   public void setgxTv_SdtTTRM_Trmfecha_Z_SetNull( )
   {
      gxTv_SdtTTRM_Trmfecha_Z = GXutil.resetTime( GXutil.nullDate() );
      SetDirty("Trmfecha_Z");
   }

   public boolean getgxTv_SdtTTRM_Trmfecha_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTTRM_Trmcompra_Z( )
   {
      return gxTv_SdtTTRM_Trmcompra_Z ;
   }

   public void setgxTv_SdtTTRM_Trmcompra_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTTRM_N = (byte)(0) ;
      SetDirty("Trmcompra_Z");
      gxTv_SdtTTRM_Trmcompra_Z = value ;
   }

   public void setgxTv_SdtTTRM_Trmcompra_Z_SetNull( )
   {
      gxTv_SdtTTRM_Trmcompra_Z = DecimalUtil.ZERO ;
      SetDirty("Trmcompra_Z");
   }

   public boolean getgxTv_SdtTTRM_Trmcompra_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTTRM_Trmventa_Z( )
   {
      return gxTv_SdtTTRM_Trmventa_Z ;
   }

   public void setgxTv_SdtTTRM_Trmventa_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTTRM_N = (byte)(0) ;
      SetDirty("Trmventa_Z");
      gxTv_SdtTTRM_Trmventa_Z = value ;
   }

   public void setgxTv_SdtTTRM_Trmventa_Z_SetNull( )
   {
      gxTv_SdtTTRM_Trmventa_Z = DecimalUtil.ZERO ;
      SetDirty("Trmventa_Z");
   }

   public boolean getgxTv_SdtTTRM_Trmventa_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTTRM_Trmautman_Z( )
   {
      return gxTv_SdtTTRM_Trmautman_Z ;
   }

   public void setgxTv_SdtTTRM_Trmautman_Z( String value )
   {
      gxTv_SdtTTRM_N = (byte)(0) ;
      SetDirty("Trmautman_Z");
      gxTv_SdtTTRM_Trmautman_Z = value ;
   }

   public void setgxTv_SdtTTRM_Trmautman_Z_SetNull( )
   {
      gxTv_SdtTTRM_Trmautman_Z = "" ;
      SetDirty("Trmautman_Z");
   }

   public boolean getgxTv_SdtTTRM_Trmautman_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTRM_Emprnom_N( )
   {
      return gxTv_SdtTTRM_Emprnom_N ;
   }

   public void setgxTv_SdtTTRM_Emprnom_N( byte value )
   {
      gxTv_SdtTTRM_N = (byte)(0) ;
      SetDirty("Emprnom_N");
      gxTv_SdtTTRM_Emprnom_N = value ;
   }

   public void setgxTv_SdtTTRM_Emprnom_N_SetNull( )
   {
      gxTv_SdtTTRM_Emprnom_N = (byte)(0) ;
      SetDirty("Emprnom_N");
   }

   public boolean getgxTv_SdtTTRM_Emprnom_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTTRM_Trmdivnom_N( )
   {
      return gxTv_SdtTTRM_Trmdivnom_N ;
   }

   public void setgxTv_SdtTTRM_Trmdivnom_N( byte value )
   {
      gxTv_SdtTTRM_N = (byte)(0) ;
      SetDirty("Trmdivnom_N");
      gxTv_SdtTTRM_Trmdivnom_N = value ;
   }

   public void setgxTv_SdtTTRM_Trmdivnom_N_SetNull( )
   {
      gxTv_SdtTTRM_Trmdivnom_N = (byte)(0) ;
      SetDirty("Trmdivnom_N");
   }

   public boolean getgxTv_SdtTTRM_Trmdivnom_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      app.ficherosbasicos.ttrm_bc obj;
      obj = new app.ficherosbasicos.ttrm_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTTRM_Emprcod = "" ;
      gxTv_SdtTTRM_N = (byte)(1) ;
      gxTv_SdtTTRM_Emprnom = "" ;
      gxTv_SdtTTRM_Trmdivnom = "" ;
      gxTv_SdtTTRM_Trmfecha = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTTRM_Trmcompra = DecimalUtil.ZERO ;
      gxTv_SdtTTRM_Trmventa = DecimalUtil.ZERO ;
      gxTv_SdtTTRM_Trmautman = "" ;
      gxTv_SdtTTRM_Mode = "" ;
      gxTv_SdtTTRM_Emprcod_Z = "" ;
      gxTv_SdtTTRM_Emprnom_Z = "" ;
      gxTv_SdtTTRM_Trmdivnom_Z = "" ;
      gxTv_SdtTTRM_Trmfecha_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTTRM_Trmcompra_Z = DecimalUtil.ZERO ;
      gxTv_SdtTTRM_Trmventa_Z = DecimalUtil.ZERO ;
      gxTv_SdtTTRM_Trmautman_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtTTRM_N ;
   }

   public app.ficherosbasicos.SdtTTRM Clone( )
   {
      app.ficherosbasicos.SdtTTRM sdt;
      app.ficherosbasicos.ttrm_bc obj;
      sdt = (app.ficherosbasicos.SdtTTRM)(clone()) ;
      obj = (app.ficherosbasicos.ttrm_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( app.ficherosbasicos.StructSdtTTRM struct )
   {
      setgxTv_SdtTTRM_Emprcod(struct.getEmprcod());
      setgxTv_SdtTTRM_Emprnom(struct.getEmprnom());
      setgxTv_SdtTTRM_Trmdivid(struct.getTrmdivid());
      setgxTv_SdtTTRM_Trmdivnom(struct.getTrmdivnom());
      setgxTv_SdtTTRM_Trmfecha(struct.getTrmfecha());
      setgxTv_SdtTTRM_Trmcompra(struct.getTrmcompra());
      setgxTv_SdtTTRM_Trmventa(struct.getTrmventa());
      setgxTv_SdtTTRM_Trmautman(struct.getTrmautman());
      setgxTv_SdtTTRM_Mode(struct.getMode());
      setgxTv_SdtTTRM_Initialized(struct.getInitialized());
      setgxTv_SdtTTRM_Emprcod_Z(struct.getEmprcod_Z());
      setgxTv_SdtTTRM_Emprnom_Z(struct.getEmprnom_Z());
      setgxTv_SdtTTRM_Trmdivid_Z(struct.getTrmdivid_Z());
      setgxTv_SdtTTRM_Trmdivnom_Z(struct.getTrmdivnom_Z());
      setgxTv_SdtTTRM_Trmfecha_Z(struct.getTrmfecha_Z());
      setgxTv_SdtTTRM_Trmcompra_Z(struct.getTrmcompra_Z());
      setgxTv_SdtTTRM_Trmventa_Z(struct.getTrmventa_Z());
      setgxTv_SdtTTRM_Trmautman_Z(struct.getTrmautman_Z());
      setgxTv_SdtTTRM_Emprnom_N(struct.getEmprnom_N());
      setgxTv_SdtTTRM_Trmdivnom_N(struct.getTrmdivnom_N());
   }

   @SuppressWarnings("unchecked")
   public app.ficherosbasicos.StructSdtTTRM getStruct( )
   {
      app.ficherosbasicos.StructSdtTTRM struct = new app.ficherosbasicos.StructSdtTTRM ();
      struct.setEmprcod(getgxTv_SdtTTRM_Emprcod());
      struct.setEmprnom(getgxTv_SdtTTRM_Emprnom());
      struct.setTrmdivid(getgxTv_SdtTTRM_Trmdivid());
      struct.setTrmdivnom(getgxTv_SdtTTRM_Trmdivnom());
      struct.setTrmfecha(getgxTv_SdtTTRM_Trmfecha());
      struct.setTrmcompra(getgxTv_SdtTTRM_Trmcompra());
      struct.setTrmventa(getgxTv_SdtTTRM_Trmventa());
      struct.setTrmautman(getgxTv_SdtTTRM_Trmautman());
      struct.setMode(getgxTv_SdtTTRM_Mode());
      struct.setInitialized(getgxTv_SdtTTRM_Initialized());
      struct.setEmprcod_Z(getgxTv_SdtTTRM_Emprcod_Z());
      struct.setEmprnom_Z(getgxTv_SdtTTRM_Emprnom_Z());
      struct.setTrmdivid_Z(getgxTv_SdtTTRM_Trmdivid_Z());
      struct.setTrmdivnom_Z(getgxTv_SdtTTRM_Trmdivnom_Z());
      struct.setTrmfecha_Z(getgxTv_SdtTTRM_Trmfecha_Z());
      struct.setTrmcompra_Z(getgxTv_SdtTTRM_Trmcompra_Z());
      struct.setTrmventa_Z(getgxTv_SdtTTRM_Trmventa_Z());
      struct.setTrmautman_Z(getgxTv_SdtTTRM_Trmautman_Z());
      struct.setEmprnom_N(getgxTv_SdtTTRM_Emprnom_N());
      struct.setTrmdivnom_N(getgxTv_SdtTTRM_Trmdivnom_N());
      return struct ;
   }

   private byte gxTv_SdtTTRM_N ;
   private byte gxTv_SdtTTRM_Trmdivid ;
   private byte gxTv_SdtTTRM_Trmdivid_Z ;
   private byte gxTv_SdtTTRM_Emprnom_N ;
   private byte gxTv_SdtTTRM_Trmdivnom_N ;
   private short gxTv_SdtTTRM_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private java.math.BigDecimal gxTv_SdtTTRM_Trmcompra ;
   private java.math.BigDecimal gxTv_SdtTTRM_Trmventa ;
   private java.math.BigDecimal gxTv_SdtTTRM_Trmcompra_Z ;
   private java.math.BigDecimal gxTv_SdtTTRM_Trmventa_Z ;
   private String gxTv_SdtTTRM_Emprcod ;
   private String gxTv_SdtTTRM_Emprnom ;
   private String gxTv_SdtTTRM_Trmdivnom ;
   private String gxTv_SdtTTRM_Trmautman ;
   private String gxTv_SdtTTRM_Mode ;
   private String gxTv_SdtTTRM_Emprcod_Z ;
   private String gxTv_SdtTTRM_Emprnom_Z ;
   private String gxTv_SdtTTRM_Trmdivnom_Z ;
   private String gxTv_SdtTTRM_Trmautman_Z ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtTTRM_Trmfecha ;
   private java.util.Date gxTv_SdtTTRM_Trmfecha_Z ;
   private java.util.Date datetime_STZ ;
   private boolean readElement ;
   private boolean formatError ;
}

