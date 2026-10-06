package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.disqui__ww", "/app.pedidos.disqui__ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class disqui__ww extends GXWebObjectStub
{
   public disqui__ww( )
   {
   }

   public disqui__ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( disqui__ww.class ));
   }

   public disqui__ww( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new disqui__ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new disqui__ww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Quimicos";
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

