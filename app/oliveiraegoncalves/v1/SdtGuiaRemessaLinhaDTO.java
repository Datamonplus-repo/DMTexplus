package app.oliveiraegoncalves.v1 ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtGuiaRemessaLinhaDTO extends GxUserType
{
   public SdtGuiaRemessaLinhaDTO( )
   {
      this(  new ModelContext(SdtGuiaRemessaLinhaDTO.class));
   }

   public SdtGuiaRemessaLinhaDTO( ModelContext context )
   {
      super( context, "SdtGuiaRemessaLinhaDTO");
   }

   public SdtGuiaRemessaLinhaDTO( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle, context, "SdtGuiaRemessaLinhaDTO");
   }

   public SdtGuiaRemessaLinhaDTO( StructSdtGuiaRemessaLinhaDTO struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "guiasRemessa") )
            {
               if ( gxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa == null )
               {
                  gxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa = new GXBaseCollection<app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaDTO_guiasRemessaItem>(app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaDTO_guiasRemessaItem.class, "GuiaRemessaLinhaDTO.guiasRemessaItem", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa.readxmlcollection(oReader, "guiasRemessa", "guiasRemessaItem") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "guiasRemessa") )
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
         sName = "GuiaRemessaLinhaDTO" ;
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
      if ( gxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa != null )
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
         gxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa.writexmlcollection(oWriter, "guiasRemessa", sNameSpace1, "guiasRemessaItem", sNameSpace1);
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
      if ( gxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa != null )
      {
         AddObjectProperty("guiasRemessa", gxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa, false, false);
      }
   }

   public GXBaseCollection<app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaDTO_guiasRemessaItem> getgxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa( )
   {
      if ( gxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa == null )
      {
         gxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa = new GXBaseCollection<app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaDTO_guiasRemessaItem>(app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaDTO_guiasRemessaItem.class, "GuiaRemessaLinhaDTO.guiasRemessaItem", "TexplusNET", remoteHandle);
      }
      gxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_N = (byte)(0) ;
      return gxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa( GXBaseCollection<app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaDTO_guiasRemessaItem> value )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa = value ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa_SetNull( )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa_N = (byte)(1) ;
      gxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa = null ;
   }

   public boolean getgxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa_IsNull( )
   {
      if ( gxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa_N( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa_N = (byte)(1) ;
      gxTv_SdtGuiaRemessaLinhaDTO_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtGuiaRemessaLinhaDTO_N ;
   }

   public app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaDTO Clone( )
   {
      return (app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaDTO)(clone()) ;
   }

   public void setStruct( app.oliveiraegoncalves.v1.StructSdtGuiaRemessaLinhaDTO struct )
   {
      GXBaseCollection<app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaDTO_guiasRemessaItem> gxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa_aux = new GXBaseCollection<app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaDTO_guiasRemessaItem>(app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaDTO_guiasRemessaItem.class, "GuiaRemessaLinhaDTO.guiasRemessaItem", "TexplusNET", remoteHandle);
      Vector<app.oliveiraegoncalves.v1.StructSdtGuiaRemessaLinhaDTO_guiasRemessaItem> gxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa_aux1 = struct.getGuiasremessa();
      if (gxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa_aux1.size(); i++)
         {
            gxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa_aux.add(new app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaDTO_guiasRemessaItem(gxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa(gxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa_aux);
   }

   @SuppressWarnings("unchecked")
   public app.oliveiraegoncalves.v1.StructSdtGuiaRemessaLinhaDTO getStruct( )
   {
      app.oliveiraegoncalves.v1.StructSdtGuiaRemessaLinhaDTO struct = new app.oliveiraegoncalves.v1.StructSdtGuiaRemessaLinhaDTO ();
      struct.setGuiasremessa(getgxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa_N ;
   protected byte gxTv_SdtGuiaRemessaLinhaDTO_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaDTO_guiasRemessaItem> gxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa_aux ;
   protected GXBaseCollection<app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaDTO_guiasRemessaItem> gxTv_SdtGuiaRemessaLinhaDTO_Guiasremessa=null ;
}

