package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTConsultaMaquina_OrdenesItem extends GxUserType
{
   public SdtSDTConsultaMaquina_OrdenesItem( )
   {
      this(  new ModelContext(SdtSDTConsultaMaquina_OrdenesItem.class));
   }

   public SdtSDTConsultaMaquina_OrdenesItem( ModelContext context )
   {
      super( context, "SdtSDTConsultaMaquina_OrdenesItem");
   }

   public SdtSDTConsultaMaquina_OrdenesItem( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTConsultaMaquina_OrdenesItem");
   }

   public SdtSDTConsultaMaquina_OrdenesItem( StructSdtSDTConsultaMaquina_OrdenesItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Id") )
            {
               gxTv_SdtSDTConsultaMaquina_OrdenesItem_Id = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OMCod") )
            {
               gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OMFchCre") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omfchcre = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omfchcre_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omfchcre_N = (byte)(0) ;
                  gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omfchcre = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "OMDuracion") )
            {
               gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omduracion = oReader.getValue() ;
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
         sName = "SDTConsultaMaquina.OrdenesItem" ;
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
      oWriter.writeElement("Id", GXutil.trim( GXutil.str( gxTv_SdtSDTConsultaMaquina_OrdenesItem_Id, 15, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("OMCod", GXutil.trim( GXutil.str( gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omcod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omfchcre) && ( gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omfchcre_N == 1 ) )
      {
         oWriter.writeElement("OMFchCre", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omfchcre), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omfchcre), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omfchcre), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omfchcre), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omfchcre), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omfchcre), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("OMFchCre", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("OMDuracion", gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omduracion);
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
      AddObjectProperty("Id", gxTv_SdtSDTConsultaMaquina_OrdenesItem_Id, false, false);
      AddObjectProperty("OMCod", gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omcod, false, false);
      datetime_STZ = gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omfchcre ;
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
      AddObjectProperty("OMFchCre", sDateCnv, false, false);
      AddObjectProperty("OMDuracion", gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omduracion, false, false);
   }

   public long getgxTv_SdtSDTConsultaMaquina_OrdenesItem_Id( )
   {
      return gxTv_SdtSDTConsultaMaquina_OrdenesItem_Id ;
   }

   public void setgxTv_SdtSDTConsultaMaquina_OrdenesItem_Id( long value )
   {
      gxTv_SdtSDTConsultaMaquina_OrdenesItem_N = (byte)(0) ;
      gxTv_SdtSDTConsultaMaquina_OrdenesItem_Id = value ;
   }

   public int getgxTv_SdtSDTConsultaMaquina_OrdenesItem_Omcod( )
   {
      return gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omcod ;
   }

   public void setgxTv_SdtSDTConsultaMaquina_OrdenesItem_Omcod( int value )
   {
      gxTv_SdtSDTConsultaMaquina_OrdenesItem_N = (byte)(0) ;
      gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omcod = value ;
   }

   public java.util.Date getgxTv_SdtSDTConsultaMaquina_OrdenesItem_Omfchcre( )
   {
      return gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omfchcre ;
   }

   public void setgxTv_SdtSDTConsultaMaquina_OrdenesItem_Omfchcre( java.util.Date value )
   {
      gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omfchcre_N = (byte)(0) ;
      gxTv_SdtSDTConsultaMaquina_OrdenesItem_N = (byte)(0) ;
      gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omfchcre = value ;
   }

   public String getgxTv_SdtSDTConsultaMaquina_OrdenesItem_Omduracion( )
   {
      return gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omduracion ;
   }

   public void setgxTv_SdtSDTConsultaMaquina_OrdenesItem_Omduracion( String value )
   {
      gxTv_SdtSDTConsultaMaquina_OrdenesItem_N = (byte)(0) ;
      gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omduracion = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTConsultaMaquina_OrdenesItem_N = (byte)(1) ;
      gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omfchcre = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omfchcre_N = (byte)(1) ;
      gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omduracion = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTConsultaMaquina_OrdenesItem_N ;
   }

   public app.SdtSDTConsultaMaquina_OrdenesItem Clone( )
   {
      return (app.SdtSDTConsultaMaquina_OrdenesItem)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTConsultaMaquina_OrdenesItem struct )
   {
      setgxTv_SdtSDTConsultaMaquina_OrdenesItem_Id(struct.getId());
      setgxTv_SdtSDTConsultaMaquina_OrdenesItem_Omcod(struct.getOmcod());
      if ( struct.gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omfchcre_N == 0 )
      {
         setgxTv_SdtSDTConsultaMaquina_OrdenesItem_Omfchcre(struct.getOmfchcre());
      }
      setgxTv_SdtSDTConsultaMaquina_OrdenesItem_Omduracion(struct.getOmduracion());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTConsultaMaquina_OrdenesItem getStruct( )
   {
      app.StructSdtSDTConsultaMaquina_OrdenesItem struct = new app.StructSdtSDTConsultaMaquina_OrdenesItem ();
      struct.setId(getgxTv_SdtSDTConsultaMaquina_OrdenesItem_Id());
      struct.setOmcod(getgxTv_SdtSDTConsultaMaquina_OrdenesItem_Omcod());
      if ( gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omfchcre_N == 0 )
      {
         struct.setOmfchcre(getgxTv_SdtSDTConsultaMaquina_OrdenesItem_Omfchcre());
      }
      struct.setOmduracion(getgxTv_SdtSDTConsultaMaquina_OrdenesItem_Omduracion());
      return struct ;
   }

   protected byte gxTv_SdtSDTConsultaMaquina_OrdenesItem_N ;
   protected byte gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omfchcre_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omcod ;
   protected long gxTv_SdtSDTConsultaMaquina_OrdenesItem_Id ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omfchcre ;
   protected java.util.Date datetime_STZ ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDTConsultaMaquina_OrdenesItem_Omduracion ;
}

