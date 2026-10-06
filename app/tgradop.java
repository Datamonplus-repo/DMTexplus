package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tgradop", "/app.tgradop"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tgradop extends GXWebObjectStub
{
   public tgradop( )
   {
   }

   public tgradop( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tgradop.class ));
   }

   public tgradop( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tgradop_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tgradop_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Grados Pilling";
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

