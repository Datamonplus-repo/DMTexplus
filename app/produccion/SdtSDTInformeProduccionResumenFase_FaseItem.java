package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTInformeProduccionResumenFase_FaseItem extends GxUserType
{
   public SdtSDTInformeProduccionResumenFase_FaseItem( )
   {
      this(  new ModelContext(SdtSDTInformeProduccionResumenFase_FaseItem.class));
   }

   public SdtSDTInformeProduccionResumenFase_FaseItem( ModelContext context )
   {
      super( context, "SdtSDTInformeProduccionResumenFase_FaseItem");
   }

   public SdtSDTInformeProduccionResumenFase_FaseItem( int remoteHandle ,
                                                       ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTInformeProduccionResumenFase_FaseItem");
   }

   public SdtSDTInformeProduccionResumenFase_FaseItem( StructSdtSDTInformeProduccionResumenFase_FaseItem struct )
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
               gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Emprcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqCod") )
            {
               gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Maqcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProDTF") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprodtf = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprodtf_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprodtf_N = (byte)(0) ;
                  gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprodtf = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ParCod") )
            {
               gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Parcod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProReo") )
            {
               gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisproreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Fase") )
            {
               gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Fase = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FasDsc") )
            {
               gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Fasdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProMtr") )
            {
               gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hispromtr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProKgr") )
            {
               gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprokgr = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PorKilos") )
            {
               gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Porkilos = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PorMetros") )
            {
               gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Pormetros = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "SDTInformeProduccionResumenFase.FaseItem" ;
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
      oWriter.writeElement("EmprCod", gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Emprcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqCod", gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Maqcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprodtf) && ( gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprodtf_N == 1 ) )
      {
         oWriter.writeElement("HisProDTF", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("HisProDTF", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("ParCod", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Parcod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProReo", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisproreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Fase", gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Fase);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("FasDsc", gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Fasdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProMtr", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hispromtr, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("HisProKgr", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprokgr, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PorKilos", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Porkilos, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PorMetros", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Pormetros, 6, 2)));
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
      AddObjectProperty("EmprCod", gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Emprcod, false, false);
      AddObjectProperty("MaqCod", gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Maqcod, false, false);
      datetime_STZ = gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprodtf ;
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
      AddObjectProperty("HisProDTF", sDateCnv, false, false);
      AddObjectProperty("ParCod", gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Parcod, false, false);
      AddObjectProperty("HisProReo", gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisproreo, false, false);
      AddObjectProperty("Fase", gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Fase, false, false);
      AddObjectProperty("FasDsc", gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Fasdsc, false, false);
      AddObjectProperty("HisProMtr", gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hispromtr, false, false);
      AddObjectProperty("HisProKgr", gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprokgr, false, false);
      AddObjectProperty("PorKilos", gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Porkilos, false, false);
      AddObjectProperty("PorMetros", gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Pormetros, false, false);
   }

   public String getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Emprcod( )
   {
      return gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Emprcod ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Emprcod( String value )
   {
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Emprcod = value ;
   }

   public String getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Maqcod( )
   {
      return gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Maqcod ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Maqcod( String value )
   {
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Maqcod = value ;
   }

   public java.util.Date getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprodtf( )
   {
      return gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprodtf ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprodtf( java.util.Date value )
   {
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprodtf_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprodtf = value ;
   }

   public short getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Parcod( )
   {
      return gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Parcod ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Parcod( short value )
   {
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Parcod = value ;
   }

   public byte getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisproreo( )
   {
      return gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisproreo ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisproreo( byte value )
   {
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisproreo = value ;
   }

   public String getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Fase( )
   {
      return gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Fase ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Fase( String value )
   {
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Fase = value ;
   }

   public String getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Fasdsc( )
   {
      return gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Fasdsc ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Fasdsc( String value )
   {
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Fasdsc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hispromtr( )
   {
      return gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hispromtr ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hispromtr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hispromtr = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprokgr( )
   {
      return gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprokgr ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprokgr( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprokgr = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Porkilos( )
   {
      return gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Porkilos ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Porkilos( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Porkilos = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Pormetros( )
   {
      return gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Pormetros ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Pormetros( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Pormetros = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Emprcod = "" ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_N = (byte)(1) ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Maqcod = "" ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprodtf = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprodtf_N = (byte)(1) ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Fase = "" ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Fasdsc = "" ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hispromtr = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprokgr = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Porkilos = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Pormetros = DecimalUtil.ZERO ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_N ;
   }

   public app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem Clone( )
   {
      return (app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem)(clone()) ;
   }

   public void setStruct( app.produccion.StructSdtSDTInformeProduccionResumenFase_FaseItem struct )
   {
      setgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Emprcod(struct.getEmprcod());
      setgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Maqcod(struct.getMaqcod());
      if ( struct.gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprodtf_N == 0 )
      {
         setgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprodtf(struct.getHisprodtf());
      }
      setgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Parcod(struct.getParcod());
      setgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisproreo(struct.getHisproreo());
      setgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Fase(struct.getFase());
      setgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Fasdsc(struct.getFasdsc());
      setgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hispromtr(struct.getHispromtr());
      setgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprokgr(struct.getHisprokgr());
      setgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Porkilos(struct.getPorkilos());
      setgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Pormetros(struct.getPormetros());
   }

   @SuppressWarnings("unchecked")
   public app.produccion.StructSdtSDTInformeProduccionResumenFase_FaseItem getStruct( )
   {
      app.produccion.StructSdtSDTInformeProduccionResumenFase_FaseItem struct = new app.produccion.StructSdtSDTInformeProduccionResumenFase_FaseItem ();
      struct.setEmprcod(getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Emprcod());
      struct.setMaqcod(getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Maqcod());
      if ( gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprodtf_N == 0 )
      {
         struct.setHisprodtf(getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprodtf());
      }
      struct.setParcod(getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Parcod());
      struct.setHisproreo(getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisproreo());
      struct.setFase(getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Fase());
      struct.setFasdsc(getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Fasdsc());
      struct.setHispromtr(getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hispromtr());
      struct.setHisprokgr(getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprokgr());
      struct.setPorkilos(getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Porkilos());
      struct.setPormetros(getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Pormetros());
      return struct ;
   }

   protected byte gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_N ;
   protected byte gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprodtf_N ;
   protected byte gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisproreo ;
   protected short gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Parcod ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hispromtr ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprokgr ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Porkilos ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Pormetros ;
   protected String gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Emprcod ;
   protected String gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Maqcod ;
   protected String gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Fase ;
   protected String gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Fasdsc ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprodtf ;
   protected java.util.Date datetime_STZ ;
   protected boolean readElement ;
   protected boolean formatError ;
}

