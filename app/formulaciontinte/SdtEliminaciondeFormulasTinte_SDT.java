package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtEliminaciondeFormulasTinte_SDT extends GxUserType
{
   public SdtEliminaciondeFormulasTinte_SDT( )
   {
      this(  new ModelContext(SdtEliminaciondeFormulasTinte_SDT.class));
   }

   public SdtEliminaciondeFormulasTinte_SDT( ModelContext context )
   {
      super( context, "SdtEliminaciondeFormulasTinte_SDT");
   }

   public SdtEliminaciondeFormulasTinte_SDT( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle, context, "SdtEliminaciondeFormulasTinte_SDT");
   }

   public SdtEliminaciondeFormulasTinte_SDT( StructSdtEliminaciondeFormulasTinte_SDT struct )
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
               gxTv_SdtEliminaciondeFormulasTinte_SDT_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtEliminaciondeFormulasTinte_SDT_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Forser") )
            {
               gxTv_SdtEliminaciondeFormulasTinte_SDT_Forser = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Forserdsc") )
            {
               gxTv_SdtEliminaciondeFormulasTinte_SDT_Forserdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Forcolnom") )
            {
               gxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Forcolnum") )
            {
               gxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Tipcolcod") )
            {
               gxTv_SdtEliminaciondeFormulasTinte_SDT_Tipcolcod = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ForUltUti") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtEliminaciondeFormulasTinte_SDT_Forultuti = GXutil.nullDate() ;
                  gxTv_SdtEliminaciondeFormulasTinte_SDT_Forultuti_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtEliminaciondeFormulasTinte_SDT_Forultuti_N = (byte)(0) ;
                  gxTv_SdtEliminaciondeFormulasTinte_SDT_Forultuti = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ForPro") )
            {
               gxTv_SdtEliminaciondeFormulasTinte_SDT_Forpro = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ForNumcol") )
            {
               gxTv_SdtEliminaciondeFormulasTinte_SDT_Fornumcol = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NumHdrsProd") )
            {
               gxTv_SdtEliminaciondeFormulasTinte_SDT_Numhdrsprod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NumHdrsHist") )
            {
               gxTv_SdtEliminaciondeFormulasTinte_SDT_Numhdrshist = (int)(getnumericvalue(oReader.getValue())) ;
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
         sName = "EliminaciondeFormulasTinte_SDT" ;
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
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtEliminaciondeFormulasTinte_SDT_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtEliminaciondeFormulasTinte_SDT_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Forser", gxTv_SdtEliminaciondeFormulasTinte_SDT_Forser);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Forserdsc", gxTv_SdtEliminaciondeFormulasTinte_SDT_Forserdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Forcolnom", gxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Forcolnum", GXutil.trim( GXutil.str( gxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnum, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Tipcolcod", GXutil.trim( GXutil.str( gxTv_SdtEliminaciondeFormulasTinte_SDT_Tipcolcod, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtEliminaciondeFormulasTinte_SDT_Forultuti)) && ( gxTv_SdtEliminaciondeFormulasTinte_SDT_Forultuti_N == 1 ) )
      {
         oWriter.writeElement("ForUltUti", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtEliminaciondeFormulasTinte_SDT_Forultuti), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtEliminaciondeFormulasTinte_SDT_Forultuti), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtEliminaciondeFormulasTinte_SDT_Forultuti), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("ForUltUti", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("ForPro", gxTv_SdtEliminaciondeFormulasTinte_SDT_Forpro);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ForNumcol", GXutil.trim( GXutil.str( gxTv_SdtEliminaciondeFormulasTinte_SDT_Fornumcol, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("NumHdrsProd", GXutil.trim( GXutil.str( gxTv_SdtEliminaciondeFormulasTinte_SDT_Numhdrsprod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("NumHdrsHist", GXutil.trim( GXutil.str( gxTv_SdtEliminaciondeFormulasTinte_SDT_Numhdrshist, 6, 0)));
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
      AddObjectProperty("Clicod", gxTv_SdtEliminaciondeFormulasTinte_SDT_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtEliminaciondeFormulasTinte_SDT_Clinom, false, false);
      AddObjectProperty("Forser", gxTv_SdtEliminaciondeFormulasTinte_SDT_Forser, false, false);
      AddObjectProperty("Forserdsc", gxTv_SdtEliminaciondeFormulasTinte_SDT_Forserdsc, false, false);
      AddObjectProperty("Forcolnom", gxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnom, false, false);
      AddObjectProperty("Forcolnum", gxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnum, false, false);
      AddObjectProperty("Tipcolcod", gxTv_SdtEliminaciondeFormulasTinte_SDT_Tipcolcod, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtEliminaciondeFormulasTinte_SDT_Forultuti), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtEliminaciondeFormulasTinte_SDT_Forultuti), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtEliminaciondeFormulasTinte_SDT_Forultuti), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("ForUltUti", sDateCnv, false, false);
      AddObjectProperty("ForPro", gxTv_SdtEliminaciondeFormulasTinte_SDT_Forpro, false, false);
      AddObjectProperty("ForNumcol", gxTv_SdtEliminaciondeFormulasTinte_SDT_Fornumcol, false, false);
      AddObjectProperty("NumHdrsProd", gxTv_SdtEliminaciondeFormulasTinte_SDT_Numhdrsprod, false, false);
      AddObjectProperty("NumHdrsHist", gxTv_SdtEliminaciondeFormulasTinte_SDT_Numhdrshist, false, false);
   }

   public int getgxTv_SdtEliminaciondeFormulasTinte_SDT_Clicod( )
   {
      return gxTv_SdtEliminaciondeFormulasTinte_SDT_Clicod ;
   }

   public void setgxTv_SdtEliminaciondeFormulasTinte_SDT_Clicod( int value )
   {
      gxTv_SdtEliminaciondeFormulasTinte_SDT_N = (byte)(0) ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Clicod = value ;
   }

   public String getgxTv_SdtEliminaciondeFormulasTinte_SDT_Clinom( )
   {
      return gxTv_SdtEliminaciondeFormulasTinte_SDT_Clinom ;
   }

   public void setgxTv_SdtEliminaciondeFormulasTinte_SDT_Clinom( String value )
   {
      gxTv_SdtEliminaciondeFormulasTinte_SDT_N = (byte)(0) ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Clinom = value ;
   }

   public String getgxTv_SdtEliminaciondeFormulasTinte_SDT_Forser( )
   {
      return gxTv_SdtEliminaciondeFormulasTinte_SDT_Forser ;
   }

   public void setgxTv_SdtEliminaciondeFormulasTinte_SDT_Forser( String value )
   {
      gxTv_SdtEliminaciondeFormulasTinte_SDT_N = (byte)(0) ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Forser = value ;
   }

   public String getgxTv_SdtEliminaciondeFormulasTinte_SDT_Forserdsc( )
   {
      return gxTv_SdtEliminaciondeFormulasTinte_SDT_Forserdsc ;
   }

   public void setgxTv_SdtEliminaciondeFormulasTinte_SDT_Forserdsc( String value )
   {
      gxTv_SdtEliminaciondeFormulasTinte_SDT_N = (byte)(0) ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Forserdsc = value ;
   }

   public String getgxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnom( )
   {
      return gxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnom ;
   }

   public void setgxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnom( String value )
   {
      gxTv_SdtEliminaciondeFormulasTinte_SDT_N = (byte)(0) ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnom = value ;
   }

   public int getgxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnum( )
   {
      return gxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnum ;
   }

   public void setgxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnum( int value )
   {
      gxTv_SdtEliminaciondeFormulasTinte_SDT_N = (byte)(0) ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnum = value ;
   }

   public byte getgxTv_SdtEliminaciondeFormulasTinte_SDT_Tipcolcod( )
   {
      return gxTv_SdtEliminaciondeFormulasTinte_SDT_Tipcolcod ;
   }

   public void setgxTv_SdtEliminaciondeFormulasTinte_SDT_Tipcolcod( byte value )
   {
      gxTv_SdtEliminaciondeFormulasTinte_SDT_N = (byte)(0) ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Tipcolcod = value ;
   }

   public java.util.Date getgxTv_SdtEliminaciondeFormulasTinte_SDT_Forultuti( )
   {
      return gxTv_SdtEliminaciondeFormulasTinte_SDT_Forultuti ;
   }

   public void setgxTv_SdtEliminaciondeFormulasTinte_SDT_Forultuti( java.util.Date value )
   {
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Forultuti_N = (byte)(0) ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_N = (byte)(0) ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Forultuti = value ;
   }

   public String getgxTv_SdtEliminaciondeFormulasTinte_SDT_Forpro( )
   {
      return gxTv_SdtEliminaciondeFormulasTinte_SDT_Forpro ;
   }

   public void setgxTv_SdtEliminaciondeFormulasTinte_SDT_Forpro( String value )
   {
      gxTv_SdtEliminaciondeFormulasTinte_SDT_N = (byte)(0) ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Forpro = value ;
   }

   public int getgxTv_SdtEliminaciondeFormulasTinte_SDT_Fornumcol( )
   {
      return gxTv_SdtEliminaciondeFormulasTinte_SDT_Fornumcol ;
   }

   public void setgxTv_SdtEliminaciondeFormulasTinte_SDT_Fornumcol( int value )
   {
      gxTv_SdtEliminaciondeFormulasTinte_SDT_N = (byte)(0) ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Fornumcol = value ;
   }

   public int getgxTv_SdtEliminaciondeFormulasTinte_SDT_Numhdrsprod( )
   {
      return gxTv_SdtEliminaciondeFormulasTinte_SDT_Numhdrsprod ;
   }

   public void setgxTv_SdtEliminaciondeFormulasTinte_SDT_Numhdrsprod( int value )
   {
      gxTv_SdtEliminaciondeFormulasTinte_SDT_N = (byte)(0) ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Numhdrsprod = value ;
   }

   public int getgxTv_SdtEliminaciondeFormulasTinte_SDT_Numhdrshist( )
   {
      return gxTv_SdtEliminaciondeFormulasTinte_SDT_Numhdrshist ;
   }

   public void setgxTv_SdtEliminaciondeFormulasTinte_SDT_Numhdrshist( int value )
   {
      gxTv_SdtEliminaciondeFormulasTinte_SDT_N = (byte)(0) ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Numhdrshist = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtEliminaciondeFormulasTinte_SDT_N = (byte)(1) ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Clinom = "" ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Forser = "" ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Forserdsc = "" ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnom = "" ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Forultuti = GXutil.nullDate() ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Forultuti_N = (byte)(1) ;
      gxTv_SdtEliminaciondeFormulasTinte_SDT_Forpro = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtEliminaciondeFormulasTinte_SDT_N ;
   }

   public app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT Clone( )
   {
      return (app.formulaciontinte.SdtEliminaciondeFormulasTinte_SDT)(clone()) ;
   }

   public void setStruct( app.formulaciontinte.StructSdtEliminaciondeFormulasTinte_SDT struct )
   {
      setgxTv_SdtEliminaciondeFormulasTinte_SDT_Clicod(struct.getClicod());
      setgxTv_SdtEliminaciondeFormulasTinte_SDT_Clinom(struct.getClinom());
      setgxTv_SdtEliminaciondeFormulasTinte_SDT_Forser(struct.getForser());
      setgxTv_SdtEliminaciondeFormulasTinte_SDT_Forserdsc(struct.getForserdsc());
      setgxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnom(struct.getForcolnom());
      setgxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnum(struct.getForcolnum());
      setgxTv_SdtEliminaciondeFormulasTinte_SDT_Tipcolcod(struct.getTipcolcod());
      if ( struct.gxTv_SdtEliminaciondeFormulasTinte_SDT_Forultuti_N == 0 )
      {
         setgxTv_SdtEliminaciondeFormulasTinte_SDT_Forultuti(struct.getForultuti());
      }
      setgxTv_SdtEliminaciondeFormulasTinte_SDT_Forpro(struct.getForpro());
      setgxTv_SdtEliminaciondeFormulasTinte_SDT_Fornumcol(struct.getFornumcol());
      setgxTv_SdtEliminaciondeFormulasTinte_SDT_Numhdrsprod(struct.getNumhdrsprod());
      setgxTv_SdtEliminaciondeFormulasTinte_SDT_Numhdrshist(struct.getNumhdrshist());
   }

   @SuppressWarnings("unchecked")
   public app.formulaciontinte.StructSdtEliminaciondeFormulasTinte_SDT getStruct( )
   {
      app.formulaciontinte.StructSdtEliminaciondeFormulasTinte_SDT struct = new app.formulaciontinte.StructSdtEliminaciondeFormulasTinte_SDT ();
      struct.setClicod(getgxTv_SdtEliminaciondeFormulasTinte_SDT_Clicod());
      struct.setClinom(getgxTv_SdtEliminaciondeFormulasTinte_SDT_Clinom());
      struct.setForser(getgxTv_SdtEliminaciondeFormulasTinte_SDT_Forser());
      struct.setForserdsc(getgxTv_SdtEliminaciondeFormulasTinte_SDT_Forserdsc());
      struct.setForcolnom(getgxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnom());
      struct.setForcolnum(getgxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnum());
      struct.setTipcolcod(getgxTv_SdtEliminaciondeFormulasTinte_SDT_Tipcolcod());
      if ( gxTv_SdtEliminaciondeFormulasTinte_SDT_Forultuti_N == 0 )
      {
         struct.setForultuti(getgxTv_SdtEliminaciondeFormulasTinte_SDT_Forultuti());
      }
      struct.setForpro(getgxTv_SdtEliminaciondeFormulasTinte_SDT_Forpro());
      struct.setFornumcol(getgxTv_SdtEliminaciondeFormulasTinte_SDT_Fornumcol());
      struct.setNumhdrsprod(getgxTv_SdtEliminaciondeFormulasTinte_SDT_Numhdrsprod());
      struct.setNumhdrshist(getgxTv_SdtEliminaciondeFormulasTinte_SDT_Numhdrshist());
      return struct ;
   }

   protected byte gxTv_SdtEliminaciondeFormulasTinte_SDT_N ;
   protected byte gxTv_SdtEliminaciondeFormulasTinte_SDT_Tipcolcod ;
   protected byte gxTv_SdtEliminaciondeFormulasTinte_SDT_Forultuti_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtEliminaciondeFormulasTinte_SDT_Clicod ;
   protected int gxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnum ;
   protected int gxTv_SdtEliminaciondeFormulasTinte_SDT_Fornumcol ;
   protected int gxTv_SdtEliminaciondeFormulasTinte_SDT_Numhdrsprod ;
   protected int gxTv_SdtEliminaciondeFormulasTinte_SDT_Numhdrshist ;
   protected String gxTv_SdtEliminaciondeFormulasTinte_SDT_Clinom ;
   protected String gxTv_SdtEliminaciondeFormulasTinte_SDT_Forser ;
   protected String gxTv_SdtEliminaciondeFormulasTinte_SDT_Forserdsc ;
   protected String gxTv_SdtEliminaciondeFormulasTinte_SDT_Forcolnom ;
   protected String gxTv_SdtEliminaciondeFormulasTinte_SDT_Forpro ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtEliminaciondeFormulasTinte_SDT_Forultuti ;
   protected boolean readElement ;
   protected boolean formatError ;
}

