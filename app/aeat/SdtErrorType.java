package app.aeat ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtErrorType extends GxUserType
{
   public SdtErrorType( )
   {
      this(  new ModelContext(SdtErrorType.class));
   }

   public SdtErrorType( ModelContext context )
   {
      super( context, "SdtErrorType");
   }

   public SdtErrorType( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle, context, "SdtErrorType");
   }

   public SdtErrorType( StructSdtErrorType struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "CodigoError") )
            {
               gxTv_SdtErrorType_Codigoerror = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DescripcionError") )
            {
               gxTv_SdtErrorType_Descripcionerror = oReader.getValue() ;
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
         sName = "ErrorType" ;
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
      oWriter.writeElement("CodigoError", gxTv_SdtErrorType_Codigoerror);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("DescripcionError", gxTv_SdtErrorType_Descripcionerror);
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
      AddObjectProperty("CodigoError", gxTv_SdtErrorType_Codigoerror, false, false);
      AddObjectProperty("DescripcionError", gxTv_SdtErrorType_Descripcionerror, false, false);
   }

   public String getgxTv_SdtErrorType_Codigoerror( )
   {
      return gxTv_SdtErrorType_Codigoerror ;
   }

   public void setgxTv_SdtErrorType_Codigoerror( String value )
   {
      gxTv_SdtErrorType_N = (byte)(0) ;
      gxTv_SdtErrorType_Codigoerror = value ;
   }

   public String getgxTv_SdtErrorType_Descripcionerror( )
   {
      return gxTv_SdtErrorType_Descripcionerror ;
   }

   public void setgxTv_SdtErrorType_Descripcionerror( String value )
   {
      gxTv_SdtErrorType_N = (byte)(0) ;
      gxTv_SdtErrorType_Descripcionerror = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtErrorType_Codigoerror = "" ;
      gxTv_SdtErrorType_N = (byte)(1) ;
      gxTv_SdtErrorType_Descripcionerror = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtErrorType_N ;
   }

   public app.aeat.SdtErrorType Clone( )
   {
      return (app.aeat.SdtErrorType)(clone()) ;
   }

   public void setStruct( app.aeat.StructSdtErrorType struct )
   {
      setgxTv_SdtErrorType_Codigoerror(struct.getCodigoerror());
      setgxTv_SdtErrorType_Descripcionerror(struct.getDescripcionerror());
   }

   @SuppressWarnings("unchecked")
   public app.aeat.StructSdtErrorType getStruct( )
   {
      app.aeat.StructSdtErrorType struct = new app.aeat.StructSdtErrorType ();
      struct.setCodigoerror(getgxTv_SdtErrorType_Codigoerror());
      struct.setDescripcionerror(getgxTv_SdtErrorType_Descripcionerror());
      return struct ;
   }

   protected byte gxTv_SdtErrorType_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtErrorType_Codigoerror ;
   protected String gxTv_SdtErrorType_Descripcionerror ;
}

