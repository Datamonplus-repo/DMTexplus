package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtProduccionResumenTurno_SDT_TurnosItem extends GxUserType
{
   public SdtProduccionResumenTurno_SDT_TurnosItem( )
   {
      this(  new ModelContext(SdtProduccionResumenTurno_SDT_TurnosItem.class));
   }

   public SdtProduccionResumenTurno_SDT_TurnosItem( ModelContext context )
   {
      super( context, "SdtProduccionResumenTurno_SDT_TurnosItem");
   }

   public SdtProduccionResumenTurno_SDT_TurnosItem( int remoteHandle ,
                                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtProduccionResumenTurno_SDT_TurnosItem");
   }

   public SdtProduccionResumenTurno_SDT_TurnosItem( StructSdtProduccionResumenTurno_SDT_TurnosItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Turno") )
            {
               gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Turno = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "KilosTurno") )
            {
               gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Kilosturno = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MetrosTurno") )
            {
               gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Metrosturno = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "ProduccionResumenTurno_SDT.TurnosItem" ;
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
      oWriter.writeElement("Turno", GXutil.trim( GXutil.str( gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Turno, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("KilosTurno", GXutil.trim( GXutil.strNoRound( gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Kilosturno, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MetrosTurno", GXutil.trim( GXutil.strNoRound( gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Metrosturno, 9, 2)));
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
      AddObjectProperty("Turno", gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Turno, false, false);
      AddObjectProperty("KilosTurno", gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Kilosturno, false, false);
      AddObjectProperty("MetrosTurno", gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Metrosturno, false, false);
   }

   public byte getgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Turno( )
   {
      return gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Turno ;
   }

   public void setgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Turno( byte value )
   {
      gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_N = (byte)(0) ;
      gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Turno = value ;
   }

   public java.math.BigDecimal getgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Kilosturno( )
   {
      return gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Kilosturno ;
   }

   public void setgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Kilosturno( java.math.BigDecimal value )
   {
      gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_N = (byte)(0) ;
      gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Kilosturno = value ;
   }

   public java.math.BigDecimal getgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Metrosturno( )
   {
      return gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Metrosturno ;
   }

   public void setgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Metrosturno( java.math.BigDecimal value )
   {
      gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_N = (byte)(0) ;
      gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Metrosturno = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_N = (byte)(1) ;
      gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Kilosturno = DecimalUtil.ZERO ;
      gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Metrosturno = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_N ;
   }

   public app.SdtProduccionResumenTurno_SDT_TurnosItem Clone( )
   {
      return (app.SdtProduccionResumenTurno_SDT_TurnosItem)(clone()) ;
   }

   public void setStruct( app.StructSdtProduccionResumenTurno_SDT_TurnosItem struct )
   {
      setgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Turno(struct.getTurno());
      setgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Kilosturno(struct.getKilosturno());
      setgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Metrosturno(struct.getMetrosturno());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtProduccionResumenTurno_SDT_TurnosItem getStruct( )
   {
      app.StructSdtProduccionResumenTurno_SDT_TurnosItem struct = new app.StructSdtProduccionResumenTurno_SDT_TurnosItem ();
      struct.setTurno(getgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Turno());
      struct.setKilosturno(getgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Kilosturno());
      struct.setMetrosturno(getgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Metrosturno());
      return struct ;
   }

   protected byte gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Turno ;
   protected byte gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Kilosturno ;
   protected java.math.BigDecimal gxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Metrosturno ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

