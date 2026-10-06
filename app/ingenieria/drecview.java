package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ingenieria.drecview", "/app.ingenieria.drecview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class drecview extends GXWebObjectStub
{
   public drecview( )
   {
   }

   public drecview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( drecview.class ));
   }

   public drecview( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new drecview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new drecview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "DRec View";
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

