package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.webwduppro", "/app.formulaciontinte.webwduppro"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwduppro extends GXWebObjectStub
{
   public webwduppro( )
   {
   }

   public webwduppro( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwduppro.class ));
   }

   public webwduppro( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwduppro_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwduppro_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Duplicacion de Procesos Quimicos";
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

