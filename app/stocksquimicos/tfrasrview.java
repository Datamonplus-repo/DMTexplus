package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tfrasrview", "/app.stocksquimicos.tfrasrview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfrasrview extends GXWebObjectStub
{
   public tfrasrview( )
   {
   }

   public tfrasrview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfrasrview.class ));
   }

   public tfrasrview( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfrasrview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfrasrview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TFRASRView";
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

