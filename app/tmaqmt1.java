package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmaqmt1", "/app.tmaqmt1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmaqmt1 extends GXWebObjectStub
{
   public tmaqmt1( )
   {
   }

   public tmaqmt1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmaqmt1.class ));
   }

   public tmaqmt1( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmaqmt1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmaqmt1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Calendario Maquinas Tiempo por Mantenimiento";
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

