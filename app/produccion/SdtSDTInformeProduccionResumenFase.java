package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTInformeProduccionResumenFase extends GxUserType
{
   public SdtSDTInformeProduccionResumenFase( )
   {
      this(  new ModelContext(SdtSDTInformeProduccionResumenFase.class));
   }

   public SdtSDTInformeProduccionResumenFase( ModelContext context )
   {
      super( context, "SdtSDTInformeProduccionResumenFase");
   }

   public SdtSDTInformeProduccionResumenFase( int remoteHandle ,
                                              ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTInformeProduccionResumenFase");
   }

   public SdtSDTInformeProduccionResumenFase( StructSdtSDTInformeProduccionResumenFase struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Fase") )
            {
               if ( gxTv_SdtSDTInformeProduccionResumenFase_Fase == null )
               {
                  gxTv_SdtSDTInformeProduccionResumenFase_Fase = new GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem>(app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem.class, "SDTInformeProduccionResumenFase.FaseItem", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTInformeProduccionResumenFase_Fase.readxmlcollection(oReader, "Fase", "FaseItem") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Fase") )
               {
                  GXSoapError = oReader.read() ;
               }
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotalKG") )
            {
               gxTv_SdtSDTInformeProduccionResumenFase_Totalkg = DecimalUtil.stringToDec( oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TotalMT") )
            {
               gxTv_SdtSDTInformeProduccionResumenFase_Totalmt = DecimalUtil.stringToDec( oReader.getValue()) ;
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
         sName = "SDTInformeProduccionResumenFase" ;
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
      if ( gxTv_SdtSDTInformeProduccionResumenFase_Fase != null )
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
         gxTv_SdtSDTInformeProduccionResumenFase_Fase.writexmlcollection(oWriter, "Fase", sNameSpace1, "FaseItem", sNameSpace1);
      }
      oWriter.writeElement("TotalKG", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeProduccionResumenFase_Totalkg, 6, 2)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("TotalMT", GXutil.trim( GXutil.strNoRound( gxTv_SdtSDTInformeProduccionResumenFase_Totalmt, 6, 2)));
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
      if ( gxTv_SdtSDTInformeProduccionResumenFase_Fase != null )
      {
         AddObjectProperty("Fase", gxTv_SdtSDTInformeProduccionResumenFase_Fase, false, false);
      }
      AddObjectProperty("TotalKG", gxTv_SdtSDTInformeProduccionResumenFase_Totalkg, false, false);
      AddObjectProperty("TotalMT", gxTv_SdtSDTInformeProduccionResumenFase_Totalmt, false, false);
   }

   public GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem> getgxTv_SdtSDTInformeProduccionResumenFase_Fase( )
   {
      if ( gxTv_SdtSDTInformeProduccionResumenFase_Fase == null )
      {
         gxTv_SdtSDTInformeProduccionResumenFase_Fase = new GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem>(app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem.class, "SDTInformeProduccionResumenFase.FaseItem", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTInformeProduccionResumenFase_Fase_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_N = (byte)(0) ;
      return gxTv_SdtSDTInformeProduccionResumenFase_Fase ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenFase_Fase( GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem> value )
   {
      gxTv_SdtSDTInformeProduccionResumenFase_Fase_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_Fase = value ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenFase_Fase_SetNull( )
   {
      gxTv_SdtSDTInformeProduccionResumenFase_Fase_N = (byte)(1) ;
      gxTv_SdtSDTInformeProduccionResumenFase_Fase = null ;
   }

   public boolean getgxTv_SdtSDTInformeProduccionResumenFase_Fase_IsNull( )
   {
      if ( gxTv_SdtSDTInformeProduccionResumenFase_Fase == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTInformeProduccionResumenFase_Fase_N( )
   {
      return gxTv_SdtSDTInformeProduccionResumenFase_Fase_N ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeProduccionResumenFase_Totalkg( )
   {
      return gxTv_SdtSDTInformeProduccionResumenFase_Totalkg ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenFase_Totalkg( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenFase_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_Totalkg = value ;
   }

   public java.math.BigDecimal getgxTv_SdtSDTInformeProduccionResumenFase_Totalmt( )
   {
      return gxTv_SdtSDTInformeProduccionResumenFase_Totalmt ;
   }

   public void setgxTv_SdtSDTInformeProduccionResumenFase_Totalmt( java.math.BigDecimal value )
   {
      gxTv_SdtSDTInformeProduccionResumenFase_N = (byte)(0) ;
      gxTv_SdtSDTInformeProduccionResumenFase_Totalmt = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTInformeProduccionResumenFase_Fase_N = (byte)(1) ;
      gxTv_SdtSDTInformeProduccionResumenFase_N = (byte)(1) ;
      gxTv_SdtSDTInformeProduccionResumenFase_Totalkg = DecimalUtil.ZERO ;
      gxTv_SdtSDTInformeProduccionResumenFase_Totalmt = DecimalUtil.ZERO ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTInformeProduccionResumenFase_N ;
   }

   public app.produccion.SdtSDTInformeProduccionResumenFase Clone( )
   {
      return (app.produccion.SdtSDTInformeProduccionResumenFase)(clone()) ;
   }

   public void setStruct( app.produccion.StructSdtSDTInformeProduccionResumenFase struct )
   {
      GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem> gxTv_SdtSDTInformeProduccionResumenFase_Fase_aux = new GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem>(app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem.class, "SDTInformeProduccionResumenFase.FaseItem", "TexplusNET", remoteHandle);
      Vector<app.produccion.StructSdtSDTInformeProduccionResumenFase_FaseItem> gxTv_SdtSDTInformeProduccionResumenFase_Fase_aux1 = struct.getFase();
      if (gxTv_SdtSDTInformeProduccionResumenFase_Fase_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTInformeProduccionResumenFase_Fase_aux1.size(); i++)
         {
            gxTv_SdtSDTInformeProduccionResumenFase_Fase_aux.add(new app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem(gxTv_SdtSDTInformeProduccionResumenFase_Fase_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTInformeProduccionResumenFase_Fase(gxTv_SdtSDTInformeProduccionResumenFase_Fase_aux);
      setgxTv_SdtSDTInformeProduccionResumenFase_Totalkg(struct.getTotalkg());
      setgxTv_SdtSDTInformeProduccionResumenFase_Totalmt(struct.getTotalmt());
   }

   @SuppressWarnings("unchecked")
   public app.produccion.StructSdtSDTInformeProduccionResumenFase getStruct( )
   {
      app.produccion.StructSdtSDTInformeProduccionResumenFase struct = new app.produccion.StructSdtSDTInformeProduccionResumenFase ();
      struct.setFase(getgxTv_SdtSDTInformeProduccionResumenFase_Fase().getStruct());
      struct.setTotalkg(getgxTv_SdtSDTInformeProduccionResumenFase_Totalkg());
      struct.setTotalmt(getgxTv_SdtSDTInformeProduccionResumenFase_Totalmt());
      return struct ;
   }

   protected byte gxTv_SdtSDTInformeProduccionResumenFase_Fase_N ;
   protected byte gxTv_SdtSDTInformeProduccionResumenFase_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenFase_Totalkg ;
   protected java.math.BigDecimal gxTv_SdtSDTInformeProduccionResumenFase_Totalmt ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem> gxTv_SdtSDTInformeProduccionResumenFase_Fase_aux ;
   protected GXBaseCollection<app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem> gxTv_SdtSDTInformeProduccionResumenFase_Fase=null ;
}

