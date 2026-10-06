package app.core ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTRMSDT_TRMSDTItem extends GxUserType
{
   public SdtTRMSDT_TRMSDTItem( )
   {
      this(  new ModelContext(SdtTRMSDT_TRMSDTItem.class));
   }

   public SdtTRMSDT_TRMSDTItem( ModelContext context )
   {
      super( context, "SdtTRMSDT_TRMSDTItem");
   }

   public SdtTRMSDT_TRMSDTItem( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle, context, "SdtTRMSDT_TRMSDTItem");
   }

   public SdtTRMSDT_TRMSDTItem( StructSdtTRMSDT_TRMSDTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "valor") )
            {
               gxTv_SdtTRMSDT_TRMSDTItem_Valor = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "unidad") )
            {
               gxTv_SdtTRMSDT_TRMSDTItem_Unidad = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "vigenciadesde") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTRMSDT_TRMSDTItem_Vigenciadesde = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtTRMSDT_TRMSDTItem_Vigenciadesde_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtTRMSDT_TRMSDTItem_Vigenciadesde_N = (byte)(0) ;
                  gxTv_SdtTRMSDT_TRMSDTItem_Vigenciadesde = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "vigenciahasta") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTRMSDT_TRMSDTItem_Vigenciahasta = GXutil.resetTime( GXutil.nullDate() );
                  gxTv_SdtTRMSDT_TRMSDTItem_Vigenciahasta_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtTRMSDT_TRMSDTItem_Vigenciahasta_N = (byte)(0) ;
                  gxTv_SdtTRMSDT_TRMSDTItem_Vigenciahasta = localUtil.ymdhmsToT( (short)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 12, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 15, 2), "."))), (byte)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 18, 2), ".")))) ;
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
         sName = "TRMSDT.TRMSDTItem" ;
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
      oWriter.writeElement("valor", gxTv_SdtTRMSDT_TRMSDTItem_Valor);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("unidad", gxTv_SdtTRMSDT_TRMSDTItem_Unidad);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtTRMSDT_TRMSDTItem_Vigenciadesde) && ( gxTv_SdtTRMSDT_TRMSDTItem_Vigenciadesde_N == 1 ) )
      {
         oWriter.writeElement("vigenciadesde", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTRMSDT_TRMSDTItem_Vigenciadesde), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTRMSDT_TRMSDTItem_Vigenciadesde), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTRMSDT_TRMSDTItem_Vigenciadesde), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTRMSDT_TRMSDTItem_Vigenciadesde), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTRMSDT_TRMSDTItem_Vigenciadesde), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTRMSDT_TRMSDTItem_Vigenciadesde), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("vigenciadesde", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), gxTv_SdtTRMSDT_TRMSDTItem_Vigenciahasta) && ( gxTv_SdtTRMSDT_TRMSDTItem_Vigenciahasta_N == 1 ) )
      {
         oWriter.writeElement("vigenciahasta", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTRMSDT_TRMSDTItem_Vigenciahasta), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTRMSDT_TRMSDTItem_Vigenciahasta), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTRMSDT_TRMSDTItem_Vigenciahasta), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTRMSDT_TRMSDTItem_Vigenciahasta), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTRMSDT_TRMSDTItem_Vigenciahasta), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTRMSDT_TRMSDTItem_Vigenciahasta), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("vigenciahasta", sDateCnv);
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
      AddObjectProperty("valor", gxTv_SdtTRMSDT_TRMSDTItem_Valor, false, false);
      AddObjectProperty("unidad", gxTv_SdtTRMSDT_TRMSDTItem_Unidad, false, false);
      datetime_STZ = gxTv_SdtTRMSDT_TRMSDTItem_Vigenciadesde ;
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
      AddObjectProperty("vigenciadesde", sDateCnv, false, false);
      datetime_STZ = gxTv_SdtTRMSDT_TRMSDTItem_Vigenciahasta ;
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
      AddObjectProperty("vigenciahasta", sDateCnv, false, false);
   }

   public String getgxTv_SdtTRMSDT_TRMSDTItem_Valor( )
   {
      return gxTv_SdtTRMSDT_TRMSDTItem_Valor ;
   }

   public void setgxTv_SdtTRMSDT_TRMSDTItem_Valor( String value )
   {
      gxTv_SdtTRMSDT_TRMSDTItem_N = (byte)(0) ;
      gxTv_SdtTRMSDT_TRMSDTItem_Valor = value ;
   }

   public String getgxTv_SdtTRMSDT_TRMSDTItem_Unidad( )
   {
      return gxTv_SdtTRMSDT_TRMSDTItem_Unidad ;
   }

   public void setgxTv_SdtTRMSDT_TRMSDTItem_Unidad( String value )
   {
      gxTv_SdtTRMSDT_TRMSDTItem_N = (byte)(0) ;
      gxTv_SdtTRMSDT_TRMSDTItem_Unidad = value ;
   }

   public java.util.Date getgxTv_SdtTRMSDT_TRMSDTItem_Vigenciadesde( )
   {
      return gxTv_SdtTRMSDT_TRMSDTItem_Vigenciadesde ;
   }

   public void setgxTv_SdtTRMSDT_TRMSDTItem_Vigenciadesde( java.util.Date value )
   {
      gxTv_SdtTRMSDT_TRMSDTItem_Vigenciadesde_N = (byte)(0) ;
      gxTv_SdtTRMSDT_TRMSDTItem_N = (byte)(0) ;
      gxTv_SdtTRMSDT_TRMSDTItem_Vigenciadesde = value ;
   }

   public java.util.Date getgxTv_SdtTRMSDT_TRMSDTItem_Vigenciahasta( )
   {
      return gxTv_SdtTRMSDT_TRMSDTItem_Vigenciahasta ;
   }

   public void setgxTv_SdtTRMSDT_TRMSDTItem_Vigenciahasta( java.util.Date value )
   {
      gxTv_SdtTRMSDT_TRMSDTItem_Vigenciahasta_N = (byte)(0) ;
      gxTv_SdtTRMSDT_TRMSDTItem_N = (byte)(0) ;
      gxTv_SdtTRMSDT_TRMSDTItem_Vigenciahasta = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtTRMSDT_TRMSDTItem_Valor = "" ;
      gxTv_SdtTRMSDT_TRMSDTItem_N = (byte)(1) ;
      gxTv_SdtTRMSDT_TRMSDTItem_Unidad = "" ;
      gxTv_SdtTRMSDT_TRMSDTItem_Vigenciadesde = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTRMSDT_TRMSDTItem_Vigenciadesde_N = (byte)(1) ;
      gxTv_SdtTRMSDT_TRMSDTItem_Vigenciahasta = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTRMSDT_TRMSDTItem_Vigenciahasta_N = (byte)(1) ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public byte isNull( )
   {
      return gxTv_SdtTRMSDT_TRMSDTItem_N ;
   }

   public app.core.SdtTRMSDT_TRMSDTItem Clone( )
   {
      return (app.core.SdtTRMSDT_TRMSDTItem)(clone()) ;
   }

   public void setStruct( app.core.StructSdtTRMSDT_TRMSDTItem struct )
   {
      setgxTv_SdtTRMSDT_TRMSDTItem_Valor(struct.getValor());
      setgxTv_SdtTRMSDT_TRMSDTItem_Unidad(struct.getUnidad());
      if ( struct.gxTv_SdtTRMSDT_TRMSDTItem_Vigenciadesde_N == 0 )
      {
         setgxTv_SdtTRMSDT_TRMSDTItem_Vigenciadesde(struct.getVigenciadesde());
      }
      if ( struct.gxTv_SdtTRMSDT_TRMSDTItem_Vigenciahasta_N == 0 )
      {
         setgxTv_SdtTRMSDT_TRMSDTItem_Vigenciahasta(struct.getVigenciahasta());
      }
   }

   @SuppressWarnings("unchecked")
   public app.core.StructSdtTRMSDT_TRMSDTItem getStruct( )
   {
      app.core.StructSdtTRMSDT_TRMSDTItem struct = new app.core.StructSdtTRMSDT_TRMSDTItem ();
      struct.setValor(getgxTv_SdtTRMSDT_TRMSDTItem_Valor());
      struct.setUnidad(getgxTv_SdtTRMSDT_TRMSDTItem_Unidad());
      if ( gxTv_SdtTRMSDT_TRMSDTItem_Vigenciadesde_N == 0 )
      {
         struct.setVigenciadesde(getgxTv_SdtTRMSDT_TRMSDTItem_Vigenciadesde());
      }
      if ( gxTv_SdtTRMSDT_TRMSDTItem_Vigenciahasta_N == 0 )
      {
         struct.setVigenciahasta(getgxTv_SdtTRMSDT_TRMSDTItem_Vigenciahasta());
      }
      return struct ;
   }

   protected byte gxTv_SdtTRMSDT_TRMSDTItem_N ;
   protected byte gxTv_SdtTRMSDT_TRMSDTItem_Vigenciadesde_N ;
   protected byte gxTv_SdtTRMSDT_TRMSDTItem_Vigenciahasta_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtTRMSDT_TRMSDTItem_Vigenciadesde ;
   protected java.util.Date gxTv_SdtTRMSDT_TRMSDTItem_Vigenciahasta ;
   protected java.util.Date datetime_STZ ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtTRMSDT_TRMSDTItem_Valor ;
   protected String gxTv_SdtTRMSDT_TRMSDTItem_Unidad ;
}

