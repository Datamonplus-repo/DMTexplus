package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ingenieria.capfm_p", "/app.ingenieria.capfm_p"})
@jakarta.servlet.annotation.MultipartConfig
public final  class capfm_p extends GXWebObjectStub
{
   public capfm_p( )
   {
   }

   public capfm_p( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( capfm_p.class ));
   }

   public capfm_p( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new capfm_p_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new capfm_p_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Parámetros Fases-Máquinas";
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

