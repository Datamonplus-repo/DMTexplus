package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem extends GxUserType
{
   public SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem( )
   {
      this(  new ModelContext(SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem.class));
   }

   public SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem( ModelContext context )
   {
      super( context, "SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem");
   }

   public SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem( int remoteHandle ,
                                                                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem");
   }

   public SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem( StructSdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Seleccionar") )
            {
               gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Seleccionar = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProcod") )
            {
               gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprocod = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProfch") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprofch = GXutil.nullDate() ;
                  gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprofch_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprofch_N = (byte)(0) ;
                  gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprofch = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProest") )
            {
               gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albproest = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbPropie") )
            {
               gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpropie = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ALbProKgs") )
            {
               gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprokgs = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ALbProMet") )
            {
               gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpromet = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbImporte") )
            {
               gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albimporte = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "FacturacionManual_Producciones__SDT.FacturacionManual_Producciones__SDTItem" ;
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
      oWriter.writeElement("Seleccionar", GXutil.booltostr( gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Seleccionar));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbProcod", GXutil.trim( GXutil.str( gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprocod, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprofch)) && ( gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprofch_N == 1 ) )
      {
         oWriter.writeElement("AlbProfch", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprofch), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprofch), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprofch), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("AlbProfch", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("AlbProest", GXutil.trim( GXutil.str( gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albproest, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbPropie", GXutil.trim( GXutil.str( gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpropie, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ALbProKgs", GXutil.trim( GXutil.strNoRound( gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprokgs, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ALbProMet", GXutil.trim( GXutil.strNoRound( gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpromet, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbImporte", GXutil.trim( GXutil.strNoRound( gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albimporte, 15, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
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
      AddObjectProperty("Seleccionar", gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Seleccionar, false, false);
      AddObjectProperty("AlbProcod", gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprocod, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprofch), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprofch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprofch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("AlbProfch", sDateCnv, false, false);
      AddObjectProperty("AlbProest", gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albproest, false, false);
      AddObjectProperty("AlbPropie", gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpropie, false, false);
      AddObjectProperty("ALbProKgs", gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprokgs, false, false);
      AddObjectProperty("ALbProMet", gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpromet, false, false);
      AddObjectProperty("AlbImporte", gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albimporte, false, false);
   }

   public boolean getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Seleccionar( )
   {
      return gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Seleccionar ;
   }

   public void setgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Seleccionar( boolean value )
   {
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_N = (byte)(0) ;
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Seleccionar = value ;
   }

   public long getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprocod( )
   {
      return gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprocod ;
   }

   public void setgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprocod( long value )
   {
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_N = (byte)(0) ;
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprocod = value ;
   }

   public java.util.Date getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprofch( )
   {
      return gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprofch ;
   }

   public void setgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprofch( java.util.Date value )
   {
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprofch_N = (byte)(0) ;
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_N = (byte)(0) ;
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprofch = value ;
   }

   public byte getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albproest( )
   {
      return gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albproest ;
   }

   public void setgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albproest( byte value )
   {
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_N = (byte)(0) ;
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albproest = value ;
   }

   public short getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpropie( )
   {
      return gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpropie ;
   }

   public void setgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpropie( short value )
   {
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_N = (byte)(0) ;
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpropie = value ;
   }

   public java.math.BigDecimal getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprokgs( )
   {
      return gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprokgs ;
   }

   public void setgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprokgs( java.math.BigDecimal value )
   {
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_N = (byte)(0) ;
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprokgs = value ;
   }

   public java.math.BigDecimal getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpromet( )
   {
      return gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpromet ;
   }

   public void setgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpromet( java.math.BigDecimal value )
   {
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_N = (byte)(0) ;
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpromet = value ;
   }

   public java.math.BigDecimal getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albimporte( )
   {
      return gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albimporte ;
   }

   public void setgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albimporte( java.math.BigDecimal value )
   {
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_N = (byte)(0) ;
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albimporte = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_N = (byte)(1) ;
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprofch = GXutil.nullDate() ;
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprofch_N = (byte)(1) ;
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprokgs = DecimalUtil.ZERO ;
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpromet = DecimalUtil.ZERO ;
      gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albimporte = DecimalUtil.ZERO ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_N ;
   }

   public app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem Clone( )
   {
      return (app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem)(clone()) ;
   }

   public void setStruct( app.facturacion.StructSdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem struct )
   {
      setgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Seleccionar(struct.getSeleccionar());
      setgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprocod(struct.getAlbprocod());
      if ( struct.gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprofch_N == 0 )
      {
         setgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprofch(struct.getAlbprofch());
      }
      setgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albproest(struct.getAlbproest());
      setgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpropie(struct.getAlbpropie());
      setgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprokgs(struct.getAlbprokgs());
      setgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpromet(struct.getAlbpromet());
      setgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albimporte(struct.getAlbimporte());
   }

   @SuppressWarnings("unchecked")
   public app.facturacion.StructSdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem getStruct( )
   {
      app.facturacion.StructSdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem struct = new app.facturacion.StructSdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem ();
      struct.setSeleccionar(getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Seleccionar());
      struct.setAlbprocod(getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprocod());
      if ( gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprofch_N == 0 )
      {
         struct.setAlbprofch(getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprofch());
      }
      struct.setAlbproest(getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albproest());
      struct.setAlbpropie(getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpropie());
      struct.setAlbprokgs(getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprokgs());
      struct.setAlbpromet(getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpromet());
      struct.setAlbimporte(getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albimporte());
      return struct ;
   }

   protected byte gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_N ;
   protected byte gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprofch_N ;
   protected byte gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albproest ;
   protected short gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpropie ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprocod ;
   protected java.math.BigDecimal gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprokgs ;
   protected java.math.BigDecimal gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpromet ;
   protected java.math.BigDecimal gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albimporte ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprofch ;
   protected boolean gxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Seleccionar ;
   protected boolean readElement ;
   protected boolean formatError ;
}

