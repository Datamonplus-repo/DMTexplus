package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem extends GxUserType
{
   public SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem( )
   {
      this(  new ModelContext(SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem.class));
   }

   public SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem( ModelContext context )
   {
      super( context, "SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem");
   }

   public SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem( int remoteHandle ,
                                                                                        ModelContext context )
   {
      super( remoteHandle, context, "SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem");
   }

   public SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem( StructSdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem struct )
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
               gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Seleccionar = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbComCod") )
            {
               gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbComFch") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomfch = GXutil.nullDate() ;
                  gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomfch_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomfch_N = (byte)(0) ;
                  gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomfch = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AlbComImp") )
            {
               gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomimp = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "FacturacionManual_Comerciales__SDT.FacturacionManual_Comerciales__SDTItem" ;
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
      oWriter.writeElement("Seleccionar", GXutil.booltostr( gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Seleccionar));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("AlbComCod", GXutil.trim( GXutil.str( gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomcod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomfch)) && ( gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomfch_N == 1 ) )
      {
         oWriter.writeElement("AlbComFch", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomfch), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomfch), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomfch), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("AlbComFch", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("AlbComImp", GXutil.trim( GXutil.strNoRound( gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomimp, 13, 2)));
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
      AddObjectProperty("Seleccionar", gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Seleccionar, false, false);
      AddObjectProperty("AlbComCod", gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomcod, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomfch), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomfch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomfch), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("AlbComFch", sDateCnv, false, false);
      AddObjectProperty("AlbComImp", gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomimp, false, false);
   }

   public boolean getgxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Seleccionar( )
   {
      return gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Seleccionar ;
   }

   public void setgxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Seleccionar( boolean value )
   {
      gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_N = (byte)(0) ;
      gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Seleccionar = value ;
   }

   public int getgxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomcod( )
   {
      return gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomcod ;
   }

   public void setgxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomcod( int value )
   {
      gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_N = (byte)(0) ;
      gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomcod = value ;
   }

   public java.util.Date getgxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomfch( )
   {
      return gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomfch ;
   }

   public void setgxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomfch( java.util.Date value )
   {
      gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomfch_N = (byte)(0) ;
      gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_N = (byte)(0) ;
      gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomfch = value ;
   }

   public java.math.BigDecimal getgxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomimp( )
   {
      return gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomimp ;
   }

   public void setgxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomimp( java.math.BigDecimal value )
   {
      gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_N = (byte)(0) ;
      gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomimp = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_N = (byte)(1) ;
      gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomfch = GXutil.nullDate() ;
      gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomfch_N = (byte)(1) ;
      gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomimp = DecimalUtil.ZERO ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_N ;
   }

   public app.facturacion.SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem Clone( )
   {
      return (app.facturacion.SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem)(clone()) ;
   }

   public void setStruct( app.facturacion.StructSdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem struct )
   {
      setgxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Seleccionar(struct.getSeleccionar());
      setgxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomcod(struct.getAlbcomcod());
      if ( struct.gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomfch_N == 0 )
      {
         setgxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomfch(struct.getAlbcomfch());
      }
      setgxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomimp(struct.getAlbcomimp());
   }

   @SuppressWarnings("unchecked")
   public app.facturacion.StructSdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem getStruct( )
   {
      app.facturacion.StructSdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem struct = new app.facturacion.StructSdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem ();
      struct.setSeleccionar(getgxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Seleccionar());
      struct.setAlbcomcod(getgxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomcod());
      if ( gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomfch_N == 0 )
      {
         struct.setAlbcomfch(getgxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomfch());
      }
      struct.setAlbcomimp(getgxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomimp());
      return struct ;
   }

   protected byte gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_N ;
   protected byte gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomfch_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomcod ;
   protected java.math.BigDecimal gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomimp ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Albcomfch ;
   protected boolean gxTv_SdtFacturacionManual_Comerciales__SDT_FacturacionManual_Comerciales__SDTItem_Seleccionar ;
   protected boolean readElement ;
   protected boolean formatError ;
}

