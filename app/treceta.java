package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.treceta", "/app.treceta"})
@jakarta.servlet.annotation.MultipartConfig
public final  class treceta extends GXWebObjectStub
{
   public treceta( )
   {
   }

   public treceta( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( treceta.class ));
   }

   public treceta( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new treceta_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new treceta_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TRATAMIENTO DE RECETAS";
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

