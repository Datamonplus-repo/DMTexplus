package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tvxstkres", "/app.tvxstkres"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tvxstkres extends GXWebObjectStub
{
   public tvxstkres( )
   {
   }

   public tvxstkres( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tvxstkres.class ));
   }

   public tvxstkres( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tvxstkres_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tvxstkres_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla VERTEX.STKRES";
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

