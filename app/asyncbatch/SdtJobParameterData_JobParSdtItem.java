package app.asyncbatch ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtJobParameterData_JobParSdtItem extends GxUserType
{
   public SdtJobParameterData_JobParSdtItem( )
   {
      this(  new ModelContext(SdtJobParameterData_JobParSdtItem.class));
   }

   public SdtJobParameterData_JobParSdtItem( ModelContext context )
   {
      super( context, "SdtJobParameterData_JobParSdtItem");
   }

   public SdtJobParameterData_JobParSdtItem( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle, context, "SdtJobParameterData_JobParSdtItem");
   }

   public SdtJobParameterData_JobParSdtItem( StructSdtJobParameterData_JobParSdtItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "ParKey") )
            {
               gxTv_SdtJobParameterData_JobParSdtItem_Parkey = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ParVal") )
            {
               gxTv_SdtJobParameterData_JobParSdtItem_Parval = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ValTyp") )
            {
               gxTv_SdtJobParameterData_JobParSdtItem_Valtyp = oReader.getValue() ;
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
         sName = "JobParameterData.JobParSdtItem" ;
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
      oWriter.writeElement("ParKey", gxTv_SdtJobParameterData_JobParSdtItem_Parkey);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ParVal", gxTv_SdtJobParameterData_JobParSdtItem_Parval);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ValTyp", gxTv_SdtJobParameterData_JobParSdtItem_Valtyp);
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
      AddObjectProperty("ParKey", gxTv_SdtJobParameterData_JobParSdtItem_Parkey, false, false);
      AddObjectProperty("ParVal", gxTv_SdtJobParameterData_JobParSdtItem_Parval, false, false);
      AddObjectProperty("ValTyp", gxTv_SdtJobParameterData_JobParSdtItem_Valtyp, false, false);
   }

   public String getgxTv_SdtJobParameterData_JobParSdtItem_Parkey( )
   {
      return gxTv_SdtJobParameterData_JobParSdtItem_Parkey ;
   }

   public void setgxTv_SdtJobParameterData_JobParSdtItem_Parkey( String value )
   {
      gxTv_SdtJobParameterData_JobParSdtItem_N = (byte)(0) ;
      gxTv_SdtJobParameterData_JobParSdtItem_Parkey = value ;
   }

   public String getgxTv_SdtJobParameterData_JobParSdtItem_Parval( )
   {
      return gxTv_SdtJobParameterData_JobParSdtItem_Parval ;
   }

   public void setgxTv_SdtJobParameterData_JobParSdtItem_Parval( String value )
   {
      gxTv_SdtJobParameterData_JobParSdtItem_N = (byte)(0) ;
      gxTv_SdtJobParameterData_JobParSdtItem_Parval = value ;
   }

   public String getgxTv_SdtJobParameterData_JobParSdtItem_Valtyp( )
   {
      return gxTv_SdtJobParameterData_JobParSdtItem_Valtyp ;
   }

   public void setgxTv_SdtJobParameterData_JobParSdtItem_Valtyp( String value )
   {
      gxTv_SdtJobParameterData_JobParSdtItem_N = (byte)(0) ;
      gxTv_SdtJobParameterData_JobParSdtItem_Valtyp = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtJobParameterData_JobParSdtItem_Parkey = "" ;
      gxTv_SdtJobParameterData_JobParSdtItem_N = (byte)(1) ;
      gxTv_SdtJobParameterData_JobParSdtItem_Parval = "" ;
      gxTv_SdtJobParameterData_JobParSdtItem_Valtyp = "" ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtJobParameterData_JobParSdtItem_N ;
   }

   public app.asyncbatch.SdtJobParameterData_JobParSdtItem Clone( )
   {
      return (app.asyncbatch.SdtJobParameterData_JobParSdtItem)(clone()) ;
   }

   public void setStruct( app.asyncbatch.StructSdtJobParameterData_JobParSdtItem struct )
   {
      setgxTv_SdtJobParameterData_JobParSdtItem_Parkey(struct.getParkey());
      setgxTv_SdtJobParameterData_JobParSdtItem_Parval(struct.getParval());
      setgxTv_SdtJobParameterData_JobParSdtItem_Valtyp(struct.getValtyp());
   }

   @SuppressWarnings("unchecked")
   public app.asyncbatch.StructSdtJobParameterData_JobParSdtItem getStruct( )
   {
      app.asyncbatch.StructSdtJobParameterData_JobParSdtItem struct = new app.asyncbatch.StructSdtJobParameterData_JobParSdtItem ();
      struct.setParkey(getgxTv_SdtJobParameterData_JobParSdtItem_Parkey());
      struct.setParval(getgxTv_SdtJobParameterData_JobParSdtItem_Parval());
      struct.setValtyp(getgxTv_SdtJobParameterData_JobParSdtItem_Valtyp());
      return struct ;
   }

   protected byte gxTv_SdtJobParameterData_JobParSdtItem_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected String gxTv_SdtJobParameterData_JobParSdtItem_Parkey ;
   protected String gxTv_SdtJobParameterData_JobParSdtItem_Parval ;
   protected String gxTv_SdtJobParameterData_JobParSdtItem_Valtyp ;
}

