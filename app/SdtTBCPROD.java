package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTBCPROD extends GxSilentTrnSdt
{
   public SdtTBCPROD( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTBCPROD.class));
   }

   public SdtTBCPROD( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle, context, "SdtTBCPROD");
      initialize( remoteHandle) ;
   }

   public SdtTBCPROD( int remoteHandle ,
                      StructSdtTBCPROD struct )
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
                     String AV13478BCProducto )
   {
      IGxSilentTrn obj;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {AV396EmprCod,AV13478BCProducto});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"EmprCod", String.class}, new Object[]{"BCProducto", String.class}}) ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties();
      metadata.set("Name", "TBCPROD");
      metadata.set("BT", "PRODUCTO");
      metadata.set("PK", "[ \"BCProducto\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"EmprCod\" ],\"FKMap\":[  ] } ]");
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
               gxTv_SdtTBCPROD_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom") )
            {
               gxTv_SdtTBCPROD_Emprnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BCProducto") )
            {
               gxTv_SdtTBCPROD_Bcproducto = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BCDescripcion") )
            {
               gxTv_SdtTBCPROD_Bcdescripcion = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BCPrecio") )
            {
               gxTv_SdtTBCPROD_Bcprecio = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BCUndComp") )
            {
               gxTv_SdtTBCPROD_Bcundcomp = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BCProveedor") )
            {
               gxTv_SdtTBCPROD_Bcproveedor = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BCProcesado") )
            {
               gxTv_SdtTBCPROD_Bcprocesado = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BCError") )
            {
               gxTv_SdtTBCPROD_Bcerror = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BCDescError") )
            {
               gxTv_SdtTBCPROD_Bcdescerror = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BCFechError") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBCPROD_Bcfecherror = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBCPROD_Bcfecherror = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BCPilaError") )
            {
               gxTv_SdtTBCPROD_Bcpilaerror = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTBCPROD_Mode = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTBCPROD_Initialized = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod_Z") )
            {
               gxTv_SdtTBCPROD_Emprcod_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom_Z") )
            {
               gxTv_SdtTBCPROD_Emprnom_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BCProducto_Z") )
            {
               gxTv_SdtTBCPROD_Bcproducto_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BCDescripcion_Z") )
            {
               gxTv_SdtTBCPROD_Bcdescripcion_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BCPrecio_Z") )
            {
               gxTv_SdtTBCPROD_Bcprecio_Z = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BCUndComp_Z") )
            {
               gxTv_SdtTBCPROD_Bcundcomp_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BCProveedor_Z") )
            {
               gxTv_SdtTBCPROD_Bcproveedor_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BCProcesado_Z") )
            {
               gxTv_SdtTBCPROD_Bcprocesado_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BCError_Z") )
            {
               gxTv_SdtTBCPROD_Bcerror_Z = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BCDescError_Z") )
            {
               gxTv_SdtTBCPROD_Bcdescerror_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BCFechError_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBCPROD_Bcfecherror_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBCPROD_Bcfecherror_Z = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BCPilaError_Z") )
            {
               gxTv_SdtTBCPROD_Bcpilaerror_Z = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom_N") )
            {
               gxTv_SdtTBCPROD_Emprnom_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BCProducto_N") )
            {
               gxTv_SdtTBCPROD_Bcproducto_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BCDescripcion_N") )
            {
               gxTv_SdtTBCPROD_Bcdescripcion_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BCPrecio_N") )
            {
               gxTv_SdtTBCPROD_Bcprecio_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BCUndComp_N") )
            {
               gxTv_SdtTBCPROD_Bcundcomp_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BCProveedor_N") )
            {
               gxTv_SdtTBCPROD_Bcproveedor_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BCProcesado_N") )
            {
               gxTv_SdtTBCPROD_Bcprocesado_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BCError_N") )
            {
               gxTv_SdtTBCPROD_Bcerror_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BCDescError_N") )
            {
               gxTv_SdtTBCPROD_Bcdescerror_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BCFechError_N") )
            {
               gxTv_SdtTBCPROD_Bcfecherror_N = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BCPilaError_N") )
            {
               gxTv_SdtTBCPROD_Bcpilaerror_N = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "TBCPROD" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtTBCPROD_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EmprNom", gxTv_SdtTBCPROD_Emprnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BCProducto", gxTv_SdtTBCPROD_Bcproducto);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BCDescripcion", gxTv_SdtTBCPROD_Bcdescripcion);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BCPrecio", GXutil.trim( GXutil.strNoRound( gxTv_SdtTBCPROD_Bcprecio, 13, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BCUndComp", GXutil.trim( GXutil.str( gxTv_SdtTBCPROD_Bcundcomp, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BCProveedor", gxTv_SdtTBCPROD_Bcproveedor);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BCProcesado", GXutil.trim( GXutil.str( gxTv_SdtTBCPROD_Bcprocesado, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BCError", GXutil.trim( GXutil.str( gxTv_SdtTBCPROD_Bcerror, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BCDescError", gxTv_SdtTBCPROD_Bcdescerror);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBCPROD_Bcfecherror), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBCPROD_Bcfecherror), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBCPROD_Bcfecherror), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBCPROD_Bcfecherror), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBCPROD_Bcfecherror), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBCPROD_Bcfecherror), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      oWriter.writeElement("BCFechError", sDateCnv);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BCPilaError", gxTv_SdtTBCPROD_Bcpilaerror);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", gxTv_SdtTBCPROD_Mode);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTBCPROD_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprCod_Z", gxTv_SdtTBCPROD_Emprcod_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprNom_Z", gxTv_SdtTBCPROD_Emprnom_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("BCProducto_Z", gxTv_SdtTBCPROD_Bcproducto_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("BCDescripcion_Z", gxTv_SdtTBCPROD_Bcdescripcion_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("BCPrecio_Z", GXutil.trim( GXutil.strNoRound( gxTv_SdtTBCPROD_Bcprecio_Z, 13, 5)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("BCUndComp_Z", GXutil.trim( GXutil.str( gxTv_SdtTBCPROD_Bcundcomp_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("BCProveedor_Z", gxTv_SdtTBCPROD_Bcproveedor_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("BCProcesado_Z", GXutil.trim( GXutil.str( gxTv_SdtTBCPROD_Bcprocesado_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("BCError_Z", GXutil.trim( GXutil.str( gxTv_SdtTBCPROD_Bcerror_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("BCDescError_Z", gxTv_SdtTBCPROD_Bcdescerror_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBCPROD_Bcfecherror_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBCPROD_Bcfecherror_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBCPROD_Bcfecherror_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBCPROD_Bcfecherror_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBCPROD_Bcfecherror_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBCPROD_Bcfecherror_Z), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("BCFechError_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("BCPilaError_Z", gxTv_SdtTBCPROD_Bcpilaerror_Z);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("EmprNom_N", GXutil.trim( GXutil.str( gxTv_SdtTBCPROD_Emprnom_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("BCProducto_N", GXutil.trim( GXutil.str( gxTv_SdtTBCPROD_Bcproducto_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("BCDescripcion_N", GXutil.trim( GXutil.str( gxTv_SdtTBCPROD_Bcdescripcion_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("BCPrecio_N", GXutil.trim( GXutil.str( gxTv_SdtTBCPROD_Bcprecio_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("BCUndComp_N", GXutil.trim( GXutil.str( gxTv_SdtTBCPROD_Bcundcomp_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("BCProveedor_N", GXutil.trim( GXutil.str( gxTv_SdtTBCPROD_Bcproveedor_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("BCProcesado_N", GXutil.trim( GXutil.str( gxTv_SdtTBCPROD_Bcprocesado_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("BCError_N", GXutil.trim( GXutil.str( gxTv_SdtTBCPROD_Bcerror_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("BCDescError_N", GXutil.trim( GXutil.str( gxTv_SdtTBCPROD_Bcdescerror_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("BCFechError_N", GXutil.trim( GXutil.str( gxTv_SdtTBCPROD_Bcfecherror_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
         oWriter.writeElement("BCPilaError_N", GXutil.trim( GXutil.str( gxTv_SdtTBCPROD_Bcpilaerror_N, 1, 0)));
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
      AddObjectProperty("EmprCod", gxTv_SdtTBCPROD_Emprcod, false, includeNonInitialized);
      AddObjectProperty("EmprNom", gxTv_SdtTBCPROD_Emprnom, false, includeNonInitialized);
      AddObjectProperty("EmprNom_N", gxTv_SdtTBCPROD_Emprnom_N, false, includeNonInitialized);
      AddObjectProperty("BCProducto", gxTv_SdtTBCPROD_Bcproducto, false, includeNonInitialized);
      AddObjectProperty("BCProducto_N", gxTv_SdtTBCPROD_Bcproducto_N, false, includeNonInitialized);
      AddObjectProperty("BCDescripcion", gxTv_SdtTBCPROD_Bcdescripcion, false, includeNonInitialized);
      AddObjectProperty("BCDescripcion_N", gxTv_SdtTBCPROD_Bcdescripcion_N, false, includeNonInitialized);
      AddObjectProperty("BCPrecio", gxTv_SdtTBCPROD_Bcprecio, false, includeNonInitialized);
      AddObjectProperty("BCPrecio_N", gxTv_SdtTBCPROD_Bcprecio_N, false, includeNonInitialized);
      AddObjectProperty("BCUndComp", gxTv_SdtTBCPROD_Bcundcomp, false, includeNonInitialized);
      AddObjectProperty("BCUndComp_N", gxTv_SdtTBCPROD_Bcundcomp_N, false, includeNonInitialized);
      AddObjectProperty("BCProveedor", gxTv_SdtTBCPROD_Bcproveedor, false, includeNonInitialized);
      AddObjectProperty("BCProveedor_N", gxTv_SdtTBCPROD_Bcproveedor_N, false, includeNonInitialized);
      AddObjectProperty("BCProcesado", gxTv_SdtTBCPROD_Bcprocesado, false, includeNonInitialized);
      AddObjectProperty("BCProcesado_N", gxTv_SdtTBCPROD_Bcprocesado_N, false, includeNonInitialized);
      AddObjectProperty("BCError", gxTv_SdtTBCPROD_Bcerror, false, includeNonInitialized);
      AddObjectProperty("BCError_N", gxTv_SdtTBCPROD_Bcerror_N, false, includeNonInitialized);
      AddObjectProperty("BCDescError", gxTv_SdtTBCPROD_Bcdescerror, false, includeNonInitialized);
      AddObjectProperty("BCDescError_N", gxTv_SdtTBCPROD_Bcdescerror_N, false, includeNonInitialized);
      datetime_STZ = gxTv_SdtTBCPROD_Bcfecherror ;
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
      AddObjectProperty("BCFechError", sDateCnv, false, includeNonInitialized);
      AddObjectProperty("BCFechError_N", gxTv_SdtTBCPROD_Bcfecherror_N, false, includeNonInitialized);
      AddObjectProperty("BCPilaError", gxTv_SdtTBCPROD_Bcpilaerror, false, includeNonInitialized);
      AddObjectProperty("BCPilaError_N", gxTv_SdtTBCPROD_Bcpilaerror_N, false, includeNonInitialized);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtTBCPROD_Mode, false, includeNonInitialized);
         AddObjectProperty("Initialized", gxTv_SdtTBCPROD_Initialized, false, includeNonInitialized);
         AddObjectProperty("EmprCod_Z", gxTv_SdtTBCPROD_Emprcod_Z, false, includeNonInitialized);
         AddObjectProperty("EmprNom_Z", gxTv_SdtTBCPROD_Emprnom_Z, false, includeNonInitialized);
         AddObjectProperty("BCProducto_Z", gxTv_SdtTBCPROD_Bcproducto_Z, false, includeNonInitialized);
         AddObjectProperty("BCDescripcion_Z", gxTv_SdtTBCPROD_Bcdescripcion_Z, false, includeNonInitialized);
         AddObjectProperty("BCPrecio_Z", gxTv_SdtTBCPROD_Bcprecio_Z, false, includeNonInitialized);
         AddObjectProperty("BCUndComp_Z", gxTv_SdtTBCPROD_Bcundcomp_Z, false, includeNonInitialized);
         AddObjectProperty("BCProveedor_Z", gxTv_SdtTBCPROD_Bcproveedor_Z, false, includeNonInitialized);
         AddObjectProperty("BCProcesado_Z", gxTv_SdtTBCPROD_Bcprocesado_Z, false, includeNonInitialized);
         AddObjectProperty("BCError_Z", gxTv_SdtTBCPROD_Bcerror_Z, false, includeNonInitialized);
         AddObjectProperty("BCDescError_Z", gxTv_SdtTBCPROD_Bcdescerror_Z, false, includeNonInitialized);
         datetime_STZ = gxTv_SdtTBCPROD_Bcfecherror_Z ;
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
         AddObjectProperty("BCFechError_Z", sDateCnv, false, includeNonInitialized);
         AddObjectProperty("BCPilaError_Z", gxTv_SdtTBCPROD_Bcpilaerror_Z, false, includeNonInitialized);
         AddObjectProperty("EmprNom_N", gxTv_SdtTBCPROD_Emprnom_N, false, includeNonInitialized);
         AddObjectProperty("BCProducto_N", gxTv_SdtTBCPROD_Bcproducto_N, false, includeNonInitialized);
         AddObjectProperty("BCDescripcion_N", gxTv_SdtTBCPROD_Bcdescripcion_N, false, includeNonInitialized);
         AddObjectProperty("BCPrecio_N", gxTv_SdtTBCPROD_Bcprecio_N, false, includeNonInitialized);
         AddObjectProperty("BCUndComp_N", gxTv_SdtTBCPROD_Bcundcomp_N, false, includeNonInitialized);
         AddObjectProperty("BCProveedor_N", gxTv_SdtTBCPROD_Bcproveedor_N, false, includeNonInitialized);
         AddObjectProperty("BCProcesado_N", gxTv_SdtTBCPROD_Bcprocesado_N, false, includeNonInitialized);
         AddObjectProperty("BCError_N", gxTv_SdtTBCPROD_Bcerror_N, false, includeNonInitialized);
         AddObjectProperty("BCDescError_N", gxTv_SdtTBCPROD_Bcdescerror_N, false, includeNonInitialized);
         AddObjectProperty("BCFechError_N", gxTv_SdtTBCPROD_Bcfecherror_N, false, includeNonInitialized);
         AddObjectProperty("BCPilaError_N", gxTv_SdtTBCPROD_Bcpilaerror_N, false, includeNonInitialized);
      }
   }

   public void updateDirties( app.SdtTBCPROD sdt )
   {
      if ( sdt.IsDirty("EmprCod") )
      {
         gxTv_SdtTBCPROD_N = (byte)(0) ;
         gxTv_SdtTBCPROD_Emprcod = sdt.getgxTv_SdtTBCPROD_Emprcod() ;
      }
      if ( sdt.IsDirty("EmprNom") )
      {
         gxTv_SdtTBCPROD_Emprnom_N = sdt.getgxTv_SdtTBCPROD_Emprnom_N() ;
         gxTv_SdtTBCPROD_N = (byte)(0) ;
         gxTv_SdtTBCPROD_Emprnom = sdt.getgxTv_SdtTBCPROD_Emprnom() ;
      }
      if ( sdt.IsDirty("BCProducto") )
      {
         gxTv_SdtTBCPROD_N = (byte)(0) ;
         gxTv_SdtTBCPROD_Bcproducto = sdt.getgxTv_SdtTBCPROD_Bcproducto() ;
      }
      if ( sdt.IsDirty("BCDescripcion") )
      {
         gxTv_SdtTBCPROD_Bcdescripcion_N = sdt.getgxTv_SdtTBCPROD_Bcdescripcion_N() ;
         gxTv_SdtTBCPROD_N = (byte)(0) ;
         gxTv_SdtTBCPROD_Bcdescripcion = sdt.getgxTv_SdtTBCPROD_Bcdescripcion() ;
      }
      if ( sdt.IsDirty("BCPrecio") )
      {
         gxTv_SdtTBCPROD_Bcprecio_N = sdt.getgxTv_SdtTBCPROD_Bcprecio_N() ;
         gxTv_SdtTBCPROD_N = (byte)(0) ;
         gxTv_SdtTBCPROD_Bcprecio = sdt.getgxTv_SdtTBCPROD_Bcprecio() ;
      }
      if ( sdt.IsDirty("BCUndComp") )
      {
         gxTv_SdtTBCPROD_Bcundcomp_N = sdt.getgxTv_SdtTBCPROD_Bcundcomp_N() ;
         gxTv_SdtTBCPROD_N = (byte)(0) ;
         gxTv_SdtTBCPROD_Bcundcomp = sdt.getgxTv_SdtTBCPROD_Bcundcomp() ;
      }
      if ( sdt.IsDirty("BCProveedor") )
      {
         gxTv_SdtTBCPROD_Bcproveedor_N = sdt.getgxTv_SdtTBCPROD_Bcproveedor_N() ;
         gxTv_SdtTBCPROD_N = (byte)(0) ;
         gxTv_SdtTBCPROD_Bcproveedor = sdt.getgxTv_SdtTBCPROD_Bcproveedor() ;
      }
      if ( sdt.IsDirty("BCProcesado") )
      {
         gxTv_SdtTBCPROD_Bcprocesado_N = sdt.getgxTv_SdtTBCPROD_Bcprocesado_N() ;
         gxTv_SdtTBCPROD_N = (byte)(0) ;
         gxTv_SdtTBCPROD_Bcprocesado = sdt.getgxTv_SdtTBCPROD_Bcprocesado() ;
      }
      if ( sdt.IsDirty("BCError") )
      {
         gxTv_SdtTBCPROD_Bcerror_N = sdt.getgxTv_SdtTBCPROD_Bcerror_N() ;
         gxTv_SdtTBCPROD_N = (byte)(0) ;
         gxTv_SdtTBCPROD_Bcerror = sdt.getgxTv_SdtTBCPROD_Bcerror() ;
      }
      if ( sdt.IsDirty("BCDescError") )
      {
         gxTv_SdtTBCPROD_Bcdescerror_N = sdt.getgxTv_SdtTBCPROD_Bcdescerror_N() ;
         gxTv_SdtTBCPROD_N = (byte)(0) ;
         gxTv_SdtTBCPROD_Bcdescerror = sdt.getgxTv_SdtTBCPROD_Bcdescerror() ;
      }
      if ( sdt.IsDirty("BCFechError") )
      {
         gxTv_SdtTBCPROD_Bcfecherror_N = sdt.getgxTv_SdtTBCPROD_Bcfecherror_N() ;
         gxTv_SdtTBCPROD_N = (byte)(0) ;
         gxTv_SdtTBCPROD_Bcfecherror = sdt.getgxTv_SdtTBCPROD_Bcfecherror() ;
      }
      if ( sdt.IsDirty("BCPilaError") )
      {
         gxTv_SdtTBCPROD_Bcpilaerror_N = sdt.getgxTv_SdtTBCPROD_Bcpilaerror_N() ;
         gxTv_SdtTBCPROD_N = (byte)(0) ;
         gxTv_SdtTBCPROD_Bcpilaerror = sdt.getgxTv_SdtTBCPROD_Bcpilaerror() ;
      }
   }

   public String getgxTv_SdtTBCPROD_Emprcod( )
   {
      return gxTv_SdtTBCPROD_Emprcod ;
   }

   public void setgxTv_SdtTBCPROD_Emprcod( String value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      if ( GXutil.strcmp(gxTv_SdtTBCPROD_Emprcod, value) != 0 )
      {
         gxTv_SdtTBCPROD_Mode = "INS" ;
         this.setgxTv_SdtTBCPROD_Emprcod_Z_SetNull( );
         this.setgxTv_SdtTBCPROD_Emprnom_Z_SetNull( );
         this.setgxTv_SdtTBCPROD_Bcproducto_Z_SetNull( );
         this.setgxTv_SdtTBCPROD_Bcdescripcion_Z_SetNull( );
         this.setgxTv_SdtTBCPROD_Bcprecio_Z_SetNull( );
         this.setgxTv_SdtTBCPROD_Bcundcomp_Z_SetNull( );
         this.setgxTv_SdtTBCPROD_Bcproveedor_Z_SetNull( );
         this.setgxTv_SdtTBCPROD_Bcprocesado_Z_SetNull( );
         this.setgxTv_SdtTBCPROD_Bcerror_Z_SetNull( );
         this.setgxTv_SdtTBCPROD_Bcdescerror_Z_SetNull( );
         this.setgxTv_SdtTBCPROD_Bcfecherror_Z_SetNull( );
         this.setgxTv_SdtTBCPROD_Bcpilaerror_Z_SetNull( );
      }
      SetDirty("Emprcod");
      gxTv_SdtTBCPROD_Emprcod = value ;
   }

   public String getgxTv_SdtTBCPROD_Emprnom( )
   {
      return gxTv_SdtTBCPROD_Emprnom ;
   }

   public void setgxTv_SdtTBCPROD_Emprnom( String value )
   {
      gxTv_SdtTBCPROD_Emprnom_N = (byte)(0) ;
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      SetDirty("Emprnom");
      gxTv_SdtTBCPROD_Emprnom = value ;
   }

   public void setgxTv_SdtTBCPROD_Emprnom_SetNull( )
   {
      gxTv_SdtTBCPROD_Emprnom_N = (byte)(1) ;
      gxTv_SdtTBCPROD_Emprnom = "" ;
      SetDirty("Emprnom");
   }

   public boolean getgxTv_SdtTBCPROD_Emprnom_IsNull( )
   {
      return (gxTv_SdtTBCPROD_Emprnom_N==1) ;
   }

   public String getgxTv_SdtTBCPROD_Bcproducto( )
   {
      return gxTv_SdtTBCPROD_Bcproducto ;
   }

   public void setgxTv_SdtTBCPROD_Bcproducto( String value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      if ( GXutil.strcmp(gxTv_SdtTBCPROD_Bcproducto, value) != 0 )
      {
         gxTv_SdtTBCPROD_Mode = "INS" ;
         this.setgxTv_SdtTBCPROD_Emprcod_Z_SetNull( );
         this.setgxTv_SdtTBCPROD_Emprnom_Z_SetNull( );
         this.setgxTv_SdtTBCPROD_Bcproducto_Z_SetNull( );
         this.setgxTv_SdtTBCPROD_Bcdescripcion_Z_SetNull( );
         this.setgxTv_SdtTBCPROD_Bcprecio_Z_SetNull( );
         this.setgxTv_SdtTBCPROD_Bcundcomp_Z_SetNull( );
         this.setgxTv_SdtTBCPROD_Bcproveedor_Z_SetNull( );
         this.setgxTv_SdtTBCPROD_Bcprocesado_Z_SetNull( );
         this.setgxTv_SdtTBCPROD_Bcerror_Z_SetNull( );
         this.setgxTv_SdtTBCPROD_Bcdescerror_Z_SetNull( );
         this.setgxTv_SdtTBCPROD_Bcfecherror_Z_SetNull( );
         this.setgxTv_SdtTBCPROD_Bcpilaerror_Z_SetNull( );
      }
      SetDirty("Bcproducto");
      gxTv_SdtTBCPROD_Bcproducto = value ;
   }

   public String getgxTv_SdtTBCPROD_Bcdescripcion( )
   {
      return gxTv_SdtTBCPROD_Bcdescripcion ;
   }

   public void setgxTv_SdtTBCPROD_Bcdescripcion( String value )
   {
      gxTv_SdtTBCPROD_Bcdescripcion_N = (byte)(0) ;
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      SetDirty("Bcdescripcion");
      gxTv_SdtTBCPROD_Bcdescripcion = value ;
   }

   public void setgxTv_SdtTBCPROD_Bcdescripcion_SetNull( )
   {
      gxTv_SdtTBCPROD_Bcdescripcion_N = (byte)(1) ;
      gxTv_SdtTBCPROD_Bcdescripcion = "" ;
      SetDirty("Bcdescripcion");
   }

   public boolean getgxTv_SdtTBCPROD_Bcdescripcion_IsNull( )
   {
      return (gxTv_SdtTBCPROD_Bcdescripcion_N==1) ;
   }

   public java.math.BigDecimal getgxTv_SdtTBCPROD_Bcprecio( )
   {
      return gxTv_SdtTBCPROD_Bcprecio ;
   }

   public void setgxTv_SdtTBCPROD_Bcprecio( java.math.BigDecimal value )
   {
      gxTv_SdtTBCPROD_Bcprecio_N = (byte)(0) ;
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      SetDirty("Bcprecio");
      gxTv_SdtTBCPROD_Bcprecio = value ;
   }

   public void setgxTv_SdtTBCPROD_Bcprecio_SetNull( )
   {
      gxTv_SdtTBCPROD_Bcprecio_N = (byte)(1) ;
      gxTv_SdtTBCPROD_Bcprecio = DecimalUtil.ZERO ;
      SetDirty("Bcprecio");
   }

   public boolean getgxTv_SdtTBCPROD_Bcprecio_IsNull( )
   {
      return (gxTv_SdtTBCPROD_Bcprecio_N==1) ;
   }

   public short getgxTv_SdtTBCPROD_Bcundcomp( )
   {
      return gxTv_SdtTBCPROD_Bcundcomp ;
   }

   public void setgxTv_SdtTBCPROD_Bcundcomp( short value )
   {
      gxTv_SdtTBCPROD_Bcundcomp_N = (byte)(0) ;
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      SetDirty("Bcundcomp");
      gxTv_SdtTBCPROD_Bcundcomp = value ;
   }

   public void setgxTv_SdtTBCPROD_Bcundcomp_SetNull( )
   {
      gxTv_SdtTBCPROD_Bcundcomp_N = (byte)(1) ;
      gxTv_SdtTBCPROD_Bcundcomp = (short)(0) ;
      SetDirty("Bcundcomp");
   }

   public boolean getgxTv_SdtTBCPROD_Bcundcomp_IsNull( )
   {
      return (gxTv_SdtTBCPROD_Bcundcomp_N==1) ;
   }

   public String getgxTv_SdtTBCPROD_Bcproveedor( )
   {
      return gxTv_SdtTBCPROD_Bcproveedor ;
   }

   public void setgxTv_SdtTBCPROD_Bcproveedor( String value )
   {
      gxTv_SdtTBCPROD_Bcproveedor_N = (byte)(0) ;
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      SetDirty("Bcproveedor");
      gxTv_SdtTBCPROD_Bcproveedor = value ;
   }

   public void setgxTv_SdtTBCPROD_Bcproveedor_SetNull( )
   {
      gxTv_SdtTBCPROD_Bcproveedor_N = (byte)(1) ;
      gxTv_SdtTBCPROD_Bcproveedor = "" ;
      SetDirty("Bcproveedor");
   }

   public boolean getgxTv_SdtTBCPROD_Bcproveedor_IsNull( )
   {
      return (gxTv_SdtTBCPROD_Bcproveedor_N==1) ;
   }

   public short getgxTv_SdtTBCPROD_Bcprocesado( )
   {
      return gxTv_SdtTBCPROD_Bcprocesado ;
   }

   public void setgxTv_SdtTBCPROD_Bcprocesado( short value )
   {
      gxTv_SdtTBCPROD_Bcprocesado_N = (byte)(0) ;
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      SetDirty("Bcprocesado");
      gxTv_SdtTBCPROD_Bcprocesado = value ;
   }

   public void setgxTv_SdtTBCPROD_Bcprocesado_SetNull( )
   {
      gxTv_SdtTBCPROD_Bcprocesado_N = (byte)(1) ;
      gxTv_SdtTBCPROD_Bcprocesado = (short)(0) ;
      SetDirty("Bcprocesado");
   }

   public boolean getgxTv_SdtTBCPROD_Bcprocesado_IsNull( )
   {
      return (gxTv_SdtTBCPROD_Bcprocesado_N==1) ;
   }

   public short getgxTv_SdtTBCPROD_Bcerror( )
   {
      return gxTv_SdtTBCPROD_Bcerror ;
   }

   public void setgxTv_SdtTBCPROD_Bcerror( short value )
   {
      gxTv_SdtTBCPROD_Bcerror_N = (byte)(0) ;
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      SetDirty("Bcerror");
      gxTv_SdtTBCPROD_Bcerror = value ;
   }

   public void setgxTv_SdtTBCPROD_Bcerror_SetNull( )
   {
      gxTv_SdtTBCPROD_Bcerror_N = (byte)(1) ;
      gxTv_SdtTBCPROD_Bcerror = (short)(0) ;
      SetDirty("Bcerror");
   }

   public boolean getgxTv_SdtTBCPROD_Bcerror_IsNull( )
   {
      return (gxTv_SdtTBCPROD_Bcerror_N==1) ;
   }

   public String getgxTv_SdtTBCPROD_Bcdescerror( )
   {
      return gxTv_SdtTBCPROD_Bcdescerror ;
   }

   public void setgxTv_SdtTBCPROD_Bcdescerror( String value )
   {
      gxTv_SdtTBCPROD_Bcdescerror_N = (byte)(0) ;
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      SetDirty("Bcdescerror");
      gxTv_SdtTBCPROD_Bcdescerror = value ;
   }

   public void setgxTv_SdtTBCPROD_Bcdescerror_SetNull( )
   {
      gxTv_SdtTBCPROD_Bcdescerror_N = (byte)(1) ;
      gxTv_SdtTBCPROD_Bcdescerror = "" ;
      SetDirty("Bcdescerror");
   }

   public boolean getgxTv_SdtTBCPROD_Bcdescerror_IsNull( )
   {
      return (gxTv_SdtTBCPROD_Bcdescerror_N==1) ;
   }

   public java.util.Date getgxTv_SdtTBCPROD_Bcfecherror( )
   {
      return gxTv_SdtTBCPROD_Bcfecherror ;
   }

   public void setgxTv_SdtTBCPROD_Bcfecherror( java.util.Date value )
   {
      gxTv_SdtTBCPROD_Bcfecherror_N = (byte)(0) ;
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      SetDirty("Bcfecherror");
      gxTv_SdtTBCPROD_Bcfecherror = value ;
   }

   public void setgxTv_SdtTBCPROD_Bcfecherror_SetNull( )
   {
      gxTv_SdtTBCPROD_Bcfecherror_N = (byte)(1) ;
      gxTv_SdtTBCPROD_Bcfecherror = GXutil.resetTime( GXutil.nullDate() );
      SetDirty("Bcfecherror");
   }

   public boolean getgxTv_SdtTBCPROD_Bcfecherror_IsNull( )
   {
      return (gxTv_SdtTBCPROD_Bcfecherror_N==1) ;
   }

   public String getgxTv_SdtTBCPROD_Bcpilaerror( )
   {
      return gxTv_SdtTBCPROD_Bcpilaerror ;
   }

   public void setgxTv_SdtTBCPROD_Bcpilaerror( String value )
   {
      gxTv_SdtTBCPROD_Bcpilaerror_N = (byte)(0) ;
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      SetDirty("Bcpilaerror");
      gxTv_SdtTBCPROD_Bcpilaerror = value ;
   }

   public void setgxTv_SdtTBCPROD_Bcpilaerror_SetNull( )
   {
      gxTv_SdtTBCPROD_Bcpilaerror_N = (byte)(1) ;
      gxTv_SdtTBCPROD_Bcpilaerror = "" ;
      SetDirty("Bcpilaerror");
   }

   public boolean getgxTv_SdtTBCPROD_Bcpilaerror_IsNull( )
   {
      return (gxTv_SdtTBCPROD_Bcpilaerror_N==1) ;
   }

   public String getgxTv_SdtTBCPROD_Mode( )
   {
      return gxTv_SdtTBCPROD_Mode ;
   }

   public void setgxTv_SdtTBCPROD_Mode( String value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      SetDirty("Mode");
      gxTv_SdtTBCPROD_Mode = value ;
   }

   public void setgxTv_SdtTBCPROD_Mode_SetNull( )
   {
      gxTv_SdtTBCPROD_Mode = "" ;
      SetDirty("Mode");
   }

   public boolean getgxTv_SdtTBCPROD_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBCPROD_Initialized( )
   {
      return gxTv_SdtTBCPROD_Initialized ;
   }

   public void setgxTv_SdtTBCPROD_Initialized( short value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      SetDirty("Initialized");
      gxTv_SdtTBCPROD_Initialized = value ;
   }

   public void setgxTv_SdtTBCPROD_Initialized_SetNull( )
   {
      gxTv_SdtTBCPROD_Initialized = (short)(0) ;
      SetDirty("Initialized");
   }

   public boolean getgxTv_SdtTBCPROD_Initialized_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBCPROD_Emprcod_Z( )
   {
      return gxTv_SdtTBCPROD_Emprcod_Z ;
   }

   public void setgxTv_SdtTBCPROD_Emprcod_Z( String value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      SetDirty("Emprcod_Z");
      gxTv_SdtTBCPROD_Emprcod_Z = value ;
   }

   public void setgxTv_SdtTBCPROD_Emprcod_Z_SetNull( )
   {
      gxTv_SdtTBCPROD_Emprcod_Z = "" ;
      SetDirty("Emprcod_Z");
   }

   public boolean getgxTv_SdtTBCPROD_Emprcod_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBCPROD_Emprnom_Z( )
   {
      return gxTv_SdtTBCPROD_Emprnom_Z ;
   }

   public void setgxTv_SdtTBCPROD_Emprnom_Z( String value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      SetDirty("Emprnom_Z");
      gxTv_SdtTBCPROD_Emprnom_Z = value ;
   }

   public void setgxTv_SdtTBCPROD_Emprnom_Z_SetNull( )
   {
      gxTv_SdtTBCPROD_Emprnom_Z = "" ;
      SetDirty("Emprnom_Z");
   }

   public boolean getgxTv_SdtTBCPROD_Emprnom_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBCPROD_Bcproducto_Z( )
   {
      return gxTv_SdtTBCPROD_Bcproducto_Z ;
   }

   public void setgxTv_SdtTBCPROD_Bcproducto_Z( String value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      SetDirty("Bcproducto_Z");
      gxTv_SdtTBCPROD_Bcproducto_Z = value ;
   }

   public void setgxTv_SdtTBCPROD_Bcproducto_Z_SetNull( )
   {
      gxTv_SdtTBCPROD_Bcproducto_Z = "" ;
      SetDirty("Bcproducto_Z");
   }

   public boolean getgxTv_SdtTBCPROD_Bcproducto_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBCPROD_Bcdescripcion_Z( )
   {
      return gxTv_SdtTBCPROD_Bcdescripcion_Z ;
   }

   public void setgxTv_SdtTBCPROD_Bcdescripcion_Z( String value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      SetDirty("Bcdescripcion_Z");
      gxTv_SdtTBCPROD_Bcdescripcion_Z = value ;
   }

   public void setgxTv_SdtTBCPROD_Bcdescripcion_Z_SetNull( )
   {
      gxTv_SdtTBCPROD_Bcdescripcion_Z = "" ;
      SetDirty("Bcdescripcion_Z");
   }

   public boolean getgxTv_SdtTBCPROD_Bcdescripcion_Z_IsNull( )
   {
      return false ;
   }

   public java.math.BigDecimal getgxTv_SdtTBCPROD_Bcprecio_Z( )
   {
      return gxTv_SdtTBCPROD_Bcprecio_Z ;
   }

   public void setgxTv_SdtTBCPROD_Bcprecio_Z( java.math.BigDecimal value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      SetDirty("Bcprecio_Z");
      gxTv_SdtTBCPROD_Bcprecio_Z = value ;
   }

   public void setgxTv_SdtTBCPROD_Bcprecio_Z_SetNull( )
   {
      gxTv_SdtTBCPROD_Bcprecio_Z = DecimalUtil.ZERO ;
      SetDirty("Bcprecio_Z");
   }

   public boolean getgxTv_SdtTBCPROD_Bcprecio_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBCPROD_Bcundcomp_Z( )
   {
      return gxTv_SdtTBCPROD_Bcundcomp_Z ;
   }

   public void setgxTv_SdtTBCPROD_Bcundcomp_Z( short value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      SetDirty("Bcundcomp_Z");
      gxTv_SdtTBCPROD_Bcundcomp_Z = value ;
   }

   public void setgxTv_SdtTBCPROD_Bcundcomp_Z_SetNull( )
   {
      gxTv_SdtTBCPROD_Bcundcomp_Z = (short)(0) ;
      SetDirty("Bcundcomp_Z");
   }

   public boolean getgxTv_SdtTBCPROD_Bcundcomp_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBCPROD_Bcproveedor_Z( )
   {
      return gxTv_SdtTBCPROD_Bcproveedor_Z ;
   }

   public void setgxTv_SdtTBCPROD_Bcproveedor_Z( String value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      SetDirty("Bcproveedor_Z");
      gxTv_SdtTBCPROD_Bcproveedor_Z = value ;
   }

   public void setgxTv_SdtTBCPROD_Bcproveedor_Z_SetNull( )
   {
      gxTv_SdtTBCPROD_Bcproveedor_Z = "" ;
      SetDirty("Bcproveedor_Z");
   }

   public boolean getgxTv_SdtTBCPROD_Bcproveedor_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBCPROD_Bcprocesado_Z( )
   {
      return gxTv_SdtTBCPROD_Bcprocesado_Z ;
   }

   public void setgxTv_SdtTBCPROD_Bcprocesado_Z( short value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      SetDirty("Bcprocesado_Z");
      gxTv_SdtTBCPROD_Bcprocesado_Z = value ;
   }

   public void setgxTv_SdtTBCPROD_Bcprocesado_Z_SetNull( )
   {
      gxTv_SdtTBCPROD_Bcprocesado_Z = (short)(0) ;
      SetDirty("Bcprocesado_Z");
   }

   public boolean getgxTv_SdtTBCPROD_Bcprocesado_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBCPROD_Bcerror_Z( )
   {
      return gxTv_SdtTBCPROD_Bcerror_Z ;
   }

   public void setgxTv_SdtTBCPROD_Bcerror_Z( short value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      SetDirty("Bcerror_Z");
      gxTv_SdtTBCPROD_Bcerror_Z = value ;
   }

   public void setgxTv_SdtTBCPROD_Bcerror_Z_SetNull( )
   {
      gxTv_SdtTBCPROD_Bcerror_Z = (short)(0) ;
      SetDirty("Bcerror_Z");
   }

   public boolean getgxTv_SdtTBCPROD_Bcerror_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBCPROD_Bcdescerror_Z( )
   {
      return gxTv_SdtTBCPROD_Bcdescerror_Z ;
   }

   public void setgxTv_SdtTBCPROD_Bcdescerror_Z( String value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      SetDirty("Bcdescerror_Z");
      gxTv_SdtTBCPROD_Bcdescerror_Z = value ;
   }

   public void setgxTv_SdtTBCPROD_Bcdescerror_Z_SetNull( )
   {
      gxTv_SdtTBCPROD_Bcdescerror_Z = "" ;
      SetDirty("Bcdescerror_Z");
   }

   public boolean getgxTv_SdtTBCPROD_Bcdescerror_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBCPROD_Bcfecherror_Z( )
   {
      return gxTv_SdtTBCPROD_Bcfecherror_Z ;
   }

   public void setgxTv_SdtTBCPROD_Bcfecherror_Z( java.util.Date value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      SetDirty("Bcfecherror_Z");
      gxTv_SdtTBCPROD_Bcfecherror_Z = value ;
   }

   public void setgxTv_SdtTBCPROD_Bcfecherror_Z_SetNull( )
   {
      gxTv_SdtTBCPROD_Bcfecherror_Z = GXutil.resetTime( GXutil.nullDate() );
      SetDirty("Bcfecherror_Z");
   }

   public boolean getgxTv_SdtTBCPROD_Bcfecherror_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBCPROD_Bcpilaerror_Z( )
   {
      return gxTv_SdtTBCPROD_Bcpilaerror_Z ;
   }

   public void setgxTv_SdtTBCPROD_Bcpilaerror_Z( String value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      SetDirty("Bcpilaerror_Z");
      gxTv_SdtTBCPROD_Bcpilaerror_Z = value ;
   }

   public void setgxTv_SdtTBCPROD_Bcpilaerror_Z_SetNull( )
   {
      gxTv_SdtTBCPROD_Bcpilaerror_Z = "" ;
      SetDirty("Bcpilaerror_Z");
   }

   public boolean getgxTv_SdtTBCPROD_Bcpilaerror_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBCPROD_Emprnom_N( )
   {
      return gxTv_SdtTBCPROD_Emprnom_N ;
   }

   public void setgxTv_SdtTBCPROD_Emprnom_N( byte value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      SetDirty("Emprnom_N");
      gxTv_SdtTBCPROD_Emprnom_N = value ;
   }

   public void setgxTv_SdtTBCPROD_Emprnom_N_SetNull( )
   {
      gxTv_SdtTBCPROD_Emprnom_N = (byte)(0) ;
      SetDirty("Emprnom_N");
   }

   public boolean getgxTv_SdtTBCPROD_Emprnom_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBCPROD_Bcproducto_N( )
   {
      return gxTv_SdtTBCPROD_Bcproducto_N ;
   }

   public void setgxTv_SdtTBCPROD_Bcproducto_N( byte value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      SetDirty("Bcproducto_N");
      gxTv_SdtTBCPROD_Bcproducto_N = value ;
   }

   public void setgxTv_SdtTBCPROD_Bcproducto_N_SetNull( )
   {
      gxTv_SdtTBCPROD_Bcproducto_N = (byte)(0) ;
      SetDirty("Bcproducto_N");
   }

   public boolean getgxTv_SdtTBCPROD_Bcproducto_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBCPROD_Bcdescripcion_N( )
   {
      return gxTv_SdtTBCPROD_Bcdescripcion_N ;
   }

   public void setgxTv_SdtTBCPROD_Bcdescripcion_N( byte value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      SetDirty("Bcdescripcion_N");
      gxTv_SdtTBCPROD_Bcdescripcion_N = value ;
   }

   public void setgxTv_SdtTBCPROD_Bcdescripcion_N_SetNull( )
   {
      gxTv_SdtTBCPROD_Bcdescripcion_N = (byte)(0) ;
      SetDirty("Bcdescripcion_N");
   }

   public boolean getgxTv_SdtTBCPROD_Bcdescripcion_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBCPROD_Bcprecio_N( )
   {
      return gxTv_SdtTBCPROD_Bcprecio_N ;
   }

   public void setgxTv_SdtTBCPROD_Bcprecio_N( byte value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      SetDirty("Bcprecio_N");
      gxTv_SdtTBCPROD_Bcprecio_N = value ;
   }

   public void setgxTv_SdtTBCPROD_Bcprecio_N_SetNull( )
   {
      gxTv_SdtTBCPROD_Bcprecio_N = (byte)(0) ;
      SetDirty("Bcprecio_N");
   }

   public boolean getgxTv_SdtTBCPROD_Bcprecio_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBCPROD_Bcundcomp_N( )
   {
      return gxTv_SdtTBCPROD_Bcundcomp_N ;
   }

   public void setgxTv_SdtTBCPROD_Bcundcomp_N( byte value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      SetDirty("Bcundcomp_N");
      gxTv_SdtTBCPROD_Bcundcomp_N = value ;
   }

   public void setgxTv_SdtTBCPROD_Bcundcomp_N_SetNull( )
   {
      gxTv_SdtTBCPROD_Bcundcomp_N = (byte)(0) ;
      SetDirty("Bcundcomp_N");
   }

   public boolean getgxTv_SdtTBCPROD_Bcundcomp_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBCPROD_Bcproveedor_N( )
   {
      return gxTv_SdtTBCPROD_Bcproveedor_N ;
   }

   public void setgxTv_SdtTBCPROD_Bcproveedor_N( byte value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      SetDirty("Bcproveedor_N");
      gxTv_SdtTBCPROD_Bcproveedor_N = value ;
   }

   public void setgxTv_SdtTBCPROD_Bcproveedor_N_SetNull( )
   {
      gxTv_SdtTBCPROD_Bcproveedor_N = (byte)(0) ;
      SetDirty("Bcproveedor_N");
   }

   public boolean getgxTv_SdtTBCPROD_Bcproveedor_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBCPROD_Bcprocesado_N( )
   {
      return gxTv_SdtTBCPROD_Bcprocesado_N ;
   }

   public void setgxTv_SdtTBCPROD_Bcprocesado_N( byte value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      SetDirty("Bcprocesado_N");
      gxTv_SdtTBCPROD_Bcprocesado_N = value ;
   }

   public void setgxTv_SdtTBCPROD_Bcprocesado_N_SetNull( )
   {
      gxTv_SdtTBCPROD_Bcprocesado_N = (byte)(0) ;
      SetDirty("Bcprocesado_N");
   }

   public boolean getgxTv_SdtTBCPROD_Bcprocesado_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBCPROD_Bcerror_N( )
   {
      return gxTv_SdtTBCPROD_Bcerror_N ;
   }

   public void setgxTv_SdtTBCPROD_Bcerror_N( byte value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      SetDirty("Bcerror_N");
      gxTv_SdtTBCPROD_Bcerror_N = value ;
   }

   public void setgxTv_SdtTBCPROD_Bcerror_N_SetNull( )
   {
      gxTv_SdtTBCPROD_Bcerror_N = (byte)(0) ;
      SetDirty("Bcerror_N");
   }

   public boolean getgxTv_SdtTBCPROD_Bcerror_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBCPROD_Bcdescerror_N( )
   {
      return gxTv_SdtTBCPROD_Bcdescerror_N ;
   }

   public void setgxTv_SdtTBCPROD_Bcdescerror_N( byte value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      SetDirty("Bcdescerror_N");
      gxTv_SdtTBCPROD_Bcdescerror_N = value ;
   }

   public void setgxTv_SdtTBCPROD_Bcdescerror_N_SetNull( )
   {
      gxTv_SdtTBCPROD_Bcdescerror_N = (byte)(0) ;
      SetDirty("Bcdescerror_N");
   }

   public boolean getgxTv_SdtTBCPROD_Bcdescerror_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBCPROD_Bcfecherror_N( )
   {
      return gxTv_SdtTBCPROD_Bcfecherror_N ;
   }

   public void setgxTv_SdtTBCPROD_Bcfecherror_N( byte value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      SetDirty("Bcfecherror_N");
      gxTv_SdtTBCPROD_Bcfecherror_N = value ;
   }

   public void setgxTv_SdtTBCPROD_Bcfecherror_N_SetNull( )
   {
      gxTv_SdtTBCPROD_Bcfecherror_N = (byte)(0) ;
      SetDirty("Bcfecherror_N");
   }

   public boolean getgxTv_SdtTBCPROD_Bcfecherror_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBCPROD_Bcpilaerror_N( )
   {
      return gxTv_SdtTBCPROD_Bcpilaerror_N ;
   }

   public void setgxTv_SdtTBCPROD_Bcpilaerror_N( byte value )
   {
      gxTv_SdtTBCPROD_N = (byte)(0) ;
      SetDirty("Bcpilaerror_N");
      gxTv_SdtTBCPROD_Bcpilaerror_N = value ;
   }

   public void setgxTv_SdtTBCPROD_Bcpilaerror_N_SetNull( )
   {
      gxTv_SdtTBCPROD_Bcpilaerror_N = (byte)(0) ;
      SetDirty("Bcpilaerror_N");
   }

   public boolean getgxTv_SdtTBCPROD_Bcpilaerror_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      app.tbcprod_bc obj;
      obj = new app.tbcprod_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTBCPROD_Emprcod = "" ;
      gxTv_SdtTBCPROD_N = (byte)(1) ;
      gxTv_SdtTBCPROD_Emprnom = "" ;
      gxTv_SdtTBCPROD_Bcproducto = "" ;
      gxTv_SdtTBCPROD_Bcdescripcion = "" ;
      gxTv_SdtTBCPROD_Bcprecio = DecimalUtil.ZERO ;
      gxTv_SdtTBCPROD_Bcproveedor = "" ;
      gxTv_SdtTBCPROD_Bcdescerror = "" ;
      gxTv_SdtTBCPROD_Bcfecherror = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBCPROD_Bcpilaerror = "" ;
      gxTv_SdtTBCPROD_Mode = "" ;
      gxTv_SdtTBCPROD_Emprcod_Z = "" ;
      gxTv_SdtTBCPROD_Emprnom_Z = "" ;
      gxTv_SdtTBCPROD_Bcproducto_Z = "" ;
      gxTv_SdtTBCPROD_Bcdescripcion_Z = "" ;
      gxTv_SdtTBCPROD_Bcprecio_Z = DecimalUtil.ZERO ;
      gxTv_SdtTBCPROD_Bcproveedor_Z = "" ;
      gxTv_SdtTBCPROD_Bcdescerror_Z = "" ;
      gxTv_SdtTBCPROD_Bcfecherror_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBCPROD_Bcpilaerror_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtTBCPROD_N ;
   }

   public app.SdtTBCPROD Clone( )
   {
      app.SdtTBCPROD sdt;
      app.tbcprod_bc obj;
      sdt = (app.SdtTBCPROD)(clone()) ;
      obj = (app.tbcprod_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( app.StructSdtTBCPROD struct )
   {
      setgxTv_SdtTBCPROD_Emprcod(struct.getEmprcod());
      setgxTv_SdtTBCPROD_Emprnom(struct.getEmprnom());
      setgxTv_SdtTBCPROD_Bcproducto(struct.getBcproducto());
      setgxTv_SdtTBCPROD_Bcdescripcion(struct.getBcdescripcion());
      setgxTv_SdtTBCPROD_Bcprecio(struct.getBcprecio());
      setgxTv_SdtTBCPROD_Bcundcomp(struct.getBcundcomp());
      setgxTv_SdtTBCPROD_Bcproveedor(struct.getBcproveedor());
      setgxTv_SdtTBCPROD_Bcprocesado(struct.getBcprocesado());
      setgxTv_SdtTBCPROD_Bcerror(struct.getBcerror());
      setgxTv_SdtTBCPROD_Bcdescerror(struct.getBcdescerror());
      setgxTv_SdtTBCPROD_Bcfecherror(struct.getBcfecherror());
      setgxTv_SdtTBCPROD_Bcpilaerror(struct.getBcpilaerror());
      setgxTv_SdtTBCPROD_Mode(struct.getMode());
      setgxTv_SdtTBCPROD_Initialized(struct.getInitialized());
      setgxTv_SdtTBCPROD_Emprcod_Z(struct.getEmprcod_Z());
      setgxTv_SdtTBCPROD_Emprnom_Z(struct.getEmprnom_Z());
      setgxTv_SdtTBCPROD_Bcproducto_Z(struct.getBcproducto_Z());
      setgxTv_SdtTBCPROD_Bcdescripcion_Z(struct.getBcdescripcion_Z());
      setgxTv_SdtTBCPROD_Bcprecio_Z(struct.getBcprecio_Z());
      setgxTv_SdtTBCPROD_Bcundcomp_Z(struct.getBcundcomp_Z());
      setgxTv_SdtTBCPROD_Bcproveedor_Z(struct.getBcproveedor_Z());
      setgxTv_SdtTBCPROD_Bcprocesado_Z(struct.getBcprocesado_Z());
      setgxTv_SdtTBCPROD_Bcerror_Z(struct.getBcerror_Z());
      setgxTv_SdtTBCPROD_Bcdescerror_Z(struct.getBcdescerror_Z());
      setgxTv_SdtTBCPROD_Bcfecherror_Z(struct.getBcfecherror_Z());
      setgxTv_SdtTBCPROD_Bcpilaerror_Z(struct.getBcpilaerror_Z());
      setgxTv_SdtTBCPROD_Emprnom_N(struct.getEmprnom_N());
      setgxTv_SdtTBCPROD_Bcproducto_N(struct.getBcproducto_N());
      setgxTv_SdtTBCPROD_Bcdescripcion_N(struct.getBcdescripcion_N());
      setgxTv_SdtTBCPROD_Bcprecio_N(struct.getBcprecio_N());
      setgxTv_SdtTBCPROD_Bcundcomp_N(struct.getBcundcomp_N());
      setgxTv_SdtTBCPROD_Bcproveedor_N(struct.getBcproveedor_N());
      setgxTv_SdtTBCPROD_Bcprocesado_N(struct.getBcprocesado_N());
      setgxTv_SdtTBCPROD_Bcerror_N(struct.getBcerror_N());
      setgxTv_SdtTBCPROD_Bcdescerror_N(struct.getBcdescerror_N());
      setgxTv_SdtTBCPROD_Bcfecherror_N(struct.getBcfecherror_N());
      setgxTv_SdtTBCPROD_Bcpilaerror_N(struct.getBcpilaerror_N());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtTBCPROD getStruct( )
   {
      app.StructSdtTBCPROD struct = new app.StructSdtTBCPROD ();
      struct.setEmprcod(getgxTv_SdtTBCPROD_Emprcod());
      struct.setEmprnom(getgxTv_SdtTBCPROD_Emprnom());
      struct.setBcproducto(getgxTv_SdtTBCPROD_Bcproducto());
      struct.setBcdescripcion(getgxTv_SdtTBCPROD_Bcdescripcion());
      struct.setBcprecio(getgxTv_SdtTBCPROD_Bcprecio());
      struct.setBcundcomp(getgxTv_SdtTBCPROD_Bcundcomp());
      struct.setBcproveedor(getgxTv_SdtTBCPROD_Bcproveedor());
      struct.setBcprocesado(getgxTv_SdtTBCPROD_Bcprocesado());
      struct.setBcerror(getgxTv_SdtTBCPROD_Bcerror());
      struct.setBcdescerror(getgxTv_SdtTBCPROD_Bcdescerror());
      struct.setBcfecherror(getgxTv_SdtTBCPROD_Bcfecherror());
      struct.setBcpilaerror(getgxTv_SdtTBCPROD_Bcpilaerror());
      struct.setMode(getgxTv_SdtTBCPROD_Mode());
      struct.setInitialized(getgxTv_SdtTBCPROD_Initialized());
      struct.setEmprcod_Z(getgxTv_SdtTBCPROD_Emprcod_Z());
      struct.setEmprnom_Z(getgxTv_SdtTBCPROD_Emprnom_Z());
      struct.setBcproducto_Z(getgxTv_SdtTBCPROD_Bcproducto_Z());
      struct.setBcdescripcion_Z(getgxTv_SdtTBCPROD_Bcdescripcion_Z());
      struct.setBcprecio_Z(getgxTv_SdtTBCPROD_Bcprecio_Z());
      struct.setBcundcomp_Z(getgxTv_SdtTBCPROD_Bcundcomp_Z());
      struct.setBcproveedor_Z(getgxTv_SdtTBCPROD_Bcproveedor_Z());
      struct.setBcprocesado_Z(getgxTv_SdtTBCPROD_Bcprocesado_Z());
      struct.setBcerror_Z(getgxTv_SdtTBCPROD_Bcerror_Z());
      struct.setBcdescerror_Z(getgxTv_SdtTBCPROD_Bcdescerror_Z());
      struct.setBcfecherror_Z(getgxTv_SdtTBCPROD_Bcfecherror_Z());
      struct.setBcpilaerror_Z(getgxTv_SdtTBCPROD_Bcpilaerror_Z());
      struct.setEmprnom_N(getgxTv_SdtTBCPROD_Emprnom_N());
      struct.setBcproducto_N(getgxTv_SdtTBCPROD_Bcproducto_N());
      struct.setBcdescripcion_N(getgxTv_SdtTBCPROD_Bcdescripcion_N());
      struct.setBcprecio_N(getgxTv_SdtTBCPROD_Bcprecio_N());
      struct.setBcundcomp_N(getgxTv_SdtTBCPROD_Bcundcomp_N());
      struct.setBcproveedor_N(getgxTv_SdtTBCPROD_Bcproveedor_N());
      struct.setBcprocesado_N(getgxTv_SdtTBCPROD_Bcprocesado_N());
      struct.setBcerror_N(getgxTv_SdtTBCPROD_Bcerror_N());
      struct.setBcdescerror_N(getgxTv_SdtTBCPROD_Bcdescerror_N());
      struct.setBcfecherror_N(getgxTv_SdtTBCPROD_Bcfecherror_N());
      struct.setBcpilaerror_N(getgxTv_SdtTBCPROD_Bcpilaerror_N());
      return struct ;
   }

   private byte gxTv_SdtTBCPROD_N ;
   private byte gxTv_SdtTBCPROD_Emprnom_N ;
   private byte gxTv_SdtTBCPROD_Bcproducto_N ;
   private byte gxTv_SdtTBCPROD_Bcdescripcion_N ;
   private byte gxTv_SdtTBCPROD_Bcprecio_N ;
   private byte gxTv_SdtTBCPROD_Bcundcomp_N ;
   private byte gxTv_SdtTBCPROD_Bcproveedor_N ;
   private byte gxTv_SdtTBCPROD_Bcprocesado_N ;
   private byte gxTv_SdtTBCPROD_Bcerror_N ;
   private byte gxTv_SdtTBCPROD_Bcdescerror_N ;
   private byte gxTv_SdtTBCPROD_Bcfecherror_N ;
   private byte gxTv_SdtTBCPROD_Bcpilaerror_N ;
   private short gxTv_SdtTBCPROD_Bcundcomp ;
   private short gxTv_SdtTBCPROD_Bcprocesado ;
   private short gxTv_SdtTBCPROD_Bcerror ;
   private short gxTv_SdtTBCPROD_Initialized ;
   private short gxTv_SdtTBCPROD_Bcundcomp_Z ;
   private short gxTv_SdtTBCPROD_Bcprocesado_Z ;
   private short gxTv_SdtTBCPROD_Bcerror_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private java.math.BigDecimal gxTv_SdtTBCPROD_Bcprecio ;
   private java.math.BigDecimal gxTv_SdtTBCPROD_Bcprecio_Z ;
   private String gxTv_SdtTBCPROD_Emprcod ;
   private String gxTv_SdtTBCPROD_Emprnom ;
   private String gxTv_SdtTBCPROD_Bcproducto ;
   private String gxTv_SdtTBCPROD_Bcdescripcion ;
   private String gxTv_SdtTBCPROD_Bcproveedor ;
   private String gxTv_SdtTBCPROD_Mode ;
   private String gxTv_SdtTBCPROD_Emprcod_Z ;
   private String gxTv_SdtTBCPROD_Emprnom_Z ;
   private String gxTv_SdtTBCPROD_Bcproducto_Z ;
   private String gxTv_SdtTBCPROD_Bcdescripcion_Z ;
   private String gxTv_SdtTBCPROD_Bcproveedor_Z ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtTBCPROD_Bcfecherror ;
   private java.util.Date gxTv_SdtTBCPROD_Bcfecherror_Z ;
   private java.util.Date datetime_STZ ;
   private boolean readElement ;
   private boolean formatError ;
   private String gxTv_SdtTBCPROD_Bcdescerror ;
   private String gxTv_SdtTBCPROD_Bcpilaerror ;
   private String gxTv_SdtTBCPROD_Bcdescerror_Z ;
   private String gxTv_SdtTBCPROD_Bcpilaerror_Z ;
}

