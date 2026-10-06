package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTInformeProduccionResumenMaquina extends GxUserType
{
   public SdtSDTInformeProduccionResumenMaquina( )
   {
      this(  new ModelContext(SdtSDTInformeProduccionResumenMaquina.class));
   }

   public SdtSDTInformeProduccionResumenMaquina( ModelContext context )
   {
      super( context, "SdtSDTInformeProduccionResumenMaquina");
   }

   public SdtSDTInformeProduccionResumenMaquina( int remoteHandle ,
                                                 ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTInformeProduccionResumenMaquina");
   }

   public SdtSDTInformeProduccionResumenMaquina( StructSdtSDTInformeProduccionResumenMaquina struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Maquina") )
            {
               if ( gxTv_SdtSDTInformeProduccionResumenMaquina_Maquina == null )
               {
                  gxTv_SdtSDTInformeProduccionResumenMaquina_Maquina = new GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem>(app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem.class, "SDTInformeProduccionResumenMaquina.MaquinaItem", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTInformeProduccionResumenMaquina_Maquina.readxmlcollection(oReader, "Maquina", "MaquinaItem") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Maquina") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotalMt") )
            {
               gxTv_SdtSDTInformeProduccionResumenMaquina_Totalmt = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotalKG") )
            {
               gxTv_SdtSDTInformeProduccionResumenMaquina_Totalkg = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "SDTInformeProduccionResumenMaquina" ;
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
      if ( gxTv_SdtSDTInformeProduccionResumenMaquina_Maquina != null )
      {
         String sNameSpace1;
         if ( GXutil.strcmp(sNameSpace, "TexplusNET") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "TexplusNET" ;
         }
         else
         {
            sNameSpace1 = "TexplusNET" ;
         }
         gxTv_SdtSDTInformeProduccionResumenMaquina_Maquina.writexmlcollection(oWriter, "Maquina", sNameSpace1, "MaquinaItem", sNameSpace1);
      }
      oWriter.writeElement("TotalMt", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeProduccionResumenMaquina_Totalmt, 10, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TotalKG", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeProduccionResumenMaquina_Totalkg, 10, 2)));
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
      if ( gxTv_SdtSDTInformeProduccionResumenMaquina_Maquina != null )
      {
         AddObjectProperty("Maquina", gxTv_SdtSDTInformeProduccionResumenMaquina_Maquina, false, false);
      }
      AddObjectProperty("TotalMt", gxTv_SdtSDTInformeProduccionResumenMaquina_Totalmt, false, false);
      AddObjectProperty("TotalKG", gxTv_SdtSDTInformeProduccionResumenMaquina_Totalkg, false, false);
   }

   public GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem> getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina( )
   {
      if ( gxTv_SdtSDTInformeProduccionResumenMaquina_Maquina == null )
      {
         gxTv_SdtSDTInformeProduccionResumenMaquina_Maquina = new GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem>(app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem.class, "SDTInformeProduccionResumenMaquina.MaquinaItem", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTInformeProduccionResumenMaquina_Maquina_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_N = (byte)(0) ;
      return gxTv_SdtSDTInformeProduccionResumenMaquina_Maquina ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina( GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem> value )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_Maquina_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_Maquina = value ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina_SetNull( )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_Maquina_N = (byte)(1) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_Maquina = null ;
   }

   public boolean getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina_IsNull( )
   {
      if ( gxTv_SdtSDTInformeProduccionResumenMaquina_Maquina == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina_N( )
   {
      return gxTv_SdtSDTInformeProduccionResumenMaquina_Maquina_N ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeProduccionResumenMaquina_Totalmt( )
   {
      return gxTv_SdtSDTInformeProduccionResumenMaquina_Totalmt ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenMaquina_Totalmt( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_Totalmt = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeProduccionResumenMaquina_Totalkg( )
   {
      return gxTv_SdtSDTInformeProduccionResumenMaquina_Totalkg ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenMaquina_Totalkg( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_Totalkg = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTInformeProduccionResumenMaquina_Maquina_N = (byte)(1) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_N = (byte)(1) ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_Totalmt = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeProduccionResumenMaquina_Totalkg = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTInformeProduccionResumenMaquina_N ;
   }

   public app.produccion.SdtSDTInformeProduccionResumenMaquina Clone( )
   {
      return (app.produccion.SdtSDTInformeProduccionResumenMaquina)(clone()) ;
   }

   public void setStruct( app.produccion.StructSdtSDTInformeProduccionResumenMaquina struct )
   {
      GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem> gxTv_SdtSDTInformeProduccionResumenMaquina_Maquina_aux = new GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem>(app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem.class, "SDTInformeProduccionResumenMaquina.MaquinaItem", "TexplusNET", remoteHandle);
      Vector<app.produccion.StructSdtSDTInformeProduccionResumenMaquina_MaquinaItem> gxTv_SdtSDTInformeProduccionResumenMaquina_Maquina_aux1 = struct.getMaquina();
      if (gxTv_SdtSDTInformeProduccionResumenMaquina_Maquina_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTInformeProduccionResumenMaquina_Maquina_aux1.size(); i++)
         {
            gxTv_SdtSDTInformeProduccionResumenMaquina_Maquina_aux.add(new app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem(gxTv_SdtSDTInformeProduccionResumenMaquina_Maquina_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina(gxTv_SdtSDTInformeProduccionResumenMaquina_Maquina_aux);
      setgxTv_SdtSDTInformeProduccionResumenMaquina_Totalmt(struct.getTotalmt());
      setgxTv_SdtSDTInformeProduccionResumenMaquina_Totalkg(struct.getTotalkg());
   }

   @SuppressWarnings("unchecked")
   public app.produccion.StructSdtSDTInformeProduccionResumenMaquina getStruct( )
   {
      app.produccion.StructSdtSDTInformeProduccionResumenMaquina struct = new app.produccion.StructSdtSDTInformeProduccionResumenMaquina ();
      struct.setMaquina(getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().getStruct());
      struct.setTotalmt(getgxTv_SdtSDTInformeProduccionResumenMaquina_Totalmt());
      struct.setTotalkg(getgxTv_SdtSDTInformeProduccionResumenMaquina_Totalkg());
      return struct ;
   }

   protected byte gxTv_SdtSDTInformeProduccionResumenMaquina_Maquina_N ;
   protected byte gxTv_SdtSDTInformeProduccionResumenMaquina_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenMaquina_Totalmt ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenMaquina_Totalkg ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem> gxTv_SdtSDTInformeProduccionResumenMaquina_Maquina_aux ;
   protected GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem> gxTv_SdtSDTInformeProduccionResumenMaquina_Maquina=null ;
}

