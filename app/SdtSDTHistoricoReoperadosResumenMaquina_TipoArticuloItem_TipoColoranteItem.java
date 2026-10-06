package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem extends GxUserType
{
   public SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem( )
   {
      this(  new ModelContext(SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem.class));
   }

   public SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem( ModelContext context )
   {
      super( context, "SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem");
   }

   public SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem( int remoteHandle ,
                                                                                      ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem");
   }

   public SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem( StructSdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipColCod") )
            {
               gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Tipcolcod = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TipColDsc") )
            {
               gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Tipcoldsc = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "KilosTipColCod") )
            {
               gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Kilostipcolcod = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MetrosTipColCod") )
            {
               gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Metrostipcolcod = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "SDTHistoricoReoperadosResumenMaquina.TipoArticuloItem.TipoColoranteItem" ;
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
      oWriter.writeElement("TipColCod", GXutil.trim( GXutil.str( gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Tipcolcod, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TipColDsc", gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Tipcoldsc);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("KilosTipColCod", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Kilostipcolcod, 9, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("MetrosTipColCod", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Metrostipcolcod, 9, 2)));
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
      AddObjectProperty("TipColCod", gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Tipcolcod, false, false);
      AddObjectProperty("TipColDsc", gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Tipcoldsc, false, false);
      AddObjectProperty("KilosTipColCod", gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Kilostipcolcod, false, false);
      AddObjectProperty("MetrosTipColCod", gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Metrostipcolcod, false, false);
   }

   public byte getgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Tipcolcod( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Tipcolcod ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Tipcolcod( byte value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Tipcolcod = value ;
   }

   public String getgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Tipcoldsc( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Tipcoldsc ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Tipcoldsc( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Tipcoldsc = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Kilostipcolcod( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Kilostipcolcod ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Kilostipcolcod( java.math.BigDecimal value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Kilostipcolcod = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Metrostipcolcod( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Metrostipcolcod ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Metrostipcolcod( java.math.BigDecimal value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Metrostipcolcod = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_N = (byte)(1) ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Tipcoldsc = "" ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Kilostipcolcod = DecimalUtil.ZERO ;
      gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Metrostipcolcod = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_N ;
   }

   public app.SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem Clone( )
   {
      return (app.SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem struct )
   {
      setgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Tipcolcod(struct.getTipcolcod());
      setgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Tipcoldsc(struct.getTipcoldsc());
      setgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Kilostipcolcod(struct.getKilostipcolcod());
      setgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Metrostipcolcod(struct.getMetrostipcolcod());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem getStruct( )
   {
      app.StructSdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem struct = new app.StructSdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem ();
      struct.setTipcolcod(getgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Tipcolcod());
      struct.setTipcoldsc(getgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Tipcoldsc());
      struct.setKilostipcolcod(getgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Kilostipcolcod());
      struct.setMetrostipcolcod(getgxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Metrostipcolcod());
      return struct ;
   }

   protected byte gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Tipcolcod ;
   protected byte gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Kilostipcolcod ;
   protected java.math.BigDecimal gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Metrostipcolcod ;
   protected String gxTv_SdtSDTHistoricoReoperadosResumenMaquina_TipoArticuloItem_TipoColoranteItem_Tipcoldsc ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
}

