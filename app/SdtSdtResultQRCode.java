package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSdtResultQRCode extends GxUserType
{
   public SdtSdtResultQRCode( )
   {
      this(  new ModelContext(SdtSdtResultQRCode.class));
   }

   public SdtSdtResultQRCode( ModelContext context )
   {
      super( context, "SdtSdtResultQRCode");
   }

   public SdtSdtResultQRCode( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle, context, "SdtSdtResultQRCode");
   }

   public SdtSdtResultQRCode( StructSdtSdtResultQRCode struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "result") )
            {
               if ( gxTv_SdtSdtResultQRCode_Result == null )
               {
                  gxTv_SdtSdtResultQRCode_Result = new app.SdtSdtQRCode(remoteHandle, context);
               }
               GXSoapError = gxTv_SdtSdtResultQRCode_Result.readxml(oReader, "result") ;
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
         sName = "SdtResultQRCode" ;
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
      if ( gxTv_SdtSdtResultQRCode_Result != null )
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
         gxTv_SdtSdtResultQRCode_Result.writexml(oWriter, "result", sNameSpace1);
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
      if ( gxTv_SdtSdtResultQRCode_Result != null )
      {
         AddObjectProperty("result", gxTv_SdtSdtResultQRCode_Result, false, false);
      }
   }

   public app.SdtSdtQRCode getgxTv_SdtSdtResultQRCode_Result( )
   {
      if ( gxTv_SdtSdtResultQRCode_Result == null )
      {
         gxTv_SdtSdtResultQRCode_Result = new app.SdtSdtQRCode(remoteHandle, context);
      }
      gxTv_SdtSdtResultQRCode_Result_N = (byte)(0) ;
      gxTv_SdtSdtResultQRCode_N = (byte)(0) ;
      return gxTv_SdtSdtResultQRCode_Result ;
   }

   public void setgxTv_SdtSdtResultQRCode_Result( app.SdtSdtQRCode value )
   {
      gxTv_SdtSdtResultQRCode_Result_N = (byte)(0) ;
      gxTv_SdtSdtResultQRCode_N = (byte)(0) ;
      gxTv_SdtSdtResultQRCode_Result = value;
   }

   public void setgxTv_SdtSdtResultQRCode_Result_SetNull( )
   {
      gxTv_SdtSdtResultQRCode_Result_N = (byte)(1) ;
      gxTv_SdtSdtResultQRCode_Result = (app.SdtSdtQRCode)null;
   }

   public boolean getgxTv_SdtSdtResultQRCode_Result_IsNull( )
   {
      if ( gxTv_SdtSdtResultQRCode_Result == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSdtResultQRCode_Result_N( )
   {
      return gxTv_SdtSdtResultQRCode_Result_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSdtResultQRCode_Result_N = (byte)(1) ;
      gxTv_SdtSdtResultQRCode_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSdtResultQRCode_N ;
   }

   public app.SdtSdtResultQRCode Clone( )
   {
      return (app.SdtSdtResultQRCode)(clone()) ;
   }

   public void setStruct( app.StructSdtSdtResultQRCode struct )
   {
      setgxTv_SdtSdtResultQRCode_Result(new app.SdtSdtQRCode(struct.getResult()));
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSdtResultQRCode getStruct( )
   {
      app.StructSdtSdtResultQRCode struct = new app.StructSdtSdtResultQRCode ();
      struct.setResult(getgxTv_SdtSdtResultQRCode_Result().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSdtResultQRCode_Result_N ;
   protected byte gxTv_SdtSdtResultQRCode_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected app.SdtSdtQRCode gxTv_SdtSdtResultQRCode_Result=null ;
}

