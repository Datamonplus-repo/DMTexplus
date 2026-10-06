package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdvproduc", "/app.tdvproduc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdvproduc extends GXWebObjectStub
{
   public tdvproduc( )
   {
   }

   public tdvproduc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdvproduc.class ));
   }

   public tdvproduc( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdvproduc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdvproduc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Productos Data View";
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

