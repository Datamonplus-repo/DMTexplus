package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.ttipmaq", "/app.ficherosbasicos.ttipmaq"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttipmaq extends GXWebObjectStub
{
   public ttipmaq( )
   {
   }

   public ttipmaq( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttipmaq.class ));
   }

   public ttipmaq( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttipmaq_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttipmaq_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tipo Maquina";
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

