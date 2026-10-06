package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtControlProductossinMovimientos_SDT extends GxUserType
{
   public SdtControlProductossinMovimientos_SDT( )
   {
      this(  new ModelContext(SdtControlProductossinMovimientos_SDT.class));
   }

   public SdtControlProductossinMovimientos_SDT( ModelContext context )
   {
      super( context, "SdtControlProductossinMovimientos_SDT");
   }

   public SdtControlProductossinMovimientos_SDT( int remoteHandle ,
                                                 ModelContext context )
   {
      super( remoteHandle, context, "SdtControlProductossinMovimientos_SDT");
   }

   public SdtControlProductossinMovimientos_SDT( StructSdtControlProductossinMovimientos_SDT struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Prdnum") )
            {
               gxTv_SdtControlProductossinMovimientos_SDT_Prdnum = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNom") )
            {
               gxTv_SdtControlProductossinMovimientos_SDT_Prdnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdExialm") )
            {
               gxTv_SdtControlProductossinMovimientos_SDT_Prdexialm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFecUltMov") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtControlProductossinMovimientos_SDT_Prdfecultmov = GXutil.nullDate() ;
                  gxTv_SdtControlProductossinMovimientos_SDT_Prdfecultmov_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtControlProductossinMovimientos_SDT_Prdfecultmov_N = (byte)(0) ;
                  gxTv_SdtControlProductossinMovimientos_SDT_Prdfecultmov = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdTipMovUlt") )
            {
               gxTv_SdtControlProductossinMovimientos_SDT_Prdtipmovult = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdDiasInactivo") )
            {
               gxTv_SdtControlProductossinMovimientos_SDT_Prddiasinactivo = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdPreact") )
            {
               gxTv_SdtControlProductossinMovimientos_SDT_Prdpreact = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "ControlProductossinMovimientos_SDT" ;
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
      oWriter.writeElement("Prdnum", gxTv_SdtControlProductossinMovimientos_SDT_Prdnum);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdNom", gxTv_SdtControlProductossinMovimientos_SDT_Prdnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdExialm", GXutil.trim( GXutil.strNoRound( gxTv_SdtControlProductossinMovimientos_SDT_Prdexialm, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtControlProductossinMovimientos_SDT_Prdfecultmov)) && ( gxTv_SdtControlProductossinMovimientos_SDT_Prdfecultmov_N == 1 ) )
      {
         oWriter.writeElement("PrdFecUltMov", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtControlProductossinMovimientos_SDT_Prdfecultmov), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtControlProductossinMovimientos_SDT_Prdfecultmov), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtControlProductossinMovimientos_SDT_Prdfecultmov), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("PrdFecUltMov", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("PrdTipMovUlt", gxTv_SdtControlProductossinMovimientos_SDT_Prdtipmovult);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdDiasInactivo", GXutil.trim( GXutil.str( gxTv_SdtControlProductossinMovimientos_SDT_Prddiasinactivo, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdPreact", GXutil.trim( GXutil.strNoRound( gxTv_SdtControlProductossinMovimientos_SDT_Prdpreact, 14, 5)));
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
      AddObjectProperty("Prdnum", gxTv_SdtControlProductossinMovimientos_SDT_Prdnum, false, false);
      AddObjectProperty("PrdNom", gxTv_SdtControlProductossinMovimientos_SDT_Prdnom, false, false);
      AddObjectProperty("PrdExialm", gxTv_SdtControlProductossinMovimientos_SDT_Prdexialm, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtControlProductossinMovimientos_SDT_Prdfecultmov), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtControlProductossinMovimientos_SDT_Prdfecultmov), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtControlProductossinMovimientos_SDT_Prdfecultmov), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("PrdFecUltMov", sDateCnv, false, false);
      AddObjectProperty("PrdTipMovUlt", gxTv_SdtControlProductossinMovimientos_SDT_Prdtipmovult, false, false);
      AddObjectProperty("PrdDiasInactivo", gxTv_SdtControlProductossinMovimientos_SDT_Prddiasinactivo, false, false);
      AddObjectProperty("PrdPreact", gxTv_SdtControlProductossinMovimientos_SDT_Prdpreact, false, false);
   }

   public String getgxTv_SdtControlProductossinMovimientos_SDT_Prdnum( )
   {
      return gxTv_SdtControlProductossinMovimientos_SDT_Prdnum ;
   }

   public void setgxTv_SdtControlProductossinMovimientos_SDT_Prdnum( String value )
   {
      gxTv_SdtControlProductossinMovimientos_SDT_N = (byte)(0) ;
      gxTv_SdtControlProductossinMovimientos_SDT_Prdnum = value ;
   }

   public String getgxTv_SdtControlProductossinMovimientos_SDT_Prdnom( )
   {
      return gxTv_SdtControlProductossinMovimientos_SDT_Prdnom ;
   }

   public void setgxTv_SdtControlProductossinMovimientos_SDT_Prdnom( String value )
   {
      gxTv_SdtControlProductossinMovimientos_SDT_N = (byte)(0) ;
      gxTv_SdtControlProductossinMovimientos_SDT_Prdnom = value ;
   }

   public java.math.BigDecimal getgxTv_SdtControlProductossinMovimientos_SDT_Prdexialm( )
   {
      return gxTv_SdtControlProductossinMovimientos_SDT_Prdexialm ;
   }

   public void setgxTv_SdtControlProductossinMovimientos_SDT_Prdexialm( java.math.BigDecimal value )
   {
      gxTv_SdtControlProductossinMovimientos_SDT_N = (byte)(0) ;
      gxTv_SdtControlProductossinMovimientos_SDT_Prdexialm = value ;
   }

   public java.util.Date getgxTv_SdtControlProductossinMovimientos_SDT_Prdfecultmov( )
   {
      return gxTv_SdtControlProductossinMovimientos_SDT_Prdfecultmov ;
   }

   public void setgxTv_SdtControlProductossinMovimientos_SDT_Prdfecultmov( java.util.Date value )
   {
      gxTv_SdtControlProductossinMovimientos_SDT_Prdfecultmov_N = (byte)(0) ;
      gxTv_SdtControlProductossinMovimientos_SDT_N = (byte)(0) ;
      gxTv_SdtControlProductossinMovimientos_SDT_Prdfecultmov = value ;
   }

   public String getgxTv_SdtControlProductossinMovimientos_SDT_Prdtipmovult( )
   {
      return gxTv_SdtControlProductossinMovimientos_SDT_Prdtipmovult ;
   }

   public void setgxTv_SdtControlProductossinMovimientos_SDT_Prdtipmovult( String value )
   {
      gxTv_SdtControlProductossinMovimientos_SDT_N = (byte)(0) ;
      gxTv_SdtControlProductossinMovimientos_SDT_Prdtipmovult = value ;
   }

   public short getgxTv_SdtControlProductossinMovimientos_SDT_Prddiasinactivo( )
   {
      return gxTv_SdtControlProductossinMovimientos_SDT_Prddiasinactivo ;
   }

   public void setgxTv_SdtControlProductossinMovimientos_SDT_Prddiasinactivo( short value )
   {
      gxTv_SdtControlProductossinMovimientos_SDT_N = (byte)(0) ;
      gxTv_SdtControlProductossinMovimientos_SDT_Prddiasinactivo = value ;
   }

   public java.math.BigDecimal getgxTv_SdtControlProductossinMovimientos_SDT_Prdpreact( )
   {
      return gxTv_SdtControlProductossinMovimientos_SDT_Prdpreact ;
   }

   public void setgxTv_SdtControlProductossinMovimientos_SDT_Prdpreact( java.math.BigDecimal value )
   {
      gxTv_SdtControlProductossinMovimientos_SDT_N = (byte)(0) ;
      gxTv_SdtControlProductossinMovimientos_SDT_Prdpreact = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtControlProductossinMovimientos_SDT_Prdnum = "" ;
      gxTv_SdtControlProductossinMovimientos_SDT_N = (byte)(1) ;
      gxTv_SdtControlProductossinMovimientos_SDT_Prdnom = "" ;
      gxTv_SdtControlProductossinMovimientos_SDT_Prdexialm = DecimalUtil.ZERO ;
      gxTv_SdtControlProductossinMovimientos_SDT_Prdfecultmov = GXutil.nullDate() ;
      gxTv_SdtControlProductossinMovimientos_SDT_Prdfecultmov_N = (byte)(1) ;
      gxTv_SdtControlProductossinMovimientos_SDT_Prdtipmovult = "" ;
      gxTv_SdtControlProductossinMovimientos_SDT_Prdpreact = DecimalUtil.ZERO ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtControlProductossinMovimientos_SDT_N ;
   }

   public app.SdtControlProductossinMovimientos_SDT Clone( )
   {
      return (app.SdtControlProductossinMovimientos_SDT)(clone()) ;
   }

   public void setStruct( app.StructSdtControlProductossinMovimientos_SDT struct )
   {
      setgxTv_SdtControlProductossinMovimientos_SDT_Prdnum(struct.getPrdnum());
      setgxTv_SdtControlProductossinMovimientos_SDT_Prdnom(struct.getPrdnom());
      setgxTv_SdtControlProductossinMovimientos_SDT_Prdexialm(struct.getPrdexialm());
      if ( struct.gxTv_SdtControlProductossinMovimientos_SDT_Prdfecultmov_N == 0 )
      {
         setgxTv_SdtControlProductossinMovimientos_SDT_Prdfecultmov(struct.getPrdfecultmov());
      }
      setgxTv_SdtControlProductossinMovimientos_SDT_Prdtipmovult(struct.getPrdtipmovult());
      setgxTv_SdtControlProductossinMovimientos_SDT_Prddiasinactivo(struct.getPrddiasinactivo());
      setgxTv_SdtControlProductossinMovimientos_SDT_Prdpreact(struct.getPrdpreact());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtControlProductossinMovimientos_SDT getStruct( )
   {
      app.StructSdtControlProductossinMovimientos_SDT struct = new app.StructSdtControlProductossinMovimientos_SDT ();
      struct.setPrdnum(getgxTv_SdtControlProductossinMovimientos_SDT_Prdnum());
      struct.setPrdnom(getgxTv_SdtControlProductossinMovimientos_SDT_Prdnom());
      struct.setPrdexialm(getgxTv_SdtControlProductossinMovimientos_SDT_Prdexialm());
      if ( gxTv_SdtControlProductossinMovimientos_SDT_Prdfecultmov_N == 0 )
      {
         struct.setPrdfecultmov(getgxTv_SdtControlProductossinMovimientos_SDT_Prdfecultmov());
      }
      struct.setPrdtipmovult(getgxTv_SdtControlProductossinMovimientos_SDT_Prdtipmovult());
      struct.setPrddiasinactivo(getgxTv_SdtControlProductossinMovimientos_SDT_Prddiasinactivo());
      struct.setPrdpreact(getgxTv_SdtControlProductossinMovimientos_SDT_Prdpreact());
      return struct ;
   }

   protected byte gxTv_SdtControlProductossinMovimientos_SDT_N ;
   protected byte gxTv_SdtControlProductossinMovimientos_SDT_Prdfecultmov_N ;
   protected short gxTv_SdtControlProductossinMovimientos_SDT_Prddiasinactivo ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtControlProductossinMovimientos_SDT_Prdexialm ;
   protected java.math.BigDecimal gxTv_SdtControlProductossinMovimientos_SDT_Prdpreact ;
   protected String gxTv_SdtControlProductossinMovimientos_SDT_Prdnum ;
   protected String gxTv_SdtControlProductossinMovimientos_SDT_Prdnom ;
   protected String gxTv_SdtControlProductossinMovimientos_SDT_Prdtipmovult ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtControlProductossinMovimientos_SDT_Prdfecultmov ;
   protected boolean readElement ;
   protected boolean formatError ;
}

