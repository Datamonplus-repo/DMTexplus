package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTClienteArticuloResumenEntradas extends GxUserType
{
   public SdtSDTClienteArticuloResumenEntradas( )
   {
      this(  new ModelContext(SdtSDTClienteArticuloResumenEntradas.class));
   }

   public SdtSDTClienteArticuloResumenEntradas( ModelContext context )
   {
      super( context, "SdtSDTClienteArticuloResumenEntradas");
   }

   public SdtSDTClienteArticuloResumenEntradas( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTClienteArticuloResumenEntradas");
   }

   public SdtSDTClienteArticuloResumenEntradas( StructSdtSDTClienteArticuloResumenEntradas struct )
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
               gxTv_SdtSDTClienteArticuloResumenEntradas_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtSDTClienteArticuloResumenEntradas_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Articulos") )
            {
               if ( gxTv_SdtSDTClienteArticuloResumenEntradas_Articulos == null )
               {
                  gxTv_SdtSDTClienteArticuloResumenEntradas_Articulos = new GXBaseCollection<app.SdtSDTClienteArticuloResumenEntradas_ArticulosItem>(app.SdtSDTClienteArticuloResumenEntradas_ArticulosItem.class, "SDTClienteArticuloResumenEntradas.ArticulosItem", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTClienteArticuloResumenEntradas_Articulos.readxmlcollection(oReader, "Articulos", "ArticulosItem") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Articulos") )
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
         sName = "SDTClienteArticuloResumenEntradas" ;
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
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtSDTClienteArticuloResumenEntradas_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtSDTClienteArticuloResumenEntradas_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtSDTClienteArticuloResumenEntradas_Articulos != null )
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
         gxTv_SdtSDTClienteArticuloResumenEntradas_Articulos.writexmlcollection(oWriter, "Articulos", sNameSpace1, "ArticulosItem", sNameSpace1);
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
      AddObjectProperty("Clicod", gxTv_SdtSDTClienteArticuloResumenEntradas_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtSDTClienteArticuloResumenEntradas_Clinom, false, false);
      if ( gxTv_SdtSDTClienteArticuloResumenEntradas_Articulos != null )
      {
         AddObjectProperty("Articulos", gxTv_SdtSDTClienteArticuloResumenEntradas_Articulos, false, false);
      }
   }

   public int getgxTv_SdtSDTClienteArticuloResumenEntradas_Clicod( )
   {
      return gxTv_SdtSDTClienteArticuloResumenEntradas_Clicod ;
   }

   public void setgxTv_SdtSDTClienteArticuloResumenEntradas_Clicod( int value )
   {
      gxTv_SdtSDTClienteArticuloResumenEntradas_N = (byte)(0) ;
      gxTv_SdtSDTClienteArticuloResumenEntradas_Clicod = value ;
   }

   public String getgxTv_SdtSDTClienteArticuloResumenEntradas_Clinom( )
   {
      return gxTv_SdtSDTClienteArticuloResumenEntradas_Clinom ;
   }

   public void setgxTv_SdtSDTClienteArticuloResumenEntradas_Clinom( String value )
   {
      gxTv_SdtSDTClienteArticuloResumenEntradas_N = (byte)(0) ;
      gxTv_SdtSDTClienteArticuloResumenEntradas_Clinom = value ;
   }

   public GXBaseCollection<app.SdtSDTClienteArticuloResumenEntradas_ArticulosItem> getgxTv_SdtSDTClienteArticuloResumenEntradas_Articulos( )
   {
      if ( gxTv_SdtSDTClienteArticuloResumenEntradas_Articulos == null )
      {
         gxTv_SdtSDTClienteArticuloResumenEntradas_Articulos = new GXBaseCollection<app.SdtSDTClienteArticuloResumenEntradas_ArticulosItem>(app.SdtSDTClienteArticuloResumenEntradas_ArticulosItem.class, "SDTClienteArticuloResumenEntradas.ArticulosItem", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTClienteArticuloResumenEntradas_Articulos_N = (byte)(0) ;
      gxTv_SdtSDTClienteArticuloResumenEntradas_N = (byte)(0) ;
      return gxTv_SdtSDTClienteArticuloResumenEntradas_Articulos ;
   }

   public void setgxTv_SdtSDTClienteArticuloResumenEntradas_Articulos( GXBaseCollection<app.SdtSDTClienteArticuloResumenEntradas_ArticulosItem> value )
   {
      gxTv_SdtSDTClienteArticuloResumenEntradas_Articulos_N = (byte)(0) ;
      gxTv_SdtSDTClienteArticuloResumenEntradas_N = (byte)(0) ;
      gxTv_SdtSDTClienteArticuloResumenEntradas_Articulos = value ;
   }

   public void setgxTv_SdtSDTClienteArticuloResumenEntradas_Articulos_SetNull( )
   {
      gxTv_SdtSDTClienteArticuloResumenEntradas_Articulos_N = (byte)(1) ;
      gxTv_SdtSDTClienteArticuloResumenEntradas_Articulos = null ;
   }

   public boolean getgxTv_SdtSDTClienteArticuloResumenEntradas_Articulos_IsNull( )
   {
      if ( gxTv_SdtSDTClienteArticuloResumenEntradas_Articulos == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTClienteArticuloResumenEntradas_Articulos_N( )
   {
      return gxTv_SdtSDTClienteArticuloResumenEntradas_Articulos_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTClienteArticuloResumenEntradas_N = (byte)(1) ;
      gxTv_SdtSDTClienteArticuloResumenEntradas_Clinom = "" ;
      gxTv_SdtSDTClienteArticuloResumenEntradas_Articulos_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTClienteArticuloResumenEntradas_N ;
   }

   public app.SdtSDTClienteArticuloResumenEntradas Clone( )
   {
      return (app.SdtSDTClienteArticuloResumenEntradas)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTClienteArticuloResumenEntradas struct )
   {
      setgxTv_SdtSDTClienteArticuloResumenEntradas_Clicod(struct.getClicod());
      setgxTv_SdtSDTClienteArticuloResumenEntradas_Clinom(struct.getClinom());
      GXBaseCollection<app.SdtSDTClienteArticuloResumenEntradas_ArticulosItem> gxTv_SdtSDTClienteArticuloResumenEntradas_Articulos_aux = new GXBaseCollection<app.SdtSDTClienteArticuloResumenEntradas_ArticulosItem>(app.SdtSDTClienteArticuloResumenEntradas_ArticulosItem.class, "SDTClienteArticuloResumenEntradas.ArticulosItem", "TexplusNET", remoteHandle);
      Vector<app.StructSdtSDTClienteArticuloResumenEntradas_ArticulosItem> gxTv_SdtSDTClienteArticuloResumenEntradas_Articulos_aux1 = struct.getArticulos();
      if (gxTv_SdtSDTClienteArticuloResumenEntradas_Articulos_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTClienteArticuloResumenEntradas_Articulos_aux1.size(); i++)
         {
            gxTv_SdtSDTClienteArticuloResumenEntradas_Articulos_aux.add(new app.SdtSDTClienteArticuloResumenEntradas_ArticulosItem(gxTv_SdtSDTClienteArticuloResumenEntradas_Articulos_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTClienteArticuloResumenEntradas_Articulos(gxTv_SdtSDTClienteArticuloResumenEntradas_Articulos_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTClienteArticuloResumenEntradas getStruct( )
   {
      app.StructSdtSDTClienteArticuloResumenEntradas struct = new app.StructSdtSDTClienteArticuloResumenEntradas ();
      struct.setClicod(getgxTv_SdtSDTClienteArticuloResumenEntradas_Clicod());
      struct.setClinom(getgxTv_SdtSDTClienteArticuloResumenEntradas_Clinom());
      struct.setArticulos(getgxTv_SdtSDTClienteArticuloResumenEntradas_Articulos().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSDTClienteArticuloResumenEntradas_N ;
   protected byte gxTv_SdtSDTClienteArticuloResumenEntradas_Articulos_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTClienteArticuloResumenEntradas_Clicod ;
   protected String gxTv_SdtSDTClienteArticuloResumenEntradas_Clinom ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtSDTClienteArticuloResumenEntradas_ArticulosItem> gxTv_SdtSDTClienteArticuloResumenEntradas_Articulos_aux ;
   protected GXBaseCollection<app.SdtSDTClienteArticuloResumenEntradas_ArticulosItem> gxTv_SdtSDTClienteArticuloResumenEntradas_Articulos=null ;
}

