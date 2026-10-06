package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTiempoMedioEntrega_LAB extends GxUserType
{
   public SdtTiempoMedioEntrega_LAB( )
   {
      this(  new ModelContext(SdtTiempoMedioEntrega_LAB.class));
   }

   public SdtTiempoMedioEntrega_LAB( ModelContext context )
   {
      super( context, "SdtTiempoMedioEntrega_LAB");
   }

   public SdtTiempoMedioEntrega_LAB( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle, context, "SdtTiempoMedioEntrega_LAB");
   }

   public SdtTiempoMedioEntrega_LAB( StructSdtTiempoMedioEntrega_LAB struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Clicod") )
            {
               gxTv_SdtTiempoMedioEntrega_LAB_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtTiempoMedioEntrega_LAB_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_numero") )
            {
               gxTv_SdtTiempoMedioEntrega_LAB_Lb_numero = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_artcod") )
            {
               gxTv_SdtTiempoMedioEntrega_LAB_Lb_artcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_ColNom") )
            {
               gxTv_SdtTiempoMedioEntrega_LAB_Lb_colnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_Cartaz") )
            {
               gxTv_SdtTiempoMedioEntrega_LAB_Lb_cartaz = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_FechaE") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechae = GXutil.nullDate() ;
                  gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechae_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechae_N = (byte)(0) ;
                  gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechae = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_FechaEn") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechaen = GXutil.nullDate() ;
                  gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechaen_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechaen_N = (byte)(0) ;
                  gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechaen = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lb_Dias") )
            {
               gxTv_SdtTiempoMedioEntrega_LAB_Lb_dias = (short)(getnumericvalue(oReader.getValue())) ;
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
         sName = "TiempoMedioEntrega_LAB" ;
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
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtTiempoMedioEntrega_LAB_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtTiempoMedioEntrega_LAB_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Lb_numero", GXutil.trim( GXutil.str( gxTv_SdtTiempoMedioEntrega_LAB_Lb_numero, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Lb_artcod", gxTv_SdtTiempoMedioEntrega_LAB_Lb_artcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Lb_ColNom", gxTv_SdtTiempoMedioEntrega_LAB_Lb_colnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Lb_Cartaz", gxTv_SdtTiempoMedioEntrega_LAB_Lb_cartaz);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechae)) && ( gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechae_N == 1 ) )
      {
         oWriter.writeElement("Lb_FechaE", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechae), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechae), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechae), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Lb_FechaE", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechaen)) && ( gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechaen_N == 1 ) )
      {
         oWriter.writeElement("Lb_FechaEn", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechaen), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechaen), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechaen), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Lb_FechaEn", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("Lb_Dias", GXutil.trim( GXutil.str( gxTv_SdtTiempoMedioEntrega_LAB_Lb_dias, 4, 0)));
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
      AddObjectProperty("Clicod", gxTv_SdtTiempoMedioEntrega_LAB_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtTiempoMedioEntrega_LAB_Clinom, false, false);
      AddObjectProperty("Lb_numero", gxTv_SdtTiempoMedioEntrega_LAB_Lb_numero, false, false);
      AddObjectProperty("Lb_artcod", gxTv_SdtTiempoMedioEntrega_LAB_Lb_artcod, false, false);
      AddObjectProperty("Lb_ColNom", gxTv_SdtTiempoMedioEntrega_LAB_Lb_colnom, false, false);
      AddObjectProperty("Lb_Cartaz", gxTv_SdtTiempoMedioEntrega_LAB_Lb_cartaz, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechae), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechae), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechae), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Lb_FechaE", sDateCnv, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechaen), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechaen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechaen), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Lb_FechaEn", sDateCnv, false, false);
      AddObjectProperty("Lb_Dias", gxTv_SdtTiempoMedioEntrega_LAB_Lb_dias, false, false);
   }

   public int getgxTv_SdtTiempoMedioEntrega_LAB_Clicod( )
   {
      return gxTv_SdtTiempoMedioEntrega_LAB_Clicod ;
   }

   public void setgxTv_SdtTiempoMedioEntrega_LAB_Clicod( int value )
   {
      gxTv_SdtTiempoMedioEntrega_LAB_N = (byte)(0) ;
      gxTv_SdtTiempoMedioEntrega_LAB_Clicod = value ;
   }

   public String getgxTv_SdtTiempoMedioEntrega_LAB_Clinom( )
   {
      return gxTv_SdtTiempoMedioEntrega_LAB_Clinom ;
   }

   public void setgxTv_SdtTiempoMedioEntrega_LAB_Clinom( String value )
   {
      gxTv_SdtTiempoMedioEntrega_LAB_N = (byte)(0) ;
      gxTv_SdtTiempoMedioEntrega_LAB_Clinom = value ;
   }

   public int getgxTv_SdtTiempoMedioEntrega_LAB_Lb_numero( )
   {
      return gxTv_SdtTiempoMedioEntrega_LAB_Lb_numero ;
   }

   public void setgxTv_SdtTiempoMedioEntrega_LAB_Lb_numero( int value )
   {
      gxTv_SdtTiempoMedioEntrega_LAB_N = (byte)(0) ;
      gxTv_SdtTiempoMedioEntrega_LAB_Lb_numero = value ;
   }

   public String getgxTv_SdtTiempoMedioEntrega_LAB_Lb_artcod( )
   {
      return gxTv_SdtTiempoMedioEntrega_LAB_Lb_artcod ;
   }

   public void setgxTv_SdtTiempoMedioEntrega_LAB_Lb_artcod( String value )
   {
      gxTv_SdtTiempoMedioEntrega_LAB_N = (byte)(0) ;
      gxTv_SdtTiempoMedioEntrega_LAB_Lb_artcod = value ;
   }

   public String getgxTv_SdtTiempoMedioEntrega_LAB_Lb_colnom( )
   {
      return gxTv_SdtTiempoMedioEntrega_LAB_Lb_colnom ;
   }

   public void setgxTv_SdtTiempoMedioEntrega_LAB_Lb_colnom( String value )
   {
      gxTv_SdtTiempoMedioEntrega_LAB_N = (byte)(0) ;
      gxTv_SdtTiempoMedioEntrega_LAB_Lb_colnom = value ;
   }

   public String getgxTv_SdtTiempoMedioEntrega_LAB_Lb_cartaz( )
   {
      return gxTv_SdtTiempoMedioEntrega_LAB_Lb_cartaz ;
   }

   public void setgxTv_SdtTiempoMedioEntrega_LAB_Lb_cartaz( String value )
   {
      gxTv_SdtTiempoMedioEntrega_LAB_N = (byte)(0) ;
      gxTv_SdtTiempoMedioEntrega_LAB_Lb_cartaz = value ;
   }

   public java.util.Date getgxTv_SdtTiempoMedioEntrega_LAB_Lb_fechae( )
   {
      return gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechae ;
   }

   public void setgxTv_SdtTiempoMedioEntrega_LAB_Lb_fechae( java.util.Date value )
   {
      gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechae_N = (byte)(0) ;
      gxTv_SdtTiempoMedioEntrega_LAB_N = (byte)(0) ;
      gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechae = value ;
   }

   public java.util.Date getgxTv_SdtTiempoMedioEntrega_LAB_Lb_fechaen( )
   {
      return gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechaen ;
   }

   public void setgxTv_SdtTiempoMedioEntrega_LAB_Lb_fechaen( java.util.Date value )
   {
      gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechaen_N = (byte)(0) ;
      gxTv_SdtTiempoMedioEntrega_LAB_N = (byte)(0) ;
      gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechaen = value ;
   }

   public short getgxTv_SdtTiempoMedioEntrega_LAB_Lb_dias( )
   {
      return gxTv_SdtTiempoMedioEntrega_LAB_Lb_dias ;
   }

   public void setgxTv_SdtTiempoMedioEntrega_LAB_Lb_dias( short value )
   {
      gxTv_SdtTiempoMedioEntrega_LAB_N = (byte)(0) ;
      gxTv_SdtTiempoMedioEntrega_LAB_Lb_dias = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtTiempoMedioEntrega_LAB_N = (byte)(1) ;
      gxTv_SdtTiempoMedioEntrega_LAB_Clinom = "" ;
      gxTv_SdtTiempoMedioEntrega_LAB_Lb_artcod = "" ;
      gxTv_SdtTiempoMedioEntrega_LAB_Lb_colnom = "" ;
      gxTv_SdtTiempoMedioEntrega_LAB_Lb_cartaz = "" ;
      gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechae = GXutil.nullDate() ;
      gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechae_N = (byte)(1) ;
      gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechaen = GXutil.nullDate() ;
      gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechaen_N = (byte)(1) ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtTiempoMedioEntrega_LAB_N ;
   }

   public app.gestionlaboratorio.SdtTiempoMedioEntrega_LAB Clone( )
   {
      return (app.gestionlaboratorio.SdtTiempoMedioEntrega_LAB)(clone()) ;
   }

   public void setStruct( app.gestionlaboratorio.StructSdtTiempoMedioEntrega_LAB struct )
   {
      setgxTv_SdtTiempoMedioEntrega_LAB_Clicod(struct.getClicod());
      setgxTv_SdtTiempoMedioEntrega_LAB_Clinom(struct.getClinom());
      setgxTv_SdtTiempoMedioEntrega_LAB_Lb_numero(struct.getLb_numero());
      setgxTv_SdtTiempoMedioEntrega_LAB_Lb_artcod(struct.getLb_artcod());
      setgxTv_SdtTiempoMedioEntrega_LAB_Lb_colnom(struct.getLb_colnom());
      setgxTv_SdtTiempoMedioEntrega_LAB_Lb_cartaz(struct.getLb_cartaz());
      if ( struct.gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechae_N == 0 )
      {
         setgxTv_SdtTiempoMedioEntrega_LAB_Lb_fechae(struct.getLb_fechae());
      }
      if ( struct.gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechaen_N == 0 )
      {
         setgxTv_SdtTiempoMedioEntrega_LAB_Lb_fechaen(struct.getLb_fechaen());
      }
      setgxTv_SdtTiempoMedioEntrega_LAB_Lb_dias(struct.getLb_dias());
   }

   @SuppressWarnings("unchecked")
   public app.gestionlaboratorio.StructSdtTiempoMedioEntrega_LAB getStruct( )
   {
      app.gestionlaboratorio.StructSdtTiempoMedioEntrega_LAB struct = new app.gestionlaboratorio.StructSdtTiempoMedioEntrega_LAB ();
      struct.setClicod(getgxTv_SdtTiempoMedioEntrega_LAB_Clicod());
      struct.setClinom(getgxTv_SdtTiempoMedioEntrega_LAB_Clinom());
      struct.setLb_numero(getgxTv_SdtTiempoMedioEntrega_LAB_Lb_numero());
      struct.setLb_artcod(getgxTv_SdtTiempoMedioEntrega_LAB_Lb_artcod());
      struct.setLb_colnom(getgxTv_SdtTiempoMedioEntrega_LAB_Lb_colnom());
      struct.setLb_cartaz(getgxTv_SdtTiempoMedioEntrega_LAB_Lb_cartaz());
      if ( gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechae_N == 0 )
      {
         struct.setLb_fechae(getgxTv_SdtTiempoMedioEntrega_LAB_Lb_fechae());
      }
      if ( gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechaen_N == 0 )
      {
         struct.setLb_fechaen(getgxTv_SdtTiempoMedioEntrega_LAB_Lb_fechaen());
      }
      struct.setLb_dias(getgxTv_SdtTiempoMedioEntrega_LAB_Lb_dias());
      return struct ;
   }

   protected byte gxTv_SdtTiempoMedioEntrega_LAB_N ;
   protected byte gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechae_N ;
   protected byte gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechaen_N ;
   protected short gxTv_SdtTiempoMedioEntrega_LAB_Lb_dias ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtTiempoMedioEntrega_LAB_Clicod ;
   protected int gxTv_SdtTiempoMedioEntrega_LAB_Lb_numero ;
   protected String gxTv_SdtTiempoMedioEntrega_LAB_Clinom ;
   protected String gxTv_SdtTiempoMedioEntrega_LAB_Lb_artcod ;
   protected String gxTv_SdtTiempoMedioEntrega_LAB_Lb_colnom ;
   protected String gxTv_SdtTiempoMedioEntrega_LAB_Lb_cartaz ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechae ;
   protected java.util.Date gxTv_SdtTiempoMedioEntrega_LAB_Lb_fechaen ;
   protected boolean readElement ;
   protected boolean formatError ;
}

