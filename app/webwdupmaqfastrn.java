package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwdupmaqfastrn", "/app.webwdupmaqfastrn"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwdupmaqfastrn extends GXWebObjectStub
{
   public webwdupmaqfastrn( )
   {
   }

   public webwdupmaqfastrn( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwdupmaqfastrn.class ));
   }

   public webwdupmaqfastrn( int remoteHandle ,
                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwdupmaqfastrn_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwdupmaqfastrn_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Tabla MAQFAS";
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

