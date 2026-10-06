package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmaquinww", "/app.tmaquinww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmaquinww extends GXWebObjectStub
{
   public tmaquinww( )
   {
   }

   public tmaquinww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmaquinww.class ));
   }

   public tmaquinww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmaquinww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmaquinww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " MANTENIMIENTO DE MAQUINAS";
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

