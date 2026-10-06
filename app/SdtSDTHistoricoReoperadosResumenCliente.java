package app ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtSDTHistoricoReoperadosResumenCliente extends GxUserType
{
   public SdtSDTHistoricoReoperadosResumenCliente( )
   {
      this(  new ModelContext(SdtSDTHistoricoReoperadosResumenCliente.class));
   }

   public SdtSDTHistoricoReoperadosResumenCliente( ModelContext context )
   {
      super( context, "SdtSDTHistoricoReoperadosResumenCliente");
   }

   public SdtSDTHistoricoReoperadosResumenCliente( int remoteHandle ,
                                                   ModelContext context )
   {
      super( remoteHandle, context, "SdtSDTHistoricoReoperadosResumenCliente");
   }

   public SdtSDTHistoricoReoperadosResumenCliente( StructSdtSDTHistoricoReoperadosResumenCliente struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "Cliente") )
            {
               gxTv_SdtSDTHistoricoReoperadosResumenCliente_Cliente = (int)(getnumericvalue(oReader.getValue())) ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ClienteNombre") )
            {
               gxTv_SdtSDTHistoricoReoperadosResumenCliente_Clientenombre = oReader.getValue() ;
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Total") )
            {
               if ( gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total == null )
               {
                  gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total = new app.SdtSDTHistoricoReoperadosResumenCliente_Total(remoteHandle, context);
               }
               GXSoapError = gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total.readxml(oReader, "Total") ;
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
         sName = "SDTHistoricoReoperadosResumenCliente" ;
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
      oWriter.writeElement("Cliente", GXutil.trim( GXutil.str( gxTv_SdtSDTHistoricoReoperadosResumenCliente_Cliente, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      oWriter.writeElement("ClienteNombre", gxTv_SdtSDTHistoricoReoperadosResumenCliente_Clientenombre);
      if ( GXutil.strcmp(sNameSpace, "TexplusNET") != 0 )
      {
         oWriter.writeAttribute("xmlns", "TexplusNET");
      }
      if ( gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total != null )
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
         gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total.writexml(oWriter, "Total", sNameSpace1);
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
      AddObjectProperty("Cliente", gxTv_SdtSDTHistoricoReoperadosResumenCliente_Cliente, false, false);
      AddObjectProperty("ClienteNombre", gxTv_SdtSDTHistoricoReoperadosResumenCliente_Clientenombre, false, false);
      if ( gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total != null )
      {
         AddObjectProperty("Total", gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total, false, false);
      }
   }

   public int getgxTv_SdtSDTHistoricoReoperadosResumenCliente_Cliente( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenCliente_Cliente ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosResumenCliente_Cliente( int value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenCliente_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenCliente_Cliente = value ;
   }

   public String getgxTv_SdtSDTHistoricoReoperadosResumenCliente_Clientenombre( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenCliente_Clientenombre ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosResumenCliente_Clientenombre( String value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenCliente_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenCliente_Clientenombre = value ;
   }

   public app.SdtSDTHistoricoReoperadosResumenCliente_Total getgxTv_SdtSDTHistoricoReoperadosResumenCliente_Total( )
   {
      if ( gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total == null )
      {
         gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total = new app.SdtSDTHistoricoReoperadosResumenCliente_Total(remoteHandle, context);
      }
      gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenCliente_N = (byte)(0) ;
      return gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total ;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosResumenCliente_Total( app.SdtSDTHistoricoReoperadosResumenCliente_Total value )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenCliente_N = (byte)(0) ;
      gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total = value;
   }

   public void setgxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_SetNull( )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_N = (byte)(1) ;
      gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total = (app.SdtSDTHistoricoReoperadosResumenCliente_Total)null;
   }

   public boolean getgxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_IsNull( )
   {
      if ( gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_N( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtSDTHistoricoReoperadosResumenCliente_N = (byte)(1) ;
      gxTv_SdtSDTHistoricoReoperadosResumenCliente_Clientenombre = "" ;
      gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtSDTHistoricoReoperadosResumenCliente_N ;
   }

   public app.SdtSDTHistoricoReoperadosResumenCliente Clone( )
   {
      return (app.SdtSDTHistoricoReoperadosResumenCliente)(clone()) ;
   }

   public void setStruct( app.StructSdtSDTHistoricoReoperadosResumenCliente struct )
   {
      setgxTv_SdtSDTHistoricoReoperadosResumenCliente_Cliente(struct.getCliente());
      setgxTv_SdtSDTHistoricoReoperadosResumenCliente_Clientenombre(struct.getClientenombre());
      setgxTv_SdtSDTHistoricoReoperadosResumenCliente_Total(new app.SdtSDTHistoricoReoperadosResumenCliente_Total(struct.getTotal()));
   }

   @SuppressWarnings("unchecked")
   public app.StructSdtSDTHistoricoReoperadosResumenCliente getStruct( )
   {
      app.StructSdtSDTHistoricoReoperadosResumenCliente struct = new app.StructSdtSDTHistoricoReoperadosResumenCliente ();
      struct.setCliente(getgxTv_SdtSDTHistoricoReoperadosResumenCliente_Cliente());
      struct.setClientenombre(getgxTv_SdtSDTHistoricoReoperadosResumenCliente_Clientenombre());
      struct.setTotal(getgxTv_SdtSDTHistoricoReoperadosResumenCliente_Total().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtSDTHistoricoReoperadosResumenCliente_N ;
   protected byte gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtSDTHistoricoReoperadosResumenCliente_Cliente ;
   protected String gxTv_SdtSDTHistoricoReoperadosResumenCliente_Clientenombre ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected app.SdtSDTHistoricoReoperadosResumenCliente_Total gxTv_SdtSDTHistoricoReoperadosResumenCliente_Total=null ;
}

