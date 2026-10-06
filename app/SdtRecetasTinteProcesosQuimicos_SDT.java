package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtRecetasTinteProcesosQuimicos_SDT extends GxUserType
{
   public SdtRecetasTinteProcesosQuimicos_SDT( )
   {
      this(  new ModelContext(SdtRecetasTinteProcesosQuimicos_SDT.class));
   }

   public SdtRecetasTinteProcesosQuimicos_SDT( ModelContext context )
   {
      super( context, "SdtRecetasTinteProcesosQuimicos_SDT");
   }

   public SdtRecetasTinteProcesosQuimicos_SDT( int remoteHandle ,
                                               ModelContext context )
   {
      super( remoteHandle, context, "SdtRecetasTinteProcesosQuimicos_SDT");
   }

   public SdtRecetasTinteProcesosQuimicos_SDT( StructSdtRecetasTinteProcesosQuimicos_SDT struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Eliminar") )
            {
               gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Eliminar = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NumerodeLinea") )
            {
               gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Numerodelinea = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Proforcod") )
            {
               gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Proforcod = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Profordsc") )
            {
               gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Profordsc = oReader.getValue() ;
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
         sName = "RecetasTinteProcesosQuimicos_SDT" ;
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
      oWriter.writeElement("Eliminar", GXutil.booltostr( gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Eliminar));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("NumerodeLinea", GXutil.trim( GXutil.str( gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Numerodelinea, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Proforcod", gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Proforcod);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Profordsc", gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Profordsc);
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
      AddObjectProperty("Eliminar", gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Eliminar, false, false);
      AddObjectProperty("NumerodeLinea", gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Numerodelinea, false, false);
      AddObjectProperty("Proforcod", gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Proforcod, false, false);
      AddObjectProperty("Profordsc", gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Profordsc, false, false);
   }

   public boolean getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Eliminar( )
   {
      return gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Eliminar ;
   }

   public void setgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Eliminar( boolean value )
   {
      gxTv_SdtRecetasTinteProcesosQuimicos_SDT_N = (byte)(0) ;
      gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Eliminar = value ;
   }

   public short getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Numerodelinea( )
   {
      return gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Numerodelinea ;
   }

   public void setgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Numerodelinea( short value )
   {
      gxTv_SdtRecetasTinteProcesosQuimicos_SDT_N = (byte)(0) ;
      gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Numerodelinea = value ;
   }

   public String getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Proforcod( )
   {
      return gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Proforcod ;
   }

   public void setgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Proforcod( String value )
   {
      gxTv_SdtRecetasTinteProcesosQuimicos_SDT_N = (byte)(0) ;
      gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Proforcod = value ;
   }

   public String getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Profordsc( )
   {
      return gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Profordsc ;
   }

   public void setgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Profordsc( String value )
   {
      gxTv_SdtRecetasTinteProcesosQuimicos_SDT_N = (byte)(0) ;
      gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Profordsc = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtRecetasTinteProcesosQuimicos_SDT_N = (byte)(1) ;
      gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Proforcod = "" ;
      gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Profordsc = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtRecetasTinteProcesosQuimicos_SDT_N ;
   }

   public app.SdtRecetasTinteProcesosQuimicos_SDT Clone( )
   {
      return (app.SdtRecetasTinteProcesosQuimicos_SDT)(clone()) ;
   }

   public void setStruct( app.StructSdtRecetasTinteProcesosQuimicos_SDT struct )
   {
      setgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Eliminar(struct.getEliminar());
      setgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Numerodelinea(struct.getNumerodelinea());
      setgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Proforcod(struct.getProforcod());
      setgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Profordsc(struct.getProfordsc());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtRecetasTinteProcesosQuimicos_SDT getStruct( )
   {
      app.StructSdtRecetasTinteProcesosQuimicos_SDT struct = new app.StructSdtRecetasTinteProcesosQuimicos_SDT ();
      struct.setEliminar(getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Eliminar());
      struct.setNumerodelinea(getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Numerodelinea());
      struct.setProforcod(getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Proforcod());
      struct.setProfordsc(getgxTv_SdtRecetasTinteProcesosQuimicos_SDT_Profordsc());
      return struct ;
   }

   protected byte gxTv_SdtRecetasTinteProcesosQuimicos_SDT_N ;
   protected short gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Numerodelinea ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Proforcod ;
   protected String gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Profordsc ;
   protected String sTagName ;
   protected boolean gxTv_SdtRecetasTinteProcesosQuimicos_SDT_Eliminar ;
   protected boolean readElement ;
   protected boolean formatError ;
}

