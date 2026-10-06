package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.reclamacionesynoconformidadeswc_lote", "/app.reclamacionesynoconformidadeswc_lote"})
@jakarta.servlet.annotation.MultipartConfig
public final  class reclamacionesynoconformidadeswc_lote extends GXWebObjectStub
{
   public reclamacionesynoconformidadeswc_lote( )
   {
   }

   public reclamacionesynoconformidadeswc_lote( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( reclamacionesynoconformidadeswc_lote.class ));
   }

   public reclamacionesynoconformidadeswc_lote( int remoteHandle ,
                                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new reclamacionesynoconformidadeswc_lote_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new reclamacionesynoconformidadeswc_lote_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Reclamacionesy No Conformidades por Lote";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

