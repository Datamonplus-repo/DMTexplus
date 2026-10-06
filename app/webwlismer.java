package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwlismer", "/app.webwlismer"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwlismer extends GXWebObjectStub
{
   public webwlismer( )
   {
   }

   public webwlismer( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwlismer.class ));
   }

   public webwlismer( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwlismer_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwlismer_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe de Mermas";
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

