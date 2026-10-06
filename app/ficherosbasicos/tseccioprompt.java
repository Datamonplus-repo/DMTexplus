package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tseccioprompt", "/app.ficherosbasicos.tseccioprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tseccioprompt extends GXWebObjectStub
{
   public tseccioprompt( )
   {
   }

   public tseccioprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tseccioprompt.class ));
   }

   public tseccioprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tseccioprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tseccioprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Secciones";
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

