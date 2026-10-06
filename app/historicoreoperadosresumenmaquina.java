package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.historicoreoperadosresumenmaquina", "/app.historicoreoperadosresumenmaquina"})
@jakarta.servlet.annotation.MultipartConfig
public final  class historicoreoperadosresumenmaquina extends GXWebObjectStub
{
   public historicoreoperadosresumenmaquina( )
   {
   }

   public historicoreoperadosresumenmaquina( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( historicoreoperadosresumenmaquina.class ));
   }

   public historicoreoperadosresumenmaquina( int remoteHandle ,
                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new historicoreoperadosresumenmaquina_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new historicoreoperadosresumenmaquina_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Historico Reoperados Resumen Maquina";
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

