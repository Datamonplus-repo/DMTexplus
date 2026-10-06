package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTInformeProduccionResumenOperario extends GxUserType
{
   public SdtSDTInformeProduccionResumenOperario( )
   {
      this(  new ModelContext(SdtSDTInformeProduccionResumenOperario.class));
   }

   public SdtSDTInformeProduccionResumenOperario( ModelContext context )
   {
      super( context, "SdtSDTInformeProduccionResumenOperario");
   }

   public SdtSDTInformeProduccionResumenOperario( int remoteHandle ,
                                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTInformeProduccionResumenOperario");
   }

   public SdtSDTInformeProduccionResumenOperario( StructSdtSDTInformeProduccionResumenOperario struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Operario") )
            {
               if ( gxTv_SdtSDTInformeProduccionResumenOperario_Operario == null )
               {
                  gxTv_SdtSDTInformeProduccionResumenOperario_Operario = new GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenOperario_OperarioItem>(app.produccion.SdtSDTInformeProduccionResumenOperario_OperarioItem.class, "SDTInformeProduccionResumenOperario.OperarioItem", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTInformeProduccionResumenOperario_Operario.readxmlcollection(oReader, "Operario", "OperarioItem") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Operario") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotalKG") )
            {
               gxTv_SdtSDTInformeProduccionResumenOperario_Totalkg = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotalMT") )
            {
               gxTv_SdtSDTInformeProduccionResumenOperario_Totalmt = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "SDTInformeProduccionResumenOperario" ;
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
      if ( gxTv_SdtSDTInformeProduccionResumenOperario_Operario != null )
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
         gxTv_SdtSDTInformeProduccionResumenOperario_Operario.writexmlcollection(oWriter, "Operario", sNameSpace1, "OperarioItem", sNameSpace1);
      }
      oWriter.writeElement("TotalKG", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeProduccionResumenOperario_Totalkg, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TotalMT", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeProduccionResumenOperario_Totalmt, 6, 2)));
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
      if ( gxTv_SdtSDTInformeProduccionResumenOperario_Operario != null )
      {
         AddObjectProperty("Operario", gxTv_SdtSDTInformeProduccionResumenOperario_Operario, false, false);
      }
      AddObjectProperty("TotalKG", gxTv_SdtSDTInformeProduccionResumenOperario_Totalkg, false, false);
      AddObjectProperty("TotalMT", gxTv_SdtSDTInformeProduccionResumenOperario_Totalmt, false, false);
   }

   public GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenOperario_OperarioItem> getgxTv_SdtSDTInformeProduccionResumenOperario_Operario( )
   {
      if ( gxTv_SdtSDTInformeProduccionResumenOperario_Operario == null )
      {
         gxTv_SdtSDTInformeProduccionResumenOperario_Operario = new GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenOperario_OperarioItem>(app.produccion.SdtSDTInformeProduccionResumenOperario_OperarioItem.class, "SDTInformeProduccionResumenOperario.OperarioItem", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTInformeProduccionResumenOperario_Operario_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_N = (byte)(0) ;
      return gxTv_SdtSDTInformeProduccionResumenOperario_Operario ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenOperario_Operario( GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenOperario_OperarioItem> value )
   {
      gxTv_SdtSDTInformeProduccionResumenOperario_Operario_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_Operario = value ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenOperario_Operario_SetNull( )
   {
      gxTv_SdtSDTInformeProduccionResumenOperario_Operario_N = (byte)(1) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_Operario = null ;
   }

   public boolean getgxTv_SdtSDTInformeProduccionResumenOperario_Operario_IsNull( )
   {
      if ( gxTv_SdtSDTInformeProduccionResumenOperario_Operario == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTInformeProduccionResumenOperario_Operario_N( )
   {
      return gxTv_SdtSDTInformeProduccionResumenOperario_Operario_N ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeProduccionResumenOperario_Totalkg( )
   {
      return gxTv_SdtSDTInformeProduccionResumenOperario_Totalkg ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenOperario_Totalkg( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenOperario_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_Totalkg = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeProduccionResumenOperario_Totalmt( )
   {
      return gxTv_SdtSDTInformeProduccionResumenOperario_Totalmt ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenOperario_Totalmt( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenOperario_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_Totalmt = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTInformeProduccionResumenOperario_Operario_N = (byte)(1) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_N = (byte)(1) ;
      gxTv_SdtSDTInformeProduccionResumenOperario_Totalkg = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeProduccionResumenOperario_Totalmt = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTInformeProduccionResumenOperario_N ;
   }

   public app.produccion.SdtSDTInformeProduccionResumenOperario Clone( )
   {
      return (app.produccion.SdtSDTInformeProduccionResumenOperario)(clone()) ;
   }

   public void setStruct( app.produccion.StructSdtSDTInformeProduccionResumenOperario struct )
   {
      GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenOperario_OperarioItem> gxTv_SdtSDTInformeProduccionResumenOperario_Operario_aux = new GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenOperario_OperarioItem>(app.produccion.SdtSDTInformeProduccionResumenOperario_OperarioItem.class, "SDTInformeProduccionResumenOperario.OperarioItem", "TexplusNET", remoteHandle);
      Vector<app.produccion.StructSdtSDTInformeProduccionResumenOperario_OperarioItem> gxTv_SdtSDTInformeProduccionResumenOperario_Operario_aux1 = struct.getOperario();
      if (gxTv_SdtSDTInformeProduccionResumenOperario_Operario_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTInformeProduccionResumenOperario_Operario_aux1.size(); i++)
         {
            gxTv_SdtSDTInformeProduccionResumenOperario_Operario_aux.add(new app.produccion.SdtSDTInformeProduccionResumenOperario_OperarioItem(gxTv_SdtSDTInformeProduccionResumenOperario_Operario_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTInformeProduccionResumenOperario_Operario(gxTv_SdtSDTInformeProduccionResumenOperario_Operario_aux);
      setgxTv_SdtSDTInformeProduccionResumenOperario_Totalkg(struct.getTotalkg());
      setgxTv_SdtSDTInformeProduccionResumenOperario_Totalmt(struct.getTotalmt());
   }

   @SuppressWarnings("unchecked")
   public app.produccion.StructSdtSDTInformeProduccionResumenOperario getStruct( )
   {
      app.produccion.StructSdtSDTInformeProduccionResumenOperario struct = new app.produccion.StructSdtSDTInformeProduccionResumenOperario ();
      struct.setOperario(getgxTv_SdtSDTInformeProduccionResumenOperario_Operario().getStruct());
      struct.setTotalkg(getgxTv_SdtSDTInformeProduccionResumenOperario_Totalkg());
      struct.setTotalmt(getgxTv_SdtSDTInformeProduccionResumenOperario_Totalmt());
      return struct ;
   }

   protected byte gxTv_SdtSDTInformeProduccionResumenOperario_Operario_N ;
   protected byte gxTv_SdtSDTInformeProduccionResumenOperario_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenOperario_Totalkg ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenOperario_Totalmt ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenOperario_OperarioItem> gxTv_SdtSDTInformeProduccionResumenOperario_Operario_aux ;
   protected GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenOperario_OperarioItem> gxTv_SdtSDTInformeProduccionResumenOperario_Operario=null ;
}

