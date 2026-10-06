package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSdtTipoArticulo extends GxUserType
{
   public SdtSdtTipoArticulo( )
   {
      this(  new ModelContext(SdtSdtTipoArticulo.class));
   }

   public SdtSdtTipoArticulo( ModelContext context )
   {
      super( context, "SdtSdtTipoArticulo");
   }

   public SdtSdtTipoArticulo( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle, context, "SdtSdtTipoArticulo");
   }

   public SdtSdtTipoArticulo( StructSdtSdtTipoArticulo struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Codigo") )
            {
               gxTv_SdtSdtTipoArticulo_Codigo = (short)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Descripcion") )
            {
               gxTv_SdtSdtTipoArticulo_Descripcion = oReader.getValue() ;
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
         sName = "SdtTipoArticulo" ;
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
      oWriter.writeElement("Codigo", GXutil.trim( GXutil.str( gxTv_SdtSdtTipoArticulo_Codigo, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Descripcion", gxTv_SdtSdtTipoArticulo_Descripcion);
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
      AddObjectProperty("Codigo", gxTv_SdtSdtTipoArticulo_Codigo, false, false);
      AddObjectProperty("Descripcion", gxTv_SdtSdtTipoArticulo_Descripcion, false, false);
   }

   public short getgxTv_SdtSdtTipoArticulo_Codigo( )
   {
      return gxTv_SdtSdtTipoArticulo_Codigo ;
   }

   public void setgxTv_SdtSdtTipoArticulo_Codigo( short value )
   {
      gxTv_SdtSdtTipoArticulo_N = (byte)(0) ;
      gxTv_SdtSdtTipoArticulo_Codigo = value ;
   }

   public String getgxTv_SdtSdtTipoArticulo_Descripcion( )
   {
      return gxTv_SdtSdtTipoArticulo_Descripcion ;
   }

   public void setgxTv_SdtSdtTipoArticulo_Descripcion( String value )
   {
      gxTv_SdtSdtTipoArticulo_N = (byte)(0) ;
      gxTv_SdtSdtTipoArticulo_Descripcion = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSdtTipoArticulo_N = (byte)(1) ;
      gxTv_SdtSdtTipoArticulo_Descripcion = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSdtTipoArticulo_N ;
   }

   public app.SdtSdtTipoArticulo Clone( )
   {
      return (app.SdtSdtTipoArticulo)(clone()) ;
   }

   public void setStruct( app.StructSdtSdtTipoArticulo struct )
   {
      setgxTv_SdtSdtTipoArticulo_Codigo(struct.getCodigo());
      setgxTv_SdtSdtTipoArticulo_Descripcion(struct.getDescripcion());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSdtTipoArticulo getStruct( )
   {
      app.StructSdtSdtTipoArticulo struct = new app.StructSdtSdtTipoArticulo ();
      struct.setCodigo(getgxTv_SdtSdtTipoArticulo_Codigo());
      struct.setDescripcion(getgxTv_SdtSdtTipoArticulo_Descripcion());
      return struct ;
   }

   protected byte gxTv_SdtSdtTipoArticulo_N ;
   protected short gxTv_SdtSdtTipoArticulo_Codigo ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSdtTipoArticulo_Descripcion ;
}

