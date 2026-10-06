package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTMaquinasR extends GxUserType
{
   public SdtSDTMaquinasR( )
   {
      this(  new ModelContext(SdtSDTMaquinasR.class));
   }

   public SdtSDTMaquinasR( ModelContext context )
   {
      super( context, "SdtSDTMaquinasR");
   }

   public SdtSDTMaquinasR( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTMaquinasR");
   }

   public SdtSDTMaquinasR( StructSdtSDTMaquinasR struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "MaqDsc") )
            {
               gxTv_SdtSDTMaquinasR_Maqdsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Kilosreoperados") )
            {
               gxTv_SdtSDTMaquinasR_Kilosreoperados = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Metrosreoperados") )
            {
               gxTv_SdtSDTMaquinasR_Metrosreoperados = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "SDTMaquinasR" ;
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
      oWriter.writeElement("MaqDsc", gxTv_SdtSDTMaquinasR_Maqdsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Kilosreoperados", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTMaquinasR_Kilosreoperados, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Metrosreoperados", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTMaquinasR_Metrosreoperados, 9, 2)));
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
      AddObjectProperty("MaqDsc", gxTv_SdtSDTMaquinasR_Maqdsc, false, false);
      AddObjectProperty("Kilosreoperados", gxTv_SdtSDTMaquinasR_Kilosreoperados, false, false);
      AddObjectProperty("Metrosreoperados", gxTv_SdtSDTMaquinasR_Metrosreoperados, false, false);
   }

   public String getgxTv_SdtSDTMaquinasR_Maqdsc( )
   {
      return gxTv_SdtSDTMaquinasR_Maqdsc ;
   }

   public void setgxTv_SdtSDTMaquinasR_Maqdsc( String value )
   {
      gxTv_SdtSDTMaquinasR_N = (byte)(0) ;
      gxTv_SdtSDTMaquinasR_Maqdsc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTMaquinasR_Kilosreoperados( )
   {
      return gxTv_SdtSDTMaquinasR_Kilosreoperados ;
   }

   public void setgxTv_SdtSDTMaquinasR_Kilosreoperados( java.math.BigDecimal value )
   {
      gxTv_SdtSDTMaquinasR_N = (byte)(0) ;
      gxTv_SdtSDTMaquinasR_Kilosreoperados = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTMaquinasR_Metrosreoperados( )
   {
      return gxTv_SdtSDTMaquinasR_Metrosreoperados ;
   }

   public void setgxTv_SdtSDTMaquinasR_Metrosreoperados( java.math.BigDecimal value )
   {
      gxTv_SdtSDTMaquinasR_N = (byte)(0) ;
      gxTv_SdtSDTMaquinasR_Metrosreoperados = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTMaquinasR_Maqdsc = "" ;
      gxTv_SdtSDTMaquinasR_N = (byte)(1) ;
      gxTv_SdtSDTMaquinasR_Kilosreoperados = DecimalUtil.ZERO ;
      gxTv_SdtSDTMaquinasR_Metrosreoperados = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTMaquinasR_N ;
   }

   public app.SdtSDTMaquinasR Clone( )
   {
      return (app.SdtSDTMaquinasR)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTMaquinasR struct )
   {
      setgxTv_SdtSDTMaquinasR_Maqdsc(struct.getMaqdsc());
      setgxTv_SdtSDTMaquinasR_Kilosreoperados(struct.getKilosreoperados());
      setgxTv_SdtSDTMaquinasR_Metrosreoperados(struct.getMetrosreoperados());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTMaquinasR getStruct( )
   {
      app.StructSdtSDTMaquinasR struct = new app.StructSdtSDTMaquinasR ();
      struct.setMaqdsc(getgxTv_SdtSDTMaquinasR_Maqdsc());
      struct.setKilosreoperados(getgxTv_SdtSDTMaquinasR_Kilosreoperados());
      struct.setMetrosreoperados(getgxTv_SdtSDTMaquinasR_Metrosreoperados());
      return struct ;
   }

   protected byte gxTv_SdtSDTMaquinasR_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDTMaquinasR_Kilosreoperados ;
   protected java.math.BigDecimal gxTv_SdtSDTMaquinasR_Metrosreoperados ;
   protected String gxTv_SdtSDTMaquinasR_Maqdsc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

