package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSalidasManualesSDT_Cabecera extends GxUserType
{
   public SdtSalidasManualesSDT_Cabecera( )
   {
      this(  new ModelContext(SdtSalidasManualesSDT_Cabecera.class));
   }

   public SdtSalidasManualesSDT_Cabecera( ModelContext context )
   {
      super( context, "SdtSalidasManualesSDT_Cabecera");
   }

   public SdtSalidasManualesSDT_Cabecera( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtSalidasManualesSDT_Cabecera");
   }

   public SdtSalidasManualesSDT_Cabecera( StructSdtSalidasManualesSDT_Cabecera struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "CumConFec") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSalidasManualesSDT_Cabecera_Cumconfec = GXutil.nullDate() ;
                  gxTv_SdtSalidasManualesSDT_Cabecera_Cumconfec_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSalidasManualesSDT_Cabecera_Cumconfec_N = (byte)(0) ;
                  gxTv_SdtSalidasManualesSDT_Cabecera_Cumconfec = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CCoCod") )
            {
               gxTv_SdtSalidasManualesSDT_Cabecera_Ccocod = (short)(getnumericvalue(oReader.getValue())) ;
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
         sName = "SalidasManualesSDT.Cabecera" ;
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
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSalidasManualesSDT_Cabecera_Cumconfec)) && ( gxTv_SdtSalidasManualesSDT_Cabecera_Cumconfec_N == 1 ) )
      {
         oWriter.writeElement("CumConFec", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSalidasManualesSDT_Cabecera_Cumconfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSalidasManualesSDT_Cabecera_Cumconfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSalidasManualesSDT_Cabecera_Cumconfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("CumConFec", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("CCoCod", GXutil.trim( GXutil.str( gxTv_SdtSalidasManualesSDT_Cabecera_Ccocod, 3, 0)));
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
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSalidasManualesSDT_Cabecera_Cumconfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSalidasManualesSDT_Cabecera_Cumconfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSalidasManualesSDT_Cabecera_Cumconfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("CumConFec", sDateCnv, false, false);
      AddObjectProperty("CCoCod", gxTv_SdtSalidasManualesSDT_Cabecera_Ccocod, false, false);
   }

   public java.util.Date getgxTv_SdtSalidasManualesSDT_Cabecera_Cumconfec( )
   {
      return gxTv_SdtSalidasManualesSDT_Cabecera_Cumconfec ;
   }

   public void setgxTv_SdtSalidasManualesSDT_Cabecera_Cumconfec( java.util.Date value )
   {
      gxTv_SdtSalidasManualesSDT_Cabecera_Cumconfec_N = (byte)(0) ;
      gxTv_SdtSalidasManualesSDT_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesSDT_Cabecera_Cumconfec = value ;
   }

   public short getgxTv_SdtSalidasManualesSDT_Cabecera_Ccocod( )
   {
      return gxTv_SdtSalidasManualesSDT_Cabecera_Ccocod ;
   }

   public void setgxTv_SdtSalidasManualesSDT_Cabecera_Ccocod( short value )
   {
      gxTv_SdtSalidasManualesSDT_Cabecera_N = (byte)(0) ;
      gxTv_SdtSalidasManualesSDT_Cabecera_Ccocod = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSalidasManualesSDT_Cabecera_Cumconfec = GXutil.nullDate() ;
      gxTv_SdtSalidasManualesSDT_Cabecera_Cumconfec_N = (byte)(1) ;
      gxTv_SdtSalidasManualesSDT_Cabecera_N = (byte)(1) ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSalidasManualesSDT_Cabecera_N ;
   }

   public app.SdtSalidasManualesSDT_Cabecera Clone( )
   {
      return (app.SdtSalidasManualesSDT_Cabecera)(clone()) ;
   }

   public void setStruct( app.StructSdtSalidasManualesSDT_Cabecera struct )
   {
      if ( struct.gxTv_SdtSalidasManualesSDT_Cabecera_Cumconfec_N == 0 )
      {
         setgxTv_SdtSalidasManualesSDT_Cabecera_Cumconfec(struct.getCumconfec());
      }
      setgxTv_SdtSalidasManualesSDT_Cabecera_Ccocod(struct.getCcocod());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSalidasManualesSDT_Cabecera getStruct( )
   {
      app.StructSdtSalidasManualesSDT_Cabecera struct = new app.StructSdtSalidasManualesSDT_Cabecera ();
      if ( gxTv_SdtSalidasManualesSDT_Cabecera_Cumconfec_N == 0 )
      {
         struct.setCumconfec(getgxTv_SdtSalidasManualesSDT_Cabecera_Cumconfec());
      }
      struct.setCcocod(getgxTv_SdtSalidasManualesSDT_Cabecera_Ccocod());
      return struct ;
   }

   protected byte gxTv_SdtSalidasManualesSDT_Cabecera_Cumconfec_N ;
   protected byte gxTv_SdtSalidasManualesSDT_Cabecera_N ;
   protected short gxTv_SdtSalidasManualesSDT_Cabecera_Ccocod ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSalidasManualesSDT_Cabecera_Cumconfec ;
   protected boolean readElement ;
   protected boolean formatError ;
}

