package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem extends GxUserType
{
   public SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem( )
   {
      this(  new ModelContext(SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem.class));
   }

   public SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem( ModelContext context )
   {
      super( context, "SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem");
   }

   public SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem( int remoteHandle ,
                                                               ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem");
   }

   public SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem( StructSdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "NAlbaran") )
            {
               gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Nalbaran = (long)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FAlbaran") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Falbaran = GXutil.nullDate() ;
                  gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Falbaran_N = (byte)(1) ;
               }
               else
               {
                  gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Falbaran_N = (byte)(0) ;
                  gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Falbaran = localUtil.ymdtod( (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 1, 4), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 6, 2), "."))), (int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( oReader.getValue(), 9, 2), ".")))) ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "KilosAlb") )
            {
               gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Kilosalb = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MetrosAlb") )
            {
               gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Metrosalb = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PiezasAlb") )
            {
               gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Piezasalb = (int)(getnumericvalue(oReader.getValue())) ;
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
         sName = "SDTDistribuciondeUnidades.HdrsItem.AlbaranesItem" ;
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
      oWriter.writeElement("NAlbaran", GXutil.trim( GXutil.str( gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Nalbaran, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Falbaran)) && ( gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Falbaran_N == 1 ) )
      {
         oWriter.writeElement("FAlbaran", "");
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Falbaran), 10, 0)) ;
         sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Falbaran), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv += "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Falbaran), 10, 0)) ;
         sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("FAlbaran", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
         {
            oWriter.writeAttribute("xmlns", "TexplusNET");
         }
      }
      oWriter.writeElement("KilosAlb", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Kilosalb, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MetrosAlb", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Metrosalb, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("PiezasAlb", GXutil.trim( GXutil.str( gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Piezasalb, 6, 0)));
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
      AddObjectProperty("NAlbaran", gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Nalbaran, false, false);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Falbaran), 10, 0)) ;
      sDateCnv += GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Falbaran), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv += "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Falbaran), 10, 0)) ;
      sDateCnv += GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("FAlbaran", sDateCnv, false, false);
      AddObjectProperty("KilosAlb", gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Kilosalb, false, false);
      AddObjectProperty("MetrosAlb", gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Metrosalb, false, false);
      AddObjectProperty("PiezasAlb", gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Piezasalb, false, false);
   }

   public long getgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Nalbaran( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Nalbaran ;
   }

   public void setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Nalbaran( long value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Nalbaran = value ;
   }

   public java.util.Date getgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Falbaran( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Falbaran ;
   }

   public void setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Falbaran( java.util.Date value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Falbaran_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Falbaran = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Kilosalb( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Kilosalb ;
   }

   public void setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Kilosalb( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Kilosalb = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Metrosalb( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Metrosalb ;
   }

   public void setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Metrosalb( java.math.BigDecimal value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Metrosalb = value ;
   }

   public int getgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Piezasalb( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Piezasalb ;
   }

   public void setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Piezasalb( int value )
   {
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_N = (byte)(0) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Piezasalb = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_N = (byte)(1) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Falbaran = GXutil.nullDate() ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Falbaran_N = (byte)(1) ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Kilosalb = DecimalUtil.ZERO ;
      gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Metrosalb = DecimalUtil.ZERO ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_N ;
   }

   public app.SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem Clone( )
   {
      return (app.SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem struct )
   {
      setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Nalbaran(struct.getNalbaran());
      if ( struct.gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Falbaran_N == 0 )
      {
         setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Falbaran(struct.getFalbaran());
      }
      setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Kilosalb(struct.getKilosalb());
      setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Metrosalb(struct.getMetrosalb());
      setgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Piezasalb(struct.getPiezasalb());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem getStruct( )
   {
      app.StructSdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem struct = new app.StructSdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem ();
      struct.setNalbaran(getgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Nalbaran());
      if ( gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Falbaran_N == 0 )
      {
         struct.setFalbaran(getgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Falbaran());
      }
      struct.setKilosalb(getgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Kilosalb());
      struct.setMetrosalb(getgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Metrosalb());
      struct.setPiezasalb(getgxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Piezasalb());
      return struct ;
   }

   protected byte gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_N ;
   protected byte gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Falbaran_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Piezasalb ;
   protected long gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Nalbaran ;
   protected java.math.BigDecimal gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Kilosalb ;
   protected java.math.BigDecimal gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Metrosalb ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtSDTDistribuciondeUnidades_HdrsItem_AlbaranesItem_Falbaran ;
   protected boolean readElement ;
   protected boolean formatError ;
}

