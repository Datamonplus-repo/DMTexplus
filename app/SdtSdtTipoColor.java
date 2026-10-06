package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSdtTipoColor extends GxUserType
{
   public SdtSdtTipoColor( )
   {
      this(  new ModelContext(SdtSdtTipoColor.class));
   }

   public SdtSdtTipoColor( ModelContext context )
   {
      super( context, "SdtSdtTipoColor");
   }

   public SdtSdtTipoColor( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle, context, "SdtSdtTipoColor");
   }

   public SdtSdtTipoColor( StructSdtSdtTipoColor struct )
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
               gxTv_SdtSdtTipoColor_Codigo = (byte)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Descripcion") )
            {
               gxTv_SdtSdtTipoColor_Descripcion = oReader.getValue() ;
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
         sName = "SdtTipoColor" ;
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
      oWriter.writeElement("Codigo", GXutil.trim( GXutil.str( gxTv_SdtSdtTipoColor_Codigo, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Descripcion", gxTv_SdtSdtTipoColor_Descripcion);
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
      AddObjectProperty("Codigo", gxTv_SdtSdtTipoColor_Codigo, false, false);
      AddObjectProperty("Descripcion", gxTv_SdtSdtTipoColor_Descripcion, false, false);
   }

   public byte getgxTv_SdtSdtTipoColor_Codigo( )
   {
      return gxTv_SdtSdtTipoColor_Codigo ;
   }

   public void setgxTv_SdtSdtTipoColor_Codigo( byte value )
   {
      gxTv_SdtSdtTipoColor_N = (byte)(0) ;
      gxTv_SdtSdtTipoColor_Codigo = value ;
   }

   public String getgxTv_SdtSdtTipoColor_Descripcion( )
   {
      return gxTv_SdtSdtTipoColor_Descripcion ;
   }

   public void setgxTv_SdtSdtTipoColor_Descripcion( String value )
   {
      gxTv_SdtSdtTipoColor_N = (byte)(0) ;
      gxTv_SdtSdtTipoColor_Descripcion = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSdtTipoColor_N = (byte)(1) ;
      gxTv_SdtSdtTipoColor_Descripcion = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSdtTipoColor_N ;
   }

   public app.SdtSdtTipoColor Clone( )
   {
      return (app.SdtSdtTipoColor)(clone()) ;
   }

   public void setStruct( app.StructSdtSdtTipoColor struct )
   {
      setgxTv_SdtSdtTipoColor_Codigo(struct.getCodigo());
      setgxTv_SdtSdtTipoColor_Descripcion(struct.getDescripcion());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSdtTipoColor getStruct( )
   {
      app.StructSdtSdtTipoColor struct = new app.StructSdtSdtTipoColor ();
      struct.setCodigo(getgxTv_SdtSdtTipoColor_Codigo());
      struct.setDescripcion(getgxTv_SdtSdtTipoColor_Descripcion());
      return struct ;
   }

   protected byte gxTv_SdtSdtTipoColor_Codigo ;
   protected byte gxTv_SdtSdtTipoColor_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSdtTipoColor_Descripcion ;
}

