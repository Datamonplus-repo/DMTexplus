package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTProduccionParos extends GxUserType
{
   public SdtSDTProduccionParos( )
   {
      this(  new ModelContext(SdtSDTProduccionParos.class));
   }

   public SdtSDTProduccionParos( ModelContext context )
   {
      super( context, "SdtSDTProduccionParos");
   }

   public SdtSDTProduccionParos( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTProduccionParos");
   }

   public SdtSDTProduccionParos( StructSdtSDTProduccionParos struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Maqcod") )
            {
               gxTv_SdtSDTProduccionParos_Maqcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqDsc") )
            {
               gxTv_SdtSDTProduccionParos_Maqdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Parcod") )
            {
               gxTv_SdtSDTProduccionParos_Parcod = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Parcodnom") )
            {
               gxTv_SdtSDTProduccionParos_Parcodnom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Hisprodti") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTProduccionParos_Hisprodti = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtSDTProduccionParos_Hisprodti_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTProduccionParos_Hisprodti_N = (byte)(0) ;
                  gxTv_SdtSDTProduccionParos_Hisprodti = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "HisProdtf") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTProduccionParos_Hisprodtf = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtSDTProduccionParos_Hisprodtf_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTProduccionParos_Hisprodtf_N = (byte)(0) ;
                  gxTv_SdtSDTProduccionParos_Hisprodtf = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TiempoParo") )
            {
               gxTv_SdtSDTProduccionParos_Tiempoparo = (int)(getnumericvalue(oReader.getValue())) ;
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
         sName = "SDTProduccionParos" ;
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
      oWriter.writeElement("Maqcod", gxTv_SdtSDTProduccionParos_Maqcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqDsc", gxTv_SdtSDTProduccionParos_Maqdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Parcod", GXutil.trim( GXutil.str( gxTv_SdtSDTProduccionParos_Parcod, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Parcodnom", gxTv_SdtSDTProduccionParos_Parcodnom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTProduccionParos_Hisprodti) && ( gxTv_SdtSDTProduccionParos_Hisprodti_N == 1 ) )
      {
         oWriter.writeElement("Hisprodti", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTProduccionParos_Hisprodti), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTProduccionParos_Hisprodti), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTProduccionParos_Hisprodti), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSDTProduccionParos_Hisprodti), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSDTProduccionParos_Hisprodti), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSDTProduccionParos_Hisprodti), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("Hisprodti", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTProduccionParos_Hisprodtf) && ( gxTv_SdtSDTProduccionParos_Hisprodtf_N == 1 ) )
      {
         oWriter.writeElement("HisProdtf", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTProduccionParos_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTProduccionParos_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTProduccionParos_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSDTProduccionParos_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSDTProduccionParos_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSDTProduccionParos_Hisprodtf), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("HisProdtf", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("TiempoParo", GXutil.trim( GXutil.str( gxTv_SdtSDTProduccionParos_Tiempoparo, 6, 0)));
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
      AddObjectProperty("Maqcod", gxTv_SdtSDTProduccionParos_Maqcod, false, false);
      AddObjectProperty("MaqDsc", gxTv_SdtSDTProduccionParos_Maqdsc, false, false);
      AddObjectProperty("Parcod", gxTv_SdtSDTProduccionParos_Parcod, false, false);
      AddObjectProperty("Parcodnom", gxTv_SdtSDTProduccionParos_Parcodnom, false, false);
      datetime_STZ = gxTv_SdtSDTProduccionParos_Hisprodti ;
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
      AddObjectProperty("Hisprodti", sDateCnv, false, false);
      datetime_STZ = gxTv_SdtSDTProduccionParos_Hisprodtf ;
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
      AddObjectProperty("HisProdtf", sDateCnv, false, false);
      AddObjectProperty("TiempoParo", gxTv_SdtSDTProduccionParos_Tiempoparo, false, false);
   }

   public String getgxTv_SdtSDTProduccionParos_Maqcod( )
   {
      return gxTv_SdtSDTProduccionParos_Maqcod ;
   }

   public void setgxTv_SdtSDTProduccionParos_Maqcod( String value )
   {
      gxTv_SdtSDTProduccionParos_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParos_Maqcod = value ;
   }

   public String getgxTv_SdtSDTProduccionParos_Maqdsc( )
   {
      return gxTv_SdtSDTProduccionParos_Maqdsc ;
   }

   public void setgxTv_SdtSDTProduccionParos_Maqdsc( String value )
   {
      gxTv_SdtSDTProduccionParos_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParos_Maqdsc = value ;
   }

   public short getgxTv_SdtSDTProduccionParos_Parcod( )
   {
      return gxTv_SdtSDTProduccionParos_Parcod ;
   }

   public void setgxTv_SdtSDTProduccionParos_Parcod( short value )
   {
      gxTv_SdtSDTProduccionParos_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParos_Parcod = value ;
   }

   public String getgxTv_SdtSDTProduccionParos_Parcodnom( )
   {
      return gxTv_SdtSDTProduccionParos_Parcodnom ;
   }

   public void setgxTv_SdtSDTProduccionParos_Parcodnom( String value )
   {
      gxTv_SdtSDTProduccionParos_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParos_Parcodnom = value ;
   }

   public java.util.Date getgxTv_SdtSDTProduccionParos_Hisprodti( )
   {
      return gxTv_SdtSDTProduccionParos_Hisprodti ;
   }

   public void setgxTv_SdtSDTProduccionParos_Hisprodti( java.util.Date value )
   {
      gxTv_SdtSDTProduccionParos_Hisprodti_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParos_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParos_Hisprodti = value ;
   }

   public java.util.Date getgxTv_SdtSDTProduccionParos_Hisprodtf( )
   {
      return gxTv_SdtSDTProduccionParos_Hisprodtf ;
   }

   public void setgxTv_SdtSDTProduccionParos_Hisprodtf( java.util.Date value )
   {
      gxTv_SdtSDTProduccionParos_Hisprodtf_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParos_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParos_Hisprodtf = value ;
   }

   public int getgxTv_SdtSDTProduccionParos_Tiempoparo( )
   {
      return gxTv_SdtSDTProduccionParos_Tiempoparo ;
   }

   public void setgxTv_SdtSDTProduccionParos_Tiempoparo( int value )
   {
      gxTv_SdtSDTProduccionParos_N = (byte)(0) ;
      gxTv_SdtSDTProduccionParos_Tiempoparo = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTProduccionParos_Maqcod = "" ;
      gxTv_SdtSDTProduccionParos_N = (byte)(1) ;
      gxTv_SdtSDTProduccionParos_Maqdsc = "" ;
      gxTv_SdtSDTProduccionParos_Parcodnom = "" ;
      gxTv_SdtSDTProduccionParos_Hisprodti = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSDTProduccionParos_Hisprodti_N = (byte)(1) ;
      gxTv_SdtSDTProduccionParos_Hisprodtf = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSDTProduccionParos_Hisprodtf_N = (byte)(1) ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTProduccionParos_N ;
   }

   public app.SdtSDTProduccionParos Clone( )
   {
      return (app.SdtSDTProduccionParos)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTProduccionParos struct )
   {
      setgxTv_SdtSDTProduccionParos_Maqcod(struct.getMaqcod());
      setgxTv_SdtSDTProduccionParos_Maqdsc(struct.getMaqdsc());
      setgxTv_SdtSDTProduccionParos_Parcod(struct.getParcod());
      setgxTv_SdtSDTProduccionParos_Parcodnom(struct.getParcodnom());
      if ( struct.gxTv_SdtSDTProduccionParos_Hisprodti_N == 0 )
      {
         setgxTv_SdtSDTProduccionParos_Hisprodti(struct.getHisprodti());
      }
      if ( struct.gxTv_SdtSDTProduccionParos_Hisprodtf_N == 0 )
      {
         setgxTv_SdtSDTProduccionParos_Hisprodtf(struct.getHisprodtf());
      }
      setgxTv_SdtSDTProduccionParos_Tiempoparo(struct.getTiempoparo());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTProduccionParos getStruct( )
   {
      app.StructSdtSDTProduccionParos struct = new app.StructSdtSDTProduccionParos ();
      struct.setMaqcod(getgxTv_SdtSDTProduccionParos_Maqcod());
      struct.setMaqdsc(getgxTv_SdtSDTProduccionParos_Maqdsc());
      struct.setParcod(getgxTv_SdtSDTProduccionParos_Parcod());
      struct.setParcodnom(getgxTv_SdtSDTProduccionParos_Parcodnom());
      if ( gxTv_SdtSDTProduccionParos_Hisprodti_N == 0 )
      {
         struct.setHisprodti(getgxTv_SdtSDTProduccionParos_Hisprodti());
      }
      if ( gxTv_SdtSDTProduccionParos_Hisprodtf_N == 0 )
      {
         struct.setHisprodtf(getgxTv_SdtSDTProduccionParos_Hisprodtf());
      }
      struct.setTiempoparo(getgxTv_SdtSDTProduccionParos_Tiempoparo());
      return struct ;
   }

   protected byte gxTv_SdtSDTProduccionParos_N ;
   protected byte gxTv_SdtSDTProduccionParos_Hisprodti_N ;
   protected byte gxTv_SdtSDTProduccionParos_Hisprodtf_N ;
   protected short gxTv_SdtSDTProduccionParos_Parcod ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTProduccionParos_Tiempoparo ;
   protected String gxTv_SdtSDTProduccionParos_Maqcod ;
   protected String gxTv_SdtSDTProduccionParos_Maqdsc ;
   protected String gxTv_SdtSDTProduccionParos_Parcodnom ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTProduccionParos_Hisprodti ;
   protected java.util.Date gxTv_SdtSDTProduccionParos_Hisprodtf ;
   protected java.util.Date datetime_STZ ;
   protected boolean readElement ;
   protected boolean formatError ;
}

