package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.historicoderecetas_procesosquimicos_wc", "/app.historicoderecetas_procesosquimicos_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class historicoderecetas_procesosquimicos_wc extends GXWebObjectStub
{
   public historicoderecetas_procesosquimicos_wc( )
   {
   }

   public historicoderecetas_procesosquimicos_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( historicoderecetas_procesosquimicos_wc.class ));
   }

   public historicoderecetas_procesosquimicos_wc( int remoteHandle ,
                                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new historicoderecetas_procesosquimicos_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new historicoderecetas_procesosquimicos_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Recetas Historico (Procesos quimicos)";
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

