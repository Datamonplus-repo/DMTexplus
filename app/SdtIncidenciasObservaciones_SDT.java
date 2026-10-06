package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtIncidenciasObservaciones_SDT extends GxUserType
{
   public SdtIncidenciasObservaciones_SDT( )
   {
      this(  new ModelContext(SdtIncidenciasObservaciones_SDT.class));
   }

   public SdtIncidenciasObservaciones_SDT( ModelContext context )
   {
      super( context, "SdtIncidenciasObservaciones_SDT");
   }

   public SdtIncidenciasObservaciones_SDT( int remoteHandle ,
                                           ModelContext context )
   {
      super( remoteHandle, context, "SdtIncidenciasObservaciones_SDT");
   }

   public SdtIncidenciasObservaciones_SDT( StructSdtIncidenciasObservaciones_SDT struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Inc_obs") )
            {
               gxTv_SdtIncidenciasObservaciones_SDT_Inc_obs = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ForNumCol") )
            {
               gxTv_SdtIncidenciasObservaciones_SDT_Fornumcol = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcod") )
            {
               gxTv_SdtIncidenciasObservaciones_SDT_Barcod = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcodreo") )
            {
               gxTv_SdtIncidenciasObservaciones_SDT_Barcodreo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Barcodpar") )
            {
               gxTv_SdtIncidenciasObservaciones_SDT_Barcodpar = oReader.getValue() ;
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
         sName = "IncidenciasObservaciones_SDT" ;
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
      oWriter.writeElement("Inc_obs", gxTv_SdtIncidenciasObservaciones_SDT_Inc_obs);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ForNumCol", GXutil.trim( GXutil.str( gxTv_SdtIncidenciasObservaciones_SDT_Fornumcol, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcod", GXutil.trim( GXutil.str( gxTv_SdtIncidenciasObservaciones_SDT_Barcod, 8, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcodreo", GXutil.trim( GXutil.str( gxTv_SdtIncidenciasObservaciones_SDT_Barcodreo, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Barcodpar", gxTv_SdtIncidenciasObservaciones_SDT_Barcodpar);
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
      AddObjectProperty("Inc_obs", gxTv_SdtIncidenciasObservaciones_SDT_Inc_obs, false, false);
      AddObjectProperty("ForNumCol", gxTv_SdtIncidenciasObservaciones_SDT_Fornumcol, false, false);
      AddObjectProperty("Barcod", gxTv_SdtIncidenciasObservaciones_SDT_Barcod, false, false);
      AddObjectProperty("Barcodreo", gxTv_SdtIncidenciasObservaciones_SDT_Barcodreo, false, false);
      AddObjectProperty("Barcodpar", gxTv_SdtIncidenciasObservaciones_SDT_Barcodpar, false, false);
   }

   public String getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( )
   {
      return gxTv_SdtIncidenciasObservaciones_SDT_Inc_obs ;
   }

   public void setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs( String value )
   {
      gxTv_SdtIncidenciasObservaciones_SDT_N = (byte)(0) ;
      gxTv_SdtIncidenciasObservaciones_SDT_Inc_obs = value ;
   }

   public int getgxTv_SdtIncidenciasObservaciones_SDT_Fornumcol( )
   {
      return gxTv_SdtIncidenciasObservaciones_SDT_Fornumcol ;
   }

   public void setgxTv_SdtIncidenciasObservaciones_SDT_Fornumcol( int value )
   {
      gxTv_SdtIncidenciasObservaciones_SDT_N = (byte)(0) ;
      gxTv_SdtIncidenciasObservaciones_SDT_Fornumcol = value ;
   }

   public int getgxTv_SdtIncidenciasObservaciones_SDT_Barcod( )
   {
      return gxTv_SdtIncidenciasObservaciones_SDT_Barcod ;
   }

   public void setgxTv_SdtIncidenciasObservaciones_SDT_Barcod( int value )
   {
      gxTv_SdtIncidenciasObservaciones_SDT_N = (byte)(0) ;
      gxTv_SdtIncidenciasObservaciones_SDT_Barcod = value ;
   }

   public byte getgxTv_SdtIncidenciasObservaciones_SDT_Barcodreo( )
   {
      return gxTv_SdtIncidenciasObservaciones_SDT_Barcodreo ;
   }

   public void setgxTv_SdtIncidenciasObservaciones_SDT_Barcodreo( byte value )
   {
      gxTv_SdtIncidenciasObservaciones_SDT_N = (byte)(0) ;
      gxTv_SdtIncidenciasObservaciones_SDT_Barcodreo = value ;
   }

   public String getgxTv_SdtIncidenciasObservaciones_SDT_Barcodpar( )
   {
      return gxTv_SdtIncidenciasObservaciones_SDT_Barcodpar ;
   }

   public void setgxTv_SdtIncidenciasObservaciones_SDT_Barcodpar( String value )
   {
      gxTv_SdtIncidenciasObservaciones_SDT_N = (byte)(0) ;
      gxTv_SdtIncidenciasObservaciones_SDT_Barcodpar = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtIncidenciasObservaciones_SDT_Inc_obs = "" ;
      gxTv_SdtIncidenciasObservaciones_SDT_N = (byte)(1) ;
      gxTv_SdtIncidenciasObservaciones_SDT_Barcodpar = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtIncidenciasObservaciones_SDT_N ;
   }

   public app.SdtIncidenciasObservaciones_SDT Clone( )
   {
      return (app.SdtIncidenciasObservaciones_SDT)(clone()) ;
   }

   public void setStruct( app.StructSdtIncidenciasObservaciones_SDT struct )
   {
      setgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs(struct.getInc_obs());
      setgxTv_SdtIncidenciasObservaciones_SDT_Fornumcol(struct.getFornumcol());
      setgxTv_SdtIncidenciasObservaciones_SDT_Barcod(struct.getBarcod());
      setgxTv_SdtIncidenciasObservaciones_SDT_Barcodreo(struct.getBarcodreo());
      setgxTv_SdtIncidenciasObservaciones_SDT_Barcodpar(struct.getBarcodpar());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtIncidenciasObservaciones_SDT getStruct( )
   {
      app.StructSdtIncidenciasObservaciones_SDT struct = new app.StructSdtIncidenciasObservaciones_SDT ();
      struct.setInc_obs(getgxTv_SdtIncidenciasObservaciones_SDT_Inc_obs());
      struct.setFornumcol(getgxTv_SdtIncidenciasObservaciones_SDT_Fornumcol());
      struct.setBarcod(getgxTv_SdtIncidenciasObservaciones_SDT_Barcod());
      struct.setBarcodreo(getgxTv_SdtIncidenciasObservaciones_SDT_Barcodreo());
      struct.setBarcodpar(getgxTv_SdtIncidenciasObservaciones_SDT_Barcodpar());
      return struct ;
   }

   protected byte gxTv_SdtIncidenciasObservaciones_SDT_N ;
   protected byte gxTv_SdtIncidenciasObservaciones_SDT_Barcodreo ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtIncidenciasObservaciones_SDT_Fornumcol ;
   protected int gxTv_SdtIncidenciasObservaciones_SDT_Barcod ;
   protected String gxTv_SdtIncidenciasObservaciones_SDT_Barcodpar ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtIncidenciasObservaciones_SDT_Inc_obs ;
}

