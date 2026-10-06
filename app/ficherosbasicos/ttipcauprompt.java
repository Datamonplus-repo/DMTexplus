package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttipcauprompt", "/app.ficherosbasicos.ttipcauprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipcauprompt extends GXWebObjectStub
{
   public ttipcauprompt( )
   {
   }

   public ttipcauprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipcauprompt.class ));
   }

   public ttipcauprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipcauprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipcauprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Causas del Defecto";
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

