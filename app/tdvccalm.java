package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdvccalm", "/app.tdvccalm"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdvccalm extends GXWebObjectStub
{
   public tdvccalm( )
   {
   }

   public tdvccalm( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdvccalm.class ));
   }

   public tdvccalm( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdvccalm_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdvccalm_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Movimeintos Productos por Almacen Data View";
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

