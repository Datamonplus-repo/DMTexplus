package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem extends GxUserType
{
   public SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem( )
   {
      this(  new ModelContext(SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem.class));
   }

   public SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem( ModelContext context )
   {
      super( context, "SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem");
   }

   public SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem( int remoteHandle ,
                                                                                      ModelContext context )
   {
      super( remoteHandle, context, "SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem");
   }

   public SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem( StructSdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem struct )
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
               gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Maqcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqDsc") )
            {
               gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Maqdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Kilos1") )
            {
               gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos1 = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Kilos2") )
            {
               gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos2 = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Kilos3") )
            {
               gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos3 = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Kilos4") )
            {
               gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos4 = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "InformeProduccionResumenTurno_SDT.InformeProduccionResumenTurno_SDTItem" ;
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
      oWriter.writeElement("Maqcod", gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Maqcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MaqDsc", gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Maqdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Kilos1", GXutil.trim( GXutil.strNoRound( gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos1, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Kilos2", GXutil.trim( GXutil.strNoRound( gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos2, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Kilos3", GXutil.trim( GXutil.strNoRound( gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos3, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Kilos4", GXutil.trim( GXutil.strNoRound( gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos4, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
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
      AddObjectProperty("Maqcod", gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Maqcod, false, false);
      AddObjectProperty("MaqDsc", gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Maqdsc, false, false);
      AddObjectProperty("Kilos1", gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos1, false, false);
      AddObjectProperty("Kilos2", gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos2, false, false);
      AddObjectProperty("Kilos3", gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos3, false, false);
      AddObjectProperty("Kilos4", gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos4, false, false);
   }

   public String getgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Maqcod( )
   {
      return gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Maqcod ;
   }

   public void setgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Maqcod( String value )
   {
      gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Maqcod = value ;
   }

   public String getgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Maqdsc( )
   {
      return gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Maqdsc ;
   }

   public void setgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Maqdsc( String value )
   {
      gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Maqdsc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos1( )
   {
      return gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos1 ;
   }

   public void setgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos1( java.math.BigDecimal value )
   {
      gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos1 = value ;
   }

   public java.math.BigDecimal getgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos2( )
   {
      return gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos2 ;
   }

   public void setgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos2( java.math.BigDecimal value )
   {
      gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos2 = value ;
   }

   public java.math.BigDecimal getgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos3( )
   {
      return gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos3 ;
   }

   public void setgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos3( java.math.BigDecimal value )
   {
      gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos3 = value ;
   }

   public java.math.BigDecimal getgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos4( )
   {
      return gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos4 ;
   }

   public void setgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos4( java.math.BigDecimal value )
   {
      gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_N = (byte)(0) ;
      gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos4 = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Maqcod = "" ;
      gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_N = (byte)(1) ;
      gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Maqdsc = "" ;
      gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos1 = DecimalUtil.ZERO ;
      gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos2 = DecimalUtil.ZERO ;
      gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos3 = DecimalUtil.ZERO ;
      gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos4 = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_N ;
   }

   public app.produccion.SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem Clone( )
   {
      return (app.produccion.SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem)(clone()) ;
   }

   public void setStruct( app.produccion.StructSdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem struct )
   {
      setgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Maqcod(struct.getMaqcod());
      setgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Maqdsc(struct.getMaqdsc());
      setgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos1(struct.getKilos1());
      setgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos2(struct.getKilos2());
      setgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos3(struct.getKilos3());
      setgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos4(struct.getKilos4());
   }

   @SuppressWarnings("unchecked")
   public app.produccion.StructSdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem getStruct( )
   {
      app.produccion.StructSdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem struct = new app.produccion.StructSdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem ();
      struct.setMaqcod(getgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Maqcod());
      struct.setMaqdsc(getgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Maqdsc());
      struct.setKilos1(getgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos1());
      struct.setKilos2(getgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos2());
      struct.setKilos3(getgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos3());
      struct.setKilos4(getgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos4());
      return struct ;
   }

   protected byte gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos1 ;
   protected java.math.BigDecimal gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos2 ;
   protected java.math.BigDecimal gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos3 ;
   protected java.math.BigDecimal gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos4 ;
   protected String gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Maqcod ;
   protected String gxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Maqdsc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

