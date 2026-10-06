package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tplaeta", "/app.tplaeta"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tplaeta extends GXWebObjectStub
{
   public tplaeta( )
   {
   }

   public tplaeta( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tplaeta.class ));
   }

   public tplaeta( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tplaeta_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tplaeta_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Planificacion Etal";
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

