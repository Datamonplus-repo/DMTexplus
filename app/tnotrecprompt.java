package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tnotrecprompt", "/app.tnotrecprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnotrecprompt extends GXWebObjectStub
{
   public tnotrecprompt( )
   {
   }

   public tnotrecprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnotrecprompt.class ));
   }

   public tnotrecprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnotrecprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnotrecprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona NOTAS DE RECLAMACIONES";
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

