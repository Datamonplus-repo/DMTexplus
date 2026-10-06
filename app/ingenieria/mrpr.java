package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ingenieria.mrpr", "/app.ingenieria.mrpr"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mrpr extends GXWebObjectStub
{
   public mrpr( )
   {
   }

   public mrpr( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mrpr.class ));
   }

   public mrpr( int remoteHandle ,
                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mrpr_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mrpr_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "M Recibido Produccion";
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

