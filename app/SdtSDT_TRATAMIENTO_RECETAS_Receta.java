package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDT_TRATAMIENTO_RECETAS_Receta extends GxUserType
{
   public SdtSDT_TRATAMIENTO_RECETAS_Receta( )
   {
      this(  new ModelContext(SdtSDT_TRATAMIENTO_RECETAS_Receta.class));
   }

   public SdtSDT_TRATAMIENTO_RECETAS_Receta( ModelContext context )
   {
      super( context, "SdtSDT_TRATAMIENTO_RECETAS_Receta");
   }

   public SdtSDT_TRATAMIENTO_RECETAS_Receta( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle, context, "SdtSDT_TRATAMIENTO_RECETAS_Receta");
   }

   public SdtSDT_TRATAMIENTO_RECETAS_Receta( StructSdtSDT_TRATAMIENTO_RECETAS_Receta struct )
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
               gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarCod") )
            {
               gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarCodReo") )
            {
               gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcodreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarCodPar") )
            {
               gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcodpar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EmprNom") )
            {
               gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Emprnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliCod") )
            {
               gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarTotAgr") )
            {
               gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotagr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarTotPie") )
            {
               gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotpie = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarTotMtr") )
            {
               gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotmtr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarColNum") )
            {
               gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcolnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarColNom") )
            {
               gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcolnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarArtcod") )
            {
               gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barartcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarArtDsc") )
            {
               gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barartdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarGraaca") )
            {
               gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bargraaca = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Principal") )
            {
               gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Principal = (short)(getnumericvalue(oReader.getValue())) ;
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
         sName = "SDT_TRATAMIENTO_RECETAS.Receta" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarCod", gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarCodReo", GXutil.trim( GXutil.str( gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcodreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarCodPar", gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcodpar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("EmprNom", gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Emprnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliCod", GXutil.trim( GXutil.str( gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarTotAgr", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotagr, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarTotPie", GXutil.trim( GXutil.str( gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotpie, 5, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarTotMtr", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotmtr, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarColNum", GXutil.trim( GXutil.str( gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcolnum, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarColNom", gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcolnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarArtcod", gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barartcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarArtDsc", gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barartdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarGraaca", GXutil.trim( GXutil.str( gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bargraaca, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Principal", GXutil.trim( GXutil.str( gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Principal, 4, 0)));
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
      AddObjectProperty("EmprCod", gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Emprcod, false, false);
      AddObjectProperty("BarCod", gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcod, false, false);
      AddObjectProperty("BarCodReo", gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcodreo, false, false);
      AddObjectProperty("BarCodPar", gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcodpar, false, false);
      AddObjectProperty("EmprNom", gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Emprnom, false, false);
      AddObjectProperty("CliCod", gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Clinom, false, false);
      AddObjectProperty("BarTotAgr", gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotagr, false, false);
      AddObjectProperty("BarTotPie", gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotpie, false, false);
      AddObjectProperty("BarTotMtr", gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotmtr, false, false);
      AddObjectProperty("BarColNum", gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcolnum, false, false);
      AddObjectProperty("BarColNom", gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcolnom, false, false);
      AddObjectProperty("BarArtcod", gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barartcod, false, false);
      AddObjectProperty("BarArtDsc", gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barartdsc, false, false);
      AddObjectProperty("BarGraaca", gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bargraaca, false, false);
      AddObjectProperty("Principal", gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Principal, false, false);
   }

   public String getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Emprcod( )
   {
      return gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Emprcod ;
   }

   public void setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Emprcod( String value )
   {
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_N = (byte)(0) ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Emprcod = value ;
   }

   public String getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcod( )
   {
      return gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcod ;
   }

   public void setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcod( String value )
   {
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_N = (byte)(0) ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcod = value ;
   }

   public byte getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcodreo( )
   {
      return gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcodreo ;
   }

   public void setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcodreo( byte value )
   {
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_N = (byte)(0) ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcodreo = value ;
   }

   public String getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcodpar( )
   {
      return gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcodpar ;
   }

   public void setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcodpar( String value )
   {
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_N = (byte)(0) ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcodpar = value ;
   }

   public String getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Emprnom( )
   {
      return gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Emprnom ;
   }

   public void setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Emprnom( String value )
   {
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_N = (byte)(0) ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Emprnom = value ;
   }

   public int getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Clicod( )
   {
      return gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Clicod ;
   }

   public void setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Clicod( int value )
   {
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_N = (byte)(0) ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Clicod = value ;
   }

   public String getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Clinom( )
   {
      return gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Clinom ;
   }

   public void setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Clinom( String value )
   {
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_N = (byte)(0) ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Clinom = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotagr( )
   {
      return gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotagr ;
   }

   public void setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotagr( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_N = (byte)(0) ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotagr = value ;
   }

   public int getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotpie( )
   {
      return gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotpie ;
   }

   public void setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotpie( int value )
   {
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_N = (byte)(0) ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotpie = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotmtr( )
   {
      return gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotmtr ;
   }

   public void setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotmtr( java.math.BigDecimal value )
   {
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_N = (byte)(0) ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotmtr = value ;
   }

   public int getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcolnum( )
   {
      return gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcolnum ;
   }

   public void setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcolnum( int value )
   {
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_N = (byte)(0) ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcolnum = value ;
   }

   public String getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcolnom( )
   {
      return gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcolnom ;
   }

   public void setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcolnom( String value )
   {
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_N = (byte)(0) ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcolnom = value ;
   }

   public String getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barartcod( )
   {
      return gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barartcod ;
   }

   public void setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barartcod( String value )
   {
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_N = (byte)(0) ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barartcod = value ;
   }

   public String getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barartdsc( )
   {
      return gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barartdsc ;
   }

   public void setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barartdsc( String value )
   {
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_N = (byte)(0) ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barartdsc = value ;
   }

   public short getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bargraaca( )
   {
      return gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bargraaca ;
   }

   public void setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bargraaca( short value )
   {
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_N = (byte)(0) ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bargraaca = value ;
   }

   public short getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Principal( )
   {
      return gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Principal ;
   }

   public void setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Principal( short value )
   {
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_N = (byte)(0) ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Principal = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Emprcod = "" ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_N = (byte)(1) ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcod = "" ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcodpar = "" ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Emprnom = "" ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Clinom = "" ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotagr = DecimalUtil.ZERO ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotmtr = DecimalUtil.ZERO ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcolnom = "" ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barartcod = "" ;
      gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barartdsc = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_N ;
   }

   public app.SdtSDT_TRATAMIENTO_RECETAS_Receta Clone( )
   {
      return (app.SdtSDT_TRATAMIENTO_RECETAS_Receta)(clone()) ;
   }

   public void setStruct( app.StructSdtSDT_TRATAMIENTO_RECETAS_Receta struct )
   {
      setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Emprcod(struct.getEmprcod());
      setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcod(struct.getBarcod());
      setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcodreo(struct.getBarcodreo());
      setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcodpar(struct.getBarcodpar());
      setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Emprnom(struct.getEmprnom());
      setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Clicod(struct.getClicod());
      setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Clinom(struct.getClinom());
      setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotagr(struct.getBartotagr());
      setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotpie(struct.getBartotpie());
      setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotmtr(struct.getBartotmtr());
      setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcolnum(struct.getBarcolnum());
      setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcolnom(struct.getBarcolnom());
      setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barartcod(struct.getBarartcod());
      setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barartdsc(struct.getBarartdsc());
      setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bargraaca(struct.getBargraaca());
      setgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Principal(struct.getPrincipal());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDT_TRATAMIENTO_RECETAS_Receta getStruct( )
   {
      app.StructSdtSDT_TRATAMIENTO_RECETAS_Receta struct = new app.StructSdtSDT_TRATAMIENTO_RECETAS_Receta ();
      struct.setEmprcod(getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Emprcod());
      struct.setBarcod(getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcod());
      struct.setBarcodreo(getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcodreo());
      struct.setBarcodpar(getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcodpar());
      struct.setEmprnom(getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Emprnom());
      struct.setClicod(getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Clicod());
      struct.setClinom(getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Clinom());
      struct.setBartotagr(getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotagr());
      struct.setBartotpie(getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotpie());
      struct.setBartotmtr(getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotmtr());
      struct.setBarcolnum(getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcolnum());
      struct.setBarcolnom(getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcolnom());
      struct.setBarartcod(getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barartcod());
      struct.setBarartdsc(getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barartdsc());
      struct.setBargraaca(getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bargraaca());
      struct.setPrincipal(getgxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Principal());
      return struct ;
   }

   protected byte gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_N ;
   protected byte gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcodreo ;
   protected short gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bargraaca ;
   protected short gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Principal ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Clicod ;
   protected int gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotpie ;
   protected int gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcolnum ;
   protected java.math.BigDecimal gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotagr ;
   protected java.math.BigDecimal gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Bartotmtr ;
   protected String gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Emprcod ;
   protected String gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcodpar ;
   protected String gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Emprnom ;
   protected String gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Clinom ;
   protected String gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcolnom ;
   protected String gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barartcod ;
   protected String gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barartdsc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDT_TRATAMIENTO_RECETAS_Receta_Barcod ;
}

