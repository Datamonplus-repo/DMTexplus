package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTForColNom extends GxUserType
{
   public SdtSDTForColNom( )
   {
      this(  new ModelContext(SdtSDTForColNom.class));
   }

   public SdtSDTForColNom( ModelContext context )
   {
      super( context, "SdtSDTForColNom");
   }

   public SdtSDTForColNom( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTForColNom");
   }

   public SdtSDTForColNom( StructSdtSDTForColNom struct )
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
               gxTv_SdtSDTForColNom_Codigo = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Descripcion") )
            {
               gxTv_SdtSDTForColNom_Descripcion = oReader.getValue() ;
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
         sName = "SDTForColNom" ;
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
      oWriter.writeElement("Codigo", gxTv_SdtSDTForColNom_Codigo);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("Descripcion", gxTv_SdtSDTForColNom_Descripcion);
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
      AddObjectProperty("Codigo", gxTv_SdtSDTForColNom_Codigo, false, false);
      AddObjectProperty("Descripcion", gxTv_SdtSDTForColNom_Descripcion, false, false);
   }

   public String getgxTv_SdtSDTForColNom_Codigo( )
   {
      return gxTv_SdtSDTForColNom_Codigo ;
   }

   public void setgxTv_SdtSDTForColNom_Codigo( String value )
   {
      gxTv_SdtSDTForColNom_N = (byte)(0) ;
      gxTv_SdtSDTForColNom_Codigo = value ;
   }

   public String getgxTv_SdtSDTForColNom_Descripcion( )
   {
      return gxTv_SdtSDTForColNom_Descripcion ;
   }

   public void setgxTv_SdtSDTForColNom_Descripcion( String value )
   {
      gxTv_SdtSDTForColNom_N = (byte)(0) ;
      gxTv_SdtSDTForColNom_Descripcion = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTForColNom_Codigo = "" ;
      gxTv_SdtSDTForColNom_N = (byte)(1) ;
      gxTv_SdtSDTForColNom_Descripcion = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTForColNom_N ;
   }

   public app.SdtSDTForColNom Clone( )
   {
      return (app.SdtSDTForColNom)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTForColNom struct )
   {
      setgxTv_SdtSDTForColNom_Codigo(struct.getCodigo());
      setgxTv_SdtSDTForColNom_Descripcion(struct.getDescripcion());
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTForColNom getStruct( )
   {
      app.StructSdtSDTForColNom struct = new app.StructSdtSDTForColNom ();
      struct.setCodigo(getgxTv_SdtSDTForColNom_Codigo());
      struct.setDescripcion(getgxTv_SdtSDTForColNom_Descripcion());
      return struct ;
   }

   protected byte gxTv_SdtSDTForColNom_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String gxTv_SdtSDTForColNom_Codigo ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtSDTForColNom_Descripcion ;
}

