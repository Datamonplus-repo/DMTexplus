package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTProduccionMaquinasTurnos_TurnosItem extends GxUserType
{
   public SdtSDTProduccionMaquinasTurnos_TurnosItem( )
   {
      this(  new ModelContext(SdtSDTProduccionMaquinasTurnos_TurnosItem.class));
   }

   public SdtSDTProduccionMaquinasTurnos_TurnosItem( ModelContext context )
   {
      super( context, "SdtSDTProduccionMaquinasTurnos_TurnosItem");
   }

   public SdtSDTProduccionMaquinasTurnos_TurnosItem( int remoteHandle ,
                                                     ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTProduccionMaquinasTurnos_TurnosItem");
   }

   public SdtSDTProduccionMaquinasTurnos_TurnosItem( StructSdtSDTProduccionMaquinasTurnos_TurnosItem struct )
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
               gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Turno = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "KilosTurno") )
            {
               gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Kilosturno = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MetrosTurno") )
            {
               gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Metrosturno = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "SDTProduccionMaquinasTurnos.TurnosItem" ;
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
      oWriter.writeElement("Turno", GXutil.trim( GXutil.str( gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Turno, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("KilosTurno", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Kilosturno, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MetrosTurno", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Metrosturno, 9, 2)));
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
      AddObjectProperty("Turno", gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Turno, false, false);
      AddObjectProperty("KilosTurno", gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Kilosturno, false, false);
      AddObjectProperty("MetrosTurno", gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Metrosturno, false, false);
   }

   public byte getgxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Turno( )
   {
      return gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Turno ;
   }

   public void setgxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Turno( byte value )
   {
      gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_N = (byte)(0) ;
      gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Turno = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Kilosturno( )
   {
      return gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Kilosturno ;
   }

   public void setgxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Kilosturno( java.math.BigDecimal value )
   {
      gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_N = (byte)(0) ;
      gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Kilosturno = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Metrosturno( )
   {
      return gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Metrosturno ;
   }

   public void setgxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Metrosturno( java.math.BigDecimal value )
   {
      gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_N = (byte)(0) ;
      gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Metrosturno = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_N = (byte)(1) ;
      gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Kilosturno = DecimalUtil.ZERO ;
      gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Metrosturno = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_N ;
   }

   public app.SdtSDTProduccionMaquinasTurnos_TurnosItem Clone( )
   {
      return (app.SdtSDTProduccionMaquinasTurnos_TurnosItem)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTProduccionMaquinasTurnos_TurnosItem struct )
   {
      setgxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Turno(struct.getTurno());
      setgxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Kilosturno(struct.getKilosturno());
      setgxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Metrosturno(struct.getMetrosturno());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTProduccionMaquinasTurnos_TurnosItem getStruct( )
   {
      app.StructSdtSDTProduccionMaquinasTurnos_TurnosItem struct = new app.StructSdtSDTProduccionMaquinasTurnos_TurnosItem ();
      struct.setTurno(getgxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Turno());
      struct.setKilosturno(getgxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Kilosturno());
      struct.setMetrosturno(getgxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Metrosturno());
      return struct ;
   }

   protected byte gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Turno ;
   protected byte gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Kilosturno ;
   protected java.math.BigDecimal gxTv_SdtSDTProduccionMaquinasTurnos_TurnosItem_Metrosturno ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

