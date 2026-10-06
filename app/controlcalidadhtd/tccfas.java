package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.tccfas", "/app.controlcalidadhtd.tccfas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tccfas extends GXWebObjectStub
{
   public tccfas( )
   {
   }

   public tccfas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tccfas.class ));
   }

   public tccfas( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tccfas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tccfas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Ctrls de Calidad de las Fases";
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

