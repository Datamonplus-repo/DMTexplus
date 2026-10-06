package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwmaqcdbt", "/app.webwmaqcdbt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwmaqcdbt extends GXWebObjectStub
{
   public webwmaqcdbt( )
   {
   }

   public webwmaqcdbt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwmaqcdbt.class ));
   }

   public webwmaqcdbt( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwmaqcdbt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwmaqcdbt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Listado Maquinas Code Bar";
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

