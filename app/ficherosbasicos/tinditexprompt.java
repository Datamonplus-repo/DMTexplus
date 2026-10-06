package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tinditexprompt", "/app.ficherosbasicos.tinditexprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tinditexprompt extends GXWebObjectStub
{
   public tinditexprompt( )
   {
   }

   public tinditexprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tinditexprompt.class ));
   }

   public tinditexprompt( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tinditexprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tinditexprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Clear to Wear";
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

