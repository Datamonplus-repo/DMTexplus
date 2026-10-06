package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.winccresultados", "/app.controlcalidadhtd.winccresultados"})
@jakarta.servlet.annotation.MultipartConfig
public final  class winccresultados extends GXWebObjectStub
{
   public winccresultados( )
   {
   }

   public winccresultados( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( winccresultados.class ));
   }

   public winccresultados( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new winccresultados_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new winccresultados_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entrada Resultados CCalidad";
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

