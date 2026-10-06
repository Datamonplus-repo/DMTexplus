package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdvccstks", "/app.tdvccstks"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdvccstks extends GXWebObjectStub
{
   public tdvccstks( )
   {
   }

   public tdvccstks( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdvccstks.class ));
   }

   public tdvccstks( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdvccstks_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdvccstks_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Movimientos Productos Data View";
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

