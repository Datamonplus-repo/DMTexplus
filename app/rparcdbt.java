package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rparcdbt", "/app.rparcdbt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rparcdbt extends GXWebObjectStub
{
   public rparcdbt( )
   {
   }

   public rparcdbt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rparcdbt.class ));
   }

   public rparcdbt( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rparcdbt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rparcdbt_impl(context).cleanup();
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

