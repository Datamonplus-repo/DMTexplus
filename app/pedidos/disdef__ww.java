package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pedidos.disdef__ww", "/app.pedidos.disdef__ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class disdef__ww extends GXWebObjectStub
{
   public disdef__ww( )
   {
   }

   public disdef__ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( disdef__ww.class ));
   }

   public disdef__ww( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new disdef__ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new disdef__ww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Defectos";
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

