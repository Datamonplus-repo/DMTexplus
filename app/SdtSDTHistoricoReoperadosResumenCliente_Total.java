package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTHistoricoReoperadosResumenCliente_Total extends GxUserType
{
   public SdtSDTHistoricoReoperadosResumenCliente_Total( )
   {
      this(  new ModelContext(SdtSDTHistoricoReoperadosResumenCliente_Total.class));
   }

   public SdtSDTHistoricoReoperadosResumenCliente_Total( ModelContext context )
   {
      super( context, "SdtSDTHistoricoReoperadosResumenCliente_Total");
   }

   public SdtSDTHistoricoReoperadosResumenCliente_Total( int remoteHandle ,
                                                         ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTHistoricoReoperadosResumenCliente_Total");
   }

   public SdtSDTHistoricoReoperadosResumenCliente_Total( StructSdtSDTHistoricoReoperadosResumenCliente_Total struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotalKilos") )
            {
               gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_Totalkilos = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotalMetros") )
            {
               gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_Totalmetros = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "SDTHistoricoReoperadosResumenCliente.Total" ;
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
      oWriter.writeElement("TotalKilos", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_Totalkilos, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TotalMetros", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_Totalmetros, 9, 2)));
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
      AddObjectProperty("TotalKilos", gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_Totalkilos, false, false);
      AddObjectProperty("TotalMetros", gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_Totalmetros, false, false);
   }

   public java.math.BigDecimal getgxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_Totalkilos( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_Totalkilos ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_Totalkilos( java.math.BigDecimal value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_Totalkilos = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_Totalmetros( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_Totalmetros ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_Totalmetros( java.math.BigDecimal value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_Totalmetros = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_Totalkilos = DecimalUtil.ZERO ;
      gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_N = (byte)(1) ;
      gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_Totalmetros = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_N ;
   }

   public app.SdtSDTHistoricoReoperadosResumenCliente_Total Clone( )
   {
      return (app.SdtSDTHistoricoReoperadosResumenCliente_Total)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTHistoricoReoperadosResumenCliente_Total struct )
   {
      setgxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_Totalkilos(struct.getTotalkilos());
      setgxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_Totalmetros(struct.getTotalmetros());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTHistoricoReoperadosResumenCliente_Total getStruct( )
   {
      app.StructSdtSDTHistoricoReoperadosResumenCliente_Total struct = new app.StructSdtSDTHistoricoReoperadosResumenCliente_Total ();
      struct.setTotalkilos(getgxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_Totalkilos());
      struct.setTotalmetros(getgxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_Totalmetros());
      return struct ;
   }

   protected byte gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_Totalkilos ;
   protected java.math.BigDecimal gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_Totalmetros ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

