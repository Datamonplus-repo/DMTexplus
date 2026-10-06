package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.prctinhistorico", "/app.prctinhistorico"})
@jakarta.servlet.annotation.MultipartConfig
public final  class prctinhistorico extends GXWebObjectStub
{
   public prctinhistorico( )
   {
   }

   public prctinhistorico( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( prctinhistorico.class ));
   }

   public prctinhistorico( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new prctinhistorico_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new prctinhistorico_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Rc Tin Historico";
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

