package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttr0400prompt", "/app.ficherosbasicos.ttr0400prompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttr0400prompt extends GXWebObjectStub
{
   public ttr0400prompt( )
   {
   }

   public ttr0400prompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttr0400prompt.class ));
   }

   public ttr0400prompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttr0400prompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttr0400prompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona TABLA PAISES";
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

