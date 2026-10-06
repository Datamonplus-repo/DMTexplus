package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tmordenww", "/app.tmordenww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmordenww extends GXWebObjectStub
{
   public tmordenww( )
   {
   }

   public tmordenww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmordenww.class ));
   }

   public tmordenww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmordenww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmordenww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Ordenes de Mantenimiento";
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

