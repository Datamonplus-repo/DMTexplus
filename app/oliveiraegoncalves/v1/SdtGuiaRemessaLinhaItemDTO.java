package app.oliveiraegoncalves.v1 ;
import app.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtGuiaRemessaLinhaItemDTO extends GxUserType
{
   public SdtGuiaRemessaLinhaItemDTO( )
   {
      this(  new ModelContext(SdtGuiaRemessaLinhaItemDTO.class));
   }

   public SdtGuiaRemessaLinhaItemDTO( ModelContext context )
   {
      super( context, "SdtGuiaRemessaLinhaItemDTO");
   }

   public SdtGuiaRemessaLinhaItemDTO( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle, context, "SdtGuiaRemessaLinhaItemDTO");
   }

   public SdtGuiaRemessaLinhaItemDTO( StructSdtGuiaRemessaLinhaItemDTO struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "linhas") )
            {
               if ( gxTv_SdtGuiaRemessaLinhaItemDTO_Linhas == null )
               {
                  gxTv_SdtGuiaRemessaLinhaItemDTO_Linhas = new GXBaseCollection<app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaItemDTO_linhasItem>(app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaItemDTO_linhasItem.class, "GuiaRemessaLinhaItemDTO.linhasItem", "TexplusNET", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtGuiaRemessaLinhaItemDTO_Linhas.readxmlcollection(oReader, "linhas", "linhasItem") ;
               }
               readElement = true ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               if ( GXutil.strcmp2( oReader.getLocalName(), "linhas") )
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
         sName = "GuiaRemessaLinhaItemDTO" ;
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
      if ( gxTv_SdtGuiaRemessaLinhaItemDTO_Linhas != null )
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
         gxTv_SdtGuiaRemessaLinhaItemDTO_Linhas.writexmlcollection(oWriter, "linhas", sNameSpace1, "linhasItem", sNameSpace1);
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
      if ( gxTv_SdtGuiaRemessaLinhaItemDTO_Linhas != null )
      {
         AddObjectProperty("linhas", gxTv_SdtGuiaRemessaLinhaItemDTO_Linhas, false, false);
      }
   }

   public GXBaseCollection<app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaItemDTO_linhasItem> getgxTv_SdtGuiaRemessaLinhaItemDTO_Linhas( )
   {
      if ( gxTv_SdtGuiaRemessaLinhaItemDTO_Linhas == null )
      {
         gxTv_SdtGuiaRemessaLinhaItemDTO_Linhas = new GXBaseCollection<app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaItemDTO_linhasItem>(app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaItemDTO_linhasItem.class, "GuiaRemessaLinhaItemDTO.linhasItem", "TexplusNET", remoteHandle);
      }
      gxTv_SdtGuiaRemessaLinhaItemDTO_Linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_N = (byte)(0) ;
      return gxTv_SdtGuiaRemessaLinhaItemDTO_Linhas ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_Linhas( GXBaseCollection<app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaItemDTO_linhasItem> value )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_Linhas_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_N = (byte)(0) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_Linhas = value ;
   }

   public void setgxTv_SdtGuiaRemessaLinhaItemDTO_Linhas_SetNull( )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_Linhas_N = (byte)(1) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_Linhas = null ;
   }

   public boolean getgxTv_SdtGuiaRemessaLinhaItemDTO_Linhas_IsNull( )
   {
      if ( gxTv_SdtGuiaRemessaLinhaItemDTO_Linhas == null )
      {
         return true ;
      }
      return false ;
   }

   public byte getgxTv_SdtGuiaRemessaLinhaItemDTO_Linhas_N( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_Linhas_N ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtGuiaRemessaLinhaItemDTO_Linhas_N = (byte)(1) ;
      gxTv_SdtGuiaRemessaLinhaItemDTO_N = (byte)(1) ;
      sTagName = "" ;
   }

   public byte isNull( )
   {
      return gxTv_SdtGuiaRemessaLinhaItemDTO_N ;
   }

   public app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaItemDTO Clone( )
   {
      return (app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaItemDTO)(clone()) ;
   }

   public void setStruct( app.oliveiraegoncalves.v1.StructSdtGuiaRemessaLinhaItemDTO struct )
   {
      GXBaseCollection<app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaItemDTO_linhasItem> gxTv_SdtGuiaRemessaLinhaItemDTO_Linhas_aux = new GXBaseCollection<app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaItemDTO_linhasItem>(app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaItemDTO_linhasItem.class, "GuiaRemessaLinhaItemDTO.linhasItem", "TexplusNET", remoteHandle);
      Vector<app.oliveiraegoncalves.v1.StructSdtGuiaRemessaLinhaItemDTO_linhasItem> gxTv_SdtGuiaRemessaLinhaItemDTO_Linhas_aux1 = struct.getLinhas();
      if (gxTv_SdtGuiaRemessaLinhaItemDTO_Linhas_aux1 != null)
      {
         for (int i = 0; i < gxTv_SdtGuiaRemessaLinhaItemDTO_Linhas_aux1.size(); i++)
         {
            gxTv_SdtGuiaRemessaLinhaItemDTO_Linhas_aux.add(new app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaItemDTO_linhasItem(gxTv_SdtGuiaRemessaLinhaItemDTO_Linhas_aux1.elementAt(i)));
         }
      }
      setgxTv_SdtGuiaRemessaLinhaItemDTO_Linhas(gxTv_SdtGuiaRemessaLinhaItemDTO_Linhas_aux);
   }

   @SuppressWarnings("unchecked")
   public app.oliveiraegoncalves.v1.StructSdtGuiaRemessaLinhaItemDTO getStruct( )
   {
      app.oliveiraegoncalves.v1.StructSdtGuiaRemessaLinhaItemDTO struct = new app.oliveiraegoncalves.v1.StructSdtGuiaRemessaLinhaItemDTO ();
      struct.setLinhas(getgxTv_SdtGuiaRemessaLinhaItemDTO_Linhas().getStruct());
      return struct ;
   }

   protected byte gxTv_SdtGuiaRemessaLinhaItemDTO_Linhas_N ;
   protected byte gxTv_SdtGuiaRemessaLinhaItemDTO_N ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean readElement ;
   protected boolean formatError ;
   protected GXBaseCollection<app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaItemDTO_linhasItem> gxTv_SdtGuiaRemessaLinhaItemDTO_Linhas_aux ;
   protected GXBaseCollection<app.oliveiraegoncalves.v1.SdtGuiaRemessaLinhaItemDTO_linhasItem> gxTv_SdtGuiaRemessaLinhaItemDTO_Linhas=null ;
}

