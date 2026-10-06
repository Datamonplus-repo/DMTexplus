package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ingenieria.malq", "/app.ingenieria.malq"})
@jakarta.servlet.annotation.MultipartConfig
public final  class malq extends GXWebObjectStub
{
   public malq( )
   {
   }

   public malq( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( malq.class ));
   }

   public malq( int remoteHandle ,
                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new malq_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new malq_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "M Alerta Maquinas Ingenieria";
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

