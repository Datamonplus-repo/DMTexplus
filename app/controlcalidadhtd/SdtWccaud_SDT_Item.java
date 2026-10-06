package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtWccaud_SDT_Item extends GxUserType
{
   public SdtWccaud_SDT_Item( )
   {
      this(  new ModelContext(SdtWccaud_SDT_Item.class));
   }

   public SdtWccaud_SDT_Item( ModelContext context )
   {
      super( context, "SdtWccaud_SDT_Item");
   }

   public SdtWccaud_SDT_Item( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle, context, "SdtWccaud_SDT_Item");
   }

   public SdtWccaud_SDT_Item( StructSdtWccaud_SDT_Item struct )
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
               gxTv_SdtWccaud_SDT_Item_Seleccionar = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcod") )
            {
               gxTv_SdtWccaud_SDT_Item_Barcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcodreo") )
            {
               gxTv_SdtWccaud_SDT_Item_Barcodreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcodpar") )
            {
               gxTv_SdtWccaud_SDT_Item_Barcodpar = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Procod") )
            {
               gxTv_SdtWccaud_SDT_Item_Procod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Prodsc") )
            {
               gxTv_SdtWccaud_SDT_Item_Prodsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barordlin") )
            {
               gxTv_SdtWccaud_SDT_Item_Barordlin = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Fascod") )
            {
               gxTv_SdtWccaud_SDT_Item_Fascod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Fasdsc") )
            {
               gxTv_SdtWccaud_SDT_Item_Fasdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Ccfch") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtWccaud_SDT_Item_Ccfch = GXutil.nullDate() ;
                  gxTv_SdtWccaud_SDT_Item_Ccfch_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtWccaud_SDT_Item_Ccfch_N = (byte)(0) ;
                  gxTv_SdtWccaud_SDT_Item_Ccfch = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCtcod") )
            {
               gxTv_SdtWccaud_SDT_Item_Cctcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCtdsc") )
            {
               gxTv_SdtWccaud_SDT_Item_Cctdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCopecod") )
            {
               gxTv_SdtWccaud_SDT_Item_Ccopecod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Openom") )
            {
               gxTv_SdtWccaud_SDT_Item_Openom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barser") )
            {
               gxTv_SdtWccaud_SDT_Item_Barser = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcolnom") )
            {
               gxTv_SdtWccaud_SDT_Item_Barcolnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barenccli") )
            {
               gxTv_SdtWccaud_SDT_Item_Barenccli = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Bartipart") )
            {
               gxTv_SdtWccaud_SDT_Item_Bartipart = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Bargraaca") )
            {
               gxTv_SdtWccaud_SDT_Item_Bargraaca = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barancaca1") )
            {
               gxTv_SdtWccaud_SDT_Item_Barancaca1 = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCfOk") )
            {
               gxTv_SdtWccaud_SDT_Item_Ccfok = (byte)(getnumericvalue(oReader.getValue())) ;
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
         sName = "Wccaud_SDT.Item" ;
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
      oWriter.writeElement("Seleccionar", GXutil.booltostr( gxTv_SdtWccaud_SDT_Item_Seleccionar));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcod", GXutil.trim( GXutil.str( gxTv_SdtWccaud_SDT_Item_Barcod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcodreo", GXutil.trim( GXutil.str( gxTv_SdtWccaud_SDT_Item_Barcodreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcodpar", gxTv_SdtWccaud_SDT_Item_Barcodpar);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Procod", gxTv_SdtWccaud_SDT_Item_Procod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Prodsc", gxTv_SdtWccaud_SDT_Item_Prodsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barordlin", GXutil.trim( GXutil.str( gxTv_SdtWccaud_SDT_Item_Barordlin, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Fascod", gxTv_SdtWccaud_SDT_Item_Fascod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Fasdsc", gxTv_SdtWccaud_SDT_Item_Fasdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtWccaud_SDT_Item_Ccfch)) && ( gxTv_SdtWccaud_SDT_Item_Ccfch_N == 1 ) )
      {
         oWriter.writeElement("Ccfch", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtWccaud_SDT_Item_Ccfch), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtWccaud_SDT_Item_Ccfch), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtWccaud_SDT_Item_Ccfch), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Ccfch", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("CCtcod", GXutil.trim( GXutil.str( gxTv_SdtWccaud_SDT_Item_Cctcod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CCtdsc", gxTv_SdtWccaud_SDT_Item_Cctdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CCopecod", GXutil.trim( GXutil.str( gxTv_SdtWccaud_SDT_Item_Ccopecod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Openom", gxTv_SdtWccaud_SDT_Item_Openom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barser", gxTv_SdtWccaud_SDT_Item_Barser);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcolnom", gxTv_SdtWccaud_SDT_Item_Barcolnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barenccli", gxTv_SdtWccaud_SDT_Item_Barenccli);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Bartipart", GXutil.trim( GXutil.str( gxTv_SdtWccaud_SDT_Item_Bartipart, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Bargraaca", GXutil.trim( GXutil.str( gxTv_SdtWccaud_SDT_Item_Bargraaca, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barancaca1", GXutil.trim( GXutil.str( gxTv_SdtWccaud_SDT_Item_Barancaca1, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CCfOk", GXutil.trim( GXutil.str( gxTv_SdtWccaud_SDT_Item_Ccfok, 1, 0)));
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
      AddObjectProperty("Seleccionar", gxTv_SdtWccaud_SDT_Item_Seleccionar, false, false);
      AddObjectProperty("Barcod", gxTv_SdtWccaud_SDT_Item_Barcod, false, false);
      AddObjectProperty("Barcodreo", gxTv_SdtWccaud_SDT_Item_Barcodreo, false, false);
      AddObjectProperty("Barcodpar", gxTv_SdtWccaud_SDT_Item_Barcodpar, false, false);
      AddObjectProperty("Procod", gxTv_SdtWccaud_SDT_Item_Procod, false, false);
      AddObjectProperty("Prodsc", gxTv_SdtWccaud_SDT_Item_Prodsc, false, false);
      AddObjectProperty("Barordlin", gxTv_SdtWccaud_SDT_Item_Barordlin, false, false);
      AddObjectProperty("Fascod", gxTv_SdtWccaud_SDT_Item_Fascod, false, false);
      AddObjectProperty("Fasdsc", gxTv_SdtWccaud_SDT_Item_Fasdsc, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtWccaud_SDT_Item_Ccfch), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtWccaud_SDT_Item_Ccfch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtWccaud_SDT_Item_Ccfch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("Ccfch", sDateCnv, false, false);
      AddObjectProperty("CCtcod", gxTv_SdtWccaud_SDT_Item_Cctcod, false, false);
      AddObjectProperty("CCtdsc", gxTv_SdtWccaud_SDT_Item_Cctdsc, false, false);
      AddObjectProperty("CCopecod", gxTv_SdtWccaud_SDT_Item_Ccopecod, false, false);
      AddObjectProperty("Openom", gxTv_SdtWccaud_SDT_Item_Openom, false, false);
      AddObjectProperty("Barser", gxTv_SdtWccaud_SDT_Item_Barser, false, false);
      AddObjectProperty("Barcolnom", gxTv_SdtWccaud_SDT_Item_Barcolnom, false, false);
      AddObjectProperty("Barenccli", gxTv_SdtWccaud_SDT_Item_Barenccli, false, false);
      AddObjectProperty("Bartipart", gxTv_SdtWccaud_SDT_Item_Bartipart, false, false);
      AddObjectProperty("Bargraaca", gxTv_SdtWccaud_SDT_Item_Bargraaca, false, false);
      AddObjectProperty("Barancaca1", gxTv_SdtWccaud_SDT_Item_Barancaca1, false, false);
      AddObjectProperty("CCfOk", gxTv_SdtWccaud_SDT_Item_Ccfok, false, false);
   }

   public boolean getgxTv_SdtWccaud_SDT_Item_Seleccionar( )
   {
      return gxTv_SdtWccaud_SDT_Item_Seleccionar ;
   }

   public void setgxTv_SdtWccaud_SDT_Item_Seleccionar( boolean value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Seleccionar = value ;
   }

   public int getgxTv_SdtWccaud_SDT_Item_Barcod( )
   {
      return gxTv_SdtWccaud_SDT_Item_Barcod ;
   }

   public void setgxTv_SdtWccaud_SDT_Item_Barcod( int value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Barcod = value ;
   }

   public byte getgxTv_SdtWccaud_SDT_Item_Barcodreo( )
   {
      return gxTv_SdtWccaud_SDT_Item_Barcodreo ;
   }

   public void setgxTv_SdtWccaud_SDT_Item_Barcodreo( byte value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Barcodreo = value ;
   }

   public String getgxTv_SdtWccaud_SDT_Item_Barcodpar( )
   {
      return gxTv_SdtWccaud_SDT_Item_Barcodpar ;
   }

   public void setgxTv_SdtWccaud_SDT_Item_Barcodpar( String value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Barcodpar = value ;
   }

   public String getgxTv_SdtWccaud_SDT_Item_Procod( )
   {
      return gxTv_SdtWccaud_SDT_Item_Procod ;
   }

   public void setgxTv_SdtWccaud_SDT_Item_Procod( String value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Procod = value ;
   }

   public String getgxTv_SdtWccaud_SDT_Item_Prodsc( )
   {
      return gxTv_SdtWccaud_SDT_Item_Prodsc ;
   }

   public void setgxTv_SdtWccaud_SDT_Item_Prodsc( String value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Prodsc = value ;
   }

   public short getgxTv_SdtWccaud_SDT_Item_Barordlin( )
   {
      return gxTv_SdtWccaud_SDT_Item_Barordlin ;
   }

   public void setgxTv_SdtWccaud_SDT_Item_Barordlin( short value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Barordlin = value ;
   }

   public String getgxTv_SdtWccaud_SDT_Item_Fascod( )
   {
      return gxTv_SdtWccaud_SDT_Item_Fascod ;
   }

   public void setgxTv_SdtWccaud_SDT_Item_Fascod( String value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Fascod = value ;
   }

   public String getgxTv_SdtWccaud_SDT_Item_Fasdsc( )
   {
      return gxTv_SdtWccaud_SDT_Item_Fasdsc ;
   }

   public void setgxTv_SdtWccaud_SDT_Item_Fasdsc( String value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Fasdsc = value ;
   }

   public java.util.Date getgxTv_SdtWccaud_SDT_Item_Ccfch( )
   {
      return gxTv_SdtWccaud_SDT_Item_Ccfch ;
   }

   public void setgxTv_SdtWccaud_SDT_Item_Ccfch( java.util.Date value )
   {
      gxTv_SdtWccaud_SDT_Item_Ccfch_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Ccfch = value ;
   }

   public int getgxTv_SdtWccaud_SDT_Item_Cctcod( )
   {
      return gxTv_SdtWccaud_SDT_Item_Cctcod ;
   }

   public void setgxTv_SdtWccaud_SDT_Item_Cctcod( int value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Cctcod = value ;
   }

   public String getgxTv_SdtWccaud_SDT_Item_Cctdsc( )
   {
      return gxTv_SdtWccaud_SDT_Item_Cctdsc ;
   }

   public void setgxTv_SdtWccaud_SDT_Item_Cctdsc( String value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Cctdsc = value ;
   }

   public int getgxTv_SdtWccaud_SDT_Item_Ccopecod( )
   {
      return gxTv_SdtWccaud_SDT_Item_Ccopecod ;
   }

   public void setgxTv_SdtWccaud_SDT_Item_Ccopecod( int value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Ccopecod = value ;
   }

   public String getgxTv_SdtWccaud_SDT_Item_Openom( )
   {
      return gxTv_SdtWccaud_SDT_Item_Openom ;
   }

   public void setgxTv_SdtWccaud_SDT_Item_Openom( String value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Openom = value ;
   }

   public String getgxTv_SdtWccaud_SDT_Item_Barser( )
   {
      return gxTv_SdtWccaud_SDT_Item_Barser ;
   }

   public void setgxTv_SdtWccaud_SDT_Item_Barser( String value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Barser = value ;
   }

   public String getgxTv_SdtWccaud_SDT_Item_Barcolnom( )
   {
      return gxTv_SdtWccaud_SDT_Item_Barcolnom ;
   }

   public void setgxTv_SdtWccaud_SDT_Item_Barcolnom( String value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Barcolnom = value ;
   }

   public String getgxTv_SdtWccaud_SDT_Item_Barenccli( )
   {
      return gxTv_SdtWccaud_SDT_Item_Barenccli ;
   }

   public void setgxTv_SdtWccaud_SDT_Item_Barenccli( String value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Barenccli = value ;
   }

   public short getgxTv_SdtWccaud_SDT_Item_Bartipart( )
   {
      return gxTv_SdtWccaud_SDT_Item_Bartipart ;
   }

   public void setgxTv_SdtWccaud_SDT_Item_Bartipart( short value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Bartipart = value ;
   }

   public short getgxTv_SdtWccaud_SDT_Item_Bargraaca( )
   {
      return gxTv_SdtWccaud_SDT_Item_Bargraaca ;
   }

   public void setgxTv_SdtWccaud_SDT_Item_Bargraaca( short value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Bargraaca = value ;
   }

   public short getgxTv_SdtWccaud_SDT_Item_Barancaca1( )
   {
      return gxTv_SdtWccaud_SDT_Item_Barancaca1 ;
   }

   public void setgxTv_SdtWccaud_SDT_Item_Barancaca1( short value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Barancaca1 = value ;
   }

   public byte getgxTv_SdtWccaud_SDT_Item_Ccfok( )
   {
      return gxTv_SdtWccaud_SDT_Item_Ccfok ;
   }

   public void setgxTv_SdtWccaud_SDT_Item_Ccfok( byte value )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(0) ;
      gxTv_SdtWccaud_SDT_Item_Ccfok = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtWccaud_SDT_Item_N = (byte)(1) ;
      gxTv_SdtWccaud_SDT_Item_Barcodpar = "" ;
      gxTv_SdtWccaud_SDT_Item_Procod = "" ;
      gxTv_SdtWccaud_SDT_Item_Prodsc = "" ;
      gxTv_SdtWccaud_SDT_Item_Fascod = "" ;
      gxTv_SdtWccaud_SDT_Item_Fasdsc = "" ;
      gxTv_SdtWccaud_SDT_Item_Ccfch = GXutil.nullDate() ;
      gxTv_SdtWccaud_SDT_Item_Ccfch_N = (byte)(1) ;
      gxTv_SdtWccaud_SDT_Item_Cctdsc = "" ;
      gxTv_SdtWccaud_SDT_Item_Openom = "" ;
      gxTv_SdtWccaud_SDT_Item_Barser = "" ;
      gxTv_SdtWccaud_SDT_Item_Barcolnom = "" ;
      gxTv_SdtWccaud_SDT_Item_Barenccli = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtWccaud_SDT_Item_N ;
   }

   public app.controlcalidadhtd.SdtWccaud_SDT_Item Clone( )
   {
      return (app.controlcalidadhtd.SdtWccaud_SDT_Item)(clone()) ;
   }

   public void setStruct( app.controlcalidadhtd.StructSdtWccaud_SDT_Item struct )
   {
      setgxTv_SdtWccaud_SDT_Item_Seleccionar(struct.getSeleccionar());
      setgxTv_SdtWccaud_SDT_Item_Barcod(struct.getBarcod());
      setgxTv_SdtWccaud_SDT_Item_Barcodreo(struct.getBarcodreo());
      setgxTv_SdtWccaud_SDT_Item_Barcodpar(struct.getBarcodpar());
      setgxTv_SdtWccaud_SDT_Item_Procod(struct.getProcod());
      setgxTv_SdtWccaud_SDT_Item_Prodsc(struct.getProdsc());
      setgxTv_SdtWccaud_SDT_Item_Barordlin(struct.getBarordlin());
      setgxTv_SdtWccaud_SDT_Item_Fascod(struct.getFascod());
      setgxTv_SdtWccaud_SDT_Item_Fasdsc(struct.getFasdsc());
      if ( struct.gxTv_SdtWccaud_SDT_Item_Ccfch_N == 0 )
      {
         setgxTv_SdtWccaud_SDT_Item_Ccfch(struct.getCcfch());
      }
      setgxTv_SdtWccaud_SDT_Item_Cctcod(struct.getCctcod());
      setgxTv_SdtWccaud_SDT_Item_Cctdsc(struct.getCctdsc());
      setgxTv_SdtWccaud_SDT_Item_Ccopecod(struct.getCcopecod());
      setgxTv_SdtWccaud_SDT_Item_Openom(struct.getOpenom());
      setgxTv_SdtWccaud_SDT_Item_Barser(struct.getBarser());
      setgxTv_SdtWccaud_SDT_Item_Barcolnom(struct.getBarcolnom());
      setgxTv_SdtWccaud_SDT_Item_Barenccli(struct.getBarenccli());
      setgxTv_SdtWccaud_SDT_Item_Bartipart(struct.getBartipart());
      setgxTv_SdtWccaud_SDT_Item_Bargraaca(struct.getBargraaca());
      setgxTv_SdtWccaud_SDT_Item_Barancaca1(struct.getBarancaca1());
      setgxTv_SdtWccaud_SDT_Item_Ccfok(struct.getCcfok());
   }

   @SuppressWarnings("unchecked")
   public app.controlcalidadhtd.StructSdtWccaud_SDT_Item getStruct( )
   {
      app.controlcalidadhtd.StructSdtWccaud_SDT_Item struct = new app.controlcalidadhtd.StructSdtWccaud_SDT_Item ();
      struct.setSeleccionar(getgxTv_SdtWccaud_SDT_Item_Seleccionar());
      struct.setBarcod(getgxTv_SdtWccaud_SDT_Item_Barcod());
      struct.setBarcodreo(getgxTv_SdtWccaud_SDT_Item_Barcodreo());
      struct.setBarcodpar(getgxTv_SdtWccaud_SDT_Item_Barcodpar());
      struct.setProcod(getgxTv_SdtWccaud_SDT_Item_Procod());
      struct.setProdsc(getgxTv_SdtWccaud_SDT_Item_Prodsc());
      struct.setBarordlin(getgxTv_SdtWccaud_SDT_Item_Barordlin());
      struct.setFascod(getgxTv_SdtWccaud_SDT_Item_Fascod());
      struct.setFasdsc(getgxTv_SdtWccaud_SDT_Item_Fasdsc());
      if ( gxTv_SdtWccaud_SDT_Item_Ccfch_N == 0 )
      {
         struct.setCcfch(getgxTv_SdtWccaud_SDT_Item_Ccfch());
      }
      struct.setCctcod(getgxTv_SdtWccaud_SDT_Item_Cctcod());
      struct.setCctdsc(getgxTv_SdtWccaud_SDT_Item_Cctdsc());
      struct.setCcopecod(getgxTv_SdtWccaud_SDT_Item_Ccopecod());
      struct.setOpenom(getgxTv_SdtWccaud_SDT_Item_Openom());
      struct.setBarser(getgxTv_SdtWccaud_SDT_Item_Barser());
      struct.setBarcolnom(getgxTv_SdtWccaud_SDT_Item_Barcolnom());
      struct.setBarenccli(getgxTv_SdtWccaud_SDT_Item_Barenccli());
      struct.setBartipart(getgxTv_SdtWccaud_SDT_Item_Bartipart());
      struct.setBargraaca(getgxTv_SdtWccaud_SDT_Item_Bargraaca());
      struct.setBarancaca1(getgxTv_SdtWccaud_SDT_Item_Barancaca1());
      struct.setCcfok(getgxTv_SdtWccaud_SDT_Item_Ccfok());
      return struct ;
   }

   protected byte gxTv_SdtWccaud_SDT_Item_N ;
   protected byte gxTv_SdtWccaud_SDT_Item_Barcodreo ;
   protected byte gxTv_SdtWccaud_SDT_Item_Ccfch_N ;
   protected byte gxTv_SdtWccaud_SDT_Item_Ccfok ;
   protected short gxTv_SdtWccaud_SDT_Item_Barordlin ;
   protected short gxTv_SdtWccaud_SDT_Item_Bartipart ;
   protected short gxTv_SdtWccaud_SDT_Item_Bargraaca ;
   protected short gxTv_SdtWccaud_SDT_Item_Barancaca1 ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtWccaud_SDT_Item_Barcod ;
   protected int gxTv_SdtWccaud_SDT_Item_Cctcod ;
   protected int gxTv_SdtWccaud_SDT_Item_Ccopecod ;
   protected String gxTv_SdtWccaud_SDT_Item_Barcodpar ;
   protected String gxTv_SdtWccaud_SDT_Item_Procod ;
   protected String gxTv_SdtWccaud_SDT_Item_Prodsc ;
   protected String gxTv_SdtWccaud_SDT_Item_Fascod ;
   protected String gxTv_SdtWccaud_SDT_Item_Fasdsc ;
   protected String gxTv_SdtWccaud_SDT_Item_Cctdsc ;
   protected String gxTv_SdtWccaud_SDT_Item_Openom ;
   protected String gxTv_SdtWccaud_SDT_Item_Barser ;
   protected String gxTv_SdtWccaud_SDT_Item_Barcolnom ;
   protected String gxTv_SdtWccaud_SDT_Item_Barenccli ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtWccaud_SDT_Item_Ccfch ;
   protected boolean gxTv_SdtWccaud_SDT_Item_Seleccionar ;
   protected boolean readElement ;
   protected boolean formatError ;
}

