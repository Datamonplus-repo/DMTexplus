package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talbdetprompt", "/app.talbdetprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talbdetprompt extends GXWebObjectStub
{
   public talbdetprompt( )
   {
   }

   public talbdetprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talbdetprompt.class ));
   }

   public talbdetprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talbdetprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talbdetprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Almacen de Entrada, con detalle de rollos";
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

