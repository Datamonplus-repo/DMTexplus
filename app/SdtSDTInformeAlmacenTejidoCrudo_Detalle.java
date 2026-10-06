package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTInformeAlmacenTejidoCrudo_Detalle extends GxUserType
{
   public SdtSDTInformeAlmacenTejidoCrudo_Detalle( )
   {
      this(  new ModelContext(SdtSDTInformeAlmacenTejidoCrudo_Detalle.class));
   }

   public SdtSDTInformeAlmacenTejidoCrudo_Detalle( ModelContext context )
   {
      super( context, "SdtSDTInformeAlmacenTejidoCrudo_Detalle");
   }

   public SdtSDTInformeAlmacenTejidoCrudo_Detalle( int remoteHandle ,
                                                   ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTInformeAlmacenTejidoCrudo_Detalle");
   }

   public SdtSDTInformeAlmacenTejidoCrudo_Detalle( StructSdtSDTInformeAlmacenTejidoCrudo_Detalle struct )
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
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Lineas") )
            {
               if ( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas == null )
               {
                  gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas = new GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea>(app.SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea.class, "SDTInformeAlmacenTejidoCrudo_Detalle.Linea", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas.readxmlcollection(oReader, "Lineas", "Linea") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Lineas") )
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
         sName = "SDTInformeAlmacenTejidoCrudo_Detalle" ;
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
      oWriter.writeElement("Clicod", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas != null )
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
         gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas.writexmlcollection(oWriter, "Lineas", sNameSpace1, "Linea", sNameSpace1);
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
      AddObjectProperty("Clicod", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Clinom, false, false);
      if ( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas != null )
      {
         AddObjectProperty("Lineas", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas, false, false);
      }
   }

   public int getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Clicod( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Clicod ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Clicod( int value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Clicod = value ;
   }

   public String getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Clinom( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Clinom ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Clinom( String value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Clinom = value ;
   }

   public GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea> getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas( )
   {
      if ( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas == null )
      {
         gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas = new GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea>(app.SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea.class, "SDTInformeAlmacenTejidoCrudo_Detalle.Linea", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_N = (byte)(0) ;
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas( GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea> value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas = value ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas_SetNull( )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas_N = (byte)(1) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas = null ;
   }

   public boolean getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas_IsNull( )
   {
      if ( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas_N( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_N = (byte)(1) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Clinom = "" ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_N ;
   }

   public app.SdtSDTInformeAlmacenTejidoCrudo_Detalle Clone( )
   {
      return (app.SdtSDTInformeAlmacenTejidoCrudo_Detalle)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTInformeAlmacenTejidoCrudo_Detalle struct )
   {
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Clicod(struct.getClicod());
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Clinom(struct.getClinom());
      GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea> gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas_aux = new GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea>(app.SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea.class, "SDTInformeAlmacenTejidoCrudo_Detalle.Linea", "TexplusNET", remoteHandle);
      Vector<app.StructSdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea> gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas_aux1 = struct.getLineas();
      if (gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas_aux1.size(); i++)
         {
            gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas_aux.add(new app.SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea(gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas(gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTInformeAlmacenTejidoCrudo_Detalle getStruct( )
   {
      app.StructSdtSDTInformeAlmacenTejidoCrudo_Detalle struct = new app.StructSdtSDTInformeAlmacenTejidoCrudo_Detalle ();
      struct.setClicod(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Clicod());
      struct.setClinom(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Clinom());
      struct.setLineas(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_N ;
   protected byte gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Clicod ;
   protected String gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Clinom ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea> gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas_aux ;
   protected GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Detalle_Linea> gxTv_SdtSDTInformeAlmacenTejidoCrudo_Detalle_Lineas=null ;
}

