package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtPenalizaciones_SDT_Item extends GxUserType
{
   public SdtPenalizaciones_SDT_Item( )
   {
      this(  new ModelContext(SdtPenalizaciones_SDT_Item.class));
   }

   public SdtPenalizaciones_SDT_Item( ModelContext context )
   {
      super( context, "SdtPenalizaciones_SDT_Item");
   }

   public SdtPenalizaciones_SDT_Item( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle, context, "SdtPenalizaciones_SDT_Item");
   }

   public SdtPenalizaciones_SDT_Item( StructSdtPenalizaciones_SDT_Item struct )
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
               gxTv_SdtPenalizaciones_SDT_Item_Seleccionar = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Clicod") )
            {
               gxTv_SdtPenalizaciones_SDT_Item_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barmancod1") )
            {
               gxTv_SdtPenalizaciones_SDT_Item_Barmancod1 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcolnum") )
            {
               gxTv_SdtPenalizaciones_SDT_Item_Barcolnum = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcolnom") )
            {
               gxTv_SdtPenalizaciones_SDT_Item_Barcolnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcod") )
            {
               gxTv_SdtPenalizaciones_SDT_Item_Barcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcodreo") )
            {
               gxTv_SdtPenalizaciones_SDT_Item_Barcodreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcodpar") )
            {
               gxTv_SdtPenalizaciones_SDT_Item_Barcodpar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbProcod") )
            {
               gxTv_SdtPenalizaciones_SDT_Item_Albprocod = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarKgm") )
            {
               gxTv_SdtPenalizaciones_SDT_Item_Barkgm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Baralbkgm") )
            {
               gxTv_SdtPenalizaciones_SDT_Item_Baralbkgm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMDDtoTin") )
            {
               gxTv_SdtPenalizaciones_SDT_Item_Pmddtotin = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMDDtoAca") )
            {
               gxTv_SdtPenalizaciones_SDT_Item_Pmddtoaca = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMDTinPrc") )
            {
               gxTv_SdtPenalizaciones_SDT_Item_Pmdtinprc = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMDAcaPrc") )
            {
               gxTv_SdtPenalizaciones_SDT_Item_Pmdacaprc = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Precio") )
            {
               gxTv_SdtPenalizaciones_SDT_Item_Precio = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarPreKgm") )
            {
               gxTv_SdtPenalizaciones_SDT_Item_Barprekgm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtPenalizaciones_SDT_Item_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMDDsc") )
            {
               gxTv_SdtPenalizaciones_SDT_Item_Pmddsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OkKgMin") )
            {
               gxTv_SdtPenalizaciones_SDT_Item_Okkgmin = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMDPreUni") )
            {
               gxTv_SdtPenalizaciones_SDT_Item_Pmdpreuni = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BarAcc") )
            {
               gxTv_SdtPenalizaciones_SDT_Item_Baracc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Fase_618") )
            {
               gxTv_SdtPenalizaciones_SDT_Item_Fase_618 = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PMDKgmMinS") )
            {
               gxTv_SdtPenalizaciones_SDT_Item_Pmdkgmmins = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MtsMinS") )
            {
               gxTv_SdtPenalizaciones_SDT_Item_Mtsmins = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "Penalizaciones_SDT.Item" ;
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
      oWriter.writeElement("Seleccionar", GXutil.booltostr( gxTv_SdtPenalizaciones_SDT_Item_Seleccionar));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtPenalizaciones_SDT_Item_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barmancod1", GXutil.trim( GXutil.str( gxTv_SdtPenalizaciones_SDT_Item_Barmancod1, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcolnum", GXutil.trim( GXutil.str( gxTv_SdtPenalizaciones_SDT_Item_Barcolnum, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcolnom", gxTv_SdtPenalizaciones_SDT_Item_Barcolnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcod", GXutil.trim( GXutil.str( gxTv_SdtPenalizaciones_SDT_Item_Barcod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcodreo", GXutil.trim( GXutil.str( gxTv_SdtPenalizaciones_SDT_Item_Barcodreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcodpar", gxTv_SdtPenalizaciones_SDT_Item_Barcodpar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbProcod", GXutil.trim( GXutil.str( gxTv_SdtPenalizaciones_SDT_Item_Albprocod, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarKgm", GXutil.trim( GXutil.strNoRound( gxTv_SdtPenalizaciones_SDT_Item_Barkgm, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Baralbkgm", GXutil.trim( GXutil.strNoRound( gxTv_SdtPenalizaciones_SDT_Item_Baralbkgm, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PMDDtoTin", GXutil.trim( GXutil.strNoRound( gxTv_SdtPenalizaciones_SDT_Item_Pmddtotin, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PMDDtoAca", GXutil.trim( GXutil.strNoRound( gxTv_SdtPenalizaciones_SDT_Item_Pmddtoaca, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PMDTinPrc", GXutil.trim( GXutil.strNoRound( gxTv_SdtPenalizaciones_SDT_Item_Pmdtinprc, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PMDAcaPrc", GXutil.trim( GXutil.strNoRound( gxTv_SdtPenalizaciones_SDT_Item_Pmdacaprc, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Precio", GXutil.trim( GXutil.strNoRound( gxTv_SdtPenalizaciones_SDT_Item_Precio, 9, 3)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarPreKgm", GXutil.trim( GXutil.strNoRound( gxTv_SdtPenalizaciones_SDT_Item_Barprekgm, 13, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtPenalizaciones_SDT_Item_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PMDDsc", gxTv_SdtPenalizaciones_SDT_Item_Pmddsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("OkKgMin", GXutil.trim( GXutil.str( gxTv_SdtPenalizaciones_SDT_Item_Okkgmin, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PMDPreUni", GXutil.trim( GXutil.strNoRound( gxTv_SdtPenalizaciones_SDT_Item_Pmdpreuni, 14, 5)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("BarAcc", gxTv_SdtPenalizaciones_SDT_Item_Baracc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Fase_618", GXutil.booltostr( gxTv_SdtPenalizaciones_SDT_Item_Fase_618));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PMDKgmMinS", GXutil.trim( GXutil.strNoRound( gxTv_SdtPenalizaciones_SDT_Item_Pmdkgmmins, 7, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MtsMinS", GXutil.trim( GXutil.strNoRound( gxTv_SdtPenalizaciones_SDT_Item_Mtsmins, 7, 2)));
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
      AddObjectProperty("Seleccionar", gxTv_SdtPenalizaciones_SDT_Item_Seleccionar, false, false);
      AddObjectProperty("Clicod", gxTv_SdtPenalizaciones_SDT_Item_Clicod, false, false);
      AddObjectProperty("Barmancod1", gxTv_SdtPenalizaciones_SDT_Item_Barmancod1, false, false);
      AddObjectProperty("Barcolnum", gxTv_SdtPenalizaciones_SDT_Item_Barcolnum, false, false);
      AddObjectProperty("Barcolnom", gxTv_SdtPenalizaciones_SDT_Item_Barcolnom, false, false);
      AddObjectProperty("Barcod", gxTv_SdtPenalizaciones_SDT_Item_Barcod, false, false);
      AddObjectProperty("Barcodreo", gxTv_SdtPenalizaciones_SDT_Item_Barcodreo, false, false);
      AddObjectProperty("Barcodpar", gxTv_SdtPenalizaciones_SDT_Item_Barcodpar, false, false);
      AddObjectProperty("AlbProcod", gxTv_SdtPenalizaciones_SDT_Item_Albprocod, false, false);
      AddObjectProperty("BarKgm", gxTv_SdtPenalizaciones_SDT_Item_Barkgm, false, false);
      AddObjectProperty("Baralbkgm", gxTv_SdtPenalizaciones_SDT_Item_Baralbkgm, false, false);
      AddObjectProperty("PMDDtoTin", gxTv_SdtPenalizaciones_SDT_Item_Pmddtotin, false, false);
      AddObjectProperty("PMDDtoAca", gxTv_SdtPenalizaciones_SDT_Item_Pmddtoaca, false, false);
      AddObjectProperty("PMDTinPrc", gxTv_SdtPenalizaciones_SDT_Item_Pmdtinprc, false, false);
      AddObjectProperty("PMDAcaPrc", gxTv_SdtPenalizaciones_SDT_Item_Pmdacaprc, false, false);
      AddObjectProperty("Precio", gxTv_SdtPenalizaciones_SDT_Item_Precio, false, false);
      AddObjectProperty("BarPreKgm", gxTv_SdtPenalizaciones_SDT_Item_Barprekgm, false, false);
      AddObjectProperty("CliNom", gxTv_SdtPenalizaciones_SDT_Item_Clinom, false, false);
      AddObjectProperty("PMDDsc", gxTv_SdtPenalizaciones_SDT_Item_Pmddsc, false, false);
      AddObjectProperty("OkKgMin", gxTv_SdtPenalizaciones_SDT_Item_Okkgmin, false, false);
      AddObjectProperty("PMDPreUni", gxTv_SdtPenalizaciones_SDT_Item_Pmdpreuni, false, false);
      AddObjectProperty("BarAcc", gxTv_SdtPenalizaciones_SDT_Item_Baracc, false, false);
      AddObjectProperty("Fase_618", gxTv_SdtPenalizaciones_SDT_Item_Fase_618, false, false);
      AddObjectProperty("PMDKgmMinS", gxTv_SdtPenalizaciones_SDT_Item_Pmdkgmmins, false, false);
      AddObjectProperty("MtsMinS", gxTv_SdtPenalizaciones_SDT_Item_Mtsmins, false, false);
   }

   public boolean getgxTv_SdtPenalizaciones_SDT_Item_Seleccionar( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Seleccionar ;
   }

   public void setgxTv_SdtPenalizaciones_SDT_Item_Seleccionar( boolean value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Seleccionar = value ;
   }

   public int getgxTv_SdtPenalizaciones_SDT_Item_Clicod( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Clicod ;
   }

   public void setgxTv_SdtPenalizaciones_SDT_Item_Clicod( int value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Clicod = value ;
   }

   public short getgxTv_SdtPenalizaciones_SDT_Item_Barmancod1( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Barmancod1 ;
   }

   public void setgxTv_SdtPenalizaciones_SDT_Item_Barmancod1( short value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Barmancod1 = value ;
   }

   public int getgxTv_SdtPenalizaciones_SDT_Item_Barcolnum( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Barcolnum ;
   }

   public void setgxTv_SdtPenalizaciones_SDT_Item_Barcolnum( int value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Barcolnum = value ;
   }

   public String getgxTv_SdtPenalizaciones_SDT_Item_Barcolnom( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Barcolnom ;
   }

   public void setgxTv_SdtPenalizaciones_SDT_Item_Barcolnom( String value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Barcolnom = value ;
   }

   public int getgxTv_SdtPenalizaciones_SDT_Item_Barcod( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Barcod ;
   }

   public void setgxTv_SdtPenalizaciones_SDT_Item_Barcod( int value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Barcod = value ;
   }

   public byte getgxTv_SdtPenalizaciones_SDT_Item_Barcodreo( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Barcodreo ;
   }

   public void setgxTv_SdtPenalizaciones_SDT_Item_Barcodreo( byte value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Barcodreo = value ;
   }

   public String getgxTv_SdtPenalizaciones_SDT_Item_Barcodpar( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Barcodpar ;
   }

   public void setgxTv_SdtPenalizaciones_SDT_Item_Barcodpar( String value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Barcodpar = value ;
   }

   public long getgxTv_SdtPenalizaciones_SDT_Item_Albprocod( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Albprocod ;
   }

   public void setgxTv_SdtPenalizaciones_SDT_Item_Albprocod( long value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Albprocod = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPenalizaciones_SDT_Item_Barkgm( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Barkgm ;
   }

   public void setgxTv_SdtPenalizaciones_SDT_Item_Barkgm( java.math.BigDecimal value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Barkgm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPenalizaciones_SDT_Item_Baralbkgm( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Baralbkgm ;
   }

   public void setgxTv_SdtPenalizaciones_SDT_Item_Baralbkgm( java.math.BigDecimal value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Baralbkgm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPenalizaciones_SDT_Item_Pmddtotin( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Pmddtotin ;
   }

   public void setgxTv_SdtPenalizaciones_SDT_Item_Pmddtotin( java.math.BigDecimal value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Pmddtotin = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPenalizaciones_SDT_Item_Pmddtoaca( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Pmddtoaca ;
   }

   public void setgxTv_SdtPenalizaciones_SDT_Item_Pmddtoaca( java.math.BigDecimal value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Pmddtoaca = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPenalizaciones_SDT_Item_Pmdtinprc( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Pmdtinprc ;
   }

   public void setgxTv_SdtPenalizaciones_SDT_Item_Pmdtinprc( java.math.BigDecimal value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Pmdtinprc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPenalizaciones_SDT_Item_Pmdacaprc( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Pmdacaprc ;
   }

   public void setgxTv_SdtPenalizaciones_SDT_Item_Pmdacaprc( java.math.BigDecimal value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Pmdacaprc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPenalizaciones_SDT_Item_Precio( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Precio ;
   }

   public void setgxTv_SdtPenalizaciones_SDT_Item_Precio( java.math.BigDecimal value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Precio = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPenalizaciones_SDT_Item_Barprekgm( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Barprekgm ;
   }

   public void setgxTv_SdtPenalizaciones_SDT_Item_Barprekgm( java.math.BigDecimal value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Barprekgm = value ;
   }

   public String getgxTv_SdtPenalizaciones_SDT_Item_Clinom( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Clinom ;
   }

   public void setgxTv_SdtPenalizaciones_SDT_Item_Clinom( String value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Clinom = value ;
   }

   public String getgxTv_SdtPenalizaciones_SDT_Item_Pmddsc( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Pmddsc ;
   }

   public void setgxTv_SdtPenalizaciones_SDT_Item_Pmddsc( String value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Pmddsc = value ;
   }

   public byte getgxTv_SdtPenalizaciones_SDT_Item_Okkgmin( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Okkgmin ;
   }

   public void setgxTv_SdtPenalizaciones_SDT_Item_Okkgmin( byte value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Okkgmin = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPenalizaciones_SDT_Item_Pmdpreuni( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Pmdpreuni ;
   }

   public void setgxTv_SdtPenalizaciones_SDT_Item_Pmdpreuni( java.math.BigDecimal value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Pmdpreuni = value ;
   }

   public String getgxTv_SdtPenalizaciones_SDT_Item_Baracc( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Baracc ;
   }

   public void setgxTv_SdtPenalizaciones_SDT_Item_Baracc( String value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Baracc = value ;
   }

   public boolean getgxTv_SdtPenalizaciones_SDT_Item_Fase_618( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Fase_618 ;
   }

   public void setgxTv_SdtPenalizaciones_SDT_Item_Fase_618( boolean value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Fase_618 = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPenalizaciones_SDT_Item_Pmdkgmmins( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Pmdkgmmins ;
   }

   public void setgxTv_SdtPenalizaciones_SDT_Item_Pmdkgmmins( java.math.BigDecimal value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Pmdkgmmins = value ;
   }

   public java.math.BigDecimal getgxTv_SdtPenalizaciones_SDT_Item_Mtsmins( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_Mtsmins ;
   }

   public void setgxTv_SdtPenalizaciones_SDT_Item_Mtsmins( java.math.BigDecimal value )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(0) ;
      gxTv_SdtPenalizaciones_SDT_Item_Mtsmins = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtPenalizaciones_SDT_Item_N = (byte)(1) ;
      gxTv_SdtPenalizaciones_SDT_Item_Barcolnom = "" ;
      gxTv_SdtPenalizaciones_SDT_Item_Barcodpar = "" ;
      gxTv_SdtPenalizaciones_SDT_Item_Barkgm = DecimalUtil.ZERO ;
      gxTv_SdtPenalizaciones_SDT_Item_Baralbkgm = DecimalUtil.ZERO ;
      gxTv_SdtPenalizaciones_SDT_Item_Pmddtotin = DecimalUtil.ZERO ;
      gxTv_SdtPenalizaciones_SDT_Item_Pmddtoaca = DecimalUtil.ZERO ;
      gxTv_SdtPenalizaciones_SDT_Item_Pmdtinprc = DecimalUtil.ZERO ;
      gxTv_SdtPenalizaciones_SDT_Item_Pmdacaprc = DecimalUtil.ZERO ;
      gxTv_SdtPenalizaciones_SDT_Item_Precio = DecimalUtil.ZERO ;
      gxTv_SdtPenalizaciones_SDT_Item_Barprekgm = DecimalUtil.ZERO ;
      gxTv_SdtPenalizaciones_SDT_Item_Clinom = "" ;
      gxTv_SdtPenalizaciones_SDT_Item_Pmddsc = "" ;
      gxTv_SdtPenalizaciones_SDT_Item_Pmdpreuni = DecimalUtil.ZERO ;
      gxTv_SdtPenalizaciones_SDT_Item_Baracc = "" ;
      gxTv_SdtPenalizaciones_SDT_Item_Pmdkgmmins = DecimalUtil.ZERO ;
      gxTv_SdtPenalizaciones_SDT_Item_Mtsmins = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtPenalizaciones_SDT_Item_N ;
   }

   public app.facturacion.SdtPenalizaciones_SDT_Item Clone( )
   {
      return (app.facturacion.SdtPenalizaciones_SDT_Item)(clone()) ;
   }

   public void setStruct( app.facturacion.StructSdtPenalizaciones_SDT_Item struct )
   {
      setgxTv_SdtPenalizaciones_SDT_Item_Seleccionar(struct.getSeleccionar());
      setgxTv_SdtPenalizaciones_SDT_Item_Clicod(struct.getClicod());
      setgxTv_SdtPenalizaciones_SDT_Item_Barmancod1(struct.getBarmancod1());
      setgxTv_SdtPenalizaciones_SDT_Item_Barcolnum(struct.getBarcolnum());
      setgxTv_SdtPenalizaciones_SDT_Item_Barcolnom(struct.getBarcolnom());
      setgxTv_SdtPenalizaciones_SDT_Item_Barcod(struct.getBarcod());
      setgxTv_SdtPenalizaciones_SDT_Item_Barcodreo(struct.getBarcodreo());
      setgxTv_SdtPenalizaciones_SDT_Item_Barcodpar(struct.getBarcodpar());
      setgxTv_SdtPenalizaciones_SDT_Item_Albprocod(struct.getAlbprocod());
      setgxTv_SdtPenalizaciones_SDT_Item_Barkgm(struct.getBarkgm());
      setgxTv_SdtPenalizaciones_SDT_Item_Baralbkgm(struct.getBaralbkgm());
      setgxTv_SdtPenalizaciones_SDT_Item_Pmddtotin(struct.getPmddtotin());
      setgxTv_SdtPenalizaciones_SDT_Item_Pmddtoaca(struct.getPmddtoaca());
      setgxTv_SdtPenalizaciones_SDT_Item_Pmdtinprc(struct.getPmdtinprc());
      setgxTv_SdtPenalizaciones_SDT_Item_Pmdacaprc(struct.getPmdacaprc());
      setgxTv_SdtPenalizaciones_SDT_Item_Precio(struct.getPrecio());
      setgxTv_SdtPenalizaciones_SDT_Item_Barprekgm(struct.getBarprekgm());
      setgxTv_SdtPenalizaciones_SDT_Item_Clinom(struct.getClinom());
      setgxTv_SdtPenalizaciones_SDT_Item_Pmddsc(struct.getPmddsc());
      setgxTv_SdtPenalizaciones_SDT_Item_Okkgmin(struct.getOkkgmin());
      setgxTv_SdtPenalizaciones_SDT_Item_Pmdpreuni(struct.getPmdpreuni());
      setgxTv_SdtPenalizaciones_SDT_Item_Baracc(struct.getBaracc());
      setgxTv_SdtPenalizaciones_SDT_Item_Fase_618(struct.getFase_618());
      setgxTv_SdtPenalizaciones_SDT_Item_Pmdkgmmins(struct.getPmdkgmmins());
      setgxTv_SdtPenalizaciones_SDT_Item_Mtsmins(struct.getMtsmins());
   }

   @SuppressWarnings("unchecked")
   public app.facturacion.StructSdtPenalizaciones_SDT_Item getStruct( )
   {
      app.facturacion.StructSdtPenalizaciones_SDT_Item struct = new app.facturacion.StructSdtPenalizaciones_SDT_Item ();
      struct.setSeleccionar(getgxTv_SdtPenalizaciones_SDT_Item_Seleccionar());
      struct.setClicod(getgxTv_SdtPenalizaciones_SDT_Item_Clicod());
      struct.setBarmancod1(getgxTv_SdtPenalizaciones_SDT_Item_Barmancod1());
      struct.setBarcolnum(getgxTv_SdtPenalizaciones_SDT_Item_Barcolnum());
      struct.setBarcolnom(getgxTv_SdtPenalizaciones_SDT_Item_Barcolnom());
      struct.setBarcod(getgxTv_SdtPenalizaciones_SDT_Item_Barcod());
      struct.setBarcodreo(getgxTv_SdtPenalizaciones_SDT_Item_Barcodreo());
      struct.setBarcodpar(getgxTv_SdtPenalizaciones_SDT_Item_Barcodpar());
      struct.setAlbprocod(getgxTv_SdtPenalizaciones_SDT_Item_Albprocod());
      struct.setBarkgm(getgxTv_SdtPenalizaciones_SDT_Item_Barkgm());
      struct.setBaralbkgm(getgxTv_SdtPenalizaciones_SDT_Item_Baralbkgm());
      struct.setPmddtotin(getgxTv_SdtPenalizaciones_SDT_Item_Pmddtotin());
      struct.setPmddtoaca(getgxTv_SdtPenalizaciones_SDT_Item_Pmddtoaca());
      struct.setPmdtinprc(getgxTv_SdtPenalizaciones_SDT_Item_Pmdtinprc());
      struct.setPmdacaprc(getgxTv_SdtPenalizaciones_SDT_Item_Pmdacaprc());
      struct.setPrecio(getgxTv_SdtPenalizaciones_SDT_Item_Precio());
      struct.setBarprekgm(getgxTv_SdtPenalizaciones_SDT_Item_Barprekgm());
      struct.setClinom(getgxTv_SdtPenalizaciones_SDT_Item_Clinom());
      struct.setPmddsc(getgxTv_SdtPenalizaciones_SDT_Item_Pmddsc());
      struct.setOkkgmin(getgxTv_SdtPenalizaciones_SDT_Item_Okkgmin());
      struct.setPmdpreuni(getgxTv_SdtPenalizaciones_SDT_Item_Pmdpreuni());
      struct.setBaracc(getgxTv_SdtPenalizaciones_SDT_Item_Baracc());
      struct.setFase_618(getgxTv_SdtPenalizaciones_SDT_Item_Fase_618());
      struct.setPmdkgmmins(getgxTv_SdtPenalizaciones_SDT_Item_Pmdkgmmins());
      struct.setMtsmins(getgxTv_SdtPenalizaciones_SDT_Item_Mtsmins());
      return struct ;
   }

   protected byte gxTv_SdtPenalizaciones_SDT_Item_N ;
   protected byte gxTv_SdtPenalizaciones_SDT_Item_Barcodreo ;
   protected byte gxTv_SdtPenalizaciones_SDT_Item_Okkgmin ;
   protected short gxTv_SdtPenalizaciones_SDT_Item_Barmancod1 ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtPenalizaciones_SDT_Item_Clicod ;
   protected int gxTv_SdtPenalizaciones_SDT_Item_Barcolnum ;
   protected int gxTv_SdtPenalizaciones_SDT_Item_Barcod ;
   protected long gxTv_SdtPenalizaciones_SDT_Item_Albprocod ;
   protected java.math.BigDecimal gxTv_SdtPenalizaciones_SDT_Item_Barkgm ;
   protected java.math.BigDecimal gxTv_SdtPenalizaciones_SDT_Item_Baralbkgm ;
   protected java.math.BigDecimal gxTv_SdtPenalizaciones_SDT_Item_Pmddtotin ;
   protected java.math.BigDecimal gxTv_SdtPenalizaciones_SDT_Item_Pmddtoaca ;
   protected java.math.BigDecimal gxTv_SdtPenalizaciones_SDT_Item_Pmdtinprc ;
   protected java.math.BigDecimal gxTv_SdtPenalizaciones_SDT_Item_Pmdacaprc ;
   protected java.math.BigDecimal gxTv_SdtPenalizaciones_SDT_Item_Precio ;
   protected java.math.BigDecimal gxTv_SdtPenalizaciones_SDT_Item_Barprekgm ;
   protected java.math.BigDecimal gxTv_SdtPenalizaciones_SDT_Item_Pmdpreuni ;
   protected java.math.BigDecimal gxTv_SdtPenalizaciones_SDT_Item_Pmdkgmmins ;
   protected java.math.BigDecimal gxTv_SdtPenalizaciones_SDT_Item_Mtsmins ;
   protected String gxTv_SdtPenalizaciones_SDT_Item_Barcolnom ;
   protected String gxTv_SdtPenalizaciones_SDT_Item_Barcodpar ;
   protected String gxTv_SdtPenalizaciones_SDT_Item_Clinom ;
   protected String gxTv_SdtPenalizaciones_SDT_Item_Pmddsc ;
   protected String gxTv_SdtPenalizaciones_SDT_Item_Baracc ;
   protected String sTagName ;
   protected boolean gxTv_SdtPenalizaciones_SDT_Item_Seleccionar ;
   protected boolean gxTv_SdtPenalizaciones_SDT_Item_Fase_618 ;
   protected boolean readElement ;
   protected boolean formatError ;
}

