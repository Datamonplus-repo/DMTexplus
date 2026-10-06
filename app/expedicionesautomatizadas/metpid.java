package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.expedicionesautomatizadas.metpid", "/app.expedicionesautomatizadas.metpid"})
@jakarta.servlet.annotation.MultipartConfig
public final  class metpid extends GXWebObjectStub
{
   public metpid( )
   {
   }

   public metpid( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( metpid.class ));
   }

   public metpid( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new metpid_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new metpid_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "METPID";
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

