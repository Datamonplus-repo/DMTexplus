package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.stocksquimicos.tfrasrgeneral", "/app.stocksquimicos.tfrasrgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tfrasrgeneral extends GXWebObjectStub
{
   public tfrasrgeneral( )
   {
   }

   public tfrasrgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tfrasrgeneral.class ));
   }

   public tfrasrgeneral( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tfrasrgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tfrasrgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TFRASRGeneral";
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

