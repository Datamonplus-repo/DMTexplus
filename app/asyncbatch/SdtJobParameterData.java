package app.asyncbatch ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtJobParameterData extends GxUserType
{
   public SdtJobParameterData( )
   {
      this(  new ModelContext(SdtJobParameterData.class));
   }

   public SdtJobParameterData( ModelContext context )
   {
      super( context, "SdtJobParameterData");
   }

   public SdtJobParameterData( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle, context, "SdtJobParameterData");
   }

   public SdtJobParameterData( StructSdtJobParameterData struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "JobId") )
            {
               gxTv_SdtJobParameterData_Jobid = GXutil.strToGuid(oReader.getValue()) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "JobParSdt") )
            {
               if ( gxTv_SdtJobParameterData_Jobparsdt == null )
               {
                  gxTv_SdtJobParameterData_Jobparsdt = new GXBaseCollection<app.asyncbatch.SdtJobParameterData_JobParSdtItem>(app.asyncbatch.SdtJobParameterData_JobParSdtItem.class, "JobParameterData.JobParSdtItem", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtJobParameterData_Jobparsdt.readxmlcollection(oReader, "JobParSdt", "JobParSdtItem") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "JobParSdt") )
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
         sName = "JobParameterData" ;
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
      oWriter.writeElement("JobId", gxTv_SdtJobParameterData_Jobid.toString());
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtJobParameterData_Jobparsdt != null )
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
         gxTv_SdtJobParameterData_Jobparsdt.writexmlcollection(oWriter, "JobParSdt", sNameSpace1, "JobParSdtItem", sNameSpace1);
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
      AddObjectProperty("JobId", gxTv_SdtJobParameterData_Jobid, false, false);
      if ( gxTv_SdtJobParameterData_Jobparsdt != null )
      {
         AddObjectProperty("JobParSdt", gxTv_SdtJobParameterData_Jobparsdt, false, false);
      }
   }

   public java.util.UUID getgxTv_SdtJobParameterData_Jobid( )
   {
      return gxTv_SdtJobParameterData_Jobid ;
   }

   public void setgxTv_SdtJobParameterData_Jobid( java.util.UUID value )
   {
      gxTv_SdtJobParameterData_N = (byte)(0) ;
      gxTv_SdtJobParameterData_Jobid = value ;
   }

   public GXBaseCollection<app.asyncbatch.SdtJobParameterData_JobParSdtItem> getgxTv_SdtJobParameterData_Jobparsdt( )
   {
      if ( gxTv_SdtJobParameterData_Jobparsdt == null )
      {
         gxTv_SdtJobParameterData_Jobparsdt = new GXBaseCollection<app.asyncbatch.SdtJobParameterData_JobParSdtItem>(app.asyncbatch.SdtJobParameterData_JobParSdtItem.class, "JobParameterData.JobParSdtItem", "TexplusNET", remoteHandle);
      }
      gxTv_SdtJobParameterData_Jobparsdt_N = (byte)(0) ;
      gxTv_SdtJobParameterData_N = (byte)(0) ;
      return gxTv_SdtJobParameterData_Jobparsdt ;
   }

   public void setgxTv_SdtJobParameterData_Jobparsdt( GXBaseCollection<app.asyncbatch.SdtJobParameterData_JobParSdtItem> value )
   {
      gxTv_SdtJobParameterData_Jobparsdt_N = (byte)(0) ;
      gxTv_SdtJobParameterData_N = (byte)(0) ;
      gxTv_SdtJobParameterData_Jobparsdt = value ;
   }

   public void setgxTv_SdtJobParameterData_Jobparsdt_SetNull( )
   {
      gxTv_SdtJobParameterData_Jobparsdt_N = (byte)(1) ;
      gxTv_SdtJobParameterData_Jobparsdt = null ;
   }

   public boolean getgxTv_SdtJobParameterData_Jobparsdt_IsNull( )
   {
      if ( gxTv_SdtJobParameterData_Jobparsdt == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtJobParameterData_Jobparsdt_N( )
   {
      return gxTv_SdtJobParameterData_Jobparsdt_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtJobParameterData_Jobid = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      gxTv_SdtJobParameterData_N = (byte)(1) ;
      gxTv_SdtJobParameterData_Jobparsdt_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtJobParameterData_N ;
   }

   public app.asyncbatch.SdtJobParameterData Clone( )
   {
      return (app.asyncbatch.SdtJobParameterData)(clone()) ;
   }

   public void setStruct( app.asyncbatch.StructSdtJobParameterData struct )
   {
      setgxTv_SdtJobParameterData_Jobid(struct.getJobid());
      GXBaseCollection<app.asyncbatch.SdtJobParameterData_JobParSdtItem> gxTv_SdtJobParameterData_Jobparsdt_aux = new GXBaseCollection<app.asyncbatch.SdtJobParameterData_JobParSdtItem>(app.asyncbatch.SdtJobParameterData_JobParSdtItem.class, "JobParameterData.JobParSdtItem", "TexplusNET", remoteHandle);
      Vector<app.asyncbatch.StructSdtJobParameterData_JobParSdtItem> gxTv_SdtJobParameterData_Jobparsdt_aux1 = struct.getJobparsdt();
      if (gxTv_SdtJobParameterData_Jobparsdt_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtJobParameterData_Jobparsdt_aux1.size(); i++)
         {
            gxTv_SdtJobParameterData_Jobparsdt_aux.add(new app.asyncbatch.SdtJobParameterData_JobParSdtItem(gxTv_SdtJobParameterData_Jobparsdt_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtJobParameterData_Jobparsdt(gxTv_SdtJobParameterData_Jobparsdt_aux);
   }

   @SuppressWarnings("unchecked")
   public app.asyncbatch.StructSdtJobParameterData getStruct( )
   {
      app.asyncbatch.StructSdtJobParameterData struct = new app.asyncbatch.StructSdtJobParameterData ();
      struct.setJobid(getgxTv_SdtJobParameterData_Jobid());
      struct.setJobparsdt(getgxTv_SdtJobParameterData_Jobparsdt().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtJobParameterData_N ;
   protected byte gxTv_SdtJobParameterData_Jobparsdt_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected java.util.UUID gxTv_SdtJobParameterData_Jobid ;
   protected GXBaseCollection<app.asyncbatch.SdtJobParameterData_JobParSdtItem> gxTv_SdtJobParameterData_Jobparsdt_aux ;
   protected GXBaseCollection<app.asyncbatch.SdtJobParameterData_JobParSdtItem> gxTv_SdtJobParameterData_Jobparsdt=null ;
}

