package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwparcdbt", "/app.webwparcdbt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwparcdbt extends GXWebObjectStub
{
   public webwparcdbt( )
   {
   }

   public webwparcdbt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwparcdbt.class ));
   }

   public webwparcdbt( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwparcdbt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwparcdbt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Listado Paros Code Bar";
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

