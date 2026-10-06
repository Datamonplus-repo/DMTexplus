package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.mremov", "/app.mremov"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mremov extends GXWebObjectStub
{
   public mremov( )
   {
   }

   public mremov( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mremov.class ));
   }

   public mremov( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mremov_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mremov_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Movimientos Repuestos";
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

