package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tvxosrvi", "/app.tvxosrvi"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tvxosrvi extends GXWebObjectStub
{
   public tvxosrvi( )
   {
   }

   public tvxosrvi( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tvxosrvi.class ));
   }

   public tvxosrvi( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tvxosrvi_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tvxosrvi_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Estructura OServi en VERTEX";
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

