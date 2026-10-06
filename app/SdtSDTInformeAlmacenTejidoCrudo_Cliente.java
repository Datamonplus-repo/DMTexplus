package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTInformeAlmacenTejidoCrudo_Cliente extends GxUserType
{
   public SdtSDTInformeAlmacenTejidoCrudo_Cliente( )
   {
      this(  new ModelContext(SdtSDTInformeAlmacenTejidoCrudo_Cliente.class));
   }

   public SdtSDTInformeAlmacenTejidoCrudo_Cliente( ModelContext context )
   {
      super( context, "SdtSDTInformeAlmacenTejidoCrudo_Cliente");
   }

   public SdtSDTInformeAlmacenTejidoCrudo_Cliente( int remoteHandle ,
                                                   ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTInformeAlmacenTejidoCrudo_Cliente");
   }

   public SdtSDTInformeAlmacenTejidoCrudo_Cliente( StructSdtSDTInformeAlmacenTejidoCrudo_Cliente struct )
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
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UnidadesPiezas") )
            {
               if ( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas == null )
               {
                  gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas = new GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item>(app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item.class, "SDTInformeAlmacenTejidoCrudo_Cliente.Level1Item", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas.readxmlcollection(oReader, "UnidadesPiezas", "Level1Item") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "UnidadesPiezas") )
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
         sName = "SDTInformeAlmacenTejidoCrudo_Cliente" ;
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
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas != null )
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
         gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas.writexmlcollection(oWriter, "UnidadesPiezas", sNameSpace1, "Level1Item", sNameSpace1);
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
      AddObjectProperty("Clicod", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Clinom, false, false);
      if ( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas != null )
      {
         AddObjectProperty("UnidadesPiezas", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas, false, false);
      }
   }

   public int getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Clicod( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Clicod ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Clicod( int value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Clicod = value ;
   }

   public String getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Clinom( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Clinom ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Clinom( String value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Clinom = value ;
   }

   public GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item> getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas( )
   {
      if ( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas == null )
      {
         gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas = new GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item>(app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item.class, "SDTInformeAlmacenTejidoCrudo_Cliente.Level1Item", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_N = (byte)(0) ;
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas( GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item> value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas = value ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas_SetNull( )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas_N = (byte)(1) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas = null ;
   }

   public boolean getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas_IsNull( )
   {
      if ( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas_N( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_N = (byte)(1) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Clinom = "" ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_N ;
   }

   public app.SdtSDTInformeAlmacenTejidoCrudo_Cliente Clone( )
   {
      return (app.SdtSDTInformeAlmacenTejidoCrudo_Cliente)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTInformeAlmacenTejidoCrudo_Cliente struct )
   {
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Clicod(struct.getClicod());
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Clinom(struct.getClinom());
      GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item> gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas_aux = new GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item>(app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item.class, "SDTInformeAlmacenTejidoCrudo_Cliente.Level1Item", "TexplusNET", remoteHandle);
      Vector<app.StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item> gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas_aux1 = struct.getUnidadespiezas();
      if (gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas_aux1.size(); i++)
         {
            gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas_aux.add(new app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item(gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas(gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTInformeAlmacenTejidoCrudo_Cliente getStruct( )
   {
      app.StructSdtSDTInformeAlmacenTejidoCrudo_Cliente struct = new app.StructSdtSDTInformeAlmacenTejidoCrudo_Cliente ();
      struct.setClicod(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Clicod());
      struct.setClinom(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Clinom());
      struct.setUnidadespiezas(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_N ;
   protected byte gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Clicod ;
   protected String gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Clinom ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item> gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas_aux ;
   protected GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Level1Item> gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Unidadespiezas=null ;
}

