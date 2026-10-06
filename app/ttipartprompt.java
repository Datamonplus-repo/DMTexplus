package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttipartprompt", "/app.ttipartprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipartprompt extends GXWebObjectStub
{
   public ttipartprompt( )
   {
   }

   public ttipartprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipartprompt.class ));
   }

   public ttipartprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipartprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipartprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona TIPOS DE ARTICULOS";
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

