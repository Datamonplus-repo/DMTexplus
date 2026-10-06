package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem extends GxUserType
{
   public SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem( )
   {
      this(  new ModelContext(SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem.class));
   }

   public SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem( ModelContext context )
   {
      super( context, "SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem");
   }

   public SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem( int remoteHandle ,
                                                              ModelContext context )
   {
      super( remoteHandle, context, "SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem");
   }

   public SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem( StructSdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "RecFec") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_Recfec = GXutil.nullDate() ;
                  gxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_Recfec_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_Recfec_N = (byte)(0) ;
                  gxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_Recfec = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
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
         sName = "SeleccionRecuento_SDT.SeleccionRecuento_SDTItem" ;
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
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_Recfec)) && ( gxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_Recfec_N == 1 ) )
      {
         oWriter.writeElement("RecFec", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_Recfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_Recfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_Recfec), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("RecFec", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeEndElement();
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
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_Recfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_Recfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_Recfec), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("RecFec", sDateCnv, false, false);
   }

   public java.util.Date getgxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_Recfec( )
   {
      return gxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_Recfec ;
   }

   public void setgxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_Recfec( java.util.Date value )
   {
      gxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_Recfec_N = (byte)(0) ;
      gxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_N = (byte)(0) ;
      gxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_Recfec = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_Recfec = GXutil.nullDate() ;
      gxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_Recfec_N = (byte)(1) ;
      gxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_N = (byte)(1) ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_N ;
   }

   public app.stocksquimicos.SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem Clone( )
   {
      return (app.stocksquimicos.SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem)(clone()) ;
   }

   public void setStruct( app.stocksquimicos.StructSdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem struct )
   {
      if ( struct.gxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_Recfec_N == 0 )
      {
         setgxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_Recfec(struct.getRecfec());
      }
   }

   @SuppressWarnings("unchecked")
   public app.stocksquimicos.StructSdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem getStruct( )
   {
      app.stocksquimicos.StructSdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem struct = new app.stocksquimicos.StructSdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem ();
      if ( gxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_Recfec_N == 0 )
      {
         struct.setRecfec(getgxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_Recfec());
      }
      return struct ;
   }

   protected byte gxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_Recfec_N ;
   protected byte gxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSeleccionRecuento_SDT_SeleccionRecuento_SDTItem_Recfec ;
   protected boolean readElement ;
   protected boolean formatError ;
}

