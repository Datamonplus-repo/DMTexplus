package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia extends GxUserType
{
   public SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia( )
   {
      this(  new ModelContext(SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia.class));
   }

   public SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia( ModelContext context )
   {
      super( context, "SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia");
   }

   public SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia( int remoteHandle ,
                                                              ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia");
   }

   public SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia( StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliCod") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Clicod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CliNom") )
            {
               gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Clinom = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Referencias") )
            {
               if ( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias == null )
               {
                  gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias = new GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia>(app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia.class, "SDTInformeAlmacenTejidoCrudo_Cliente_Referencia.Referencia", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias.readxmlcollection(oReader, "Referencias", "Referencia") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "Referencias") )
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
         sName = "SDTInformeAlmacenTejidoCrudo_Cliente_Referencia" ;
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
      oWriter.writeElement("CliCod", GXutil.trim( GXutil.str( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Clicod, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("CliNom", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Clinom);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias != null )
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
         gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias.writexmlcollection(oWriter, "Referencias", sNameSpace1, "Referencia", sNameSpace1);
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
      AddObjectProperty("CliCod", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Clicod, false, false);
      AddObjectProperty("CliNom", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Clinom, false, false);
      if ( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias != null )
      {
         AddObjectProperty("Referencias", gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias, false, false);
      }
   }

   public int getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Clicod( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Clicod ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Clicod( int value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Clicod = value ;
   }

   public String getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Clinom( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Clinom ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Clinom( String value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Clinom = value ;
   }

   public GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia> getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias( )
   {
      if ( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias == null )
      {
         gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias = new GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia>(app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia.class, "SDTInformeAlmacenTejidoCrudo_Cliente_Referencia.Referencia", "TexplusNET", remoteHandle);
      }
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_N = (byte)(0) ;
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias( GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia> value )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_N = (byte)(0) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias = value ;
   }

   public void setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias_SetNull( )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias_N = (byte)(1) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias = null ;
   }

   public boolean getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias_IsNull( )
   {
      if ( gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias_N( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_N = (byte)(1) ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Clinom = "" ;
      gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_N ;
   }

   public app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia Clone( )
   {
      return (app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia struct )
   {
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Clicod(struct.getClicod());
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Clinom(struct.getClinom());
      GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia> gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias_aux = new GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia>(app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia.class, "SDTInformeAlmacenTejidoCrudo_Cliente_Referencia.Referencia", "TexplusNET", remoteHandle);
      Vector<app.StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia> gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias_aux1 = struct.getReferencias();
      if (gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias_aux1.size(); i++)
         {
            gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias_aux.add(new app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia(gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias(gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias_aux);
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia getStruct( )
   {
      app.StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia struct = new app.StructSdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia ();
      struct.setClicod(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Clicod());
      struct.setClinom(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Clinom());
      struct.setReferencias(getgxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_N ;
   protected byte gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Clicod ;
   protected String gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Clinom ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia> gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias_aux ;
   protected GXBaseCollection<app.SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencia> gxTv_SdtSDTInformeAlmacenTejidoCrudo_Cliente_Referencia_Referencias=null ;
}

