package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rlempre", "/app.rlempre"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rlempre extends GXWebObjectStub
{
   public rlempre( )
   {
   }

   public rlempre( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rlempre.class ));
   }

   public rlempre( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rlempre_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rlempre_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "LISTADO DE EMPRESAS";
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

