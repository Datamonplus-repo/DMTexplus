package app.anticipacionerrores ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtsdtParametros extends GxUserType
{
   public SdtsdtParametros( )
   {
      this(  new ModelContext(SdtsdtParametros.class));
   }

   public SdtsdtParametros( ModelContext context )
   {
      super( context, "SdtsdtParametros");
   }

   public SdtsdtParametros( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle, context, "SdtsdtParametros");
   }

   public SdtsdtParametros( StructSdtsdtParametros struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprCod") )
            {
               gxTv_SdtsdtParametros_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliCod") )
            {
               gxTv_SdtsdtParametros_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ArtCod") )
            {
               gxTv_SdtsdtParametros_Artcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ForColNum") )
            {
               gxTv_SdtsdtParametros_Forcolnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipMaqCod") )
            {
               gxTv_SdtsdtParametros_Tipmaqcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqCod") )
            {
               gxTv_SdtsdtParametros_Maqcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FechaInicio") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtsdtParametros_Fechainicio = GXutil.nullDate() ;
                  gxTv_SdtsdtParametros_Fechainicio_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtsdtParametros_Fechainicio_N = (byte)(0) ;
                  gxTv_SdtsdtParametros_Fechainicio = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FechaFin") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtsdtParametros_Fechafin = GXutil.nullDate() ;
                  gxTv_SdtsdtParametros_Fechafin_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtsdtParametros_Fechafin_N = (byte)(0) ;
                  gxTv_SdtsdtParametros_Fechafin = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MTknUsu") )
            {
               gxTv_SdtsdtParametros_Mtknusu = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MTkn") )
            {
               gxTv_SdtsdtParametros_Mtkn = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DefCod") )
            {
               gxTv_SdtsdtParametros_Defcod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CatCod") )
            {
               gxTv_SdtsdtParametros_Catcod = (short)(getnumericvalue(oReader.getValue())) ;
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
         sName = "sdtParametros" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtsdtParametros_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliCod", GXutil.trim( GXutil.str( gxTv_SdtsdtParametros_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ArtCod", gxTv_SdtsdtParametros_Artcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ForColNum", GXutil.trim( GXutil.str( gxTv_SdtsdtParametros_Forcolnum, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipMaqCod", gxTv_SdtsdtParametros_Tipmaqcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqCod", gxTv_SdtsdtParametros_Maqcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtsdtParametros_Fechainicio)) && ( gxTv_SdtsdtParametros_Fechainicio_N == 1 ) )
      {
         oWriter.writeElement("FechaInicio", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtsdtParametros_Fechainicio), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtsdtParametros_Fechainicio), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtsdtParametros_Fechainicio), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("FechaInicio", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtsdtParametros_Fechafin)) && ( gxTv_SdtsdtParametros_Fechafin_N == 1 ) )
      {
         oWriter.writeElement("FechaFin", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtsdtParametros_Fechafin), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtsdtParametros_Fechafin), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtsdtParametros_Fechafin), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("FechaFin", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("MTknUsu", gxTv_SdtsdtParametros_Mtknusu);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MTkn", gxTv_SdtsdtParametros_Mtkn);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DefCod", GXutil.trim( GXutil.str( gxTv_SdtsdtParametros_Defcod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CatCod", GXutil.trim( GXutil.str( gxTv_SdtsdtParametros_Catcod, 4, 0)));
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
      AddObjectProperty("EmprCod", gxTv_SdtsdtParametros_Emprcod, false, false);
      AddObjectProperty("CliCod", gxTv_SdtsdtParametros_Clicod, false, false);
      AddObjectProperty("ArtCod", gxTv_SdtsdtParametros_Artcod, false, false);
      AddObjectProperty("ForColNum", gxTv_SdtsdtParametros_Forcolnum, false, false);
      AddObjectProperty("TipMaqCod", gxTv_SdtsdtParametros_Tipmaqcod, false, false);
      AddObjectProperty("MaqCod", gxTv_SdtsdtParametros_Maqcod, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtsdtParametros_Fechainicio), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtsdtParametros_Fechainicio), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtsdtParametros_Fechainicio), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("FechaInicio", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtsdtParametros_Fechafin), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtsdtParametros_Fechafin), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtsdtParametros_Fechafin), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("FechaFin", sDateCnv, false, false);
      AddObjectProperty("MTknUsu", gxTv_SdtsdtParametros_Mtknusu, false, false);
      AddObjectProperty("MTkn", gxTv_SdtsdtParametros_Mtkn, false, false);
      AddObjectProperty("DefCod", gxTv_SdtsdtParametros_Defcod, false, false);
      AddObjectProperty("CatCod", gxTv_SdtsdtParametros_Catcod, false, false);
   }

   public String getgxTv_SdtsdtParametros_Emprcod( )
   {
      return gxTv_SdtsdtParametros_Emprcod ;
   }

   public void setgxTv_SdtsdtParametros_Emprcod( String value )
   {
      gxTv_SdtsdtParametros_N = (byte)(0) ;
      gxTv_SdtsdtParametros_Emprcod = value ;
   }

   public int getgxTv_SdtsdtParametros_Clicod( )
   {
      return gxTv_SdtsdtParametros_Clicod ;
   }

   public void setgxTv_SdtsdtParametros_Clicod( int value )
   {
      gxTv_SdtsdtParametros_N = (byte)(0) ;
      gxTv_SdtsdtParametros_Clicod = value ;
   }

   public String getgxTv_SdtsdtParametros_Artcod( )
   {
      return gxTv_SdtsdtParametros_Artcod ;
   }

   public void setgxTv_SdtsdtParametros_Artcod( String value )
   {
      gxTv_SdtsdtParametros_N = (byte)(0) ;
      gxTv_SdtsdtParametros_Artcod = value ;
   }

   public int getgxTv_SdtsdtParametros_Forcolnum( )
   {
      return gxTv_SdtsdtParametros_Forcolnum ;
   }

   public void setgxTv_SdtsdtParametros_Forcolnum( int value )
   {
      gxTv_SdtsdtParametros_N = (byte)(0) ;
      gxTv_SdtsdtParametros_Forcolnum = value ;
   }

   public String getgxTv_SdtsdtParametros_Tipmaqcod( )
   {
      return gxTv_SdtsdtParametros_Tipmaqcod ;
   }

   public void setgxTv_SdtsdtParametros_Tipmaqcod( String value )
   {
      gxTv_SdtsdtParametros_N = (byte)(0) ;
      gxTv_SdtsdtParametros_Tipmaqcod = value ;
   }

   public String getgxTv_SdtsdtParametros_Maqcod( )
   {
      return gxTv_SdtsdtParametros_Maqcod ;
   }

   public void setgxTv_SdtsdtParametros_Maqcod( String value )
   {
      gxTv_SdtsdtParametros_N = (byte)(0) ;
      gxTv_SdtsdtParametros_Maqcod = value ;
   }

   public java.util.Date getgxTv_SdtsdtParametros_Fechainicio( )
   {
      return gxTv_SdtsdtParametros_Fechainicio ;
   }

   public void setgxTv_SdtsdtParametros_Fechainicio( java.util.Date value )
   {
      gxTv_SdtsdtParametros_Fechainicio_N = (byte)(0) ;
      gxTv_SdtsdtParametros_N = (byte)(0) ;
      gxTv_SdtsdtParametros_Fechainicio = value ;
   }

   public java.util.Date getgxTv_SdtsdtParametros_Fechafin( )
   {
      return gxTv_SdtsdtParametros_Fechafin ;
   }

   public void setgxTv_SdtsdtParametros_Fechafin( java.util.Date value )
   {
      gxTv_SdtsdtParametros_Fechafin_N = (byte)(0) ;
      gxTv_SdtsdtParametros_N = (byte)(0) ;
      gxTv_SdtsdtParametros_Fechafin = value ;
   }

   public String getgxTv_SdtsdtParametros_Mtknusu( )
   {
      return gxTv_SdtsdtParametros_Mtknusu ;
   }

   public void setgxTv_SdtsdtParametros_Mtknusu( String value )
   {
      gxTv_SdtsdtParametros_N = (byte)(0) ;
      gxTv_SdtsdtParametros_Mtknusu = value ;
   }

   public String getgxTv_SdtsdtParametros_Mtkn( )
   {
      return gxTv_SdtsdtParametros_Mtkn ;
   }

   public void setgxTv_SdtsdtParametros_Mtkn( String value )
   {
      gxTv_SdtsdtParametros_N = (byte)(0) ;
      gxTv_SdtsdtParametros_Mtkn = value ;
   }

   public short getgxTv_SdtsdtParametros_Defcod( )
   {
      return gxTv_SdtsdtParametros_Defcod ;
   }

   public void setgxTv_SdtsdtParametros_Defcod( short value )
   {
      gxTv_SdtsdtParametros_N = (byte)(0) ;
      gxTv_SdtsdtParametros_Defcod = value ;
   }

   public short getgxTv_SdtsdtParametros_Catcod( )
   {
      return gxTv_SdtsdtParametros_Catcod ;
   }

   public void setgxTv_SdtsdtParametros_Catcod( short value )
   {
      gxTv_SdtsdtParametros_N = (byte)(0) ;
      gxTv_SdtsdtParametros_Catcod = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtsdtParametros_Emprcod = "" ;
      gxTv_SdtsdtParametros_N = (byte)(1) ;
      gxTv_SdtsdtParametros_Artcod = "" ;
      gxTv_SdtsdtParametros_Tipmaqcod = "" ;
      gxTv_SdtsdtParametros_Maqcod = "" ;
      gxTv_SdtsdtParametros_Fechainicio = GXutil.nullDate() ;
      gxTv_SdtsdtParametros_Fechainicio_N = (byte)(1) ;
      gxTv_SdtsdtParametros_Fechafin = GXutil.nullDate() ;
      gxTv_SdtsdtParametros_Fechafin_N = (byte)(1) ;
      gxTv_SdtsdtParametros_Mtknusu = "" ;
      gxTv_SdtsdtParametros_Mtkn = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtsdtParametros_N ;
   }

   public app.anticipacionerrores.SdtsdtParametros Clone( )
   {
      return (app.anticipacionerrores.SdtsdtParametros)(clone()) ;
   }

   public void setStruct( app.anticipacionerrores.StructSdtsdtParametros struct )
   {
      setgxTv_SdtsdtParametros_Emprcod(struct.getEmprcod());
      setgxTv_SdtsdtParametros_Clicod(struct.getClicod());
      setgxTv_SdtsdtParametros_Artcod(struct.getArtcod());
      setgxTv_SdtsdtParametros_Forcolnum(struct.getForcolnum());
      setgxTv_SdtsdtParametros_Tipmaqcod(struct.getTipmaqcod());
      setgxTv_SdtsdtParametros_Maqcod(struct.getMaqcod());
      if ( struct.gxTv_SdtsdtParametros_Fechainicio_N == 0 )
      {
         setgxTv_SdtsdtParametros_Fechainicio(struct.getFechainicio());
      }
      if ( struct.gxTv_SdtsdtParametros_Fechafin_N == 0 )
      {
         setgxTv_SdtsdtParametros_Fechafin(struct.getFechafin());
      }
      setgxTv_SdtsdtParametros_Mtknusu(struct.getMtknusu());
      setgxTv_SdtsdtParametros_Mtkn(struct.getMtkn());
      setgxTv_SdtsdtParametros_Defcod(struct.getDefcod());
      setgxTv_SdtsdtParametros_Catcod(struct.getCatcod());
   }

   @SuppressWarnings("unchecked")
   public app.anticipacionerrores.StructSdtsdtParametros getStruct( )
   {
      app.anticipacionerrores.StructSdtsdtParametros struct = new app.anticipacionerrores.StructSdtsdtParametros ();
      struct.setEmprcod(getgxTv_SdtsdtParametros_Emprcod());
      struct.setClicod(getgxTv_SdtsdtParametros_Clicod());
      struct.setArtcod(getgxTv_SdtsdtParametros_Artcod());
      struct.setForcolnum(getgxTv_SdtsdtParametros_Forcolnum());
      struct.setTipmaqcod(getgxTv_SdtsdtParametros_Tipmaqcod());
      struct.setMaqcod(getgxTv_SdtsdtParametros_Maqcod());
      if ( gxTv_SdtsdtParametros_Fechainicio_N == 0 )
      {
         struct.setFechainicio(getgxTv_SdtsdtParametros_Fechainicio());
      }
      if ( gxTv_SdtsdtParametros_Fechafin_N == 0 )
      {
         struct.setFechafin(getgxTv_SdtsdtParametros_Fechafin());
      }
      struct.setMtknusu(getgxTv_SdtsdtParametros_Mtknusu());
      struct.setMtkn(getgxTv_SdtsdtParametros_Mtkn());
      struct.setDefcod(getgxTv_SdtsdtParametros_Defcod());
      struct.setCatcod(getgxTv_SdtsdtParametros_Catcod());
      return struct ;
   }

   protected byte gxTv_SdtsdtParametros_N ;
   protected byte gxTv_SdtsdtParametros_Fechainicio_N ;
   protected byte gxTv_SdtsdtParametros_Fechafin_N ;
   protected short gxTv_SdtsdtParametros_Defcod ;
   protected short gxTv_SdtsdtParametros_Catcod ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtsdtParametros_Clicod ;
   protected int gxTv_SdtsdtParametros_Forcolnum ;
   protected String gxTv_SdtsdtParametros_Emprcod ;
   protected String gxTv_SdtsdtParametros_Artcod ;
   protected String gxTv_SdtsdtParametros_Tipmaqcod ;
   protected String gxTv_SdtsdtParametros_Maqcod ;
   protected String gxTv_SdtsdtParametros_Mtknusu ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtsdtParametros_Fechainicio ;
   protected java.util.Date gxTv_SdtsdtParametros_Fechafin ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtsdtParametros_Mtkn ;
}

