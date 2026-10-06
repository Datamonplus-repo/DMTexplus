package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.controlcalidadhtd.tccdefprompt", "/app.controlcalidadhtd.tccdefprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tccdefprompt extends GXWebObjectStub
{
   public tccdefprompt( )
   {
   }

   public tccdefprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tccdefprompt.class ));
   }

   public tccdefprompt( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tccdefprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tccdefprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Definición de Cont. de Calidad";
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

