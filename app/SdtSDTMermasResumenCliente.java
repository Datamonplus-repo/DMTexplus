package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTMermasResumenCliente extends GxUserType
{
   public SdtSDTMermasResumenCliente( )
   {
      this(  new ModelContext(SdtSDTMermasResumenCliente.class));
   }

   public SdtSDTMermasResumenCliente( ModelContext context )
   {
      super( context, "SdtSDTMermasResumenCliente");
   }

   public SdtSDTMermasResumenCliente( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTMermasResumenCliente");
   }

   public SdtSDTMermasResumenCliente( StructSdtSDTMermasResumenCliente struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Clicod") )
            {
               gxTv_SdtSDTMermasResumenCliente_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtSDTMermasResumenCliente_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Resumen") )
            {
               if ( gxTv_SdtSDTMermasResumenCliente_Resumen == null )
               {
                  gxTv_SdtSDTMermasResumenCliente_Resumen = new GXBaseCollection<app.SdtSDTMermasResumenCliente_ResumenItem>(app.SdtSDTMermasResumenCliente_ResumenItem.class, "SDTMermasResumenCliente.ResumenItem", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTMermasResumenCliente_Resumen.readxmlcollection(oReader, "Resumen", "ResumenItem") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Resumen") )
               {
                  GXSoapError = oReader.read() ;
               }
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
         sName = "SDTMermasResumenCliente" ;
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
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtSDTMermasResumenCliente_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtSDTMermasResumenCliente_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtSDTMermasResumenCliente_Resumen != null )
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
         gxTv_SdtSDTMermasResumenCliente_Resumen.writexmlcollection(oWriter, "Resumen", sNameSpace1, "ResumenItem", sNameSpace1);
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
      AddObjectProperty("Clicod", gxTv_SdtSDTMermasResumenCliente_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtSDTMermasResumenCliente_Clinom, false, false);
      if ( gxTv_SdtSDTMermasResumenCliente_Resumen != null )
      {
         AddObjectProperty("Resumen", gxTv_SdtSDTMermasResumenCliente_Resumen, false, false);
      }
   }

   public int getgxTv_SdtSDTMermasResumenCliente_Clicod( )
   {
      return gxTv_SdtSDTMermasResumenCliente_Clicod ;
   }

   public void setgxTv_SdtSDTMermasResumenCliente_Clicod( int value )
   {
      gxTv_SdtSDTMermasResumenCliente_N = (byte)(0) ;
      gxTv_SdtSDTMermasResumenCliente_Clicod = value ;
   }

   public String getgxTv_SdtSDTMermasResumenCliente_Clinom( )
   {
      return gxTv_SdtSDTMermasResumenCliente_Clinom ;
   }

   public void setgxTv_SdtSDTMermasResumenCliente_Clinom( String value )
   {
      gxTv_SdtSDTMermasResumenCliente_N = (byte)(0) ;
      gxTv_SdtSDTMermasResumenCliente_Clinom = value ;
   }

   public GXBaseCollection<app.SdtSDTMermasResumenCliente_ResumenItem> getgxTv_SdtSDTMermasResumenCliente_Resumen( )
   {
      if ( gxTv_SdtSDTMermasResumenCliente_Resumen == null )
      {
         gxTv_SdtSDTMermasResumenCliente_Resumen = new GXBaseCollection<app.SdtSDTMermasResumenCliente_ResumenItem>(app.SdtSDTMermasResumenCliente_ResumenItem.class, "SDTMermasResumenCliente.ResumenItem", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTMermasResumenCliente_Resumen_N = (byte)(0) ;
      gxTv_SdtSDTMermasResumenCliente_N = (byte)(0) ;
      return gxTv_SdtSDTMermasResumenCliente_Resumen ;
   }

   public void setgxTv_SdtSDTMermasResumenCliente_Resumen( GXBaseCollection<app.SdtSDTMermasResumenCliente_ResumenItem> value )
   {
      gxTv_SdtSDTMermasResumenCliente_Resumen_N = (byte)(0) ;
      gxTv_SdtSDTMermasResumenCliente_N = (byte)(0) ;
      gxTv_SdtSDTMermasResumenCliente_Resumen = value ;
   }

   public void setgxTv_SdtSDTMermasResumenCliente_Resumen_SetNull( )
   {
      gxTv_SdtSDTMermasResumenCliente_Resumen_N = (byte)(1) ;
      gxTv_SdtSDTMermasResumenCliente_Resumen = null ;
   }

   public boolean getgxTv_SdtSDTMermasResumenCliente_Resumen_IsNull( )
   {
      if ( gxTv_SdtSDTMermasResumenCliente_Resumen == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTMermasResumenCliente_Resumen_N( )
   {
      return gxTv_SdtSDTMermasResumenCliente_Resumen_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTMermasResumenCliente_N = (byte)(1) ;
      gxTv_SdtSDTMermasResumenCliente_Clinom = "" ;
      gxTv_SdtSDTMermasResumenCliente_Resumen_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTMermasResumenCliente_N ;
   }

   public app.SdtSDTMermasResumenCliente Clone( )
   {
      return (app.SdtSDTMermasResumenCliente)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTMermasResumenCliente struct )
   {
      setgxTv_SdtSDTMermasResumenCliente_Clicod(struct.getClicod());
      setgxTv_SdtSDTMermasResumenCliente_Clinom(struct.getClinom());
      GXBaseCollection<app.SdtSDTMermasResumenCliente_ResumenItem> gxTv_SdtSDTMermasResumenCliente_Resumen_aux = new GXBaseCollection<app.SdtSDTMermasResumenCliente_ResumenItem>(app.SdtSDTMermasResumenCliente_ResumenItem.class, "SDTMermasResumenCliente.ResumenItem", "TexplusNET", remoteHandle);
      Vector<app.StructSdtSDTMermasResumenCliente_ResumenItem> gxTv_SdtSDTMermasResumenCliente_Resumen_aux1 = struct.getResumen();
      if (gxTv_SdtSDTMermasResumenCliente_Resumen_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTMermasResumenCliente_Resumen_aux1.size(); i++)
         {
            gxTv_SdtSDTMermasResumenCliente_Resumen_aux.add(new app.SdtSDTMermasResumenCliente_ResumenItem(gxTv_SdtSDTMermasResumenCliente_Resumen_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTMermasResumenCliente_Resumen(gxTv_SdtSDTMermasResumenCliente_Resumen_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTMermasResumenCliente getStruct( )
   {
      app.StructSdtSDTMermasResumenCliente struct = new app.StructSdtSDTMermasResumenCliente ();
      struct.setClicod(getgxTv_SdtSDTMermasResumenCliente_Clicod());
      struct.setClinom(getgxTv_SdtSDTMermasResumenCliente_Clinom());
      struct.setResumen(getgxTv_SdtSDTMermasResumenCliente_Resumen().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSDTMermasResumenCliente_N ;
   protected byte gxTv_SdtSDTMermasResumenCliente_Resumen_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTMermasResumenCliente_Clicod ;
   protected String gxTv_SdtSDTMermasResumenCliente_Clinom ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtSDTMermasResumenCliente_ResumenItem> gxTv_SdtSDTMermasResumenCliente_Resumen_aux ;
   protected GXBaseCollection<app.SdtSDTMermasResumenCliente_ResumenItem> gxTv_SdtSDTMermasResumenCliente_Resumen=null ;
}

