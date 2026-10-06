package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.reclamacionesynoconformidadeswc", "/app.reclamacionesynoconformidadeswc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class reclamacionesynoconformidadeswc extends GXWebObjectStub
{
   public reclamacionesynoconformidadeswc( )
   {
   }

   public reclamacionesynoconformidadeswc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( reclamacionesynoconformidadeswc.class ));
   }

   public reclamacionesynoconformidadeswc( int remoteHandle ,
                                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new reclamacionesynoconformidadeswc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new reclamacionesynoconformidadeswc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Reoperados Internos (Nc) y Externos (Rc)";
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

