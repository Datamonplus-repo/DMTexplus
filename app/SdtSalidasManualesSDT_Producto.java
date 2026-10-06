package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSalidasManualesSDT_Producto extends GxUserType
{
   public SdtSalidasManualesSDT_Producto( )
   {
      this(  new ModelContext(SdtSalidasManualesSDT_Producto.class));
   }

   public SdtSalidasManualesSDT_Producto( ModelContext context )
   {
      super( context, "SdtSalidasManualesSDT_Producto");
   }

   public SdtSalidasManualesSDT_Producto( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtSalidasManualesSDT_Producto");
   }

   public SdtSalidasManualesSDT_Producto( StructSdtSalidasManualesSDT_Producto struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdNum") )
            {
               gxTv_SdtSalidasManualesSDT_Producto_Prdnum = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdFaccon") )
            {
               gxTv_SdtSalidasManualesSDT_Producto_Prdfaccon = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdExiAlm") )
            {
               gxTv_SdtSalidasManualesSDT_Producto_Prdexialm = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PrdCanRes") )
            {
               gxTv_SdtSalidasManualesSDT_Producto_Prdcanres = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CumConCant") )
            {
               gxTv_SdtSalidasManualesSDT_Producto_Cumconcant = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CumUnidad") )
            {
               gxTv_SdtSalidasManualesSDT_Producto_Cumunidad = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CumConLot") )
            {
               gxTv_SdtSalidasManualesSDT_Producto_Cumconlot = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UltFecCCs") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSalidasManualesSDT_Producto_Ultfecccs = GXutil.nullDate() ;
                  gxTv_SdtSalidasManualesSDT_Producto_Ultfecccs_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSalidasManualesSDT_Producto_Ultfecccs_N = (byte)(0) ;
                  gxTv_SdtSalidasManualesSDT_Producto_Ultfecccs = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
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
         sName = "SalidasManualesSDT.Producto" ;
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
      oWriter.writeElement("PrdNum", gxTv_SdtSalidasManualesSDT_Producto_Prdnum);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdFaccon", GXutil.trim( GXutil.strNoRound( gxTv_SdtSalidasManualesSDT_Producto_Prdfaccon, 7, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdExiAlm", GXutil.trim( GXutil.strNoRound( gxTv_SdtSalidasManualesSDT_Producto_Prdexialm, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PrdCanRes", GXutil.trim( GXutil.strNoRound( gxTv_SdtSalidasManualesSDT_Producto_Prdcanres, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CumConCant", GXutil.trim( GXutil.strNoRound( gxTv_SdtSalidasManualesSDT_Producto_Cumconcant, 12, 4)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CumUnidad", GXutil.trim( GXutil.str( gxTv_SdtSalidasManualesSDT_Producto_Cumunidad, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CumConLot", gxTv_SdtSalidasManualesSDT_Producto_Cumconlot);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSalidasManualesSDT_Producto_Ultfecccs)) && ( gxTv_SdtSalidasManualesSDT_Producto_Ultfecccs_N == 1 ) )
      {
         oWriter.writeElement("UltFecCCs", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSalidasManualesSDT_Producto_Ultfecccs), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSalidasManualesSDT_Producto_Ultfecccs), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSalidasManualesSDT_Producto_Ultfecccs), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("UltFecCCs", sDateCnv);
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
      AddObjectProperty("PrdNum", gxTv_SdtSalidasManualesSDT_Producto_Prdnum, false, false);
      AddObjectProperty("PrdFaccon", gxTv_SdtSalidasManualesSDT_Producto_Prdfaccon, false, false);
      AddObjectProperty("PrdExiAlm", gxTv_SdtSalidasManualesSDT_Producto_Prdexialm, false, false);
      AddObjectProperty("PrdCanRes", gxTv_SdtSalidasManualesSDT_Producto_Prdcanres, false, false);
      AddObjectProperty("CumConCant", gxTv_SdtSalidasManualesSDT_Producto_Cumconcant, false, false);
      AddObjectProperty("CumUnidad", gxTv_SdtSalidasManualesSDT_Producto_Cumunidad, false, false);
      AddObjectProperty("CumConLot", gxTv_SdtSalidasManualesSDT_Producto_Cumconlot, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSalidasManualesSDT_Producto_Ultfecccs), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSalidasManualesSDT_Producto_Ultfecccs), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSalidasManualesSDT_Producto_Ultfecccs), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("UltFecCCs", sDateCnv, false, false);
   }

   public String getgxTv_SdtSalidasManualesSDT_Producto_Prdnum( )
   {
      return gxTv_SdtSalidasManualesSDT_Producto_Prdnum ;
   }

   public void setgxTv_SdtSalidasManualesSDT_Producto_Prdnum( String value )
   {
      gxTv_SdtSalidasManualesSDT_Producto_N = (byte)(0) ;
      gxTv_SdtSalidasManualesSDT_Producto_Prdnum = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSalidasManualesSDT_Producto_Prdfaccon( )
   {
      return gxTv_SdtSalidasManualesSDT_Producto_Prdfaccon ;
   }

   public void setgxTv_SdtSalidasManualesSDT_Producto_Prdfaccon( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesSDT_Producto_N = (byte)(0) ;
      gxTv_SdtSalidasManualesSDT_Producto_Prdfaccon = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSalidasManualesSDT_Producto_Prdexialm( )
   {
      return gxTv_SdtSalidasManualesSDT_Producto_Prdexialm ;
   }

   public void setgxTv_SdtSalidasManualesSDT_Producto_Prdexialm( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesSDT_Producto_N = (byte)(0) ;
      gxTv_SdtSalidasManualesSDT_Producto_Prdexialm = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSalidasManualesSDT_Producto_Prdcanres( )
   {
      return gxTv_SdtSalidasManualesSDT_Producto_Prdcanres ;
   }

   public void setgxTv_SdtSalidasManualesSDT_Producto_Prdcanres( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesSDT_Producto_N = (byte)(0) ;
      gxTv_SdtSalidasManualesSDT_Producto_Prdcanres = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSalidasManualesSDT_Producto_Cumconcant( )
   {
      return gxTv_SdtSalidasManualesSDT_Producto_Cumconcant ;
   }

   public void setgxTv_SdtSalidasManualesSDT_Producto_Cumconcant( java.math.BigDecimal value )
   {
      gxTv_SdtSalidasManualesSDT_Producto_N = (byte)(0) ;
      gxTv_SdtSalidasManualesSDT_Producto_Cumconcant = value ;
   }

   public byte getgxTv_SdtSalidasManualesSDT_Producto_Cumunidad( )
   {
      return gxTv_SdtSalidasManualesSDT_Producto_Cumunidad ;
   }

   public void setgxTv_SdtSalidasManualesSDT_Producto_Cumunidad( byte value )
   {
      gxTv_SdtSalidasManualesSDT_Producto_N = (byte)(0) ;
      gxTv_SdtSalidasManualesSDT_Producto_Cumunidad = value ;
   }

   public String getgxTv_SdtSalidasManualesSDT_Producto_Cumconlot( )
   {
      return gxTv_SdtSalidasManualesSDT_Producto_Cumconlot ;
   }

   public void setgxTv_SdtSalidasManualesSDT_Producto_Cumconlot( String value )
   {
      gxTv_SdtSalidasManualesSDT_Producto_N = (byte)(0) ;
      gxTv_SdtSalidasManualesSDT_Producto_Cumconlot = value ;
   }

   public java.util.Date getgxTv_SdtSalidasManualesSDT_Producto_Ultfecccs( )
   {
      return gxTv_SdtSalidasManualesSDT_Producto_Ultfecccs ;
   }

   public void setgxTv_SdtSalidasManualesSDT_Producto_Ultfecccs( java.util.Date value )
   {
      gxTv_SdtSalidasManualesSDT_Producto_Ultfecccs_N = (byte)(0) ;
      gxTv_SdtSalidasManualesSDT_Producto_N = (byte)(0) ;
      gxTv_SdtSalidasManualesSDT_Producto_Ultfecccs = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSalidasManualesSDT_Producto_Prdnum = "" ;
      gxTv_SdtSalidasManualesSDT_Producto_N = (byte)(1) ;
      gxTv_SdtSalidasManualesSDT_Producto_Prdfaccon = DecimalUtil.ZERO ;
      gxTv_SdtSalidasManualesSDT_Producto_Prdexialm = DecimalUtil.ZERO ;
      gxTv_SdtSalidasManualesSDT_Producto_Prdcanres = DecimalUtil.ZERO ;
      gxTv_SdtSalidasManualesSDT_Producto_Cumconcant = DecimalUtil.ZERO ;
      gxTv_SdtSalidasManualesSDT_Producto_Cumconlot = "" ;
      gxTv_SdtSalidasManualesSDT_Producto_Ultfecccs = GXutil.nullDate() ;
      gxTv_SdtSalidasManualesSDT_Producto_Ultfecccs_N = (byte)(1) ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSalidasManualesSDT_Producto_N ;
   }

   public app.SdtSalidasManualesSDT_Producto Clone( )
   {
      return (app.SdtSalidasManualesSDT_Producto)(clone()) ;
   }

   public void setStruct( app.StructSdtSalidasManualesSDT_Producto struct )
   {
      setgxTv_SdtSalidasManualesSDT_Producto_Prdnum(struct.getPrdnum());
      setgxTv_SdtSalidasManualesSDT_Producto_Prdfaccon(struct.getPrdfaccon());
      setgxTv_SdtSalidasManualesSDT_Producto_Prdexialm(struct.getPrdexialm());
      setgxTv_SdtSalidasManualesSDT_Producto_Prdcanres(struct.getPrdcanres());
      setgxTv_SdtSalidasManualesSDT_Producto_Cumconcant(struct.getCumconcant());
      setgxTv_SdtSalidasManualesSDT_Producto_Cumunidad(struct.getCumunidad());
      setgxTv_SdtSalidasManualesSDT_Producto_Cumconlot(struct.getCumconlot());
      if ( struct.gxTv_SdtSalidasManualesSDT_Producto_Ultfecccs_N == 0 )
      {
         setgxTv_SdtSalidasManualesSDT_Producto_Ultfecccs(struct.getUltfecccs());
      }
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSalidasManualesSDT_Producto getStruct( )
   {
      app.StructSdtSalidasManualesSDT_Producto struct = new app.StructSdtSalidasManualesSDT_Producto ();
      struct.setPrdnum(getgxTv_SdtSalidasManualesSDT_Producto_Prdnum());
      struct.setPrdfaccon(getgxTv_SdtSalidasManualesSDT_Producto_Prdfaccon());
      struct.setPrdexialm(getgxTv_SdtSalidasManualesSDT_Producto_Prdexialm());
      struct.setPrdcanres(getgxTv_SdtSalidasManualesSDT_Producto_Prdcanres());
      struct.setCumconcant(getgxTv_SdtSalidasManualesSDT_Producto_Cumconcant());
      struct.setCumunidad(getgxTv_SdtSalidasManualesSDT_Producto_Cumunidad());
      struct.setCumconlot(getgxTv_SdtSalidasManualesSDT_Producto_Cumconlot());
      if ( gxTv_SdtSalidasManualesSDT_Producto_Ultfecccs_N == 0 )
      {
         struct.setUltfecccs(getgxTv_SdtSalidasManualesSDT_Producto_Ultfecccs());
      }
      return struct ;
   }

   protected byte gxTv_SdtSalidasManualesSDT_Producto_N ;
   protected byte gxTv_SdtSalidasManualesSDT_Producto_Cumunidad ;
   protected byte gxTv_SdtSalidasManualesSDT_Producto_Ultfecccs_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesSDT_Producto_Prdfaccon ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesSDT_Producto_Prdexialm ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesSDT_Producto_Prdcanres ;
   protected java.math.BigDecimal gxTv_SdtSalidasManualesSDT_Producto_Cumconcant ;
   protected String gxTv_SdtSalidasManualesSDT_Producto_Prdnum ;
   protected String gxTv_SdtSalidasManualesSDT_Producto_Cumconlot ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSalidasManualesSDT_Producto_Ultfecccs ;
   protected boolean readElement ;
   protected boolean formatError ;
}

